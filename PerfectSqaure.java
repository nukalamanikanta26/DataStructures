public class PerfectSqaure {
    public static void main(String[] args) {
        long x = 36;
        System.out.println(isPerfectSquare(x));
    }
    public static boolean isPerfectSquare(long x){
        long num = (long)Math.sqrt(x);
        return num*num == x;
    }
}
