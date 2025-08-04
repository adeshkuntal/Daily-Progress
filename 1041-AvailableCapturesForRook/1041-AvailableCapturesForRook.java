// Last updated: 8/4/2025, 6:52:25 PM
class Solution {
    public int numRookCaptures(char[][] board) {
        int captures = 0;
        int[] rookPosition = findRook(board);

        int rx = rookPosition[0];
        int ry = rookPosition[1];

        
        captures += checkDirection(board, rx, ry, -1, 0);  
        captures += checkDirection(board, rx, ry, 1, 0);   
        captures += checkDirection(board, rx, ry, 0, -1); 
        captures += checkDirection(board, rx, ry, 0, 1);  

        return captures;
    }
    private static int[] findRook(char[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    private static int checkDirection(char[][] board, int x, int y, int dx, int dy) {
        while (0 <= x && x < 8 && 0 <= y && y < 8) {
            if (board[x][y] == 'B') {
                return 0;
            }
            if (board[x][y] == 'p') {
                return 1;
            }
            x += dx;
            y += dy;
        }
        return 0;
    }
}