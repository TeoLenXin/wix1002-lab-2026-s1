package l5q3;

import java.util.Random;
import java.util.Scanner;

public class L5Q3 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        int N = input.nextInt();
        
        int[][] workHour = new int[N][7];
        int[] total = new int[N];
        
        for(int i=0;i<N;i++){
            System.out.println();
            System.out.println("Employee "+(i+1));
            System.out.println("Day1\tDay2\tDay3\tDay4\tDay5\tDay6\tDay7");
            
            for(int j=0;j<7;j++){
                workHour[i][j] = random.nextInt(8)+1;
                total[i]  = total[i] + workHour[i][j];
                System.out.print(workHour[i][j]+"\t");
            }
            System.out.println();
            System.out.println("Total Hours: "+total[i]);
            
            
        }
    }
    
}
