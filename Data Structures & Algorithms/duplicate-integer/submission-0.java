class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            if (set.contains(temp)) {
                return true;
            }
            else {
                set.add(temp);
            }
        }
        return false;
    }
}