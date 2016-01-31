import java.util.Scanner;
import java.io.*;

class idk
{
	public static void main(String[] args)
	{
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
		boolean passed = false; //Becomes true if a level is passed.
		Scanner scanner = new Scanner(System.in);
		String[] choice = new String[4096]; //Used to hold user input.
		commands command = new commands(); //Class that has commands.
		int x = 0;
		String clearCmd = new String(System.getProperty("os.name"));
		level level = new level();
	Exit: //For the exit command.
		while (running)
		{
			level.currentLevel();
			
			while (passed == false)
			{
				if (x == 4096)
					x = 0; //Resets x to 0 so it overwrites the previous elements.
				
				System.out.print("\n" + player.getCharacter() + ": ");
				choice[x] = scanner.nextLine();
				
				if (choice[x].equalsIgnoreCase("about"))
					command.about();
				
				else if (choice[x].equalsIgnoreCase("help") || choice[x].equals("?"))
					command.help();
				
				else if (choice[x].equalsIgnoreCase("exit") || choice[x].equalsIgnoreCase("quit") || choice[x].equalsIgnoreCase("leave"))
					break Exit;
				
				else if (choice[x].equalsIgnoreCase("what is all this junk on my screen?"))
				{
					command.clear();
					level.currentLevel();
				}
				
				//implement scuicide.
				
				else
					System.out.println("I don't know that command, idiot.");
				
				++x; //Always at end, lets the program keep adding onto the array of Strings.
			}
		}
	}
}
