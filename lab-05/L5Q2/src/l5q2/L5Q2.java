package l5q2;

import java.util.Random;

public class L5Q2 {

    public static void main(String[] args) {
        Random random = new Random();
        
        int[] integers = new int[10];
        
        for(int i=0;i<integers.length;i++){
            int integer = random.nextInt(21);
            
            integers[i] = integer;

            for(int j=1;j<integers.length;j++){
                if(integers[i]==integers[j]){
                    integers[i] = random.nextInt(21);
                }
            }

            System.out.println(integers[i]);
        }
    }  
}
