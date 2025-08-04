// Last updated: 8/4/2025, 6:54:42 PM
public class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[] n1 = parse(num1);
        int[] n2 = parse(num2);

        int real = n1[0] * n2[0] - n1[1] * n2[1];
        int imag = n1[0] * n2[1] + n1[1] * n2[0];

        return real + "+" + imag + "i";
    }

    private int[] parse(String s) {
        String[] parts = s.split("\\+|i");
        int real = Integer.parseInt(parts[0]);
        int imag = Integer.parseInt(parts[1]);
        return new int[]{real, imag};
    }
}
