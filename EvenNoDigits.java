public class EvenNoDigits {
    public static void main(String[] args) {
        int[] nums = {2,43,45,666,4565};
        System.out.println(FindNoDigits(nums));

    }
    static int FindNoDigits(int[] nums){
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int NoofDigits = digits(num);
        if(NoofDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count =0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}
