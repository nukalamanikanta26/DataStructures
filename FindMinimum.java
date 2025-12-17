public class FindMinimum {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 12, 7};
        System.out.println(minNum(nums));
    }

    static int minNum(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < ans) {
                ans = arr[i];
            }

        }
        return ans;
    }
}
