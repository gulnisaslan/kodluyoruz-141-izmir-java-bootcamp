package org.kodluyoruz;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        //Game Board Size
        System.out.print("Tablo Boyutunu giriniz: ");
        int gridSize= input.nextInt();
   
        //point
        int humanPoint=0;
        int computerPoint=0;
    
        if(gridSize>=5 && gridSize<=10){
            String[][] gameBoard = new String[gridSize][gridSize];
            while (true) {
                System.out.println("Human Point : " + humanPoint);
                System.out.println("Computer Point:" + computerPoint);
                GameBoard.printGameBoard(gameBoard);

                int selectPlayer = random.nextInt(2);
                String player = selectPlayer == 1 ? "Human":"Computer";

                //game Board row and column Human
                if(player.equals("Human")){
                System.out.print("Satır numarasını giriniz: ");
                int row = input.nextInt();
                System.out.print("Sutun Numarası giriniz:  ");
                int column = input.nextInt();
                     //S-O value 
                System.out.print("S yada O Giriniz: ");
                String value_ = input.next();
                GameBoard.printSOrO(gameBoard, row, column, value_);
                humanPoint += GameRule.calculateScore(gameBoard,gridSize);
                }
                if(player.equals("Computer")){
                //Column and row for computer
                String[] arr = {"S","O"};
                int sO = arr.length;
                String randomSOForComputer = arr[random.nextInt(sO)];
             
                int row1= random.nextInt(gridSize);
                int column1 = random.nextInt(gridSize);
                String value1= randomSOForComputer ;
                GameBoard.printSOrO(gameBoard, row1, column1, value1);
                
                computerPoint += GameRule.calculateScore(gameBoard,gridSize);
                }
               
                GameRule.winPlayergameBoard,humanPoint,computerPoint);

                
                GameBoard.printGameBoard(gameBoard);
               
            }
        }
        else{
            System.out.println("5 ile 10 arası bir değer giriniz");
        }
    }
   

 
}
