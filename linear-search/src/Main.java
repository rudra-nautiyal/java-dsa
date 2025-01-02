//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {23, 43, 54, 22, 12, 19, 56};
        int target = 19;

        int ans = linearSearch(array, target);
        System.out.println(ans);
    }

//    Search in the array: return the index if item found, else return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return Integer.MAX_VALUE;
    }
}