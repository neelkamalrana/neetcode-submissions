class Solution {
    private int[] dp;
    public int rob(int[] nums) {
        dp = new int [nums.length];
        Arrays.fill(dp, -1);
        return helper (nums, 0);
    }
    public int helper (int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        } 
        int skip = helper(nums, i + 1);
        int rob = nums[i] + helper(nums, i + 2);
        dp[i] = Math.max(skip, rob);
        return dp[i];
    }
}
