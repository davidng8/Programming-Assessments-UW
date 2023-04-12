import java.util.*;
public class GuessingGame {
    public static final int MAX_VALUE = 100;
    public static void main(String [] args){
        Scanner console = new Scanner (System.in);
        Random num = new Random(42);
        int guesses = 0;
        int games = 0;
        int best = 999999;
        int test = 0;
        boolean endGame = false;
        welcome();
        System.out.println();
        while (!endGame){ 
            test = game(console, guesses, num);
            guesses += test;
            System.out.println();
            if (test < best) {
                best = test;
            }
            games++;
            //ask if user wants to play again
            System.out.print("Do you want to play again? ");
            char playAgain = console.next().charAt(0);
            if (playAgain == 'y' || playAgain == 'Y'){
                endGame = false; //will continue game as long as input starts w/ y
                System.out.println();
            }else {
                System.out.println();
                overallResults(best, games, guesses);
                endGame = true;
            }
        }
    }

    //this method rounds the number
    public static double round(double number){
        return (Math.round(number * 10.0)) / 10.0;
    }

    //the welcoming lines (haiku)
    public static void welcome(){
        System.out.println("Go guess a number!");
        System.out.println("Guess the right number and win!");
        System.out.println("Good luck and have fun!");
    }

    //this method takes user input of a number and tells them if its higher or lower
    public static int game(Scanner console, int guesses, Random num){
        System.out.println("I'm thinking of a number between 1 and "+ MAX_VALUE + "..."); 
        boolean endGame = false; // keep games running as long this is false
        int finalNum = 1 + num.nextInt(MAX_VALUE);
        int numGuess = 0; //number of guesses 
        String guessText = "";
        while (!endGame) { 
            System.out.print("Your guess? ");
            int value = console.nextInt();
            if ( value < finalNum){
                System.out.println("It's higher.");
                numGuess++;
                guesses += numGuess;
            } else if ( value > finalNum){
                System.out.println("It's lower.");
                numGuess++; 
                guesses += numGuess;
            }  else {
                numGuess++;
                if(numGuess == 1){
                    guessText = "guess";
                }else {
                    guessText = "guesses";
                }
                System.out.print("You got it right in " + numGuess + " " + guessText + "!");
                endGame = true;
            }
        }
        return numGuess;
    }

    //this method prints the overall results on all games played so far
    public static void overallResults(int best, int games, int guesses){
        System.out.println("Overall results:");
        System.out.println("Total games   = " + games);
        System.out.println("Total guesses = " + guesses);
        System.out.println("Guesses/game  = " + round(guesses * 1.0/games));
        System.out.println("Best game     = " + best);
    }
}
