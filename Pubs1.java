class Pubs1
{
	static String names[]={"local","abc","city bar","toit","district6","loft38","fenny","guzzler inn","pecos","13th floor","opus","love shake","Fbar"};
	
	public static void main(String[]joy)
	{
		System.out.println("main starts");
		getnames();
		System.out.println("main ends");
	}
		public static void getnames()
		{
			System.out.println("list of pubs in bengaluru"+names.length);
	
				for(int i=0;i<names.length;i++)
			{
				System.out.println(names[i]);
			}
		}
}