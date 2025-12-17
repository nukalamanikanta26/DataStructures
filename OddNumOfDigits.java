public class OddNumOfDigits {
    public static void main(String[] args) {
        int[] arr = {2,34,56,333,45,5,632344,455};
        System.out.println(FindDigits(arr));
    }
    static int FindDigits(int[] nums){
        int count =0;
        for(int num : nums){
            if(odd(num)){
                count++;
            }
        }
        return count;
    }
    static boolean odd(int num){
        int NumberofDigits = digits(num);
        if(NumberofDigits %2== 1){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count =0;
        while(num>0){
            num = num / 10;
            count++;
        }
        return count;
    }

}
