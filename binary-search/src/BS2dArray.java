public class BS2dArray {
    public static void main(String[] args) {

    }

    static int[] Search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length - 1 && col >= 0) {
            if(matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] > target) {
                col--;
            }
            if(matrix[row][col] < target) {
                row++;
            }
        }

        return new int[]{-1, -1};
    }
}
