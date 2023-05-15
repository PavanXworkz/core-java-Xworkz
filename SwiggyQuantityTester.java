class SwiggyQuantityTester
{
	public static void main(String[]test)
	{
		System.out.println("main method started");
		String foodName="pizza";
		double prize=SwiggyQuantity.searchItem(foodName);
		System.out.println("the name of the food  "+foodName+"is  "+prize);
		
		double prizeQuantity=SwiggyQuantity.searchItem(foodName,5);
		System.out.println("nameof the food   "+foodName+"is  "+prize);
		System.out.println("main method ended");

	}
}