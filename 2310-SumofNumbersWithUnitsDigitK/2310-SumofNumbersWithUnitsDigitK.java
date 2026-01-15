// Last updated: 1/15/2026, 12:41:24 PM
1class Solution {
2    public int minimumNumbers(int num, int k) {
3        if(num == 0){
4            return 0;
5        }
6       
7        for(int i=1; i<=10; i++){
8            if((k*i)%10 == num%10 && k*i <= num){
9               return i;
10            }
11        }
12
13        return -1;
14    }
15}