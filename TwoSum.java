import java.util.Arrays;

public class TwoSum{
    public static void main(String[] args) {
    int[] arr ={2,7,11,15};
    int target=9;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] twoSum(int[] arr, int target){
        int i; int j;
        for ( i = 0; i < arr.length; i++) {
            for ( j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}