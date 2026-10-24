package l2q1;

import java.util.Scanner;

public class L2Q1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       double Fahrenheit;
       double Celsius;
       
       System.out.print("Enter temperature in degree fahrenheit: ");
       Fahrenheit = input.nextDouble();
       
       Celsius = (Fahrenheit-32)/1.8;
       
        System.out.printf("%.2f Fahrenheit = %.2f Celsius\n",Fahrenheit,Celsius);
        
    }
    
}

