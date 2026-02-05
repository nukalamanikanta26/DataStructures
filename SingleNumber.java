public class SingleNumber {
    public static void main(String[] args) {
//        SingleNumber sn = new SingleNumber();
    int[] arr = {2,1,2,1,4};
        System.out.println(singleNum(arr));
    }
    public static int singleNum(int[] arr){
        if(arr.length!=0){
            for (int i = 0; i < arr.length; i++) {
                int count =0;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count ==1){
                    return arr[i];
                }

            }
        }
        return -1;
    }
}
