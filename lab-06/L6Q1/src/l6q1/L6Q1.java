package l6q1;

public class L6Q1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            
            System.out.print(triangular(i));
            if(i<20){
                System.out.print(", ");
            }
    }
            System.out.println();
        }
    
    public static int triangular (int n){
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        
        return sum;
    }
}