package l6q4;

public class L6Q4 {

    public static void main(String[] args) {
        int a = 200;
        int b =625;
        System.out.println("GCD : "+GCD(a,b));
    }
    
    public static int GCD(int num1 , int num2){
        while(num2!=0){
            
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
        
    }  
}
