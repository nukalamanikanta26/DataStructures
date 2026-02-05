public class FindTARGET {
    public static void main(String[] args) {
        int[] nums = {34,45,76,92,32,65};
        int target = 65;
        System.out.println(FindTargetNum(nums,target));
    }
    static int FindTargetNum(int[] arr,int target){
        if(arr.length <=0 ){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }

        }
        return -1;
    }
}
