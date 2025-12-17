public class BinarySearchDescending {
    public static void main(String[] args) {
        int[] nums = {77,65, 45,22,18,9};
        int target = 45;
        int ans = SearchBinary(nums,target);
        System.out.println(ans);
    }
    static int SearchBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid +1;
            }else if(target < arr[mid]){
                end = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
