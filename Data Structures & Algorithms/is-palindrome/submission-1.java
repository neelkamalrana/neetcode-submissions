class Solution {
    public boolean isPalindrome(String s) {
        //s.replace(" ", "");
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");;
        int n = s.length();
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
