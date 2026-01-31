// Last updated: 1/31/2026, 7:46:07 PM
1class Solution {
2    public char nextGreatestLetter(char[] l, char target) {
3        int left = 0;
4        int right = l.length-1;
5        while(left <= right){
6            int mid = left + (right-left) / 2;
7            if(l[mid] > target){
8                right = mid-1;
9            }
10            else{
11                left = mid+1;;
12            }
13        }
14
15        return l[left%l.length];
16    }
17}