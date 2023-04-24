class Speaker
{
	static boolean  isConnected;
	static String brandName="SONY";
	static int maxVolume=10;
	static int minVolume;
	static int currentVolume=8;


		public static void main(String []spaker)
		{
			System.out.println("main started ");
			onnOrOff();
			System.out.println("speaker connected"+isConnected);
			 decreaseVolume();
			 decreaseVolume();
			 increaseVolume();
			 decreaseVolume();
			 decreaseVolume();
						 decreaseVolume();

						 onnOrOff();
 			 decreaseVolume();

			System.out.println("main ended");
		}
		
		public static boolean onnOrOff()
		{
			System.out.println("ONN OR OFF method starts....");
			if(isConnected==false)
			{
				isConnected=true;
				System.out.println("Speaker is turned on.....");
			}
			else if(isConnected==true)
			{
				isConnected=false;
				System.out.println("Speaker is turned off.....");
			}
			
			
				System.out.println("on or off method ends");
				return isConnected;

		}
		
		public static int decreaseVolume()
		{
			System.out.println("decrease volume method");
			if(isConnected==true)
			{
				if(currentVolume<maxVolume)
				{
					System.out.println("current volume is less than minimum volume");
					currentVolume=currentVolume-1;
					System.out.println("the current volume is "+currentVolume);
					
				}
				else
				{
					System.out.println("min volume reached...........");
				}
			}
				else 
				{
				System.out.println("turn on the speaker");
				}
				System.out.println("decrease volume method ended");
				return currentVolume;
			
		}
		
				public static int increaseVolume()
		{
			System.out.println("increase volume method");
			if(isConnected==true)
			{
				if(minVolume<maxVolume)
				{
					System.out.println("minimum volume is less than maximum volume");
					currentVolume=currentVolume+1;
					System.out.println("the current volume is "+currentVolume);
					
				}
				else
				{
					System.out.println("max volume reached...........");
				}
			}
				else 
				{
				System.out.println("turn on the speaker");
				}
				System.out.println("increasing volume method ended");
				return currentVolume;
			
		}
				
	}		
		
	