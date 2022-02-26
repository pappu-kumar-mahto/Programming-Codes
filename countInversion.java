
import java.util.*;
import java.io.*;

public class countInversion {
  static long count = 0;
  public static long[] merge2SortedArray(long[] left, long[] right){
    int i = 0;
    int j = 0;
    int k = 0;
    long[] merged = new long[left.length + right.length];

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        merged[k] = left[i];
        i++;
        k++;
      } else {
        count += left.length - i;
        merged[k] = right[j];
        j++;
        k++;
      }
    }
    while (i < left.length) {
      merged[k] = left[i];
      i++;
      k++;
    }
    while (j < right.length) {
      merged[k] = right[j];
      j++;
      k++;
    }
    return merged;
  }
  public static long[] merge(long[] array, long low, long high) {
    if (low == high) {
      long[] ba = new long[1];
      ba[0] = array[(int)low];
      return ba;
    }
    long mid = low + (high - low) / 2;
    long[] left = merge(array, low, mid);
    long[] right = merge(array, mid + 1, high);

    long[] merged = merge2SortedArray(left, right);
    return merged;
 }
  

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long length = input.nextLong();
    long[] array = new long[(int)length];
    for (int i = 0; i < length; i++) {
      array[i] = input.nextLong();
    }
    long[] ans = merge(array, 0, length - 1);
    for (int i = 0; i < length; i++) {
      System.out.print(ans[i] + " ");
    }
    System.out.println();
    System.out.println(count);
  }
} 