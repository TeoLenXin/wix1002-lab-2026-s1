package l3q1;

import java.util.Scanner;

public class L3Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two integer number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        System.out.print("Enter the operand: ");
        char character = input.next().charAt(0);
        
        double result;
         
        if (character == '+'){
            result = num1 + num2;
            System.out.println(num1+" + "+num2+" = "+result);
        }else if(character == '-'){
            result = num1 - num2;
            System.out.println(num1+" - "+num2+" = "+result);
        }else if(character == '*'){
            result = num1*num2;
            System.out.println(num1+" * "+num2+" = "+result);
        }else if(character == '/'){
            result = num1/num2;
            System.out.println(num1+" / "+num2+" = "+result);
        }else if(character == '%'){
            result = num1%num2;
            System.out.println(num1+" % "+num2+" = "+result);
        }
    }
    
}
