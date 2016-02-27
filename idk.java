/*
 * This file contains the main, but it doesn't do much.
 * It really just controls the flow. Most classes aren't used in the main.
 * If you want to see what is actually going on, see adventure.java
 */

import java.util.Scanner;
//import java.io.*;

class idk
{
	public static void main(String[] args)
	{
		System.out.println("\nThere are no saves idk.");
		System.out.println("Don't die idk.");
		System.out.println("Type \"Help\" for help idk.\n\n");
		personality test = new personality(); //create an object for personality class.
		player player = new player(); //create an object for player class.
		test.quiz(); //start the quiz.
		byte playerPoints = test.getPoints(); //get the total points and set it to playerPoints.
		if (playerPoints <= 4) //If player points is lower than 5...
		{
			player.setCharacter("MajicMan"); //... the player is MajicMan
		}
		else
		{
			player.setCharacter("Toaster"); //If the number is higher (or somehow lower if they get the source code...) then default to Toaster.
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
		adventure adventure = new adventure(); //creates an object. no methods need to be called, the constructor does all the work.
	}
}