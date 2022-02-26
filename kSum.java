public class kSum {
    public static boolean isPossible(int [] arr, int target, int mid){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          sum = sum + (arr[i] + mid - 1) / mid;
        }
        if (sum <= target) {
          return true;
        }
        return false;
      }
      public static int minNumforKSum(int[] arr, int target) {
        int start = 1;
        int max = -1;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
          max = Math.max(max, arr[i]);
        }
        int end = max;
        while (start <= end) {
          int mid = start + (end - start) / 2;
          if (isPossible(arr, target, mid)) {
            ans = mid;
            end = mid - 1;
          } else {
            start = mid + 1;
          }
        }
        return ans;
      }
}
