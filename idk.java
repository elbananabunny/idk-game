class idk
{
	public static void main(String[] args)
	{
		personality test = new personality();
		player player = new player();
		test.quiz();
		byte playerPoints = test.getPoints();
		if (playerPoints <= 4)
		{
			player.setCharacter("MajicMan");
		}
		else
		{
			player.setCharacter("MajicMan");
		}
		System.out.print("You got. ");
		try
		{
			for (int reveal = 1; reveal <= 2; ++reveal)
			{
				Thread.sleep(1000);
				System.out.print(". ");
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("\nLook, there is supposed to be suspense, but you messed it up, idiot.");
		}
		System.out.println(player.getCharacter());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			System.out.println("\nLook, there is supposed to be suspense, but you messed it up, idiot.");
		}
		System.out.println("\n\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
		System.out.println("You, " + player.getCharacter() + " are living with your grandma, but hear a thud,");
		System.out.println("You are suspicious and go check it out, but you girlfriend,");
        System.out.println("the door's door handle, is no longer attatched to the door.");
		System.out.println("It is your job to find it, " + player.getCharacter() + ".");
		System.out.println("\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//\\\\//");
	}
}
