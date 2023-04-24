class ZomatoTester1
{
	public static void main(String zomato[])
	{
		System.out.println("main starts");
		//invoking a method
		String foodName="idly";
		double prize = Zomato.searchItem(foodName);
		System.out.println("the prize of the item " + foodName  +"is "+prize);
		System.out.println("main ends");
		
	}
}