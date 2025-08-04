// Last updated: 8/4/2025, 6:50:13 PM
class Solution {
    public String reformatNumber(String number) {
        number = number.replaceAll("[\\s-]", "");
        String ans = "";
        int a = 0;
        while (a < number.length()) {
            if (number.length() - a > 4) {
                ans += number.substring(a, a + 3) + "-";
                a += 3;
            } else {
                if (number.length() - a == 2) {
                    ans += number.substring(a, a + 2);
                    a += 2;
                } else if (number.length() - a == 3) {
                    ans += number.substring(a, a + 3);
                    a += 3;
                } else if (number.length() - a == 4) {
                    ans += number.substring(a, a + 2) + "-";
                    a += 2;
                    ans += number.substring(a, a + 2);
                    a += 2;
                }
            }
        }

        return ans;
    }
}