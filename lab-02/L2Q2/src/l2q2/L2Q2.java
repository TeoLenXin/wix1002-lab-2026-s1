package l2q2;

import java.util.Scanner;

public class L2Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the price of the car: ");
        double P = input.nextDouble();
        
        System.out.print("Enter down payment: ");
        double D = input.nextDouble();
        
        System.out.print("Enter interest rate in %: ");
        double R = input.nextDouble();
        
        System.out.print("Enter loan duration in year: ");
        int Y = input.nextInt();
        
        double M = (P-D)*(1+R*Y/100.0)/(Y*12);
        
        System.out.printf("Monthly payment: %.2f%n",M);      
    }
    
}
