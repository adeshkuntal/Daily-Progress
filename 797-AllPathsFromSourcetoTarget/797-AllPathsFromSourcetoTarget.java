// Last updated: 1/2/2026, 2:59:52 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> res = new ArrayList<>();
4        fn(n, n, "", res);
5        return res;
6    }
7
8    public static void fn(int close, int open, String ans, List<String> res) {
9        if (open == 0 && close == 0) {
10            res.add(ans);
11            return;
12        }
13
14        if (open > 0) {
15            fn(close, open - 1, ans + "(", res);
16        }
17
18        if (close > open) {
19            fn(close - 1, open, ans + ")", res);
20        }
21    }
22}
23