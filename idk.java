import java.util.Scanner;

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
			player.setCharacter("MajicMan");
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
		System.out.println("\n\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
		System.out.println("You, " + player.getCharacter() + " are living with your grandma, but hear a thud,");
		System.out.println("You are suspicious and go check it out, but you girlfriend,");
        System.out.println("the door's door handle, is no longer attatched to the door.");
		System.out.println("It is your job to find it, " + player.getCharacter() + ".");
		System.out.println("\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");

		boolean running = true; //When this becomes false, the game ends.
		Scanner scanner = new Scanner(System.in);
		String[] choice = new String[4096]; //Used to hold user input.
		commands command = new commands(); //Class that has commands.
		int x = 0;
		while (running)
		{
			if (x == 4096)
				x = 0; //Resets x to 0 so it overwrites the previous elements.
			else
			{
				System.out.print("\n" + player.getCharacter() + ": ");
				choice[x] = scanner.nextLine();
			}
			
			if (choice[x].equals("about"))
				command.about();
			
			if (choice[x].equals("help"))
				command.help();
			
			if (choice[x].equals("exit") || choice[x].equals("quit") || choice[x].equals("leave"))
				break;
			
			++x; //Always at end, lets the program keep adding onto the array of Strings.
		}
	}
}
