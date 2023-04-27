class KindleQuantityTester
{
	public static void main(String[]book)
	{
		System.out.println("main starts");
		String bookName="once upon a time spy";
		//double prize=KindleQuantity.searchBook(once upon a time spy);
		//System.out.println("prize of the book  "+bookName+"is  "+prize);
		double prizeQuantity=KindleQuantity.searchBook(bookName,5);
		System.out.println("prize of the book  "+bookName+"is  "+prizeQuantity);
		System.out.println("main ends");
	}
}