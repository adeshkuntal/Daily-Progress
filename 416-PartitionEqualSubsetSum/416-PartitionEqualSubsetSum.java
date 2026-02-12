// Last updated: 2/12/2026, 12:48:56 PM
1// class Solution {
2//     public int[] dailyTemperatures(int[] t) {
3//         int[] ans = new int[t.length];
4//         for(int i=0; i<t.length; i++){
5//             boolean flag = false;
6//             int count = 1;
7//             for(int j=i+1; j<t.length; j++){
8//                 if(t[j] > t[i]){
9//                     ans[i] = count;
10//                     flag = true;
11//                     break;
12//                 }
13//                 count++;
14//             }
15//             if(!flag){
16//                 ans[i] = 0;
17//             }
18//         }
19//         return ans;
20//     }
21// }
22
23
24class Solution {
25    public int[] dailyTemperatures(int[] temp) {
26        int[] ans = new int[temp.length];
27        Stack<Integer> stack = new Stack<>();
28
29        for (int i = 0; i < temp.length; i++) {
30            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
31                int prevIndex = stack.pop();
32                ans[prevIndex] = i - prevIndex;
33            }
34            stack.push(i);
35        }
36
37        return ans;
38    }
39}