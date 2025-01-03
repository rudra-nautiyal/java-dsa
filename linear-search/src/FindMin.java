public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, -14, 28};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
