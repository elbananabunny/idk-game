import java.util.Scanner;
import java.io.*;

class idk
{
	public static void main(String[] args)
	{
		System.out.println("This game is bad idk.");
		System.out.println("We warned you, we will warn you again, idk.");
		System.out.println("This game is bad idk.");
		System.out.println("There are no saves idk.");
		System.out.println("Don't die idk.");
		System.out.println("Type \"Help\" for help idk.\n\n");
		personality test = new personality();
		player player = new player();
		test.quiz();
		byte playerPoints = test.getPoints();
		if (playerPoints <= 4)
		{
			player.setCharacter("MajicMan");
		}
		else
		{
			player.setCharacter("Toaster");
		}
		System.out.print("You got. ");
		try
		{
			for (int reveal = 1; reveal <= 2; ++reveal)
			{
				Thread.sleep(1000);
				System.out.print(". ");
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("\nLook, there is supposed to be suspense, but you messed it up, idiot.");
		}
		System.out.println(player.getCharacter());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			System.out.println("\nLook, there is supposed to be suspense, but you messed it up, idiot.");
		}
		
		boolean running = true; //When this becomes false, the game ends.
		Scanner scanner = new Scanner(System.in);
		level level = new level();
		level.beginning();
		while (running)
		{
			/*
			if (x == 4096)
				x = 0; //Resets x to 0 so it overwrites the previous elements.
			
			System.out.print("\n" + player.getCharacter() + ": ");
			choice[x] = scanner.nextLine();
			
			baseCommands();
			
			if (choice[x].equalsIgnoreCase("exit") || choice[x].equalsIgnoreCase("quit") || choice[x].equalsIgnoreCase("leave"))
				break;
			
			else if (choice[x].equalsIgnoreCase("suicide"))
			{
				player.die();
				break;
			}
			
			else
				System.out.println("I don't know that command, idiot.");
			
			++x; //Always at end, lets the program keep adding onto the array of Strings.
			*/
			System.out.print("\n" + player.getCharacter() + ": ");
			String beginning = scanner.nextLine();
			baseCommands(beginning);
			if (beginning.equalsIgnoreCase("exit") || beginning.equalsIgnoreCase("quit") || beginning.equalsIgnoreCase("leave"))
				break;
			else if (beginning.equalsIgnoreCase("what is all this junk on my screen?"))
				level.beginning();
			else if (beginning.equalsIgnoreCase("suicide"))
			{
				player.die();
				String beginningSuicide = scanner.nextLine();
				if (beginningSuicide.equalsIgnoreCase("Y") || beginningSuicide.equalsIgnoreCase("Yes"))
					continue;
				else if (beginningSuicide.equalsIgnoreCase("N") || beginningSuicide.equalsIgnoreCase("No"))
					break;
				else
					continue;
			}
			else if (beginning.equalsIgnoreCase("1"))
			{
				level.adventure();
			}
			else if (beginning.equalsIgnoreCase("2"))
				player.die();
			else if (player.getCharacter().equalsIgnoreCase("Toaster") && beginning.equalsIgnoreCase("3"))
				level.toasterHole();
		}
	}
	static void baseCommands(String playerCommand)
	{
		commands command = new commands(); //Class that holds commands
		if (playerCommand.equalsIgnoreCase("about"))
			command.about();
		else if (playerCommand.equalsIgnoreCase("help") || playerCommand.equals("?"))
			command.help();
		else if (playerCommand.equalsIgnoreCase("what is all this junk on my screen?"))
			command.clear();
	}
}
