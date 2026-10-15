class Solution {
    public int climbStairs(int n) {
        return helper(n, 0);
    }
    public int helper(int n, int i) {
        if (i == n) {
            return 1;
        }
        else if (i > n) {
            return 0;
        }
        return helper(n, i + 1) + helper(n, i + 2);
    }
}
