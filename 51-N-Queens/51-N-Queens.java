// Last updated: 3/2/2026, 10:28:30 PM
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
11    public static void place_queen(char[][] board, List<List<String>> allBoards, int col){
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
25        List<String> newBoard = new ArrayList<>();
26        for(int row=0; row<board.length; row++){
27            String s = "";
28            for(int col=0; col<board.length; col++){
29                s += board[row][col];
30            }
31            newBoard.add(s);
32        }
33        allBoards.add(newBoard);
34    }
35    public static boolean isSafe(int row, int col, char[][] board){
36        for(int r=row,c = col; r>=0 && c>=0; r--,c--){
37            if(board[r][c] == 'Q'){
38                return false;
39            }
40        }
41        for(int r=row,c = col; r<board.length && c>=0; r++,c--){
42            if(board[r][c] == 'Q'){
43                return false;
44            }
45        }
46        for(int c = col; c>=0; c--){
47            if(board[row][c] == 'Q'){
48                return false;
49            }
50        }
51        return true;
52
53    }
54}