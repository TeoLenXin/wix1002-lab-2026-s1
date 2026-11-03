package l4q1;

import java.util.Scanner;

public class L4Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int integer = input.nextInt();
        
        System.out.print("Factors are: ");
        
        int factors = 0;
        
        for(int i=1;i<=integer;i++){
            if((integer%i)==0){
                System.out.print(i);
                if(i<integer){
                    System.out.print(", ");
                }else
                    System.out.print("");   
            }
        }
    }  
}
