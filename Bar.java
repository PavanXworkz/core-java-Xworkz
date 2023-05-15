class Bar
{
	static String alcohol[]={"royal stag","black labele","black and white","mc donals","mantion house","boom","impeir blue","king fisher","tuborg","budwiser","old monk","bira","black dog","techers","calberg"};
	
	
	public static void main(String[]bar)
	{
		System.out.println("number  of brand avalable ");
		//System.out.println("1:"+alcohol[0]+"\n"+"2:"+alcohol[1]+"\n"+"3:"+alcohol[2]+"\n"+"4:"+alcohol[3]+"\n"+"5:"+alcohol[4]+"\n"+"6:"+alcohol[5]);

		System.out.println("number  of brand avalable  using for loop");
		
		for(int i=0;i<alcohol.length;i++)
			System.out.println(alcohol[i]);
	}
}