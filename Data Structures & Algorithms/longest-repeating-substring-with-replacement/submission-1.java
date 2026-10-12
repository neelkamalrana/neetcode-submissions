class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, maxL = 0, maxCount = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxCount = Math.max(maxCount, map.get(c));
            while (right - left + 1 - maxCount > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxL = Math.max(maxL, right - left + 1);
        }

        return maxL;
    }
}
