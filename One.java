class Hospital
{
	public static void main(String[]p)
	{
		String pNames[]={"pavan","darshan","krishna","bharath"};
		for(int i=0;i<pNames.length;i++)
		{
			System.out.println(pNames[i]);
			if(pNames[i]==("krishna"))
			{
				System.out.println("names found ***"+pNames[i]);
				break;
			}
			else
			{
				System.out.println("name not found");
			}
		}
	}
}