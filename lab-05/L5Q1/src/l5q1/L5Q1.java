package l5q1;

import java.util.Random;
import java.util.Scanner;

public class L5Q1 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N student: ");
        int student = input.nextInt();
        
        int[] storeScores = new int[student];
        
        int highest=0;
        int lowest=100;
        int sum=0;
        double average;
        
        for(int i=0;i<student;i++){
            int scores = random.nextInt(101);
            storeScores[i]=scores;
            System.out.println(scores);
            sum+=scores;
            
            if(scores>highest){
                highest = scores;
            }else if(scores<lowest){
                lowest =scores;
            }
        }
        average = sum/student;
        System.out.println("Highest score: "+highest);
        System.out.println("Lowest score: "+lowest);
        System.out.println("Average: "+average);
    }
}
