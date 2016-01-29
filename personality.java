import java.util.Scanner;

public class personality
{
	private char input; //Takes a, b, c, or d.
	private byte points = 0; //Points determine who the player is.
	public void quiz()
	{
		System.out.println("Take this quiz, idiot.\n");
		
		System.out.println("1. If a hand came out of your toilet, what would you do?");
		System.out.println("\ta. Scream");
		System.out.println("\tb. Keep screaming");
		System.out.println("\tc. Pick up the hand and punt it out the window");
		System.out.println("\td. Continue to poop\n");
		prompt();
		answer('c', 'd'); //Put arguments in alphabetical order and lowercased
		
		System.out.println("\n2. A tiger comes up to your house house and knocks on your");
		System.out.println("   door door, what do you think when you open the door?");
		System.out.println("\ta. What can I help you with?");
		System.out.println("\tb. How did you get here?");
		System.out.println("\tc. Why is there a tiger knocking on my door door?");
		System.out.println("\td. Would you like to hear about the hand poop I just had?\n");
		prompt();
		answer('b', 'd');

		System.out.println("\n3. Cinnamon or Butterscotch?");
		System.out.println("\ta. Yes");
		System.out.println("\tb. No");
		prompt();
		answer('b');

		System.out.println("\n4. Are you wondering what went wrong?");
		System.out.println("\ta. 12");
		System.out.println("\tb. 11");
		System.out.println("\tc. 47");
		System.out.println("\td. 90");
		prompt();
		answer('c');

		System.out.println("\n5. Is this quiz broken?");
		System.out.println("\ta. Probably");
		prompt(); //This question gives no points

		System.out.println("\n6. [Before answering this question please read \"The Odyssey\" by Homer]");
		System.out.println("   Are you satisfied with your life decisions?");
		System.out.println("\ta. Maybe");
		System.out.println("\tb. Why did you make me read that?");
		System.out.println("\tc. Yes");
		prompt();
		answer('c');

		System.out.println("\n7. Ralph?");
		System.out.println("\ta. George?");
		System.out.println("\tb. Kevin");
		System.out.println("\tc. Bobby McCrouber?");
		System.out.println("\td. Hellen? (With 2 'L's)");
		prompt();
		answer('b', 'd');

		System.out.println("\n8. Do you like StickeyKeys?");
		System.out.println("\ta. No, who likes StickeyKeys?");
		System.out.println("\tb. Obviously, I use it everyday");
		prompt();
		answer('b');

		System.out.println("\n9. When sitting outside do you. . .");
		System.out.println("\ta. Watch birds poop");
		System.out.println("\tb. Poop yourself");
		System.out.println("\tc. Think about how you are in a 3 dimensional world but can only percieve 2 dimensions");
		System.out.println("\td. Think about poop");
		prompt();
		answer('a', 'c');

		System.out.println("\n10 Why are there so many poops in this quiz?");
		System.out.println("\ta. I like poop");
		System.out.println("\tb. You like poop");
		System.out.println("\tc. Poop is cool");
		System.out.println("\td. I don' evn no");
		prompt();
		answer('a', 'd');
	}

	public byte getPoints()
	{
		return points;
	}

	void prompt() //Method make input taking less tedious
	{
		Scanner quiz = new Scanner(System.in);
		System.out.print("Answer here (just the lowercase letter): ");
		this.input = quiz.next().charAt(0);
	}
	
	void answer(char let) //Method for one answer that gives points.
	{
		char o1, o2, o3; //Where o = other possibility
		if(let == 'a')
		{
			o1 = 'b';
			o2 = 'c';
			o3 = 'd';
		}
		else if(let == 'b')
		{
			o1 = 'a';
			o2 = 'c';
			o3 = 'd';
		}
		else if(let == 'c')
		{
			o1 = 'a';
			o2 = 'b';
			o3 = 'd';
		}
		else
		{
			o1 = 'a';
			o2 = 'b';
			o3 = 'c';
		}
		
		if(input == let)
			++points;
		else if(input == o1 || input == o2 || input == o3);
		else
			System.out.println("\nYou are the idiotest, not even typing the letter right. What are you, stupid?\n");
	}

	void answer(char let1, char let2) //Method for two answers that gives points
	{
		int oO1, oO2; //Where o = other overloaded possibility
		if(let1 == 'a' && let2 == 'b')
		{
			oO1 = 'c';
			oO2 = 'd';
		}
		else if(let1 == 'a' && let2 == 'c')
		{
			oO1 = 'b';
			oO2 = 'd';
		}
		else if(let1 == 'a' && let2 == 'd')
		{
			oO1 = 'b';
			oO2 = 'c';
		}
		else if(let1 == 'b' && let2 == 'c')
		{
			oO1 = 'a';
			oO2 = 'd';
		}
		else if(let1 == 'b' && let2 == 'd')
		{
			oO1 = 'a';
			oO2 = 'c';
		}
		else
		{
			oO1 = 'a';
			oO2 = 'b';
		}
		if(input == let1 || input == let2)
			++points;
		else if(input == oO1 || input == oO2);
		else
			System.out.println("\nYou are the idiotest, not even typing the letter right. What are you, stupid?\n");
	}
}
