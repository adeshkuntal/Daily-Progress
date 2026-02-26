// Last updated: 2/26/2026, 9:48:52 PM
1class Solution {
2    public int maximum69Number (int num) {
3        int max = num;
4        String s = String.valueOf(num);
5        int[] arr = new int[s.length()];
6        
7        for(int i = 0; i < s.length(); i++){
8            arr[i] = s.charAt(i) - '0';
9        }
10        for(int i=0; i<arr.length; i++){
11            if(arr[i] == 6){
12                arr[i] = 9;
13            }
14            else{
15                arr[i] = 6;
16            }
17            int n = 0;
18            for(int j = 0; j < arr.length; j++){
19                n = n * 10 + arr[j];
20            }
21            max = Math.max(max,n);
22            if(arr[i] == 6){
23                arr[i] = 9;
24            }
25            else{
26                arr[i] = 6;
27            }
28        }
29
30        return max;
31    }
32}