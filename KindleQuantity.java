class KindleQuantity
{
	public static double searchBook(String bookName)
	{
		System.out.println("searching books started");
		if("once upon a time spy"==bookName)
		{
			System.out.println("found the book-"+bookName);
			return 201.00;
		}
		if("one day life changewill "==bookName)
		{
			System.out.println("found the book"+bookName);
			return 129.00;
		}
		if("Dr B R Ambedkar jeevan charit"==bookName)
		{
			System.out.println("found the book"+bookName);
			return 180.00;
		}
		if("the theory of everything"==bookName)
		{
			System.out.println("found the book-"+bookName);
			return 169.00;
		}
		if("chanakya in you"==bookName)
		{
			System.out.println("found the book"+bookName);
			return 219.00;
		}
		if("everything i never told you"==bookName)
		{
			System.out.println("found the book-"+bookName);
			return 98.00;
		}
		System.out.println("searching books ends");
		return 0.00;
	}
	public static double searchBook(String bookName,int quantity)
	{
		System.out.println("searching books started");
		if("once upon a time spy"==bookName)
		{
			System.out.println("found the book-"+bookName);
			return 201.00*quantity;
		}
		if("one day life will change"==bookName)
		{
			System.out.println("found the book"+bookName);
			return 129.00*quantity;
		}
		if("Dr B R Ambedkar jeevan charit"==bookName)
		{
			System.out.println("found the book"+bookName);
			return 180.00*quantity;
		}
		if("the theory of everything"==bookName)
		{
			System.out.println("found the book-"+bookName);
			return 169.00*quantity;
		}
		if("chanakya in you"==bookName)
		{
			System.out.println("found the book"+bookName);
			return 219.00*quantity;
		}
		if("everything i never told you"==bookName)
		{
			System.out.println("found the book-"+bookName);
			return 98.00*quantity;
		}
		System.out.println("searching books ends");
		return 0.00;
	}
}
