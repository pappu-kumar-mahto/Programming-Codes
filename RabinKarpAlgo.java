import java.util.ArrayList;
import java.util.Scanner;

public class RabinKarpAlgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();

        long p = 31;
        long pow = p;
        long mod = 1000000007;

        long dhv = s2.charAt(0) - 'a' + 1;
        for (int i = 1; i < s2.length(); i++) {
            dhv = (dhv + (s2.charAt(i) - 'a' + 1) * pow) % mod;
            pow = (pow * p) % mod;
        }

        long[] dp = new long[s1.length()];
        long[] pa = new long[s1.length()];

        dp[0] = s1.charAt(0) - 'a' + 1;
        pa[0] = 1;
        pow = p;

        for (int i = 1; i < s1.length(); i++) {
            dp[i] = (dp[i - 1] + (s1.charAt(i) - 'a' + 1) * pow) % mod;
            pa[i] = pow;
            pow = (pow * p) % mod;
        }

        int sp = 0;
        int ep = s2.length() - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        
        while (ep < s1.length()) {
            long win = dp[ep];
            if (sp > 0)
                win = (win - dp[sp - 1] + mod) % mod;
            if (win == (dhv * pa[sp]) % mod)
                ans.add(sp + 1);
            sp++;
            ep++;
        }
        if (ans.size() == 0) {
            System.out.print("Not Found");
        }
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
