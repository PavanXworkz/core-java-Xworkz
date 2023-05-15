class Restorent{
	public static double searchItem(String foodName)
	{
		
		System.out.println("searchItem method starts");
		//double prize=0.00;
			if("Masala dose"==foodName)
			{
				System.out.println("thanks for ordering-----"+foodName);
                  return 250.55;
			}

			if("gobi"==foodName)
			{
				System.out.println("thanks for ordering-------"+foodName);
				return 70.00;
			}
			if("shawarma"==foodName)
			{
				System.out.println("thanks for ordering-------"+foodName);
				return 70.00;
			}
			if("anna and samber"==foodName)
			{
				System.out.println("thanks for ordering-------"+foodName);
				return 80.00;
			}
			 if("samosa"==foodName)
			{
				System.out.println("thanks for ordering-------"+foodName);
				return 55.00;
			}
			if("idly"==foodName)
			{
				System.out.println("thanks for ordering-------"+foodName);
				return 50.00;
			}
			if("oreo shake"==foodName)
			{
				System.out.println("thanks for ordering-------"+foodName);
				return 100.00;
			}
		System.out.println("searchItem method starts");
		return 0.00;
	}
	public static double searchItem(String foodName , int quantity)
	{
		System.out.println("searchItem method started");
		//double prize=0.00;
		if("masala dosa"==foodName)
		{
			System.out.println("thanks for ordering-----"+foodName);
			return 250.00* quantity;
		}
		if("samosa"==foodName)
		{
			System.out.println("thanks for ordering-----"+foodName);
			return 55.00* quantity;
		}
		if("idly"==foodName)
		{
			System.out.println("thanks for ordering-----"+foodName);
			return 50.00 * quantity;
		}
		System.out.println("search item method ended");
		return 0.00;
	}
}