package src;

import java.util.Scanner;
import java.util.Objects;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        Scanner endGame = new Scanner(System.in);
        Random random = new Random();
        int guess = 6;
        int number = random.nextInt(20);
        System.out.println("Hello user!");
        System.out.println("I'm thinking of a number between 1 & 20!");
        System.out.println("Take a guess!:");
        boolean gameOn=true;

        while (guess > 0 && gameOn)
        {
            int numGuess = numScanner.nextInt();
            if (numGuess > number)
            {
                System.out.println("Your guess is to high:" + guess + " guesses remaining");
                guess--;
                System.out.println("Take a guess!:");
            } else if (numGuess < number)
            {
                System.out.println("Your guess is to low:" + guess + " guesses remaining");
                guess--;
                System.out.println("Take a guess!");
            }
            else if(numGuess == number)
            {
                System.out.println("Good job user, you guessed it!");
                System.out.println("Wanna play again? (y/n):");
                String reset = endGame.next();
                if(Objects.equals(reset, "y"))
                {
                    number = random.nextInt(20);
                    guess=6;
                    gameOn=true;
                    System.out.println("I'm Thinking Of A Number Between 1 & 20.");
                    System.out.println("Take a guess!");
                }
                else break;
            }
            if(guess==0)
            {
                System.out.println("GAME OVER");
                gameOn=false;
                System.out.println("Wanna Play Again? (y/n): ");
                String reset = endGame.next();
                if(Objects.equals(reset, "y"))
                {
                    number = random.nextInt(20);
                    guess=6;
                    gameOn=true;
                    System.out.println("I'm Thinking Of A Number Between 1 & 20.");
                    System.out.println("Take a guess!");
                }
                else
                    break;
            }
        }
    }
}