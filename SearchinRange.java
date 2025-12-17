public class SearchinRange {
    public static void main(String[] args) {
        int[] nums = { 2, 34, 23, 53, 67, 76,23,12};
        int target = 23;
        int answ = SearchInRange(nums,target, 1, 4);
        System.out.println(answ);
    }
    static int SearchInRange(int[] arr, int target,int start, int end){

        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i <end ; i++) {
            int element = arr[i];

            if(target == element){
                return i;
            }

        }
        return -1;
    }
}
