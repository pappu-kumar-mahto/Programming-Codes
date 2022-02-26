import java.util.List;

public class medianByBinarySearch {
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        if(a.size() > b.size()){
            return (findMedianSortedArrays(b, a));
        }
        int n1 = a.size();
        int n2 = b.size();
        int start = 0;
        int end = n1;

        while(start <= end){
            int cut1 = start + (end - start)/2;
            int cut2 = ((n1 + n2) /2) - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : a.get(cut1 - 1);
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : b.get(cut2 - 1);
            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : a.get(cut1);
            int r2 = (cut1 == n2) ? Integer.MAX_VALUE : b.get(cut2);

            if(l1 > r2){
                end = cut1 - 1;
            }else if(l2 > r1){
                start = cut1 + 1;
            }else{
                if((n1 + n2) % 2 == 0){
                    return (double) ((double)(Math.max(l1,l2) + Math.min(r1, r2))/2);
                }else{
                    return (double) (Math.min(r1, r2));
                }
            }
        }
        return 0.0;
	}
}
