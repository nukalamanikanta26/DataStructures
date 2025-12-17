import java.util.Scanner;

public class BasicArithematicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //Addition
        int total = m+n;
        int mul = m*n;
        float Div = m/n;
        System.out.println("Addition: "+total);
        System.out.println("Multiplication: "+mul);
        System.out.println("Division: "+Div);
    }
}
