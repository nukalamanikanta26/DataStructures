public class SortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4};

        boolean result = isSorted(arr);
        System.out.println(result);
    }

    static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
