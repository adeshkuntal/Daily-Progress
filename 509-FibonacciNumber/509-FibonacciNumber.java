// Last updated: 12/29/2025, 8:27:55 PM
1class Solution {
2    public int fib(int n) {
3        if(n == 0){
4            return 0;
5        }
6        if(n == 1){
7            return 1;
8        }
9
10        return fib(n-2)+fib(n-1);
11    }
12}