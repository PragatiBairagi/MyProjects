package com.company;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game(){
        Random ran  = new Random();
        this.number = ran.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("WOW! you guessed it right :) ,it was %d\nYou guessed it in %d attempts",
                    number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low");
        }
        else if(inputNumber>number){
            System.out.println("Too high");
        }
        return false;
    }
}

public class Ch_quiz_guessTheNo {
    public static void main(String[] args) {
         /*
          Create a class Game, which allows a user to play "Guess the number"
          game once. Game should have the following number
          1. Constructor to generate the random number
          2. takeUserInput to take a user input of number
          3. isCorrectNumber() to detect whether the number is true
          4. getter and setter for noOfGuesses
             use properties such as noOfGuesses(int), etc to get this task done!
         */
        System.out.println("DISCLAIMER - apko is game ki adat lag sakti hai ,anyway....");
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();

        }
    }
}


