class Collage1
{
	static 	String departments[]={"BCA","microbiology","botny","zoology","chemestry","physic","mathematc","civil","ISC","CS","criminology","phycology","mechnical","design","electrical"};

	public static void main(String[]cls)
	{
		System.out.println("main starts");
		getdepartment();
		System.out.println("main ends");
	}
		public static void getdepartment()
		{
			System.out.println("departments of the college");
		
			for(int i=0;i<departments.length;i++)
			{
				System.out.println(departments[i]);
			}
		
	    }
	
	
}