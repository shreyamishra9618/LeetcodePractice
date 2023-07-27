// class Solution {
//     public String tictactoe(int[][] moves) {
        
//     }
// }

class Solution {
    public String tictactoe(int[][] moves) {
        // even add 1; odd add -1;
        int[] rows = new int[3];
        int[] cols = new int[3];
        int diagonal = 0;
        int antidiagonal = 0;
        for(int i = 0; i < moves.length; i++) {
            int add = i % 2 == 0 ? 1 : - 1;
            int x = moves[i][0];
            int y = moves[i][1];
            
            rows[x] += add;
            cols[y] += add;
            
            if(x == y) {
                diagonal += add;
            }
            
            // anti-diangonal, col = n - row - 1;这是考点；
            if(y == 3 - x - 1) {
                antidiagonal += add;
            }
        }
        if(isAwin(rows, cols, diagonal, antidiagonal)) {
            return "A";
        }
        if(isBwin(rows, cols, diagonal, antidiagonal)) {
            return "B";
        }
        if(moves.length == 9) {
            return "Draw";
        }
        return "Pending";
    }
    
    private boolean isAwin(int[] rows, int[] cols, int diagonal, int antidiagonal) {
        for(int i = 0; i < 3; i++) {
            if(rows[i] == 3 || cols[i] == 3) {
                return true;
            }
        }
        return diagonal == 3 || antidiagonal == 3;
    }
    
    private boolean isBwin(int[] rows, int[] cols, int diagonal, int antidiagonal) {
        for(int i = 0; i < 3; i++) {
            if(rows[i] == -3 || cols[i] == -3) {
                return true;
            }
        }
        return diagonal == -3 || antidiagonal == -3;
    }
}