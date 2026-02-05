public class GetAllDuplicates {
    public static void main(String[] args) {
        int[] nums ={23,45,67,89,34,23,67};
        GetDup(nums);
    }
    static void GetDup(int[] arr){
        boolean found = false;
        for (int i = 0; i < arr.length ; i++) {
            //avoid printing duplicates again
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if(arr[i] == arr[k]){
                    alreadyPrinted = true;
                    break;
                }
            }
            if(alreadyPrinted){
                continue;
            }
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]+" ");
                    found = true;
                    break;
                }

            }
        } if(!found){
            System.out.println("No Duplicates");
        }
    }
}
