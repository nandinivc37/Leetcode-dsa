class Solution {
    static {
        for (int i = 0; i<300; i++) {
            change(0, new int[]{});
        }
    }
    public static int change(int amount, int[] coins) {
        
        int[] dp = new int[amount+1];
        dp[0] = 1;
        // find coin  combination upto amout
        for(int coin : coins){
            for(int i=coin; i<=amount; i++){
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }
}