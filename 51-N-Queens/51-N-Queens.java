// Last updated: 3/2/2026, 10:04:08 PM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> solveNQueens(int n) {
5        List<List<String>> allBoards = new ArrayList<>();
6        char[][] board = new char[n][n];
7        for (int i = 0; i < n; i++) {
8            Arrays.fill(board[i], '.');
9        }
10        place_queen(board, allBoards, 0);
11        return allBoards;
12    }
13
14    public static void place_queen(char[][] board, List<List<String>> allBoards, int col) {
15        if (col == board.length) {
16            saveBoard(board, allBoards);
17            return;
18        }
19        for (int row = 0; row < board.length; row++) {
20            if (isSafe(row, col, board)) {
21                board[row][col] = 'Q';
22                place_queen(board, allBoards, col + 1);
23                board[row][col] = '.';
24            }
25        }
26    }
27
28    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
29        List<String> newBoard = new ArrayList<>();
30        for (int i = 0; i < board.length; i++) {
31            String row = "";
32            for (int j = 0; j < board.length; j++) {
33                row += board[i][j];
34            }
35            newBoard.add(row);
36        }
37        allBoards.add(newBoard);
38    }
39
40    public static boolean isSafe(int row, int col, char[][] board) {
41        // upper-left diagonal
42        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
43            if (board[r][c] == 'Q'){
44                return false;
45            }
46        }
47        // left side
48        for (int c = col; c >= 0; c--) {
49            if (board[row][c] == 'Q'){
50                return false;
51            }
52        }
53        // lower-left diagonal
54        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
55            if (board[r][c] == 'Q'){
56                return false;
57            }
58        }
59        return true;
60    }
61}
62