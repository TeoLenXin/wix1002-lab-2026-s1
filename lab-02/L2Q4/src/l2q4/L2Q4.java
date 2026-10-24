package l2q4;

import java.util.Scanner;

public class L2Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hours;
        int minutes;
        int seconds;
        int secondsremain;
                
        System.out.print("Enter the number of seconds: ");
        seconds = input.nextInt();
        
        hours = seconds/3600;
        minutes = (seconds%3600)/60;
        secondsremain= (seconds%3600)%60;
        
        System.out.print(seconds+" seconds is "); 
        System.out.print(hours+" hours, ");
        System.out.print(minutes+" minutes and ");
        System.out.println(secondsremain+" seconds");
        
    }
    
}
