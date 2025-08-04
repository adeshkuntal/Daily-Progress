// Last updated: 8/4/2025, 6:52:03 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = findGCDLength(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    private static int findGCDLength(int a, int b) {
        return b == 0 ? a : findGCDLength(b, a % b);
    }
}