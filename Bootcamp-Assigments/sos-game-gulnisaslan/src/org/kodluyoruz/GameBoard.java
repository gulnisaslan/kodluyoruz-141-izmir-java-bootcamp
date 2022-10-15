package org.kodluyoruz;

public class GameBoard {
       //Print "S" or "O"
       public static void printSOrO(String[][] gameBoard,int row ,int column, String value) {

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if(gameBoard[row][column]==null){
                    gameBoard[row][column]= value;
                }
                
            }         
        }  
    }


    //Print table
    public static void printGameBoard(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
               System.out.print(gameBoard[i][j]+"_");
            }
          System.out.println();
        }
    }

    
}
