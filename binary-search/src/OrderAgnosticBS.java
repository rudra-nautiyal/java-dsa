public class OrderAgnosticBS {
    public static void main(String[] args) {

    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find if arr ascending or descending
        boolean isAsc;
        isAsc = arr[start] > arr[end];

        while (true) {
            // find the middle element
//            int mid = (start + end) / 2; might be possible that this exceeds the range of int in java, hence resulting in error.
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    }
                }
                return -1;
            }
        }
    }
}
