class Hospital1
{
	static String doctorsName[]={"dr manjunath","dr aparna","dr monisha ravath","dr lakshmikanth","dr manoj gupta","dr anjan bhatacharya","dr anshuman manaswi","dr arjun mehara","dr abhijit pawar","dr surabhi dhanwala","dr sujith","dr yogesh","dr ashwath narayan","dr subhas shankar","dr bharathi pravin"};
	
	public static void main(String[]care)
	
	{
		System.out.println("start of main");
		getdoctorsName();
		System.out.println("start of main");

	}
		public static void getdoctorsName()
		{
			System.out.println("list of doctors avalable in the hospital");
		
			for(int i=0;i<doctorsName.length;i++)
			{
				System.out.println(doctorsName[i]);
			}
		}
}