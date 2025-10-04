// Last updated: 10/4/2025, 8:26:36 PM
import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<board.length; i+=3){
            for(int j=0; j<board[0].length; j+=3){
                int row = i;
                int col = j;
                HashSet<Character> set = new HashSet<>();
                while(row < i+3){
                    char ch = board[row][col];
                    if(ch != '.'){
                        if(set.contains(ch)){
                            return false;
                        }
                        set.add(ch);
                        boolean flag = dfs(board,ch,row,col);
                        if(!flag){
                            return false;
                        }
                    }
                    col++;
                    if(col == j+3){
                        col = j;
                        row++;
                    }
                }
                set.clear();
            }
        }
        return true;
    }

    private boolean dfs(char[][] board, char ch, int row, int col) {
        for(int k=0; k<9; k++){
            if(board[row][k] == ch && k != col) return false;
            if(board[k][col] == ch && k != row) return false;
        }
        return true;
    }
}
