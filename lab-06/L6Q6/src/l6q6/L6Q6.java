package l6q6;

public class L6Q6 {

    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        
        System.out.println("First 20 Palindromic Primes: ");
        while(count<10){
            if(isPalindromicPrime(num)){
                System.out.print(num+" ");
                count++;
                
            }
            num++;
        }
        System.out.println();
        System.out.println("First 20 Emirps number : ");
        
        int count2 = 0;
        int num2 = 2;
        
        while(count2<10){
            if(isEmirp(num2)){
                System.out.print(num2+" ");
                count2++;
                
            }
            num2++;
        }
    }
    
    public static boolean isPalindromicPrime(int a){
        return isPrime(a) && a == reverse(a);
    }
    
    public static boolean isEmirp(int a){
        return isPrime(a) && isPrime(reverse(a)) && a != reverse(a);
    }
       
    public static int reverse(int a){
        int sum = 0;
        while(a>0){
            int temp = a%10;
        a = a/10;
        sum = sum*10+temp;
        }
        return sum;
    }    
        
    public static boolean isPrime(int a){
        if(a<2){
            return false;
        }
        for (int i =2; i < a; i++) {
            if(a%i ==0){
                return false;
            }
        }
        
        return true;
    }
}
