class Swigy
{
	public static double searchItem(String foodItem)
	{
		System.out.println("search item started");
		if("noodles"==foodItem)
		{
		   System.out.println(" thanks searching-----"+foodItem);
		
	      return 40.00;
		}
	   
	   if("panner tikka"==foodItem)
	   {
		   System.out.println("thanks for searching-----"+foodItem);
	     return  80.00;
	   }
		 if("chilli parota"==foodItem)
		 {
		   System.out.println("thanks for searching-----"+foodItem);
		 return 100.00;
		 }
		 if("chow chow bath"==foodItem)
		 {
			 System.out.println("thanks for searching-----"+foodItem);
		   return 50.00;
		 }
		 if("egg rool"==foodItem)
		 {
			 System.out.println("thanks for searching-----"+foodItem);
		  return 70.00;
		 }
		 if("chicken sandwich"==foodItem)
		 {
			 System.out.println("thanks for searching-----"+foodItem);
		   return 360.00;
		 }
		   if("momos"==foodItem)
		   {
			   System.out.println("thanks for searching-----"+foodItem);
		   return 189.00;
		   }
		   if("taco"==foodItem)
		   {
			   System.out.println("thanks for searching-----"+foodItem);
		   return 285.00;
		   }
	     System.out.println("searching item ended");
			return 0.00;
	}
}