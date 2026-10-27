package l3q6;

import java.util.Scanner;

public class L3Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        
        System.out.print("Enter x-coordinate: ");
        double x = input.nextDouble();
        
        System.out.print("Enter y-coordinate: ");
        double y = input.nextDouble();
        
        double z = Math.sqrt(x*x+y*y);
        
        if(z<=radius){
            System.out.println("The point is inside the circle.");
        }else if(z>radius){
            System.out.println("The point is outside the circle.");
        }
    }
    
}
