/*
 * This file just contains what is printed when certain
 * commands are called, nothing much to see here.
 * For the main, go to idk.java
 */

import java.util.Arrays;

public class commands
{
	void help()
	{
		System.out.println("\nThis is the help command. We don't want to help you,");
        System.out.println("but I guess we have to :C\n");
		System.out.println("\nAll commands are case insensitive.\n");
		System.out.println("help\t\t\tPrints this help message");
		System.out.println("?\t\t\tPrints this help message");
		System.out.println("exit\t\t\tLeaves the game");
		System.out.println("leave\t\t\tLeaves the game");
		System.out.println("league of legends\tLeaves the game");
		System.out.println("quit\t\t\tLeaves the game");
		System.out.println("about\t\t\tGives information about the game and its creators");
		System.out.println("window washer!\t\tClears screen");
		System.out.println("cls\t\t\tClears screen");
		System.out.println("clear\t\t\tClears screen");
		System.out.println("flavor town\t\tReprints prompt");
		System.out.println("suicide\t\t\tKills yourself");
		System.out.println("fusion\t\t\tLets you fuse a clear command and a print command.");
		System.out.println("Syntax for fusion:");
		System.out.println("\tfusion clear/cls/window washer! _/\\_ <PRINT_COMMAND>");
		System.out.println("\tExample: fusion clear _/\\_ flavor town\twould clear then reprint prompt");
		System.out.println("Available print commands:");
		System.out.println("\thelp");
		System.out.println("\t?");
		System.out.println("\tabout");
		System.out.println("\tflavor town");
	}
	void about()
	{
		System.out.println("\nHead Programmer: Austin Hawkins (goes by \"Kill Man\")");
		System.out.println("Story: Joshua Green (goes by \"elbananabunny\")");
		System.out.println("Music: Cody Wesner (goes by \"WEESBAW\")");
		System.out.println("\nThis started out as a project for me to practice");
        System.out.println("Java (the language this is in), but two other people");
		System.out.println("got involved, and it turned into this. Thank us later.");
	}
	void clear() //This method just prints a bunch of newlines. Not that complicated, yet very effective.
	{
		char c = '\n';
		int length = 100;
		char[] chars = new char[length];
		Arrays.fill(chars, c);
		System.out.print(String.valueOf(chars));
	}
	
	/**CREATE FUSION COMMAND*/ //Fusion command should look like: fusion <FIRST_COMMAND> _/\_ <SECOND_COMMAND>
}