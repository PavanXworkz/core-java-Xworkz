class SnaksShop
{
		static String chats[]={"nippatu masala","boti masala","pani puri","masala puri","dhai puri","allu puri","bun masala","samosa","kachori","jalabi","fafda","nargies","allu bondaa","baggi","masala vada"};

	public static void main(String[]eat)
	{
		System.out.println("start of main");
		getchats();
		System.out.println("end of main");

	}
		public static void getchats()
		{
			System.out.println("list of chats");
		
			for(int i=0;i<chats.length;i++)
			{
				System.out.println(chats[i]);
			}
		}
	
}