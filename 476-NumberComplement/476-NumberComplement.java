// Last updated: 8/4/2025, 6:55:09 PM
class Solution {
    public int findComplement(int n) {
        String s = "";
//        Decimal to Binary
        while (n > 0){
            int a = n%2;
            n = n/2;
            s = a + s;
        }
//        Replace 0 and 1
        String z = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                z+=1;
            }
            else {
                z+=0;
            }
        }
//        Binary to Decimal
        int b = 0;
        for(int i = 0; i < z.length(); i++){
            if(z.charAt(i) != '0'){
                int a = (int) Math.pow(2, z.length() - 1 - i);
                b += a;
            }
        }
        return b;
    }
}