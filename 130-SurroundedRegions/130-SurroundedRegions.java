// Last updated: 3/6/2026, 12:38:17 PM
1class Solution {
2    public void solve(char[][] board) {
3        int m = board.length;
4        int n = board[0].length;
5
6        Queue<int[]> q = new LinkedList<>();
7
8        for(int i=0;i<m;i++){
9            if(board[i][0]=='O'){
10                q.add(new int[]{i,0});
11                board[i][0]='#';
12            }
13            if(board[i][n-1]=='O'){
14                q.add(new int[]{i,n-1});
15                board[i][n-1]='#';
16            }
17        }
18
19        for(int j=0;j<n;j++){
20            if(board[0][j]=='O'){
21                q.add(new int[]{0,j});
22                board[0][j]='#';
23            }
24            if(board[m-1][j]=='O'){
25                q.add(new int[]{m-1,j});
26                board[m-1][j]='#';
27            }
28        }
29
30        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
31
32        while(!q.isEmpty()){
33            int[] cur = q.poll();
34
35            for(int[] d : dir){
36                int x = cur[0] + d[0];
37                int y = cur[1] + d[1];
38
39                if(x>=0 && y>=0 && x<m && y<n && board[x][y]=='O'){
40                    board[x][y] = '#';
41                    q.add(new int[]{x,y});
42                }
43            }
44        }
45
46        for(int i=0;i<m;i++){
47            for(int j=0;j<n;j++){
48                if(board[i][j]=='O') board[i][j]='X';
49                if(board[i][j]=='#') board[i][j]='O';
50            }
51        }
52    }
53}