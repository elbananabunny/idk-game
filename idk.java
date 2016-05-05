/*
 * This file contains the main, but it doesn't do much.
 * It really just controls the flow. Most classes aren't used in the main.
 * If you want to see what is actually going on, see adventure.java
 */

import java.util.Scanner;

//For music
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

class idk
{
    public static void main(String[] args)
    {
        Clip clip = null; //Clip object to be used in the try/catch for music.
        try { //Play music.
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("music/main_menu.wav")));
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            System.out.println("There was supposed to be music, guess not, stupid.");
        }
        System.out.println("\nThere are no saves idk.");
        System.out.println("Don't die idk.");
        System.out.println("Type \"Help\" for help idk.");
        System.out.print("Are you ready to start? Yes or yes: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("\n\n");
        personality test = new personality(); //create an object for personality class.
        player player = new player(); //create an object for player class.
        test.quiz(); //start the quiz.
        int playerPoints = test.getPoints(); //get the total points and set it to playerPoints.
        if (playerPoints <= 4) //If player points is lower than 5...
        {
            player.setCharacter("MajicMan"); //... the player is MajicMan
        }
        else
        {
            player.setCharacter("Toaster"); //If the number is higher (or somehow lower) then default to Toaster.
        }
        System.out.print("You got. ");
        try
        {
            for (int reveal = 1; reveal <= 2; ++reveal) //Just a loop to print out a dot to make an elipse leading up to what character was chosen for them.
            {
                Thread.sleep(1000); //Pause one second.
                System.out.print(". "); //Print a dot and a space.
            }
        }
        catch (InterruptedException e) //Catch the exception if something goes wrong.
        {
            System.out.println("\nLook, there is supposed to be suspense, but you messed it up, idiot."); //Tell them that something went wrong (rudely).
        }
        System.out.println(player.getCharacter()); //Print what character they got.
        try
        {
            Thread.sleep(1000); //Pause between starting the adventure.
        }
        catch (InterruptedException e)
        {
            System.out.println("\nLook, there is supposed to be suspense, but you messed it up, idiot."); //again, tell the user that something happened.
        }
        try {
            clip.stop(); //Stop music before going on in the game.
        } catch (Exception e) {
            System.out.println("Guess this music ain't stoppin.");
        }
        adventure adventure = new adventure(); //creates an object. no methods need to be called, the constructor does all the work.
    }
}
