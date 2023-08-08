class Solution {
    public String tictactoe(int[][] moves) {
        int n = moves.length;
        char[][] board = new char[3][3];
        for(int i =0; i < 3; i++){
            for(int j =0; j < 3; j++){
                board[i][j] = '.';
            }
        }
        for(int i =0; i < n; i ++){
        
                if(i %2 == 0){
                    board[moves[i][0]][moves[i][1]] =  'X'; 
                }
                else{
                    board[moves[i][0]][moves[i][1]] =  '0';  
                }
        }
       return checkBoard(board);
    }
     public String checkBoard(char[][] board){
        //  check the cols
       
        for(int j =0; j < 3; j++){
         int countA =0;
        int countB =0;
            for(int i = 0; i < 3; i++){
                if(board[i][j] == 'X'){
                    countA++;
                }
                else if(board[i][j] == '0'){
                    countB++;
                }
            }
        if(countA == 3) return "A";
        if(countB == 3) return "B";
        }
      
         for(int j =0; j < 3; j++){
           int  countA =0;
           int  countB =0;
            for(int i = 0; i < 3; i++){
                if(board[j][i] == 'X'){
                    countA++;
                }
                else if(board[j][i] == '0'){
                    countB++;
                }
            }
              if(countA == 3) return "A";
              if(countB == 3) return "B";
        }
      
         // check diognal
        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') return "A";
        if(board[0][0] == '0' && board[1][1] == '0' && board[2][2] == '0') return "B";
        // check anti diognal
        if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') return "A";
        if(board[0][2] == '0' && board[1][1] == '0' && board[2][0] == '0') return "B";
        // check for Draw/ pending conditions
        int c = 0;
        for(int i = 0; i < 3; i++){
            for(int j =0; j < 3 ; j++){
                if(board[i][j] == 'X'|| board[i][j] == '0'){
                    c++;
                }
            }
        }
        
        if(c != 9){
            return "Pending";
        }
        else{
            return "Draw";
        }

     }



}