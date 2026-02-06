public class secLargest {
    public static void main(String[] args) {
        int[] nums = { 23,45,6,73,4,67,345};
        int ans = SecondLargest(nums);
        System.out.println(ans);
    }
    static int SecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        for(int i=0; i < arr.length;i++){
            if(arr[i]>max){
                SecondMax = max;
                max = arr[i];

            }else if(arr[i]<max && arr[i]>SecondMax){
                SecondMax = arr[i];
            }
        }
        return SecondMax;
    }
}
