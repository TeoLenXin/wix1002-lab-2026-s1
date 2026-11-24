package l6q3;

import java.util.Arrays;
import java.util.Random;

public class L6Q3 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new  Random();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10001);
        }
        System.out.println("Original : "+Arrays.toString(arr));
        reversed(arr);
        System.out.println("Reversed : "+Arrays.toString(arr));
        
    }
    
    public static void reversed(int[] num){
        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            while(num[i]>0){
                int temp = num[i]%10;
                num[i] = num[i]/10;
                sum = sum*10 +temp;
            }
            num[i]= sum;
        }
    }
}
