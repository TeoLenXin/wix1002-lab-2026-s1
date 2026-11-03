package l4q4;

import java.util.Scanner;

public class L4Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        
        System.out.print("Enter day (0=Sun , 1=Mon, ..... 6=Sat) : ");
        int day = sc.nextInt();
        
        for (int month = 1; month <=8; month++) {
            int days = 31;
            if(month ==4 || month == 6){
                days = 30;
            }else if (month ==2){
                if((year%400==0)||(year%4==0 && year %100!=0)){
                days = 29;
            }else{
                    days = 28;
                }
            }
            
            if(month == 5 || month == 8){
                if(month==5){
                    System.out.println("\nMay "+ year);
                }else
                    System.out.println("\nAugust "+ year);
                
                System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
                for (int i = 0; i < day; i++) {
                    System.out.print("     ");
                }
                
                for (int date = 1; date <= days; date++) {
                    System.out.printf("%-5d", date);
                    day = (day+1)%7;
                    
                    if(day==0){
                        System.out.println();
                    }
                }
                System.out.println();
            }else {
                day = (day+days)%7;
            }
            
        }
    }
}