import java.util.*;

class Q118_pascal1 {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0)
            return result;

        result.add(new ArrayList<>());
        result.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();

            rows.add(1);

            for (int j = 1; j < i; j++) {
                rows.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }

            rows.add(1);
            result.add(rows);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numRows = input.nextInt();
        List<List<Integer>> ans = generate(numRows);
        System.out.println(ans);
        input.close();
   }
}