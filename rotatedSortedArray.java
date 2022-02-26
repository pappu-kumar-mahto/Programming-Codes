import java.util.List;

public class rotatedSortedArray {
    public int search(final List<Integer> A, int B) {
        int start = 0;
        int end = A.size() - 1;

        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(A.get(mid) == B){
                ans = mid;
                return mid;
            }
            if(A.get(start) < A.get(mid)){
                if(B >= A.get(start) && B < A.get(mid)){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(B > A.get(mid) && B <= A.get(end)){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return ans;
    }
}
