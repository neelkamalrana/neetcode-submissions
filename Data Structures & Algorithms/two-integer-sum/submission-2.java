class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        map.put(nums[0], 0);
        for (int i = 1; i < n; i++) {
            int k = target - nums[i];
            if (map.containsKey(k)) {
                return new int[]{map.get(k), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[]{0, 0};
    }
}
