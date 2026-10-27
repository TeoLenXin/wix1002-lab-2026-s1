package l3q3;

import java.util.Scanner;

public class L3Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Sales Volume: ");
        int salesVolume = input.nextInt();
        
        double commission = 0;
        
        if(salesVolume <= 100){
            commission = salesVolume*0.05;
        }else if(salesVolume>100 && salesVolume<=500){
            commission = salesVolume*0.075;
        }else if(salesVolume>500 && salesVolume<=1000){
            commission = salesVolume*0.1;
        }else if(salesVolume>1000){
            commission = salesVolume*0.125;
        }else{
            System.out.println("Invalid value.");
        }
        
        System.out.printf("Commission is %.2f%n",commission);
    }
    
}
