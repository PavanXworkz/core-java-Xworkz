class Npr
{
	public static void main(String[]fact)
	{
		System.out.println("main method started");
		long factorial=Factorial.getFactorial(6)/Factorial.getFactorial(6-4);
		System.out.println("factorial is  "+factorial);
		System.out.println("main method ended");
	}
}

//n!/(n-r!)