class Refrigerator1
{
	static boolean iscool;
	static int minTemp;
	static int maxtemp=-50;
	static int currentTemp;
	
	
	public static void main(String[]cool)
	{
		System.out.println("main starts");
		onOrOf();
		decreasetemp();
		increaseTemp();
		decreasetemp();
		onOrOf();
		System.out.println("main ends");		
	}
	public static boolean onOrOf()
	{
		System.out.println("on or off method starts");
		if(iscool==false)
		{
			iscool=true;
		System.out.println("refrigerator is on");
			
		}
		else if(iscool==true)
		{
			iscool=false;
			System.out.println("refrigerator is off");
		}
		System.out.println("on or off method ends");
		return iscool;
	}
	public static int decreasetemp()
	{
		if (iscool==true)
		{
			if(maxtemp<currentTemp)
			{
				System.out.println("max temperature is less than currtnt tmperature");
				currentTemp=currentTemp-1;
				System.out.println("current temperature is ..........."+currentTemp);
				
			}
			else
			{
				System.out.println("max temp reached");
			}
		}
		else
		{
			System.out.println("first on the refrigerator");
		}
					System.out.println("decreasing temperaature ends");
                       return currentTemp;
	}
	public static int increaseTemp()
	{
		System.out.println("increase Temperature starts");
		if(iscool==true)
		{
			if(maxtemp<minTemp)
			{
				System.out.println("max temperature is less than currtnt tmperature");
				currentTemp=currentTemp+1;
				System.out.println("current temperature is ..........."+currentTemp);
			}
		
					else
				{
					System.out.println("min temp reached");
				}
		}
		else
		{
			System.out.println("first on the refrigerator");		
		}
		System.out.println("incersing temperaature ends");
                       return currentTemp;
	}
}