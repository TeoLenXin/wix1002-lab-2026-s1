package l4q6;

import java.util.Random;

public class L4Q6 {

    public static void main(String[] args) {
        Random rand = new Random();
        
        int a = rand.nextInt(Integer.MAX_VALUE);
        int count = 0;
        
        System.out.println("Random Number : "+a);
        
        do{
            a = a/10;
            count++;
        }while(a>0);
        
        System.out.println("Number of digits : "+ count);
    }
}