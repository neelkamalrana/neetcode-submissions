class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int zerosCount = 0;
        int zeroIndex = -1;
        int prod = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                prod *= nums[i];
            }
            else {
                zerosCount++;
                zeroIndex = i;
            }
        }
        if (zerosCount > 1) {
            return ans;
        }
        else if (zerosCount == 1) {
            ans[zeroIndex] = prod;
        }
        else {
            for (int i = 0; i < n; i++) {
                ans[i] = prod / nums[i];
            }
        }
        return ans;
    }
}  
