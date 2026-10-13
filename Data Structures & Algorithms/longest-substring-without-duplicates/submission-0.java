class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) {
            return n;
        }
        int left = 0;
        int right = 1;
        int max = 0;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        while(right < n) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            int len = right - left + 1;
            max = Math.max(max, len);
            right++;
        }
        return max;
    }
}
