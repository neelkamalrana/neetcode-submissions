class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        if (k == n) {
            return n;
        }
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (char c: set) {
            int count = 0;
            int left = 0;
            int right = 0;
            while (right < n) {
                if (s.charAt(right) == c) {
                    count++;
                }
                while ((right - left + 1) - count > k) {
                    if (s.charAt(left) == c) {
                        count--;
                    }
                    left++;

                }
                ans = Math.max(ans, right - left + 1);
                right++;
            }
        }
        return ans;
    }
}
