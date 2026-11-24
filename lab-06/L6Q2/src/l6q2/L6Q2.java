package l6q2;

public class L6Q2 {

    public static void main(String[] args) {
        int n = 5;
        char c = '#';
        
        System.out.println("\nTriangle :");
        
        for (int i = 0; i < n; i++) {
            multiPrint(n-i-1, ' ');
            multiPrint(2*i+1, c); 
            System.out.println();
            
        }
        
        System.out.println("\nDiamond: ");
        
        for (int i = 0; i < n; i++) {
            multiPrint(n-i-1, ' ');
            multiPrint(2*i+1, c); 
            System.out.println();
            
        }
        
        for (int i = n-2; i >= 0; i--) {
            multiPrint(n-i-1, ' ');
            multiPrint(2*i+1, c); 
            System.out.println();
            
        }
    }
    
    public static void multiPrint(int n , char c){
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

}