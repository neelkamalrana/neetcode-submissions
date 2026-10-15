class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        int start index = goal - 1;
        while (start >= 0) {
            if (nums[start] + start >= goal) {
                goal = start;
            }
            start--;
        }
        return goal == 0 ? true : false; 
    }
}
