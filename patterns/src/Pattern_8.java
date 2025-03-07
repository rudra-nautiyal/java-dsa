public class Pattern_8 {
    public static void main(String[] args) {
        sideTriangle(3);
    }


//    variable = condition ? expression1 : expression2;

    static void sideTriangle(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            if (row < n - 1) {
                for (int col = 0; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            } if (row > n) {
                for (int col = 0; col <= 2 * n - row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
