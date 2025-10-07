// Last updated: 10/7/2025, 8:44:06 PM
class Solution {
    public String simplifyPath(String path) {
        String ans = "";
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String part : parts) {
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!part.equals("") && !part.equals(".")) {
                stack.push(part);
            }
        }

        for (String dir : stack) {
            ans += "/" + dir;
        }

        if (ans.equals("")) {
            ans = "/";
        }

        return ans;
    }
}