class TouristPlace1
{
	static String destination[]={"mullayanagiri","baba budangiri","kemmangundi","hebbe falls","horanadu","kallathigiri falls","belur","Z point",};
	
	public static void main(String[]tour)
	{
		System.out.println("main starts");
		getdestination();
		System.out.println("main ends");
	}
		public static void getdestination()
		{
		System.out.println("list of turist destination"+destination.length);
		
		for(int i=0;i<destination.length;i++)
		{
			System.out.println(destination[i]);
		}
	}
}