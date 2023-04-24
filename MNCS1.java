class MNCs1
{
	static String companies[]={"TCS","infosys","wipro","HCL","micromax","karban","bajaj","TVS","tec mahindra","dabour","hero motercop","bharti ent","aditya birla groups","dr reddy's","cafe coffee day","britannia"};
	
	public static void main(String[]com)
	{
		System.out.println("main starts");
		getcompanies();
		System.out.println("main ends");
	}
		public static void getcompanies()
		{
			System.out.println("top MNCs of India");
			for(int i=0;i<companies.length;i++)
			{
				System.out.println(companies[i]);
			}
		}
}