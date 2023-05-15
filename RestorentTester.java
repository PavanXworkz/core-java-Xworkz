class RestorentTester{
	public static void main(String []q)
	{
		System.out.println("main method starts");
		String foodName="idly";
		double prize=Restorent.searchItem(foodName);
		System.out.println("the prize of the item  "+foodName+"is  "+prize);
		
		double prizeQuantity=Restorent.searchItem(foodName, 8);
		System.out.println("the prize of the item  "+foodName+"is  "+prizeQuantity);
				System.out.println("main method starts");

	}
}