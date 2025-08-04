// Last updated: 8/4/2025, 6:58:13 PM
import java.math.BigInteger; // Import this at the top

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger bigNum1 = new BigInteger(num1); 
        BigInteger bigNum2 = new BigInteger(num2);
        BigInteger result = bigNum1.multiply(bigNum2);
        return result.toString();
    }
}
