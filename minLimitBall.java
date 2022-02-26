import java.util.*;
import java.io.*;
public class minLimitBall {
    static int penalty(int[] array, int maxOps){
        int high = -1;
        for(int val:array){
          high = Math.max(val, high);
        }
        int low = 1;
  
        while(low<=high){
          int mid = (low + ((high-low)/2));
  
          if(check(array, mid, maxOps)){
            high = mid-1;
          }else{
            low = mid+1;
          }
        }
        return low;
      }
  
      static boolean check(int[] array, int midVal, int maxOpsVal){
        int count = 0;
  
        for(int val:array){
          count+= val/midVal;
          if(val % midVal == 0){
            count--;
          }
      }
      return count<=maxOpsVal;
      }
      public static void main(String args[]) {
          //your code here
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int maxOperation = input.nextInt();
        int [] arrayOfBalls = new int[length];
  
        for(int i=0; i<length; i++){
          arrayOfBalls[i] = input.nextInt();
        }
  
        int ans = penalty(arrayOfBalls, maxOperation);
  
        System.out.print(ans);
      }
}
