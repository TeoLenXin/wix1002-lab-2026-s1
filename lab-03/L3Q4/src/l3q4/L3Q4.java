package l3q4;

import java.util.Random;

public class L3Q4 {

    public static void main(String[] args) {
        Random random = new Random();
        
        int p1dice1 = random.nextInt(6)+1;
        int p1dice2 = random.nextInt(6)+1;
        int p2dice1 = random.nextInt(6)+1;
        int p2dice2 = random.nextInt(6)+1;
        
        int player1 = p1dice1 + p1dice2;
        int player2 = p2dice1 + p2dice2;
        
        System.out.println("Player 1 score: "+player1);
        System.out.println("Player 2 score: "+player2);
        
        if (player1>player2){
            System.out.println("Player 1 wins!");
        }else{
            System.out.println("Player 2 wins!");
        }
    }
    
}
