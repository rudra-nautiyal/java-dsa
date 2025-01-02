public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {23, 43, 54, 22, 12, 19, 56};
        int target = 19;


        int ans = linearSearch(array, target, 1, 4);
        System.out.println(ans);
    }

    //    Search in the array: return the index if item found, else return -1
    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return Integer.MAX_VALUE;
    }
}