// Last updated: 1/9/2026, 2:49:29 PM
1class Solution {
2    public int countSubstrings(String s) {
3        int odd = 0;
4        for(int axis=0; axis<s.length(); axis++){
5            for(int orbit=0; axis-orbit>=0 && axis+orbit<s.length(); orbit++){
6                if(s.charAt(axis-orbit) != s.charAt(axis+orbit)){
7                    break;
8                }
9                odd++;
10            }
11            
12        }
13        int even = 0;
14        for(double axis=0.5; axis<s.length(); axis++){
15            for(double orbit=0.5; axis-orbit>=0 && axis+orbit<s.length(); orbit++){
16                if(s.charAt((int) (axis-orbit)) != s.charAt((int) (axis+orbit))){
17                    break;
18                }
19                even++;
20            }
21            
22        }
23
24        return even + odd;
25    }
26}