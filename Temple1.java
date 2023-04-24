class Temple1
{
	static String god[]={"humantha","ganesha","eshwara","lakshmi","saraswati","chamundi","ranganath swami","narasima swami","krishna","venkateshwara","rama","indra","bramma","shani","yama"};
	
	public static void main(String[]om)
	{
		System.out.println("main starts");
		getgod();
		System.out.println("main ends");
	}	
		public static void getgod()
		{
			System.out.println("names of god"+god.length);
			for(int i=0;i<god.length;i++)
			{
					System.out.println(god[i]);
			}
		}
	
}