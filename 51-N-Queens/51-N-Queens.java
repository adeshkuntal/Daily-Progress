// Last updated: 3/18/2026, 10:16:40 PM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        List<List<String>> allBoards = new ArrayList<>();
4        char[][] board = new char[n][n];
5        for (int i = 0; i < n; i++) {
6            Arrays.fill(board[i], '.');
7        }
8        place_queen(board, allBoards, 0);
9        return allBoards;
10    }
11    public void place_queen(char[][] board,List<List<String>> allBoards,int col){
12        if(col >= board.length){
13            saveBoard(board,allBoards);
14            return;
15        }
16        for(int row=0; row<board.length; row++){
17            if(isSafe(row,col,board)){
18                board[row][col] = 'Q';
19                place_queen(board,allBoards,col+1);
20                board[row][col] = '.';
21            }
22        }
23    }
24    public static void saveBoard(char[][] board, List<List<String>> allBoards){
25        List<String> curr = new ArrayList<>();
26        for(int i=0; i<board.length; i++){
27            String s = "";
28            for(int j=0; j<board.length; j++){
29                s += board[i][j];
30            }
31            curr.add(s);
32        }
33        allBoards.add(curr);
34    }
35    
36    public boolean isSafe(int row,int col,char[][] board){
37        for(int r=row,c = col; r>=0 && c>=0; r--,c--){
38            if(board[r][c] == 'Q'){
39                return false;
40            }
41        }
42        for(int r=row,c = col; r<board.length && c>=0; r++,c--){
43            if(board[r][c] == 'Q'){
44                return false;
45            }
46        }
47        for(int c = col; c>=0; c--){
48            if(board[row][c] == 'Q'){
49                return false;
50            }
51        }
52        return true;
53    }
54}