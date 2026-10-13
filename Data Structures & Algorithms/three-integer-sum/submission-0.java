class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int pivot = n - 1;
        while (pivot > 1) {
            if (pivot < n - 1 && nums[pivot] == nums[pivot + 1]) {
                pivot--;
                continue;
            }
            int left = 0;
            int right = pivot - 1;
            int target = -nums[pivot];
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    ans.add(new ArrayList<>(List.of(nums[pivot], nums[left], nums[right])));
                    int leftValue = nums[left];
                    int rightValue = nums[right];
                    while (left < right && nums[left] == leftValue) {
                        left++;
                    }
                    while (left < right && nums[right] == rightValue) {
                        right--;
                    }
                }
                else if (nums[left] + nums[right] < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
            pivot--;
        }
        return ans;
    }
}
