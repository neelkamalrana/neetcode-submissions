class Solution {
    public int rob(int[] nums) {
        return helper (nums, 0);
    }
    public int helper (int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
        return Math.max(helper(nums, i+1), nums[i] + helper(nums, nums i + 2));
    }
}
