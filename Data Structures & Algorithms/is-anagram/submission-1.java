class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[97 - 'c']++;
        }
        for (char c : t.toCharArray()) {
            arr[97 - 'c']--;
            if (arr[97 - 'c'] < 0) {
                return false;
            }
        }
        for (int i : arr) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }
}
