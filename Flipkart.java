class Flipkart
{
	public static double searchProduct(String productName)
	{
		System.out.println("search product starts");
		
			if("LED tv"==productName)
			{
				System.out.println("product found----"+productName);
				return 40000.00;
			}
			if("Mixer"==productName)
			{
				System.out.println("product found----"+productName);
				return 9884.00;
			}
			if("speaker"==productName)
			{
				System.out.println("product found----"+productName);
				return 987.00;
			}
			if("charger"==productName)
			{
				System.out.println("product found----"+productName);
				return 998.00;
			}
			if("shirt"==productName)
			{
				System.out.println("product found----"+productName);
				return 399.00;
			}
			System.out.println("search product ends");
			return 0.00;
		
		
		
	}
	
	
	public static double searchProduct(String productName,int quantity)
	{
		System.out.println("search product starts");
		
			if("LED tv"==productName)
			{
				System.out.println("product found----"+productName);
				return 40000.00*quantity;
			}
			if("Mixer"==productName)
			{
				System.out.println("product found----"+productName);
				return 9884.00 *quantity;
			}
			if("speaker"==productName)
			{
				System.out.println("product found----"+productName);
				return 987.00* quantity;
			}
			if("charger"==productName)
			{
				System.out.println("product found----"+productName);
				return 998.00* quantity;
			}
			if("shirt"==productName)
			{
				System.out.println("product found----"+productName);
				return 399.00* quantity;
			}
			System.out.println("search product ends");
			return 0.00;
		
		
		
	}
}