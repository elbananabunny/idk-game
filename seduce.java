/*
 * CLASS UNDER CONSTRUCTION
 * This will contain the methods for the
 * seduction game.
 * If you are looking for the main, check idk.java
 */
 
 import java.util.Scanner;

public class seduce //I'm starting to think this game is getting pretty dumb.
{
	char input; //Atribute to store user input.
	int points = 0; //The more points, the more chance that the seduction will work.
	public seduce() //Prompt for the game, too lazy to write it every time, not lazy enough to write this comment.
	{
		System.out.println("We were nice enough to play the game, you didn't have to go as far as to do\nTHIS.");
	}
	
	void seduceTree() //Method used when you decide to seduce the tree.
	{
		Scanner scanner = new Scanner(System.in);
		//Question 1
		System.out.println("What is the world's largest inland sea?");
		printTab("a. Atlantic", true);
		printTab("b. Polar", true);
		printTab("c. Caspian", true); //correct answer
		printTab("d. Fart", true); //-__- Josh is an idiot
		prompt();
		answer('c'); //Since it only reads a single char, if the user types "cats are stupid," it will only read the first 'c'.
		
		//Question 2
		System.out.println("This Italian military and political leader of the late 15th century, along with");
		System.out.println("his sister, was known for treachery and cruelty. In fact, he was the model for");
		System.out.println("Machiavelli's \"The Price.\" Can you name him and his sister?");
		printTab("a. JACK and JILL ITALIA", true);
		printTab("b. CESARE and LUCREZIA BORGIA", true); //Correct answer
		printTab("c. MARIO and LUIGI IS A GIRL", true); //ask Josh if AS or IS
		printTab("d. BENTIO and SUZY MUSSOLINI", true);
		prompt();
		answer('b');
		
		//Question 3
		System.out.println("The modern opera, Porgy and Bess, was written by whom, and takes place in");
		System.out.println("which city");
		printTab("a. Shakespeare / London, England", true);
		printTab("b. Mom / The Moon, Space", true);
		printTab("c. George and Ira Gerschwin / Charleston, S.C.", true); //correct answer
		printTab("d. Bob Ross / Charleston, C.S.", true);
		prompt();
		answer('c');
		
		//Question 4
		System.out.println("In 1582 Pope Gregory XIII sponsored a new solar calendar to replace an older");
		System.out.println("calendar in effect since 46 BC, that had been introduced by what person?");
		printTab("a. Bob Saget", true);
		printTab("b. Adolf Hitler", true);
		printTab("c. John Barclay", true);
		printTab("d. Julius Caesar", true); //Correct answer
		prompt();
		answer('d');
		
		//Question 5
		System.out.println("If H. Ross Perot is ever elected President, he will undoubtedly be the richest");
		System.out.println("man ever elected to this office. Who were the two wealthiest people to become");
		System.out.println("President in the 20th Century?");
		printTab("a. John F. Kennedy / Franklin Roosevelt", true); //correct answer
		printTab("b. John F. Kennedy / Barack Obama", true);
		printTab("c. Franklin Roosevelt / Bill Clinton", true);
		printTab("d. John F. Kendy / Frankln Roosevelt", true);
		prompt();
		answer('a');
		
		//Question 6
		System.out.println("The British Leaders Robert Walpole, Earl Grey, and Lord Melbourne, and the");
		System.out.println("Americans Henry Clay, Daniel Webster, W.M. Henry Harrison, and Millard Fillmore");
		System.out.println("were all associated with which political party?");
		printTab("a. Republicans", true);
		printTab("b. Democrats", true);
		printTab("c. Some british thing, go away", true);
		printTab("d. Whigs", true); //correct answer
		prompt();
		answer('a');
		
		//Question 7
		System.out.println("Tom Hanks won the Academy Award as Best Actor for his role in what 993 film, in");
		System.out.println("which he played an attorney with what disease");
		printTab("a. Philadelphia / Autism", true);
		printTab("b. Philadelphia / AIDS", true); //correct answer
		printTab("c. Tennessee / Autism", true);
		printTab("d. Ace Attorney / AIDS", true);
		prompt();
		answer('a');
		
		//Question 8
		System.out.println("When Captain James Cook discovered the Hawiian Islands in 1778, he named them");
		System.out.println("in honor of John Montagu, a British politician, who invented a certain kind of");
		System.out.println("food. What name did Captain Cook give to Hawaii");
		printTab("a. Crepe Islands", true);
		printTab("b. Parfait Islands", true);
		printTab("c. Sandwich Islands", true); //correct answer
		printTab("d. Brioche Islands", true);
		prompt();
		answer('c');
		
		//Question 9
		System.out.println("Edward Teach, an Englishman who turned to an extremely savage form of piracy,");
		System.out.println("was better known by what colorful name?");
		printTab("a. Davy Jones", true);
		printTab("b. Blackbeard", true); //correct answer
		printTab("c. Captain Hook", true);
		printTab("d. Dread Pirate Roberts", true);
		prompt();
		answer('b');
		
		//Question 10
		System.out.println("Who was the courageous 10-year-old gymnast at the 1996 Olympics in Atlanta");
		System.out.println("whose vault on a severely sprained ankle helped ensure a U.S. Gold Medal in");
		System.out.println("gymnastics?");
		printTab("a. Kerry Strug", true); //Correct answer
		printTab("b. Maria Sharapova", true);
		printTab("c. Amelia Earhart", true);
		printTab("d. Quenn Elizabeth");
		prompt();
		answer('a');
		
		//Question 11
		System.out.println("According to a survey taken by AT&T, the average American changes residence how");
		System.out.println("many times during a lifetime?");
		printTab("a. 20", true);
		printTab("b. 3", true);
		printTab("c. 400", true);
		printTab("d. 11", true); //correct answer
		prompt();
		answer('d');
		
		//Question 12
		System.out.println("What museum is the London treasury of literature, science, and art, and the");
		System.out.println("home of the Magna Carta, Rosetta Stone, and the Elgin Marbles?");
		printTab("a. The Louvre", true);
		printTab("b. World Museum", true);
		printTab("c. British Museum", true);
		printTab("d. Uffizi Gallery", true);
		prompt();
		answer('d');
		
		//Question 13
		System.out.println("With a wingspan of 3.6 meters, or almost 12 feet, what living bird, found");
		System.out.println("mostly in the southern hemisphere, has the largest wingspan?");
		printTab("a. Bald Eagle", true);
		printTab("b. Peregrine Falcon", true);
		printTab("c. Wandering Albatross", true); //correct answer
		printTab("d. Jabiru", true);
		prompt();
		answer('c');
		
		//Question 14
		System.out.println("On November 28, 1995, 50.28% of Irish voters voted in favor of lifting a ban on");
		System.out.println("what?");
		printTab("a. Alcohol", true);
		printTab("b. Divorce", true); //correct answer
		printTab("c. Cocain", true);
		printTab("d. Insanely Big Mustaches", true);
		prompt();
		answer('b');
		
		//Question 15
		System.out.println("How is it possible to determine the sex of a parakeet?");
		printTab("a. Same way as anything, genitalia", true);
		printTab("b. Seriously, just the genitals", true);
		printTab("c. The genitals", true);
		printTab("d. Color of the cere", true);
		prompt();
		answer('d');
		
		//Taunt
		System.out.println("You got " + this.points + " points. If you would ask me, that's pretty crappy.");
	}
	
	void printTab(String s, boolean newline)
	{
		System.out.print("\t" + s);
		if (newline) {
			System.out.print("\n");
		}
	}
	
	void prompt() //Method make input taking less tedious. Prompts the user then stores it in the atribute "input"
	{
		Scanner quiz = new Scanner(System.in);
		System.out.print("Answer here (just the letter): ");
		this.input = quiz.next().charAt(0); //Stores their character in atribute input.
	}
	
	void answer(char let) //Method for one answer that gives points.
	{
		char o1, o2, o3; //Where o = other possibility
		char oC0, oC1, oC2, oC3; //Where oC is other possibility capitalized. oC0 is the answer capitalized
		/* Next if else set is for setting the above characters. */
		if (let == 'a') { //If single answer letter is 'a'
			o1 = 'b';
			o2 = 'c';
			o3 = 'd';

			oC0 = 'A';
			oC1 = 'B';
			oC2 = 'C';
			oC3 = 'D';
		} else if (let == 'b') { //If single answer letter is 'b'
			o1 = 'a';
			o2 = 'c';
			o3 = 'd';

			oC0 = 'B';
			oC1 = 'A';
			oC2 = 'C';
			oC3 = 'D';
		} else if (let == 'c') { //If single answer letter is 'c'
			o1 = 'a';
			o2 = 'b';
			o3 = 'd';

			oC0 = 'C';
			oC1 = 'A';
			oC2 = 'B';
			oC3 = 'D';
		} else { //If single letter answer is 'd'
			o1 = 'a';
			o2 = 'b';
			o3 = 'c';

			oC0 = 'D';
			oC1 = 'A';
			oC2 = 'B';
			oC3 = 'C';
		}
		
		if(input == let || input == oC0)
			++points;
		else if(!(input == o1 || input == o2 || input == o3 || input == oC1 || input == oC2 || input == oC3))
			System.out.println("\nYou are the idiotest, not even typing the letter right. What are you, stupid?\n"); //"Notifies" (insults) the player that (s)he didn't type a, b, c, or d.
	}
}