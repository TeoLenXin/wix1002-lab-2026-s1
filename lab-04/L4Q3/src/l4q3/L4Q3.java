package l4q3;

import java.util.Scanner;

public class L4Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, sum = 0, sum_sq =0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        int count = 0;
        boolean negetive = true;
        
        while(negetive){
            System.out.print("Enter a score [negetive score to quit] : ");
            n = sc.nextInt();
            if(n<0){
                negetive = false;
                break;
            }
            
            if(n>max){
                max = n;
            }
            if(n<min){
                min = n;
            }
            count++;
            sum +=n;
            sum_sq += (n*n);
        }
        double average = sum/count;
        double std = Math.sqrt(((sum_sq)-((sum*sum)/count))/(count-1));
        
        System.out.println("");
        System.out.println("Minimum Score : "+min);
        System.out.println("Maximum Score : "+max);
        System.out.printf("Average Score : %.2f\n",average);
        System.out.printf("Standard Deviation : %.2f\n",std);
        
    }
}