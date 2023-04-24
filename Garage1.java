class Garage1
{
	static String workers[]={"raju","amir","anil","faiaz","firoz","jamal","ifran","seena","dada","shankra","surya","rafik","kishan","pavan","dinakar"};


		public static void main(String []change)
		{
			
			System.out.println("main fonction starts");
			getworkers();
			System.out.println("main fucyion ends");
		}	
			public static void getworkers()
			{
				
				System.out.println("name of the workers in garage");
			
				for(int i=0;i<workers.length;i++)
				{
					System.out.println(workers[i]);
				}
			}
		
		
}