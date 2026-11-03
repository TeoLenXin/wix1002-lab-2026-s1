package l4q8;

import java.util.Random;

public class L4Q8 {

    public static void main(String[] args) {
        Random rand = new Random();
        
        int n = rand.nextInt(101);
        int count = 0;
        int num = 2;
        System.out.println("n = "+n);
        System.out.println("First "+n+" prime numbers: ");
        
        while(count<n){
            int divisor =0;
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    divisor++;
                    break;
                }
            }
            
            if(divisor ==0){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}