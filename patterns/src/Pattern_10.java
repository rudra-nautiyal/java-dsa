public class Pattern_10 {
    public static void main(String[] args) {
        numberedSquare(4);
    }

    static void numberedSquare(int n) {
        int orginalN = n;
        n  = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = orginalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
