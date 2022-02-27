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
}
