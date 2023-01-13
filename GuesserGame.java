import java.util.*;

class Guesser
{ 
    int guessNum;

    int guessNum()
    {
	Scanner scn=new Scanner(System.in);
	System.out.print("\nGuesser Kindly Guess the Number : ");
	guessNum=scn.nextInt();
	return guessNum;
    }
}

class Player
{
     int guessNum;

     int guessNum()
     {
	 Scanner scn=new Scanner(System.in);
	 System.out.print("\nPlayer Kindly Guess the Number : ");
	 guessNum=scn.nextInt();
	 return guessNum;
     }
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("\nAll players won the game ");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("\nPlayer 1 & Player2 won ");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("\nPlayer 1 & Player3 won ");
			}
			else
			{
			System.out.println("\nPlayer 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("\nPlayer 2 & Player3 won");
			}
			else
			{
			System.out.println("\nPlayer 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("\nPlayer 3 won the game");
		}
		else
		{
			System.out.println("\nGame lost Try Again!");
			
			
		}
	}
}

public class GuesserGame {

	public static void main(String[] args) {
		
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare();
			
			char choice;
			System.out.print("\nDo you want to continue the Game Press \'Y\' or \'N\' : ");
			Scanner scan=new Scanner(System.in);
			choice=scan.next().charAt(0);
			if(choice=='Y'||choice=='y')
			{
			  u.collectNumFromGuesser();
			  u.collectNumFromPlayers();
			  u.compare();
			}
			else
			{
			  System.exit(0);
			}
			

	}
}