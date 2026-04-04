// Last updated: 4/4/2026, 9:17:41 PM
1class Solution {
2    public String decodeCiphertext(String encodedText, int row) {
3        if(row == 0) return "";
4        
5        int n = encodedText.length();
6        int col = n / row;
7        
8        char[][] grid = new char[row][col];
9        
10        int idx = 0;
11        for(int i = 0; i < row; i++){
12            for(int j = 0; j < col; j++){
13                grid[i][j] = encodedText.charAt(idx++);
14            }
15        }
16        
17        StringBuilder ans = new StringBuilder();
18        
19        for(int i = 0; i < col; i++){
20            int r = 0;
21            int c = i;
22            while(r < row && c < col){
23                ans.append(grid[r][c]);
24                r++;
25                c++;
26            }
27        }
28        
29        // remove trailing spaces
30        int end = ans.length() - 1;
31        while(end >= 0 && ans.charAt(end) == ' '){
32            end--;
33        }
34        
35        return ans.substring(0, end + 1);
36    }
37}