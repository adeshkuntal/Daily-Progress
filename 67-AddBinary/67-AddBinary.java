// Last updated: 8/4/2025, 6:57:57 PM
class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int p1 = s1.length() - 1;
        int p2 = s2.length() - 1;
        while (p1 >= 0 || p2 >= 0) {
            int sum = carry;
            if (p1 >= 0) sum += s1.charAt(p1--) - '0';
            if (p2 >= 0) sum += s2.charAt(p2--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) result.append(carry);
        return result.reverse().toString();
    }
}