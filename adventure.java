/*
 * This class contains the actual adventure for the game.
 * It starts with a constructor, so you only need to create an object to call it.
 * It then goes through methods, each one testing the input.
 * For the prompts, see level.java.
 * For the main, go to idk.java
 */

import java.util.Scanner; //For input, of course

public class adventure
{
	private boolean quit = false; //Atribute that will be tested at the end of each level method. If it evaluates to false, the game ends.
	public adventure() //Constructor so that no method needs to be called to run the adventure.
	{
		Scanner scanner = new Scanner(System.in);
		level level = new level(); //level class
		level.beginning(); //beginning prompt
		String beginning, beginningSuicide = ""; //beginningSuicide and any other suicide string MUST be an empty (not void) string. This is so the death method does not read a null string.
		while (true) //infinite loop until quit or choice.
		{
			System.out.print("\n" + player.getCharacter() + ": "); //Prompts player with "MajicMan: " or "Toaster: " of course depending on who you are.
			beginning = scanner.nextLine();
			if (beginning.equalsIgnoreCase("flavor town")) //flavor town will always reprint the prompt, but since the prompt is a method, we must use it in each adventure method.
				level.beginning();
			else if (beginning.equalsIgnoreCase("1")) //1 is the correct path.
				goOnAdventure(); //Brings you to another method. This will be the process for every adventure method.
			else if (beginning.equalsIgnoreCase("2")) //Wrong answer, taunts the player then prompts them to either leave or stay.
			{
				System.out.println("You idiot, didn't even try.");
				death(beginningSuicide); //death takes the suicide string (again, must be empty, NOT void).
			}
			else
				baseCommands(beginning, beginningSuicide); //baseCommands takes two arguments, the regular input and the suicide input.
			if (this.quit == true) //tests if the quit atribute is true, if  so...
				break; //... the game ends.
		}
	}
	
	void goOnAdventure() //Goes to this method if 1 is chosen on the first level.
	{
		Scanner scanner = new Scanner(System.in);
		level level = new level();
		level.adventure(); //prompt for this level.
		String goOnAdventure, goOnAdventureSuicide = ""; //empty, NOT void suicide string.
		while(true) //infinite loop until quit or choice.
		{
			System.out.print("\n" + player.getCharacter() + ": ");
			goOnAdventure = scanner.nextLine();
			if (goOnAdventure.equalsIgnoreCase("flavor town"))
				level.adventure();
			else
				baseCommands(goOnAdventure, goOnAdventureSuicide); //Again, baseCommands takes two arguments, the regular input and the suicide input.
			if (this.quit == true)
				break;
		}
	}
	
	void death(String x) //Method that takes the argument, asks for user input, stores it in that variable, then quits the game depending on the result of var x.
	{
		Scanner scanner = new Scanner(System.in);
		player.die(); //tells the user that he/she died.
		x = scanner.nextLine(); //gets input of user, either yes or no, or some abriviation.
		if (x.equalsIgnoreCase("Y") || x.equalsIgnoreCase("Yes")) //Yes means that you DO want to continue with the game.
			this.quit = false;
		else if (x.equalsIgnoreCase("N") || x.equalsIgnoreCase("No")) //No means that you DON'T want to continue with the game.
			this.quit = true;
		else
			this.quit = false; //Defaults to Yes.
	}
	
	/*********************************************************
	 * THIS METHOD MUST ALWAYS GO AT THE BOTTOM OF THE LOOP. *
	 *********************************************************/
	void baseCommands(String playerCommand, String playerSuicide) //Takes two arguments, the regular input that takes commands, and the suicide input.
	{
		commands command = new commands(); //Class that holds commands
		if (playerCommand.equalsIgnoreCase("about")) //Runs about command
			command.about();
		else if (playerCommand.equalsIgnoreCase("help") || playerCommand.equals("?")) //Gives user help with commands.
			command.help();
		else if (playerCommand.equalsIgnoreCase("exit") || playerCommand.equalsIgnoreCase("quit") || playerCommand.equalsIgnoreCase("leave") || playerCommand.equalsIgnoreCase("league of legends"))
			this.quit = true; //Changes quit to true, so methods go back to constructor method, which then tests if quit is true.
		else if (playerCommand.equalsIgnoreCase("window washer!") || playerCommand.equalsIgnoreCase("cls") || playerCommand.equalsIgnoreCase("clear")) //Clears screen.
			command.clear();
		else if (playerCommand.equalsIgnoreCase("suicide")) //Kills player (I wouldn't blame him tbh).
			death(playerSuicide);
		else //If the command is not found, print this and restart the loop.
			System.out.println("Hitmen are headed your way, idiot.");
	}
}