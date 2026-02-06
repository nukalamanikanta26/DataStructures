import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int original = n;

        // Factorial of digits.

        while(n>0){
            int digit = n %10;
            int fact = 1;
            for(int i =1; i<=digit;i++){
                fact = fact * i;
                sum = sum + fact;
                n = n/10;
            }
            if(sum == original){
                System.out.println("Strong");
            }else{
                System.out.println("Not SAtrongh");
            }
        }
    }
}
