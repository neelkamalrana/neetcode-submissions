class Solution {
    public String minWindow(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if (n2 > n1) {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // int startingIndex = -1;
        // for (int i = 0; i < n1; i++) {
        //     char c = s.charAt(i);
        //     if (map.containsKey(c)) {
        //         startingIndex = i;
        //     }
        // }
        // if (startingIndex == -1) {
        //     return "";
        // }
        Map<Character, Integer> window = new HashMap<>();
        int have = 0;
        int need = map.size();
        int[] ans = {-1, -1};
        int ansLen = Integer.MAX_VALUE;
        int l = 0;
        for (int r = 0; r < n1; r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (map.containsKey(c) && map.get(c).equals(window.get(c))) {
                have++;
            }
            while (have == need) {
                if (r - l + 1 < ansLen) {
                    ansLen = r - l + 1;
                    ans[0] = l;
                    ans[1] = r;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if (map.containsKey(leftChar) && window.get(leftChar) < map.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }
        return ansLen == Integer.MAX_VALUE ? "" : s.substring(ans[0], ans[1] + 1);
    }
}
