class TeaShop
{
	static String teaNames[]={null,null,null,null,null,null};
	static int index;
	public static boolean teaNames(String teaName)
	{
		System.out.println("tea method started");
		boolean isAdded=false;
		if(teaName!=null)
		{
			teaNames[index++]=teaName;
			isAdded=true;
			
		}
		else
		{
			System.out.println("tea is not found "+teaNames);
		}
		System.out.println("tea method ends");
		return isAdded;
	}
	public static void getTeaNames()
	{
		System.out.println("get tea names method started");
		for(int i=0;i<teaNames.length;i++)
		{
			System.out.println(teaNames[i]);
		}
		System.out.println("get tea namesmethod ended");
	}
	public static boolean updateTeaNames(String oldTeaName, String updateTeaNames)
	{
		boolean isUpdate=false;
		for(int i=0;i<teaNames.length;i++)
		{
			if(teaNames[i].equals(oldTeaName))
			{
				teaNames[i]=updateTeaNames;
				isUpdate=true;
			}
		}
		return isUpdate;
	}
}