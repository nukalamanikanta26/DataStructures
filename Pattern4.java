import java.awt.*;

public class Pattern4 {
    public static void main(String[] args) {
    Pattern4(5);
    Pattern6(5);
    }

    static void Pattern4 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void Pattern6(int m){
        for (int i = 1; i <=m ; i++) {
            for(int j =1; j<=m-i+1; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
