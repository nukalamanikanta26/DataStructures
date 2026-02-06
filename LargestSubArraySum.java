public class LargestSubArraySum {
    public static void main(String[] args) {
    int[] mani = {1,2,2,-4,5,3,6,7};
        System.out.println(SubArrSum(mani));
    }
    static int SubArrSum(int[] arr){
        int curSum =0;
        int maxSum =arr[0];
        for (int i = 1; i < arr.length; i++) {
            curSum = curSum + arr[i];

            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        } return maxSum;
    }
}
