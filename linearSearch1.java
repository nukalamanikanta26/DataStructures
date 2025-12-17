public class linearSearch1 {
    public static void main(String[] args) {
        int[] nums = {};
        int target = 5;
        int answ = linearSearch(nums, target);
        System.out.println(answ);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}