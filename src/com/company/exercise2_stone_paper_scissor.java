package com.company;

import java.util.Random;
import java.util.Scanner;

public class exercise2_stone_paper_scissor {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for rock or 2 for paper or 3 for scissor");
        int player1 = ran.nextInt(4);
        int player2 = sc.nextInt();
        if((player1==1 && player2==3) || (player1==2 && player2==1) ||(player1==3 && player2==2)) {
            System.out.println("Player1 generated no. : " + player1 + " \n& Player1  gets a point");
        }
        else if((player1==player2)){
            System.out.println("Player1 generated no. : "+ player1+ " \n & Its a tie");
        }
        else{
            System.out.println("Player1 generated no. : "+ player1+" \n& Player2  gets a point");
        }
        System.out.println("the randomly generated no. is : "+ player1);

    }
}
