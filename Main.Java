import java.util.Scanner;
/**
 * The Guesser class is responsible for guessing a number.
 * Guesser guesses a number between 1-10.
 */

class Guesser
{
    /**
     * gnum stores the number guessed by Guesser.
     */
    int gnum;

    /**
     * This method prompts the Guesser to enter a number
     */
    int guessingNum()
    {
        System.out.println("Guesser, Kindly guess a number between 1-10");
        Scanner scan = new Scanner(System.in);
        gnum = scan.nextInt();
        return gnum;
    }
}

/**
 * Player class represents a player in the game
 * Each player predicts a number which is later compared with the guesser's number.
 */
class Player
{
    /**
     * pnum stores the number guessed by a player.
     */
    int pnum;

    /**
     * predictingNum method asks the player to provide a number.
     */
    int predictingNum()
    {
        System.out.println("Player, Kindly Provide a number!");
        Scanner scan = new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;
    }
}


/**
 * The Umpire class manages the entire game.
 * It collects numbers from the Guesser and Players, then compares them to determine the winner.
 */
class Umpire
{
    /**
     * numFromGuesser stores the number guessed by the Guesser.
     */
    int numFromGuesser;
     /**
     * These fields stores numbers predicted by the players.
     */
    int numFromp1, numFromp2, numFromp3;
   
    /**
     * This method collects the guessed number from the Guesser.
     */
    void collectingNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNum();
    }

    /**
     * This method collects predicted numbers from all three players.
     */
    void collectingNumFromPlayers()
    {
        /**
         * Creation of players object.
         */
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromp1 = p1.predictingNum();
        numFromp2 = p2.predictingNum();
        numFromp3 = p3.predictingNum();
    }

    /**
     * This method compares the guesser's number with the numbers predicted by the players and declares the winner.
     */
    void comparing() 
    {
        if(numFromGuesser == numFromp1) {
            System.out.println("Player 1 has won the game");
        }
        else if(numFromGuesser == numFromp2) {
            System.out.println("Player 2 has won the game");
        }
        else if(numFromGuesser == numFromp3) {
            System.out.println("Player 3 has won the game");
        }
        else {
            System.out.println("Game lost! Try again");
        }
    }
}


/**
 * The Main class is the entry point of the program.
 */
public class Main
{
    /**
     * The main method where program execution begins.
     */
	public static void main(String[] args) {
        /**
         * Creation of Umpire object
         */
		Umpire u = new Umpire();
		u.collectingNumFromGuesser();
		u.collectingNumFromPlayers();
		u.comparing();
	}
}