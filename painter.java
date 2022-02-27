import java.util.ArrayList;

public class painter {
    public static boolean isPossible(ArrayList<Integer> C, int A,int B, long mid){
       int noOfPainter = 1;
       int countBoard = 0;
       for(int i=0; i<C.size(); i++){
           if(countBoard + (C.get(i)) <= mid){
               countBoard += (C.get(i));
           }else{
               noOfPainter++;
               if(noOfPainter > A || (C.get(i)) > mid){
                   return false;
               }
               countBoard = (C.get(i));
           }
       }
       return true;
   }
   public static long paint(int A, int B, ArrayList<Integer> C) {
       long start =0;
       long sum = 0;
       for(int i=0; i<C.size(); i++){
           sum += (C.get(i));
       }

       long end = (int)sum;
       long ans = -1;

       while(start <= end){
           long mid = start + (end - start)/2;

           if(isPossible(C, A, B, mid)){
               ans = mid;
               end = mid - 1;
           }else{
               start = mid + 1;
           }
       }
       return (ans*B)%10000003;
   }
}