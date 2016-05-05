/*
 * This class holds the prompts, such as dialogue.
 * If you want to see the conditions for what the user wants to do,
 * go to adventure.java
 * For the main, go to idk.java
 */

public class level
{
    void beginning()
    {
        if (player.getCharacter().equalsIgnoreCase("MajicMan")) { //There are different prompts for each character in this case, so if statements are required.
            uPrompt(); //i'm lazy
            System.out.println("You, " + player.getCharacter() + ", are living with your grandma, but hear a thud,");
            System.out.println("You are suspicious and go check it out, but you sexy girlfriend,");
            System.out.println("the door's door handle, is no longer attatched to the door.");
            System.out.println("It is your job to find Patricia (her name), " + player.getCharacter() + ".");
            System.out.println("You can do one of two things:");
            printTab("1. Go on an adventure"); //Always tab choices.
            printTab("2. Stay at your grandma's");
            jttn(2); //i'm lazy
            lPrompt(); //i'm lazy
        } else {
            uPrompt();
            System.out.println("You, " + player.getCharacter() + ", an independant woman,");
            System.out.println("are living with your grandma, but hear a thud.");
            System.out.println("You are suspicious and go check it out, but you sexy girlfriend,");
            System.out.println("the door's door handle, is no longer attatched to the door.");
            System.out.println("It is your job to find Patricia (her name), " + player.getCharacter() + ".");
            System.out.println("You can do one of two things:");
            printTab("1. Go on an adventure");
            printTab("2. Stay at your grandma's");
            jttn(2);
            lPrompt();
        }
    }

    void adventure()
    {
        if (player.getCharacter().equalsIgnoreCase("Toaster")) {
            uPrompt();
            System.out.println("You leave your Grandmah's house in search for your butifull door knob");
            System.out.println("girlfirend. As you walk you see a small hole, about the size of a");
            System.out.println("toaster.");
            System.out.println("You can do one of two things:");
            printTab("1. Keep walking");
            printTab("2. Go down toaster hole");
            jttn(2);
            lPrompt();
        } else {
            uPrompt();
            System.out.println("You leave your Grandmah's house in search for your butifull door knob");
            System.out.println("girlfirend. As you walk you see a small hole, about the size of a toaster.");
            System.out.println("You can do one of one things:");
            printTab("1. Keep walking");
            jttn(1);
            lPrompt();
        }
    }
    
    void goToTree()
    {
        uPrompt();
        System.out.println("You walk for several more minutes. You see a Tree, you have never been outside");
        System.out.println("before, and are entranced by this beautiful Tree.");
        if (player.getCharacter().equalsIgnoreCase("Toaster"))
            printTab("1. Burn Tree");
        else
            printTab("1. Poof Tree");
        printTab("2. Seduce Tree");
        jttn(2);
        lPrompt();
    }

    void goToGardener() /**Complete dialogue when you are finished.*/
    {
        uPrompt();
        System.out.println("This is all we have for this path, should have gone the other way, idiot.");
        lPrompt();
    }
    
    /* Next three methods created out of laziness, really. */
    void uPrompt() //Upper prompt. The design above the prompt to signal that there is a new prompt.
    {
        System.out.println("\n\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\");
    }
    
    void lPrompt() //Lower prompt. The design under the prompt to signal that it is finished.
    {
        System.out.println("\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\");
    }
    
    void printTab(String x)
    {
        System.out.println("\t" + x);
    }
    
    void jttn(int x) //j(ust) t(ype) t(he) n(umber). Arg is the ammount of choices the user has.
    {
        System.out.print("Just type the number ");
        if (x > 1) {
            System.out.print("(");
            for (int i = 1; i <= x; ++i) { //loop that will print (<NUMBER> or <NUMBER>) until there is one number left.
                if (i < x)
                    System.out.printf("%d or ", i);
                else if (i == x)
                    System.out.printf("%d in this case).\n", i);
            }
        } else {
            System.out.println("(1 or 1 in this case)."); //this is on intentional
        }
    }
}
