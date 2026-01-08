// Last updated: 1/8/2026, 1:23:05 PM
1class Solution {
2    public void solveSudoku(char[][] board) {
3        fill_sudoku(board, 0, 0);
4    }
5
6    public boolean fill_sudoku(char[][] board, int row, int col) {
7        if (row == 9) return true;
8
9        if (col == 9) {
10            return fill_sudoku(board, row + 1, 0);
11        }
12
13        if (board[row][col] != '.') {
14            return fill_sudoku(board, row, col + 1);
15        }
16
17        for (int i = 1; i <= 9; i++) {
18            char ch = (char)(i + '0');
19            if (isSafe(board, row, col, ch)) {
20                board[row][col] = ch;
21                if (fill_sudoku(board, row, col + 1)){
22                    return true;
23                }
24                board[row][col] = '.';
25            }
26        }
27        return false;
28    }
29
30    public boolean isSafe(char[][] board, int row, int col, char val) {
31        for (int i = 0; i < 9; i++) {
32            if (board[row][i] == val) return false;
33            if (board[i][col] == val) return false;
34        }
35
36        int sr = (row / 3) * 3;
37        int sc = (col / 3) * 3;
38
39        for (int i = sr; i < sr + 3; i++) {
40            for (int j = sc; j < sc + 3; j++) {
41                if (board[i][j] == val) return false;
42            }
43        }
44        return true;
45    }
46}
47