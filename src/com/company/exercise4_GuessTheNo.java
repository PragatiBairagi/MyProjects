package com.company;
import java.util.*;

public class exercise4_GuessTheNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        while(true) {
            System.out.println("guess the random no. up to 100!!");
            int n = sc.nextInt();
            if(n<randomNumber){
                System.out.println("the no. is greater than "+n);
            }
            else if(n>randomNumber){
                System.out.println("the no. is lesser than "+n);
            }
            else {
                System.out.println("you guessed the correct no.!! that is --> "+randomNumber);
            }
        }
    }
}
