// Last updated: 2/26/2026, 9:52:19 PM
1class Solution {
2    public int maximum69Number (int num) {
3        String s = String.valueOf(num);
4        int[] arr = new int[s.length()];
5        for(int i = 0; i < s.length(); i++){
6            arr[i] = s.charAt(i) - '0';
7        }
8        for(int i=0; i<arr.length; i++){
9            if(arr[i] == 6){
10                arr[i] = 9;
11                break;
12            }
13        }
14
15        int n = 0;
16        for(int j = 0; j < arr.length; j++){
17            n = n * 10 + arr[j];
18        }
19        return n;
20    }
21}