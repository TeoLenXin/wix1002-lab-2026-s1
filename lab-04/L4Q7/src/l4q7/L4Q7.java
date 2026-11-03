package l4q7;

import java.util.Scanner;

public class L4Q7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        double P = sc.nextDouble();
        System.out.print("Enter interest in %  : ");
        double i = sc.nextDouble();
        System.out.print("Enter total number of months : ");
        double N = sc.nextDouble();
        double sumOfInterest = 0;
        double unpaidBalance = P;
        
        System.out.println("Month \tMonthly Payment \tPrinciple \tInterest \tUnpaid Balance \tTotal Interest");
        
        for (int n = 1; n <= N; n++) {
            double a = i/1200;
            double M = ((P*a)/(1-Math.pow((1+a), -N)));
            double C = (M*(Math.pow((1+a),(-(1+N-n)))));
            double L = (M-C);
            double R = (L/(a-C));
            sumOfInterest +=L;
            unpaidBalance -= C;
            System.out.printf("%d \t%.2f \t\t%.2f \t\t%.2f \t\t%.2f \t\t%.2f",n,M,C,L,unpaidBalance, sumOfInterest);
            System.out.println();
        }
        
    }
}