import java.util.Scanner;
class Guesser
{
    int gnum;
    int guessingNum()
    {
        System.out.println("Guesser, Kindly guess a number between 1-10");
        Scanner scan = new Scanner(System.in);
        gnum = scan.nextInt();
        return gnum;
    }
}

class Player
{
    int pnum;
    int predictingNum()
    {
        System.out.println("Player, Kindly Provide a number!");
        Scanner scan = new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromp1, numFromp2, numFromp3;
    
    void collectingNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNum();
    }
    void collectingNumFromPlayers()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromp1 = p1.predictingNum();
        numFromp2 = p2.predictingNum();
        numFromp3 = p3.predictingNum();
    }
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

public class Main
{
	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectingNumFromGuesser();
		u.collectingNumFromPlayers();
		u.comparing();
	}
}