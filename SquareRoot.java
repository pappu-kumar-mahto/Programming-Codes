public class SquareRoot {
    static int findSqRt(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int ans;
        for (int i = 1; i <= number; i++) {
            ans = i * i;
            if (ans == number) {
                return i;
            } else if (ans > number) {
                return i - 1;
            }
        }
        return -1;
    }
    public boolean isPerfectSquare(int num) {
        int start =0; 
        int end = num;
        long ans = -1;
        while(start <= end){
        long mid = start + (end - start)/2;
        long square = mid * mid;
        if(num >= square){
            ans = mid;
            start = (int) mid + 1;
        }else{
            end = (int) mid -1;
            }
        }
        if(ans * ans == num){
            return true;
        }
        return false;
        
    }
}
