class idk
{
	public static void main(String[] args)
	{
		personality test = new personality();
		test.quiz();
		byte playerPoints = test.getPoints();
		String character;
		if (playerPoints <= 4)
		{
			character = "MajicMan";
		}
		else
		{
			character = "Toaster";
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
		System.out.println(character);
	}
}
