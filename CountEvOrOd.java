import java.util.Scanner;

public class CountEvOrOd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int even=0;
         int odd =0;
        for (int i = 1; i <n ; i++) {
            int x = sc.nextInt();
            if(x%2==0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);

    }
}
