package l6q5;

import java.util.Random;
import java.util.Scanner;

public class L6Q5 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int a ;
        int count =0;
        
        while(true){
            int num1  =rand.nextInt(13);
            int num2  =rand.nextInt(13);
            System.out.println("Enter negetive number to quit : ");
            System.out.print(num1+" x "+num2+" = ");
            
            a =sc.nextInt();
            if(a<0){
                break;
            }
            if(check(num1,num2,a)){
                count++;
            }
        }
        System.out.println("Your score is : "+count);
    }
    public static boolean check (int a , int b , int c){
        return a*b ==c ;
    }
}
