class Microwave
{
	static boolean isOn;
	static int maxTimeInSec=30;
	static int minTimeInSec;
	static int currentTimeInSec;
	
	public static void main(String[]cook)
	{
		System.out.println("main method starts ");
		onOrOff();
		increseTime();
		increseTime();
		decreseTime();
		increseTime();
		increseTime();		
		onOrOff();
				increseTime();

		System.out.println("main method ends");
	}
	
	public static boolean onOrOff()
	{
		System.out.println("on or off method starts ");
		if(isOn==false)
		{
			isOn=true;
			System.out.println("microwave is on ");
		}
		else if(isOn==true)
		{
			isOn=false;
			System.out.println("microwave is off ");
			
		}
		System.out.println("on or off method ends ");
			return isOn;
	}
	
	public static int increseTime()
	{
		System.out.println("increse Time method starts ");
		if(isOn==true)
		{
			if(currentTimeInSec<maxTimeInSec)
			{
				System.out.println("current time is less than max time");
				currentTimeInSec=currentTimeInSec+2;
				System.out.println("current time is........."+currentTimeInSec);
			}
			else
			{
				System.out.println("max time reached ");
				
			}
			
		}
		else
		{
			System.out.println("turn on the microwavefirst ");
	
		}
	     	System.out.println("increse Time method ends ");
			return currentTimeInSec;
		
	}
	
		public static int decreseTime()
	{
		System.out.println("decrese Time starts");
		if(isOn==true)
		{
			if(currentTimeInSec<maxTimeInSec)
			{
				System.out.println("decrease time starts");
				currentTimeInSec=currentTimeInSec-2;
				System.out.println("current time is"+currentTimeInSec);
				
			}
			else
			{
				System.out.println("min time reached ");
				
			}
		}
		else
		{
			System.out.println("turn on the microwavefirst ");
		}
		System.out.println("decrease time ends ");
		return currentTimeInSec;

	}
}