import java.util.Arrays;

public class commands
{
	void help()
	{
		System.out.println("\nThis is the help command. We don't want to help you,");
        System.out.println("but I guess we have to :C\n");
		System.out.println("\nAll commands are case insensitive.\n");
		System.out.println("help\t\t\t\t\tPrints this help message");
		System.out.println("?\t\t\t\t\tPrints this help message");
		System.out.println("exit\t\t\t\t\tLeaves the game");
		System.out.println("leave\t\t\t\t\tLeaves the game");
		System.out.println("quit\t\t\t\t\tLeaves the game");
		System.out.println("about\t\t\t\t\tGives information about the game and its creators");
		System.out.println("what is all this junk on my screen?\tClears screen");
		System.out.println("suicide\t\t\t\t\tKills yourself");
	}
	void about()
	{
		System.out.println("\nHead Programmer: Austin Hawkins (goes by \"Kill Man\")");
		System.out.println("Story: Joshua Green (\"goes by elbananabunny\")");
		System.out.println("Music: Cody Wesner");
		System.out.println("\nThis started out as a project for me to practice");
        System.out.println("Java (the language this is in), but two other people");
		System.out.println("got involved, and it turned into this. Thank us later.");
	}
	void clear()
	{
		char c = '\n';
		int length = 100;
		char[] chars = new char[length];
		Arrays.fill(chars, c);
		System.out.print(String.valueOf(chars));
	}
}
