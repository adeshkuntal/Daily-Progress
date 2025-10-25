// Last updated: 10/25/2025, 4:02:20 PM
class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder str = new StringBuilder();
        Stack<Integer> count = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (str.length() > 0 && str.charAt(str.length() - 1) == c) {
                count.push(count.pop() + 1);
            } else {
                count.push(1);
            }
            str.append(c);
            if (count.peek() == k) {
                str.delete(str.length() - k, str.length());
                count.pop();
            }
        }

        return str.toString();
    }
}
