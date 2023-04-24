class Ott1
{

		static String prime[]={"fight club","kranti","shutter island","pathan","KGF","it","pushpa","top gun","harry potter","joker"};
		
		static String netflix[]={"sir","chor nikal ke badh","18 pages","eega","yavadu","superman vs batman","spyder","passenger"};
		
		
       static String hotstar[]={"special ops","RRR","alone","baggi3","night manager","chhichhore"};
		
			public static void main(String[]movie)
			{
				System.out.println("main starts");
				getprime();
				getnetflix();
				gethotstar();
				System.out.println("main ends");
			}
			
			public static void getprime()
			{
				for(int i=0;i<prime.length;i++)
				{
					System.out.println(prime[i]);
				}
				System.out.println("************************");
				return;
			}
			public static void getnetflix()
			{
				for(int n=0;n<netflix.length;n++)
				{
					System.out.println(netflix[n]);
				}
				System.out.println("************************");
				
				return;
			}
			public static void gethotstar()
			{
				for(int m=0;m<hotstar.length;m++)
				{
					System.out.println(hotstar[m]);
				}
				System.out.println("************************");
				
			}
}