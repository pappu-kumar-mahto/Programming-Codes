public class arrangeCoins {
    public int arrangeCoin(int n) {
        int start = 0; 
        int end = n;
        long ans = 0;
        
        while(start <= end){
            long mid = start + (end - start)/2;
            long totalSum = ((mid) * (mid+1))/2;
            
            if(n <= totalSum){
                ans = mid;
                end = (int)mid - 1;
            }else{
                start = (int)mid + 1;
            }
        }
        long sum = ((ans) * (ans+1))/2;
        if(sum - n != 0){
            return (int)ans - 1;
        }
        return (int)ans;
    }
}
