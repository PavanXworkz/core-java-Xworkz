class OttPlatform
{
		static String prime[]={"fight club","kranti","shutter island","pathan","KGF","it","pushpa","top gun","harry potter","joker"};
		
		static String netfilx[]={"sir","chor nikal ke badh","18 pages","eega","yavadu","superman vs batman","spyder","passenger"};

		public static void main(String OttPlatform[])
		{
		System.out.println("main started");
				getprime();
				getnetfilx();
		System.out.println("main ended");
		
		
		}
		public static void getprime()
		{
			System.out.println("calling getprime method");
			for(int i=0;i<prime.length;i++)
			{
				System.out.println(prime[i]);
			}
			System.out.println("*******************************");
								return;

		}

		public static void getnetfilx()
		{
			System.out.println("calling netfilx method");
						for(int i=0;i<netfilx.length;i++)
						{
							System.out.println(netfilx[i]);
						}
								return;

		}
}