// Last updated: 12/20/2025, 12:07:15 PM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int count = 0;
4        for(int i = 0; i < strs[0].length(); i++){
5            for(int j = 0; j < strs.length - 1; j++){
6                if((int) strs[j].charAt(i) <= (int) strs[j + 1].charAt(i)){
7                    continue;
8                }
9                else{
10                    count++;
11                    break;
12                }
13            }
14        }
15        return count;
16    }
17}
18