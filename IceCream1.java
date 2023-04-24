class IceCream1
{
	static String brands[]={"polar bear","naturals","vadilal","arun","milano","baskin robins","nandini","amul","ibaco","stoner","cream chemestry","art of delifht","icebreakers","gelato italiano"};
	
	public static void main(String[]cool)
	{
		System.out.println("main starts");
		getbrands();
		System.out.println("main ends");
	}
		public static void getbrands()
		{
		System.out.println("list of ice cream brands"+brands.length);
		for(int i=0;i<brands.length	;i++)
		{
			System.out.println(brands[i]);
		}
	}
}