import java.util.Scanner;

public class KMPalgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String source = input.next();
        String target = input.next();
        String ans = target + "#" + source;
        
        int[] LPS = new int[ans.length()];
        int i = 1;
        int len = 0;

        while (i < ans.length()) {
            if (ans.charAt(i) == ans.charAt(len)) {
                len++;
                LPS[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = LPS[len - 1];
                } else {
                    LPS[i] = 0;
                    i++;
                }
            }
        }
        int count = 0;
        for (int j = 0; j < LPS.length; j++) {
            if (LPS[j] == target.length()) {
                count++;
                System.out.print((j -(target.length()+1)) + " ");
            }
        }
        System.out.println(count);
    }
}
