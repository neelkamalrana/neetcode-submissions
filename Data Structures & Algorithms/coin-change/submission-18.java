class Solution {
    public int coinChange(int[] coins, int amount) {
        return dfs(coins, amount);
    }
    public int dfs(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        
    }
}
