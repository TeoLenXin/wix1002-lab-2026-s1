package l5q5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L5Q5 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        int[] integers = new int[20];
        
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i=0;i<20;i++){
            integers[i] = random.nextInt(101);
            System.out.print(integers[i]);
            
            if(i<19){
                System.out.print(", ");
            }
        }
        System.out.println();
        
        Arrays.sort(integers);
        
        for(int i=0;i<integers.length/2;i++){
            int temp = integers[i];
            integers[i] = integers[integers.length-1-i];
            integers[integers.length-1-i] = temp;
        }
        
        System.out.println("Array in descending order");
        for(int i=0;i<integers.length;i++){
            System.out.print(integers[i]);
            
            if(i<19){
                System.out.print(", ");
            }
        }
        System.out.println();
        
        System.out.print("Enter a number to search: ");
        int num = input.nextInt();
        
        int linear = linearSearch(integers,num);
        int binary = binarySearch(integers,num);
        
        
        if(linear != -1){
            System.out.println(num+" found");
        }else{
            System.out.println(num+"not found");
        }
        
        System.out.println("Linear search - "+Math.abs(linear)+" loop(s)");
        
        if(binary != -1){
            System.out.println(num+" found");
        }else{
            System.out.println(num+"not found");
        }
        
        System.out.println("Binary search - "+Math.abs(binary)+" loop(s)");
    }

    private static int linearSearch(int[] integers, int num) {
        int count = 0;
        
        for(int i=0;i<integers.length;i++){
            count++;
            
            if(integers[i]==num){
                return count;
            }
        }
        return -count;
    }

    private static int binarySearch(int[] integers, int num) {
        int low = 0;
        int high = integers.length-1;
        int count = 0;
        
        while(low<=high){
            count++;
            
            int middle = low + (high - low)/2;
            int value = integers[middle];
            
            if(value<num){
                high = middle-1;
            }else if(value>num){
                low = middle+1;
            }else{
                return count;
            }
        }
        return -count;
    }
    
}
