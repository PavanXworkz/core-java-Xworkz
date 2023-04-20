class Fan
{
	static boolean isOn;
	static int maxSpeed=5;
	static int minSpeed;
	static int currentSpeed;
	
	
	public static void main(String[]air)
	{
		System.out.println("main method starts hear");
		onnOrOff();
		increseSpeed();
		increseSpeed();
		increseSpeed();
		decreseSpeed();
		increseSpeed();
		onnOrOff();
		increseSpeed();
		
		System.out.println("main method ends hear");
	}
	
	
	public static boolean onnOrOff()
	{
		System.out.println("on or of method starts");
		if(isOn==false)
		{
			isOn =true;
			System.out.println("fan is on");
		}	
			else if(isOn==true)		
			{
				isOn=false;
				System.out.println("fan is turnde off");
				return isOn;
			}
		System.out.println("on or of method ends");
		return isOn;
	}
	
	public static int increseSpeed()
	{
		System.out.println("incresing speed starts hear......");
		if(isOn==true)
		{
			if(currentSpeed<maxSpeed)
			{
				System.out.println("current speed is less than max speed");
				currentSpeed=currentSpeed+1;
				System.out.println("current speed is......."+currentSpeed);
				
			}
			else
			{
				System.out.println("maximum speed reached");
			}
		}
		else
		{
			System.out.println("first on the fan ");
		}
		System.out.println("increasing speed ends hear..........");
					
		return currentSpeed;
	}
	public static int decreseSpeed()
	{
		System.out.println("decrese speed starts hear");
		if(isOn==true)
		{
			if(currentSpeed<maxSpeed)
			{
				System.out.println("current speed is less than max speed");
				currentSpeed=currentSpeed-1;
				System.out.println("current speed is....."+currentSpeed);
			}
		}
		else
		{
			System.out.println("first turn on the fan");
		}
		System.out.println("decresing speed ends hear");
		return currentSpeed;
	}
	
}