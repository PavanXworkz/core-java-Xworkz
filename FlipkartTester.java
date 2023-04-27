class FlipkartTester
{
	public static void main(String []find)
	{
		System.out.println("main starts");
		String productName="Mixer";
		double prize=Flipkart.searchProduct(productName);
		System.out.println("prize of the item  "+productName+"  is  "+prize);
		double prizeQuantity=Flipkart.searchProduct(productName,4);
		System.out.println("prize of the item  "+productName+"is  "+prizeQuantity);
		System.out.println("main starts");
	}
}