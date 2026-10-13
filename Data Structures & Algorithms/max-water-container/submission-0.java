class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int n = heights.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int amount = (right - left) * Math.min(heights[left], heights[right]);
            max = Math.max(max, amount);
            if (heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }
}
