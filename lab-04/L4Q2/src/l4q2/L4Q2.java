package l4q2;

import java.util.Scanner;

public class L4Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter integer n: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            int sumOfSeries=0;
            if(i>1){
                System.out.print(" + (");
            }
            for (int j = 1; j <=i; j++) {
                sumOfSeries += j;
                
                if(j>1){
                    System.out.print("+");
                }System.out.print(j);
            }
            if(i>1){
                System.out.print(")");
            }
            sum += sumOfSeries;
        }
        System.out.println(" = "+sum);
    }
}
