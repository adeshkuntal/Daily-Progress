// Last updated: 8/4/2025, 6:55:05 PM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "").toUpperCase();

        StringBuilder sb = new StringBuilder();

        // Start from the end of the string and work backwards
        int length = s.length();
        for (int i = 0; i < length; i++) {
            sb.append(s.charAt(length - 1 - i));
            // Insert a dash every k characters, except at the end
            if ((i + 1) % k == 0 && i != length - 1) {
                sb.append("-");
            }
        }

        // Reverse the string to get the final result
        return sb.reverse().toString();
    }
}