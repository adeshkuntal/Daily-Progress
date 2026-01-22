// Last updated: 1/22/2026, 12:14:41 PM
1class Solution {
2    private static int max = 1000000007;
3    public int monkeyMove(int n) {         
4         return (int) ((max + pow(n) - 2) % max);
5    }
6    public static long pow(int n) {
7		if (n == 1)
8			return 2;
9		if (n % 2 == 0) {
10			long half = pow(n / 2);
11			return (half * half) % max;
12		} else {
13			long half = pow(n / 2);
14			return ((half * half) % max) * 2 % max;
15		}
16		
17	}
18}