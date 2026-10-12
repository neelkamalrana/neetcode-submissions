class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (digits[n - 1] != 9) {
            digits[n - 1]++;
            return digits;
        }
        digits[n - 1] = 0;
        int index = n - 2;
        boolean overflow = false;
        boolean carry = true;
        while (carry) {
            if(index >=0 && digits[index] == 9) {
                digits[index--] = 0;
            }
            else if (index < 0) {
                overflow = true;
                break;
            }
            else if (index >= 0 && digits[index] < 9) {
                digits[index]++;
                carry = false;
            }
        }
        if (overflow) {
            int[] ans = new int[n + 1];
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}
