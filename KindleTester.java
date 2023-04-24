class KindleTester
{
	public static void main(String[]read)
	{
		System.out.println("main method starts");
		String bookName="chanakya in you";
		double prize=Kindle.searchBook(bookName);
		System.out.println("prize of the book  "+bookName+" is "+prize);
		System.out.println("main method ends");
	}
}