public class FindMin {
    public static void main(String[] args) {
    int[] arr = {23,37,47,56,64,73,1};
        System.out.println(FindMinimum(arr));
    }
    static int FindMinimum(int[] arr){
        if(arr.length <= 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
