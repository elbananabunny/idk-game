/*
 * CLASS UNDER CONSTRUCTION
 * This will contain the methods for the
 * seduction game.
 * If you are looking for the main, check idk.java
 */
 
 /**
 //Template for future seduction games
        //Question 1
        System.out.println("");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('a');
        
        //Question 2
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('c');
        
        //Question 3
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('a');
        
        //Question 4
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('d');
        
        //Question 5
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('d');
        
        //Question 6
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('b');
        
        //Question 7
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('c');
        
        //Question 8
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('d');
        
        //Question 9
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('d');
        
        //Question 10
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('c');
        
        //Question 11
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('b');
        
        //Question 12
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('d');
        
        //Question 13
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('c');
        
        //Question 14
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('b');
        
        //Question 15
        System.out.println("\n");
        printTab("a. ", true);
        printTab("b. ", true);
        printTab("c. ", true);
        printTab("d. ", true);
        prompt();
        answer('b');
        
        System.out.println("\nYou got " + this.points + " points. If you would ask me, that's pretty crappy.\n\n");
 */
 
 import java.util.Scanner;

public class seduce
{
    char input; //Atribute to store user input.
    int points = 0; //The more points, the more chance that the seduction will work.
    public seduce() //Prompt for the game, too lazy to write it every time, not lazy enough to write this comment.
    {
        System.out.println("\n\nYou were nice enough to play the game, you didn't have to go as far as to do\nTHIS.\n");
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
        System.out.println("\nThis Italian military and political leader of the late 15th century, along with");
        System.out.println("his sister, was known for treachery and cruelty. In fact, he was the model for");
        System.out.println("Machiavelli's \"The Price.\" Can you name him and his sister?");
        printTab("a. JACK and JILL ITALIA", true);
        printTab("b. CESARE and LUCREZIA BORGIA", true); //Correct answer
        printTab("c. MARIO and LUIGI IS A GIRL", true); //ask Josh if AS or IS
        printTab("d. BENTIO and SUZY MUSSOLINI", true);
        prompt();
        answer('b');
        
        //Question 3
        System.out.println("\nThe modern opera, Porgy and Bess, was written by whom, and takes place in");
        System.out.println("which city");
        printTab("a. Shakespeare / London, England", true);
        printTab("b. Mom / The Moon, Space", true);
        printTab("c. George and Ira Gerschwin / Charleston, S.C.", true); //correct answer
        printTab("d. Bob Ross / Charleston, C.S.", true);
        prompt();
        answer('c');
        
        //Question 4
        System.out.println("\nIn 1582 Pope Gregory XIII sponsored a new solar calendar to replace an older");
        System.out.println("calendar in effect since 46 BC, that had been introduced by what person?");
        printTab("a. Bob Saget", true);
        printTab("b. Adolf Hitler", true);
        printTab("c. John Barclay", true);
        printTab("d. Julius Caesar", true); //Correct answer
        prompt();
        answer('d');
        
        //Question 5
        System.out.println("\nIf H. Ross Perot is ever elected President, he will undoubtedly be the richest");
        System.out.println("man ever elected to this office. Who were the two wealthiest people to become");
        System.out.println("President in the 20th Century?");
        printTab("a. John F. Kennedy / Franklin Roosevelt", true); //correct answer
        printTab("b. John F. Kennedy / Barack Obama", true);
        printTab("c. Franklin Roosevelt / Bill Clinton", true);
        printTab("d. John F. Kendy / Frankln Roosevelt", true);
        prompt();
        answer('a');
        
        //Question 6
        System.out.println("\nThe British Leaders Robert Walpole, Earl Grey, and Lord Melbourne, and the");
        System.out.println("Americans Henry Clay, Daniel Webster, W.M. Henry Harrison, and Millard Fillmore");
        System.out.println("were all associated with which political party?");
        printTab("a. Republicans", true);
        printTab("b. Democrats", true);
        printTab("c. Some british thing, go away", true);
        printTab("d. Whigs", true); //correct answer
        prompt();
        answer('a');
        
        //Question 7
        System.out.println("\nTom Hanks won the Academy Award as Best Actor for his role in what 1993 film, in");
        System.out.println("which he played an attorney with what disease");
        printTab("a. Philadelphia / Autism", true);
        printTab("b. Philadelphia / AIDS", true); //correct answer
        printTab("c. Tennessee / Autism", true);
        printTab("d. Ace Attorney / AIDS", true);
        prompt();
        answer('a');
        
        //Question 8
        System.out.println("\nWhen Captain James Cook discovered the Hawiian Islands in 1778, he named them");
        System.out.println("in honor of John Montagu, a British politician, who invented a certain kind of");
        System.out.println("food. What name did Captain Cook give to Hawaii");
        printTab("a. Crepe Islands", true);
        printTab("b. Parfait Islands", true);
        printTab("c. Sandwich Islands", true); //correct answer
        printTab("d. Brioche Islands", true);
        prompt();
        answer('c');
        
        //Question 9
        System.out.println("\nEdward Teach, an Englishman who turned to an extremely savage form of piracy,");
        System.out.println("was better known by what colorful name?");
        printTab("a. Davy Jones", true);
        printTab("b. Blackbeard", true); //correct answer
        printTab("c. Captain Hook", true);
        printTab("d. Dread Pirate Roberts", true);
        prompt();
        answer('b');
        
        //Question 10
        System.out.println("\nWho was the courageous 10-year-old gymnast at the 1996 Olympics in Atlanta");
        System.out.println("whose vault on a severely sprained ankle helped ensure a U.S. Gold Medal in");
        System.out.println("gymnastics?");
        printTab("a. Kerry Strug", true); //Correct answer
        printTab("b. Maria Sharapova", true);
        printTab("c. Amelia Earhart", true);
        printTab("d. Quenn Elizabeth", true);
        prompt();
        answer('a');
        
        //Question 11
        System.out.println("\nAccording to a survey taken by AT&T, the average American changes residence how");
        System.out.println("many times during a lifetime?");
        printTab("a. 20", true);
        printTab("b. 3", true);
        printTab("c. 400", true);
        printTab("d. 11", true); //correct answer
        prompt();
        answer('d');
        
        //Question 12
        System.out.println("\nWhat museum is the London treasury of literature, science, and art, and the");
        System.out.println("home of the Magna Carta, Rosetta Stone, and the Elgin Marbles?");
        printTab("a. The Louvre", true);
        printTab("b. World Museum", true);
        printTab("c. British Museum", true);
        printTab("d. Uffizi Gallery", true);
        prompt();
        answer('d');
        
        //Question 13
        System.out.println("\nWith a wingspan of 3.6 meters, or almost 12 feet, what living bird, found");
        System.out.println("mostly in the southern hemisphere, has the largest wingspan?");
        printTab("a. Bald Eagle", true);
        printTab("b. Peregrine Falcon", true);
        printTab("c. Wandering Albatross", true); //correct answer
        printTab("d. Jabiru", true);
        prompt();
        answer('c');
        
        //Question 14
        System.out.println("\nOn November 28, 1995, 50.28% of Irish voters voted in favor of lifting a ban on");
        System.out.println("what?");
        printTab("a. Alcohol", true);
        printTab("b. Divorce", true); //correct answer
        printTab("c. Cocain", true);
        printTab("d. Insanely Big Mustaches", true);
        prompt();
        answer('b');
        
        //Question 15
        System.out.println("\nHow is it possible to determine the sex of a parakeet?");
        printTab("a. Same way as anything, genitalia", true);
        printTab("b. Seriously, just the genitals", true);
        printTab("c. The genitals", true);
        printTab("d. Color of the cere", true); //correct answer
        prompt();
        answer('d');
        
        //Taunt
        System.out.println("\nYou got " + this.points + " points. If you would ask me, that's pretty crappy.\n\n");
    }
    
    void seduceDuck()
    {
        //Question 1
        System.out.println("Which Frenchman designed the skeleton of the Statue of Liberty");
        printTab("a. Kestrel Fri", true);
        printTab("b. Kevin Swampe", true);
        printTab("c. Mariah Mann", true);
        printTab("d. Gustave Eiffel", true); //correct answer
        prompt();
        answer('d');
        
        //Question 2
        System.out.println("\nAfter Los Angeles, what is the most populated California city whose name does");
        System.out.println("not begin with the letter \"S\"?");
        printTab("a. Albania", true);
        printTab("b. Bee City", true);
        printTab("c. Hollywood", true);
        printTab("d. Long Beach", true); //correct answer
        prompt();
        answer('d');
        
        //Question 3
        System.out.println("\nWhich letter begins more words in the English language than any other letter?");
        printTab("a. S", true); //correct answer
        printTab("b. L", true);
        printTab("c. E", true);
        printTab("d. M", true);
        prompt();
        answer('a');
        
        //Question 4
        System.out.println("\nIf you draw one card from a normal deck of cards, what is the mathematical");
        System.out.println("probability of drawing a jack, queen, king, or diamond");
        printTab("a. 12%", true);
        printTab("b. 43%", true);
        printTab("c. 15%", true);
        printTab("d. 42%", true); //correct answer
        prompt();
        answer('d');
        
        //Question 5
        System.out.println("\nHis radio show is one of the most popular in America, his book was number 1 on");
        System.out.println("the New York Times best-seller list for 10 weeks, and some of his supporters");
        System.out.println("have stated that he should ren for President in 1996 on the Republican ticket.");
        System.out.println("Who is he?");
        printTab("a. Tom Cruise", true);
        printTab("b. Kevin Kevinson", true);
        printTab("c. Jordan Daniel", true);
        printTab("d. Rush Limbaugh", true); //correct answer
        prompt();
        answer('d');
        
        //Question 6
        System.out.println("\nWhat 10th century Catholic saint is know as the patron saint of skiing,");
        System.out.println("snowboarding, hiking and mountaineering?");
        printTab("a. St. Bernard", true); //correct answer
        printTab("b. St. Levian", true);
        printTab("c. St. Deonta", true);
        printTab("d. St. Blacke", true);
        prompt();
        answer('a');
        
        //Question 7
        System.out.println("\nCan you identify two California mountains with six-letter names?");
        printTab("a. Pazazz / Zizzle", true);
        printTab("b. Quartz / Izzard", true);
        printTab("c. Quippy / Jockey", true);
        printTab("d. Shasta / Diablo", true); //correct answer
        prompt();
        answer('d');
        
        //Question 8
        System.out.println("\nIn China these noodle-dough dumplings are filled with meat and boiled in soup,");
        System.out.println("and are called what?");
        printTab("a. Won Ton", true); //correct answer
        printTab("b. Hello stupid", true);
        printTab("c. Eat your hat", true);
        printTab("d. Noodle dough dumplings filled with meat and cook soup", true);
        prompt();
        answer('a');
        
        //Question 9
        System.out.println("\nThe Inuit Indian tribe can be found in Canada, Greenland, and Siberia, but are");
        System.out.println("known to us by a more common name. What is it?");
        printTab("a. AI Tribe", true);
        printTab("b. The hairs of Kevin James chest", true);
        printTab("c. Eskimo", true); //correct answer
        printTab("d. Haida", true);
        prompt();
        answer('c');
        
        //Question 10
        System.out.println("\nIf you looked at a clock in the mirror and the time on the clock face appeared");
        System.out.println("to read 8:20, what time would it be in reality?");
        printTab("a. 8:20", true);
        printTab("b. 3:40", true); //correct answer
        printTab("c. 12:49", true);
        printTab("d. 2:14", true);
        prompt();
        answer('b');
        
        //Question 11
        System.out.println("\nIf you flip a coin three times, what's the probability of getting at least one");
        System.out.println("\"tail\"?");
        printTab("a. 1/2", true);
        printTab("b. 9/12", true);
        printTab("c. 3/8", true);
        printTab("d. 7/8", true); //correct answer
        prompt();
        answer('d');
        
        //Question 12
        System.out.println("\nCan you name the person whose face appeared on the cover of Time Magazine more");
        System.out.println("than any other person, about 64 times, during his lifetime?");
        printTab("a. Johnny Depp", true);
        printTab("b. Bill Nye", true);
        printTab("c. Richard Nixon", true); //correct answer
        printTab("d. Deep Roy", true);
        prompt();
        answer('c');
        
        //Question 13
        System.out.println("\nAccording to 1991 population estimates, which city of the word has the largest");
        System.out.println("population, 27 million in its metro area?");
        printTab("a. Los Angeles", true);
        printTab("b. New York", true);
        printTab("c. Tokyo", true); //correct answer
        printTab("d. Buford", true);
        prompt();
        answer('c');
        
        //Question 14
        System.out.println("\nIf a rubber band weighs 40 milligrams, how many of them will weigh one");
        System.out.println("kilogram?");
        printTab("a. 800", true);
        printTab("b. -20,000,000", true);
        printTab("c. 10,000,000", true);
        printTab("d. -25,000", true); //correct answer
        prompt();
        answer('d');
        
        //Question 15
        System.out.println("\nThe breed of horse that excels at sprinting short distances, in races of a");
        System.out.println("quarter mile or less, are aptly called what?");
        printTab("a. Shetland", true);
        printTab("b. Austin's", true);
        printTab("c. Quarter", true); //correct answer
        printTab("d. PP", true);
        prompt();
        answer('c');
        
        System.out.println("\nYou got " + this.points + " points. If you would ask me, that's pretty crappy.\n\n");
    }
    
    void seduceGardener()
    {
        //Question 1
        System.out.println("In the final of 1992, the first McDonald's restaurant in Africa opened in an");
        System.out.println("exotic city bordering the Atlantic Ocean - the largest city in its country.");
        System.out.println("What city was it?");
        printTab("a. Casablanca", true); //correct answer
        printTab("b. Weast Niger", true);
        printTab("c. AustinisaPoopyHead", true);
        printTab("d. Lagos", true);
        prompt();
        answer('a');
        
        //Question 2
        System.out.println("\nSeawater contains about what percent salt?");
        printTab("a. 38%", true);
        printTab("b. 87%", true);
        printTab("c. 4%", true); //correct answer
        printTab("d. -72%", true);
        prompt();
        answer('c');
        
        //Question 3
        System.out.println("\nWith an estimated fortune at over $1 billion, she's one of the richest women in");
        System.out.println("Britain, and in 2006 was the second-richest female entertainer in the world.");
        System.out.println("Who is this?");
        printTab("a. J. K. Rowling", true); //correct answer
        printTab("b. Erin Hunter", true);
        printTab("c. Emma Watson", true);
        printTab("d. Emily Blunt", true);
        prompt();
        answer('a');
        
        //Question 4
        System.out.println("\nPatty Hearst was kidnapped on February 4, in what year?");
        printTab("a. 1973", true);
        printTab("b. 1982", true);
        printTab("c. 2014", true);
        printTab("d. 1974", true); //correct answer
        prompt();
        answer('d');
        
        //Question 5
        System.out.println("\nWhat do these well known people have in common? Dan Aykrod, Neil Young, Michael");
        System.out.println("J. Fox, and Peter Jennings?");
        printTab("a. Make Movies", true);
        printTab("b. Somewhat weird names", true);
        printTab("c. Humans", true);
        printTab("d. Born in Canada", true); //correct answer
        prompt();
        answer('d');
        
        //Question 6
        System.out.println("\nIf there are 16 telephone poles in a straight line, each pole 80 meters apart,");
        System.out.println("how far is it from the first pole to the last?");
        printTab("a. Do you have math? I HATE math!", true);
        printTab("b. 1200 Meters", true); //correct answer
        printTab("c. 300 Meters", true);
        printTab("d. 4 Days", true);
        prompt();
        answer('b');
        
        //Question 7
        System.out.println("\nWhat is the name of the delightful 1980 South African film about an African");
        System.out.println("bushman sent by his tribe to get rid of the evil thing that droped out of the");
        System.out.println("sky: a Coke bottle");
        printTab("a. Africa be Cray-Cray", true);
        printTab("b. The Gods Must be Cray-Cray", true);
        printTab("c. The Gods Must be Crazy", true); //correct answer
        printTab("d. WOW", true);
        prompt();
        answer('c');
        
        //Question 8
        System.out.println("\nThis word refers to a type of sofa, a type of overcoat, a brand of cigarettes,");
        System.out.println("and a city in England. What is it?");
        printTab("a. Thatington", true);
        printTab("b. Thatch", true);
        printTab("c. Hooch", true);
        printTab("d. Chesterfield", true); //correct answer
        prompt();
        answer('d');
        
        //Question 9
        System.out.println("\nWhich television personality, who retired in May, 1992, announced in a");
        System.out.println("television interview that he was comfortable in front of an audience but");
        System.out.println("awkward with people off camera?");
        printTab("a. May Haruka", true);
        printTab("b. Johnny Cash", true);
        printTab("c. A-Ha", true);
        printTab("d. Johnny Carson", true); //correct answer
        prompt();
        answer('d');
        
        //Question 10
        System.out.println("\nWhat is Desi Arnaz's catchphrase?");
        printTab("a. Hey", true);
        printTab("b. Babaloo", true);
        printTab("c. LUCY I'M HOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOME", true); //correct answer
        printTab("d. Thank You So Much", true);
        prompt();
        answer('c');
        
        //Question 11
        System.out.println("\nWhich range of hills runs in a north-south direction through the central part");
        System.out.println("of England?");
        printTab("a. Killaway", true);
        printTab("b. Pennies", true); //correct answer
        printTab("c. Karl", true);
        printTab("d. Martisx", true);
        prompt();
        answer('b');
        
        //Question 12
        System.out.println("\nWhat is the product name of the Skull Shaver Electric Razor");
        printTab("a. Harkian", true);
        printTab("b. J-Marks", true);
        printTab("c. Danger-J", true);
        printTab("d. Bald Eagle", true); //correct answer
        prompt();
        answer('d');
        
        //Question 13
        System.out.println("\nWhat professional boxer retired from the sport in 1976, later un-retired, and");
        System.out.println("in 1994 became the oldest fighter to ever win a major heavyweight title?");
        printTab("a. Mike Tyson", true);
        printTab("b. 'Little Mac'", true);
        printTab("c. George Foreman", true); //correct answer
        printTab("d. Kevin James", true);
        prompt();
        answer('c');
        
        //Question 14
        System.out.println("\nBy what name do we identify those certain kinds of weasels whose coats change");
        System.out.println("color in the winter?");
        printTab("a. Winter Weasels", true);
        printTab("b. Ermine", true); //correct answer
        printTab("c. Weir", true);
        printTab("d. Drupe", true);
        prompt();
        answer('b');
        
        //Question 15
        System.out.println("\nA city is in the shape of a rectangle, three times as long as it is wide. If a");
        System.out.println("diagonal distance through the city is one kilometer, what's the area of this");
        System.out.println("city, to the nearest square meter?");
        printTab("a. Do you have math? I HATE math", true);
        printTab("b. 333,333 Square Meters", true); //correct answer
        printTab("c. 333,323 Square Meters", true);
        printTab("d. 400 Square Meters", true);
        prompt();
        answer('b');
        
        System.out.println("\nYou got " + this.points + " points. If you would ask me, that's pretty crappy.\n\n");
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
