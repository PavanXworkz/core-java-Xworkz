class Theater
{
	 static String moviesName[]={null,null,null,null,null,null,null,null,null,null};
	 static int index;
	 public static boolean moviesName(String movieName)
	 {
		 System.out.println("movie name adding started");
		 boolean isAdded=false;
		 if(movieName!=null)
		 {
			 moviesName[index++]=movieName;
			 isAdded=true;
		 }
		 else
		 {
			 System.out.println("movie name not found"+moviesName);
		 }
		 System.out.println("movie name adding ended");
		 	 return isAdded;

	 }
	 
	 public static void getMoviesName() 
	 {
		System.out.println("get method started");
			for(int i=0;i<moviesName.length;i++)
			{
				System.out.println(moviesName[i]);
			}				
		System.out.println("get method ended");

	 }
	 public static boolean updateMoviesName(String oldMovieName, String updateMoviesName)
	 {
		 System.out.println("update Movies Name started");
		 boolean isUpdate=false;
		 for(int i=0;i<moviesName.length;i++)
		 {
			 if(moviesName[i].equals(oldMovieName))
			 {
				 moviesName[i]=updateMoviesName;
				 isUpdate=true;
			 }
		 }
		 return isUpdate;
	 }
}