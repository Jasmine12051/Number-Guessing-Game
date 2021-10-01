/*
 * Jasmine Allen
 * CS 232 Section 001
 * Lab3 - Number Guessing Game
 * The program will pick a random number and ask the player to guess the number. 
 * it will tell the player if the number is too high or too low. If the number matches
 * the secret number the player will get a congratulations, However if the player reaches
 * the amount of guesses that are allowed, the game will be over and print you lose. 
 */
package lab3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       //Beginning Statement
       System.out.println("I'm thinking of a number between 1 and 100...");
       
       //Variables
       boolean gameover = false;
       int num_guesses = 0;
       int secret_num = (int)(Math.random() * 100) + 1;
       int guess;
       int guesses_allowed = 12;
       
     
           
       /* While loop activates if the game is not over and 
       the number of guesses are less than the guesses that are allowed*/
       
       while(gameover != true && num_guesses != guesses_allowed){
           
           System.out.print("Please guess a number: ");
           guess = input.nextInt();
           num_guesses = num_guesses + 1;
           
           //Checks to see if the number guessed is less than the secret number
           if(guess < secret_num){
               System.out.println(guess + " is too low.");
           }
           
           //Checks to see if the number guessed is more than the secret number
           else if(guess > secret_num){
               System.out.println(guess + " is too high.");
               
           }
           //If the number guessed equals the secret number, player gets congratulations, and the game is over. 
           else if (guess == secret_num){
               System.out.println("Congratulations! You guessed the number in  " + num_guesses + " guess(es).");
               gameover = true;
           }
           
       }
       // if the player has guessed the same amount of guesses that are allowed, the player loses. 
       if(num_guesses == guesses_allowed){
           System.out.println("You ran out of guesses. You lose!");
       }
        
    }
    
}
