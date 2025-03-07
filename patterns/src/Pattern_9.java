public class Pattern_9 {
    public static void main(String[] args) {
        twoTriangles(5);
    }

    static void twoTriangles(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            int numberOfSpaces = n - totalColsInRow;
            for (int s = 0; s < numberOfSpaces; s++) {
                System.out.print(" ");
            }
        for (int col = 0; col < totalColsInRow; col++) {
            System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
