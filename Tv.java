class Tv
{
	static boolean isturnOn;
	static int maxChanel=50;
	static int minChanel;
	static int currentChanel;
	
	
	public static void main(String[]shows)
	{
		System.out.println("main starts hear");
		onOrOff();
		nextChanel();
		nextChanel();
		nextChanel();
		previousChannel();
		nextChanel();		
		onOrOff();
		System.out.println("main ends hear");
	}
	
	public static boolean onOrOff()
	{
		System.out.println(" on or off function starts");
		if(isturnOn==false)
		{
			isturnOn=true;
			System.out.println("tv is on");
		}
		else if(isturnOn==true)
		{
			isturnOn=false;
			System.out.println("tv is off");
		}
		System.out.println("on or off function ends");
		return isturnOn;
	}
	
	public static int nextChanel()
	{
		System.out.println("next channel staarts");
		if(isturnOn=true)
		{
			if(currentChanel<maxChanel)
			{
				System.out.println("current  Chanel is lessef than max channel");
				currentChanel=currentChanel+1;
				System.out.println("current channel is........."+currentChanel);
			}
			
		
			else
			{
				System.out.println("max channel reached");
			}
		}
		else 
		{
			System.out.println("first on the tv");
		}
		System.out.println("next channel ends");
		return currentChanel;
	}
	public static int previousChannel()
	{
		System.out.println("previos channel starts");
		if(isturnOn=true)
		{
			if(currentChanel<maxChanel)
			{
				System.out.println("current channel is lesser than maximum channel ");
				currentChanel=currentChanel-1;
				System.out.println("current channel is ......."+currentChanel);
			}
			else
			{
				System.out.println("minimum channel reached");
			}
		}
		
		else
		{
		
			System.out.println("first on the tv");
		}
		System.out.println("previous Channel ends");
					return currentChanel;

	}
}