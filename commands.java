public class commands
{
	void help()
	{
		System.out.println("\nThis is the help command. We don't want to help you,");
        System.out.println("but I guess we have to :C\n");
		System.out.println("\nAll commands are case insensitive.\n");
		System.out.println("help\t\tPrints this help message");
		System.out.println("?\t\tPrints this help message");
		System.out.println("exit\t\tLeaves the game");
		System.out.println("leave\t\tLeaves the game");
		System.out.println("quit\t\tLeaves the game");
		System.out.println("about\t\tGives information about the game and its creators");
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
}
