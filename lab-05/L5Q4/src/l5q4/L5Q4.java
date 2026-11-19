package l5q4;

public class L5Q4 {

    public static void main(String[] args) {
        int[][] matrix = {
            {1,5,7},
            {3,6,9},
            {5,3,8}
        };
        
        System.out.println("3 by 3 Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("After rotates 90 degrees clockwise");
        for(int i=0;i<3;i++){
            for(int j=2;j>=0;j--){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
