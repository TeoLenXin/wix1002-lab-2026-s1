package l4q5;

import java.util.Scanner;

public class L4Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int finalScore1 = 0, finalScore2= 0;
        int player1Score, player2Score;
        
        while(finalScore1 <100 && finalScore2 <100){
            do{
                System.out.print("1st Player turn : ");
                player1Score = input.nextInt();
                finalScore1 += player1Score;
                
            }while(player1Score==6 && finalScore1<100);
            
            if(finalScore1>=100){
                break;
            }
            
            do{
                System.out.print("2nd Player turn : ");
                player2Score = input.nextInt();
                finalScore2 += player2Score;
                
            }while(player2Score==6 && finalScore2<100);
            
            
            System.out.println();
            System.out.println("Player 1 Score : "+finalScore1);
            System.out.println("Player 2 Score : "+finalScore2);
        }
        if(finalScore1>=100){
            System.out.println("PLayer 1 Wins");
        }else {
            System.out.println("Player 2 Wins");
        }
    }
}