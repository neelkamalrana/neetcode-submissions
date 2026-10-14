class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Stack <Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            if (curr == '[' || curr == '{' || curr == '(') {
                stack.push(curr);
            }
            else if (curr == ']') {
                if (stack.pop() != '[') {
                    return false;
                }
            }
            else if (curr == '}') {
                if (stack.pop() != '{') {
                    return false;
                }
            }
            else {
                if (stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
