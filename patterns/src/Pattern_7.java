public class Pattern_7 {
    public static void main(String[] args) {
        nStarTriangle(3);
    }
    public static void nStarTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int space = (n+1) - i;
            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
