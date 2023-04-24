class Zomato
{
	public static double searchItem(String foodName)
	{
		System.out.println("searchItem method starts");
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
}