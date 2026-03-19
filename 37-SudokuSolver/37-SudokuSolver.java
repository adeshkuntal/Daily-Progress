// Last updated: 3/19/2026, 12:29:13 PM
1class Solution {
2    boolean[][] row = new boolean[9][10];
3    boolean[][] col = new boolean[9][10];
4    boolean[][] box = new boolean[9][10];
5
6    public void solveSudoku(char[][] board) {
7
8        for(int i=0;i<9;i++){
9            for(int j=0;j<9;j++){
10                if(board[i][j] != '.'){
11                    int num = board[i][j]-'0';
12                    row[i][num] = true;
13                    col[j][num] = true;
14                    box[(i/3)*3 + j/3][num] = true;
15                }
16            }
17        }
18
19        fill(board,0,0);
20    }
21
22    public boolean fill(char[][] board,int r,int c){
23        if(r==9) return true;
24
25        if(c==9) return fill(board,r+1,0);
26
27        if(board[r][c] != '.'){
28            return fill(board,r,c+1);
29        }
30
31        for(int num=1;num<=9;num++){
32            int b = (r/3)*3 + c/3;
33
34            if(!row[r][num] && !col[c][num] && !box[b][num]){
35                board[r][c] = (char)(num+'0');
36                row[r][num] = col[c][num] = box[b][num] = true;
37
38                if(fill(board,r,c+1)) return true;
39
40                board[r][c] = '.';
41                row[r][num] = col[c][num] = box[b][num] = false;
42            }
43        }
44
45        return false;
46    }
47}