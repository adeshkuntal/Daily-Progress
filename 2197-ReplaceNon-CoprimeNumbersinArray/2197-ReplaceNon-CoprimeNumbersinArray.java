// Last updated: 9/16/2025, 7:53:36 PM
class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            stack.push(num);
            while (stack.size() > 1) {
                int b = stack.pop();
                int a = stack.pop();
                int g = gcd(a, b);

                if (g > 1) {
                    int newNum = lcm(a, b);
                    stack.push(newNum); 
                } else {
                    stack.push(a);
                    stack.push(b);
                    break;
                }
            }
        }

        return new ArrayList<>(stack); 
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}