class Solution {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            n = helper(n);
            if(n == 1) {
                return true;
            }
            if (set.contains(n)) {
                return false;
            }
            else {
                set.add(n);
            }
        }
        return true;
    }
    public int helper (int n) {
        int total = 0;
        while (n > 0) {
            int rem = n % 10;
            total = total + (int)Math.pow(rem, 2);
            n = n / 10;
        }
        return total;
    }
}
