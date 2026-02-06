public class FindMax {
    public static void main(String[] args) {
    int[] nums = {23,34,56,44,45,56};
        System.out.println(FindMaximum(nums));
    }
    public static int FindMaximum(int[] arr){
        if(arr.length <= 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > ans) {

                //update
                ans = arr[i];
            }
        }
        return ans;
    }
}
