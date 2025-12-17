public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum=0;
            for (int col = 0; col < accounts[row].length; col++) {
            sum = sum + accounts[col][row];
            }
        if(sum>ans){
            ans=sum;
        }
        }
        return ans;
    }

}
