public class MergeArrays {
    public static void main(String[] args) {
    int[] arr1 ={1,2,3};
    int[] arr2 ={4,5,6};
    int[] merged = Merging(arr1,arr2);
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]+" ");
        }
    }

    static int[] Merging(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int index = 0;
        for (int i = 0; i < n1; i++) {
            result[index++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            result[index++] = arr2[i];
        }
        return result;
    }
}

