class TheaterRunnre
{
	public static void main(String []muv)
	{
		System.out.println("main method started");
		Theater.moviesName("kantara");
		Theater.moviesName("gaja");
		Theater.moviesName("kgf");
		Theater.moviesName("ps1");
		Theater.moviesName("master");
		Theater.moviesName("hoysala");
		Theater.moviesName("karanti");
		Theater.moviesName("karia");
		Theater.moviesName("navagraha");
		Theater.moviesName("kabza");
		
		Theater.getMoviesName();
		Theater.updateMoviesName("gaja","boos");
				Theater.getMoviesName();

		System.out.println("main method ended");
		

	}
}