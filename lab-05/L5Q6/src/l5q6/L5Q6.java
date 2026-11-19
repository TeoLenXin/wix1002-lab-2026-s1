package l5q6;

import java.util.Scanner;

public class L5Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int num = input.nextInt();
        
        int[][] pascalTri = new int[num][num];
        
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    pascalTri[i][j] = 1;
                }else{
                    pascalTri[i][j] = pascalTri[i-1][j-1]+pascalTri[i-1][j];
                }
            }
        }
        
        System.out.println("The Pascal Triangle with "+num+" row(s)");
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.printf(" %4d ",pascalTri[i][j]);
            }
            System.out.println();
        }
    }
    
}
