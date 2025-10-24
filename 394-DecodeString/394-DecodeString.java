// Last updated: 10/24/2025, 7:37:35 PM
class Solution { 
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String current = "";
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(num);
                stringStack.push(current);
                num = 0;
                current = "";
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(stringStack.pop());
                int repeat = countStack.pop();
                for (int j = 0; j < repeat; j++) {
                    temp.append(current);
                }
                current = temp.toString();
            } else {
                current += c;
            }
        }
        return current;
    }
}
