import java.util.Scanner;

public class peak {
    static int findPeakElement(int[] array, int lengthOfArray) {
        int left = 0;
        int right = lengthOfArray - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if ((mid == 0 || array[mid] >= array[mid - 1]) &&
                    (mid == lengthOfArray - 1 || array[mid] >= array[mid + 1])) {
                return mid;
            } else if (array[mid] <= array[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    static int findPeakIndex(int[] array, int lengthOfArray) {
        int left = 0;
        int right = lengthOfArray - 1;
        
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            
            if(
                (mid==0 || array[mid]>=array[mid-1]) && 
                (mid==lengthOfArray-1 || array[mid]>=array[mid+1])
                ) {
                    return mid;
                } else if (array[mid] <= array[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }
        int ans = findPeakElement(array, array.length);
        System.out.print(ans);
    }
}
