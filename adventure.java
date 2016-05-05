/*
 * This class contains the actual adventure for the game.
 * It starts with a constructor, so you only need to create an object to call it.
 * It then goes through methods, each one testing the input.
 * For the prompts, see level.java.
 * For the main, go to idk.java
 */

import java.util.Scanner; //For input, of course

//For music
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class adventure
{
    Clip clip = null; //Clip object for music.
    private boolean quit = false; //Atribute that will be tested at the end of each level method. If it evaluates to false, the game ends.
    public adventure() //Constructor so that no method needs to be called to run the adventure.
    {
        try { //Play song
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("music/play_through.wav")));
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            System.out.println("No music for you, boi.");
        }
        commands command = new commands(); //lets us use the clear command for fusion
        level level = new level(); //level class
        level.beginning(); //beginning prompt
        String beginning, beginningSuicide = ""; //beginning, beginningSuicide and any other suicide string MUST be an empty (not void) string. This is so the death method does not read a null string.
        while (true) //infinite loop until quit or choice.
        {
            beginning = userPrompt(); //Prompts player with "MajicMan: " or "Toaster: " of course depending on who you are.
            if (beginning.equalsIgnoreCase("flavor town")) //flavor town will always reprint the prompt, but since the prompt is a method, we must use it in each adventure method.
                level.beginning();
            else if (strChoice(beginning, 1)) //1 is the correct path.
                goOnAdventure(); //Brings you to another method. This will be the process for every adventure method.
            else if (strChoice(beginning, 2)) { //Wrong answer, taunts the player then prompts them to either leave or stay.
                death(beginningSuicide, "You idiot, you didn't even try to save her."); //death takes the suicide string (again, must be empty, NOT void).
            }
            else if (beginning.equalsIgnoreCase("fusion cls _/\\_ flavor town") || beginning.equalsIgnoreCase("fusion clear _/\\_ flavor town") || beginning.equalsIgnoreCase("fusion window washer! _/\\_ flavor town")) {
                command.clear();
                level.beginning();
            }
            else
                baseCommands(beginning, beginningSuicide); //baseCommands takes two arguments, the regular input and the suicide input.
            if (this.quit == true) //tests if the quit atribute is true, if  so...
                break; //... the game ends.
        }
    }
    
    void goOnAdventure() //Goes to this method if 1 is chosen on the first level.
    {
        commands command = new commands();
        level level = new level();
        level.adventure(); //prompt for this level.
        String goOnAdventure, goOnAdventureSuicide = ""; //empty, NOT void strings.
        while (true) //infinite loop until quit or choice.
        {
            goOnAdventure = userPrompt();
            if (goOnAdventure.equalsIgnoreCase("flavor town"))
                level.adventure();
            else if (goOnAdventure.equalsIgnoreCase("fusion cls _/\\_ flavor town") || goOnAdventure.equalsIgnoreCase("fusion clear _/\\_ flavor town") || goOnAdventure.equalsIgnoreCase("fusion window washer! _/\\_ flavor town")) {
                command.clear();
                level.adventure();
            }
            else if (strChoice(goOnAdventure, 1))
                goToTree();
            else if (player.getCharacter().equalsIgnoreCase("Toaster") && strChoice(goOnAdventure, 2))
                level.goToGardener(); /**Create a gardener level. This should direct to the gardener method in this class that is soon to be created. THIS IS TEMPORARY*/
            else
                baseCommands(goOnAdventure, goOnAdventureSuicide); //Again, baseCommands takes two arguments, the regular input and the suicide input.
            if (this.quit == true)
                break;
        }
    }
    
    void goToTree() /**DO THIS WHEN DONE WITH goOnAdventure*/
    {
        commands command = new commands();
        level level = new level();
        level.goToTree();
        String goToTree, goToTreeSuicide = "";
        while (true)
        {
            goToTree = userPrompt();
            if (goToTree.equalsIgnoreCase("flavor town"))
                level.goToTree();
            else if (goToTree.equalsIgnoreCase("fusion cls _/\\_ flavor town") || goToTree.equalsIgnoreCase("fusion clear _/\\_ flavor town") || goToTree.equalsIgnoreCase("fusion window washer! _/\\_ flavor town")) {
                command.clear();
                level.goToTree();
            }
            else if (strChoice(goToTree, 1) && player.getCharacter().equalsIgnoreCase("Toaster"))
                death(goToTreeSuicide, "You try to burn the Tree with your toaster heat, but you are not plugged in,\nyou die of stupidness.");
            else if (strChoice(goToTree, 1) && player.getCharacter().equalsIgnoreCase("MajicMan"))
                level.goToGardener(); /**Create a gardener level. This should direct to the gardener method in this class that is soon to be created. THIS IS TEMPORARY*/
            else if (strChoice(goToTree, 2)) {
                seduce seduce = new seduce();
                seduce.seduceTree();
            }
            else
                baseCommands(goToTree, goToTreeSuicide);
            if (this.quit == true)
                break;
        }
    }

    void goToGardener()
    {
        commands command = new commands();
        level level = new level();
        level.goToGardener();
        String goToGardener, goToGardenerSuicide = "";
    }
    
    void death(String x, String reason) //Method that takes the argument, asks for user input, stores it in that variable, then quits the game depending on the result of var x.
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reason);
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
            death(playerSuicide, "Realizing that you left the master key to any door under the doormat, you go to\nyour bathroom to drop a hairdryer into the bath tub because you are too dumb\nfor planet Earth.");
        else if (playerCommand.equalsIgnoreCase("fusion cls _/\\_ help") || playerCommand.equalsIgnoreCase("fusion cls _/\\_ ?") || playerCommand.equalsIgnoreCase("fusion clear _/\\_ help") || playerCommand.equalsIgnoreCase("fusion clear _/\\_ ?") || playerCommand.equalsIgnoreCase("fusion window washer! _/\\_ help") || playerCommand.equalsIgnoreCase("fusion window washer! _/\\_ ?")) {
            command.clear();
            command.help();
        } else if (playerCommand.equalsIgnoreCase("fusion cls _/\\_ about") || playerCommand.equalsIgnoreCase("fusion clear _/\\_ about") || playerCommand.equalsIgnoreCase("fusion window washer! _/\\_ about")) {
            command.clear();
            command.about();
        } else //If the command is not found, print this and restart the loop.
            System.out.println("You idiot, that isn't a command. Hitmen are headed your way, idiot.");
    }

    boolean strChoice(String input, int choice) //Used to test if the user chose a path rather than entered a command.
    {
        if (input.startsWith(Integer.toString(choice)))
            return true;
        else
            return false;
    }
    
    String userPrompt() //Prompts player with "MajicMan: " or "Toaster: " of course depending on who you are.
    {
        System.out.print("\n" + player.getCharacter() + ": "); //Prompt
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        x.trim();
        return x;
    }
}
