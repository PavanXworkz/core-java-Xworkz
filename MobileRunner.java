class MobileRunner
{
	public static void main(String[]call)
	{
		System.out.println("main method started");
		Mobile.addMobileName("oppo a5s");
		Mobile.addMobileName("mi 12pro");
		Mobile.addMobileName("oppo a83");
		Mobile.addMobileName("samsung m30s");
		Mobile.addMobileName("samsung galaxy");
		Mobile.addMobileName("vivo v15");
		Mobile.addMobileName("vivo v83");
		Mobile.addMobileName("nokia X");
		Mobile.addMobileName("apple iphone14");
		Mobile.addMobileName("apple iphone14pro");
		Mobile.getMobileNames();
		Mobile.updateMobileName("oppo a5s", "oppo a15s");
		Mobile.getMobileNames();

	}
}