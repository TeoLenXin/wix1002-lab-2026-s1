package l3q5;

import java.util.Scanner;

public class L3Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter value b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter value c: ");
        double c = input.nextDouble();
        
        System.out.print("Enter value d: ");
        double d = input.nextDouble();
        
        System.out.print("Enter value e: ");
        double e = input.nextDouble();
        
        System.out.print("Enter value f: ");
        double f = input.nextDouble();
        
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        
        if (((a*d)-(b*c)) == 0){
            System.out.println("The equation has no solution");
        }else{
            System.out.println("Value x: "+x);
            System.out.println("Value y: "+y);
        }
    }
    
}
