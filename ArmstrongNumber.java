import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sum =0;
        int original = num;
        int digits =0;
        // 1. Count Digits
        int temp = num;
        while(temp>0){
            digits++;
            temp = temp/10;
        }
        // 2.Calculate Armstrong.
        temp = num;
        while(temp>0){
            int digit = temp % 10;
            sum = sum + Math.pow(digit,digits);
            temp = temp /10;
        }
        if(original == sum){
            System.out.println("Armsstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}