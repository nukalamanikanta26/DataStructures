import java.util.Scanner;
public class CheckPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Not pRIME");
            return;
        }
        boolean isPrime = true;
        for(int i =2; i<n; i++){
            if(n%2==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("PrimeNumber");
        }else{
            System.out.println("Not PrimeNUmber");
        }
    }
}

