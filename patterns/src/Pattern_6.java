public class Pattern_6 {
    public static void nNumberTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
