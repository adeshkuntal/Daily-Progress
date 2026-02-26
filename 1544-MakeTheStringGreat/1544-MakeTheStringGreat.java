// Last updated: 2/26/2026, 9:34:14 PM
1// class Solution {
2//     public String makeGood(String s) {
3//         StringBuilder str = new StringBuilder(s);
4//         for(int i = 0; i < str.length() - 1; i++){
5//             if(Math.abs(str.charAt(i) - str.charAt(i+1)) == 32){
6//                 str.delete(i, i+2);
7//                 i = -1;
8//             }
9//         }
10        
11//         return str.toString();
12//     }
13// }
14
15
16class Solution {
17    public String makeGood(String s) {
18        StringBuilder str = new StringBuilder();
19        for(int i = 0; i < s.length(); i++){
20            char ch = s.charAt(i);
21            if(str.length() > 0 && Math.abs(str.charAt(str.length()-1) - ch) == 32){
22                str.deleteCharAt(str.length()-1);
23            }
24            else{
25                str.append(ch);
26            }
27        }
28        return str.toString();
29    }
30}
31