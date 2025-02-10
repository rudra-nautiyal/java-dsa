public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4 , 1},
                {18, 12, 3, 9},
                {79, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        System.out.println(search(arr, target));
    }

    static boolean search(int[][] arr, int target) {
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                if (ints[col] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
