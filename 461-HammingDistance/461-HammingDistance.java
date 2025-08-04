// Last updated: 8/4/2025, 6:55:13 PM
class Solution {
    public int hammingDistance(int x, int y) {
        String b_x = DtoB(x);
        String b_y = DtoB(y);
        int maxLen = Math.max(b_x.length(), b_y.length());

        // Pad the shorter binary string with leading zeros
        b_x = String.format("%" + maxLen + "s", b_x).replace(' ', '0');
        b_y = String.format("%" + maxLen + "s", b_y).replace(' ', '0');

        int hammingDistance = 0;
        for(int i = 0; i < maxLen; i++){
            if(b_x.charAt(i) != b_y.charAt(i)){
                hammingDistance++;
            }
        }

        return hammingDistance;
    }
    public static String DtoB(int n){
        String s = "";
        while (n > 0){
            int a = n % 2;
            n = n / 2;
            s = a + s;
        }
        return s.isEmpty() ? "0" : s; // Ensure it returns "0" for input 0
    }
}