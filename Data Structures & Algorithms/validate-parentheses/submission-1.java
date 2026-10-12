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
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((curr == ']' && top != '[') ||
                    (curr == '}' && top != '{') ||
                    (curr == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
