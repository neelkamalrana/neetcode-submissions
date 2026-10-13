class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i-1] <= 1) {
                if (nums[i] - nums[i-1] == 1) {
                    count++;
                    max = Math.max(max, count);
                }
            }
            else {
                count = 1;
            }
        }
        return max;
    }
}
