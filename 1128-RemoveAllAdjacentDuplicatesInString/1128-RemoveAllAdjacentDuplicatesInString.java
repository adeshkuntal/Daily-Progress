// Last updated: 8/4/2025, 6:52:07 PM
class Solution {
    public String removeDuplicates(String s) {
        return remove_duplicate(s);
    }

    public static String remove_duplicate(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}