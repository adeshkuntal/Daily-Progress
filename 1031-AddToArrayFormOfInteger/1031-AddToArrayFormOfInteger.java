// Last updated: 8/4/2025, 6:52:29 PM
import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder s = new StringBuilder();
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            s.append(num[i]);
        }
        BigInteger a = new BigInteger(s.toString());
        BigInteger b = BigInteger.valueOf(k);
        BigInteger r = a.add(b);
        String str = r.toString();
        for (int i = 0; i < str.length(); i++) {
            l.add(Character.getNumericValue(str.charAt(i)));
        }
        return l;
    }
}