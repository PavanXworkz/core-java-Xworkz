class SwiggyQuantity
{
	public static double searchItem(String foodName)
	{
		System.out.println("searching item starts");
		if("veg burger"==foodName)
		{
			System.out.println("thanks for ordering------"+foodName);
			return 70.00;
		}
		if("pizza"==foodName)
		{
			System.out.println("thanks for ordering------"+foodName);
			return 100.00;
		}
		if("omlet"==foodName)
		{
			System.out.println("thanks for ordering------"+foodName);
			return 40.00;
		}
		if("panner sandwitch"==foodName)
		{
			System.out.println("thanks for ordering------"+foodName);
			return 130.00;
		}
		if("lemon rice"==foodName)
		{
			System.out.println("thanks for ordering------"+foodName);
			return 40.00;
		}
		System.out.println("searching item ends");
		return 0.00;
	}
	public static double searchItem(String foodName, int quantity)
	{
		System.out.println("searching item starts");
		if("veg burger"==foodName)
		{
			System.out.println("thanks for ordering------"+foodName);
			return 70.00*quantity;
		}
		if("pizza"==foodName)
		{
			System.out.println("thanks for ordering------"+foodName);
			return 100.00*quantity;
		}
		if("omlet"==foodName)
		{
			System.out.println("thanks for ordering------"+foodName);
			return 40.00*quantity;
		}
		if("panner sandwitch"==foodName)
		{
			System.out.println("thanks for ordering------"+foodName);
			return 130.00*quantity;
		}
		if("lemon rice"==foodName)
		{
			System.out.println("thanks for ordering------"+foodName);
			return 40.00*quantity;
		}
		System.out.println("searching item ends");
		return 0.00;
	}
}