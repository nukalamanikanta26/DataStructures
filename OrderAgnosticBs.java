//Here We dont whether the array is Sorted in Asc or desc.
// This will check for sorting and results aacounding to Order


public class OrderAgnosticBs {
    public static void main(String[] args) {
    int[] arr = {2,3,4,5,6,6,7,21};
    int target = 6;
    int ans = orderAgnosticBs(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBs(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        //check for sorted order or not

        boolean isAsc = arr[start] < arr[end];

        while(start<=end){

            //find midddle element

            int mid = start+(end - start)/2;

            //Following block same for both asc and desc

            if(target == arr[mid]){
                return mid;
            }

            //now for remaining cases

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }else if(target > arr[mid]){
                    start=mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                } else if (target < arr[mid]) {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
