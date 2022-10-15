package org.kodluyoruz;

public class GameRule {
    public static int calculateScore(String[][] game , int size) {
       int score =0;
        
      
       return score;
    }

    public static void  winPlayer(int humanPoint,int computerPoint) {
      
            
        
        if(humanPoint<computerPoint){
           System.out.println("Oyunu bilgisayar kazandı"); 
        }else if(humanPoint>computerPoint){
            System.out.println("Oyunu Gerçek oyuncu kazandı");
        }
        else if(humanPoint == computerPoint){
            System.out.println("Bilgisayar ile gerçek oyuncu berabere kaldı");
        }
      
    }
  
    
}
