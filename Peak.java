class Peak{
    public static void main(String[] args) {
    int[] arr = {1,3,4,11,5,6,9};
        System.out.println(peakElement(arr));
    }
    public static int peakElement(int[] arr){
        int n = arr.length;

        //check for first element
        if(n==1 || arr[0]>=arr[1]){
            return 0;
        }

        //check for middle elements
        for (int i = 1; i < n; i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;

    }
}