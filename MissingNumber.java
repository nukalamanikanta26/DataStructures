public class MissingNumber {
    public static void main(String[] args) {
    int[] arr = {1,2,4,5,6};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[0]!=arr[i]){
                return arr[i];
            }

        }
        return -1;
    }
}
