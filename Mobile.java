class Mobile
{
	static String mobileNames[]={null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addMobileName(String mobileName)
	{
		System.out.println("-------add mobile method started-----");
		boolean isAdd=false;
			if(mobileNames!=null)
			{
				mobileNames[index++]=mobileName;
				isAdd=true;
			}
			else
			{
				System.out.println("name of the mobile not found"+mobileNames);
			}
		System.out.println("-----add mobile method ended------");
		return isAdd;
	}
	public static void getMobileNames()
	{
		System.out.println("------get mobile name method started-----");
		for(int i=0;i<mobileNames.length;i++)
		{
			System.out.println(mobileNames[i]);
		}
		System.out.println("------get Mobile Name method ended------");
	}
	public static boolean updateMobileName(String oldMobileName,String updateMobileName)
	{
		System.out.println("-------update mobile name method started-----");
		boolean isUpdate=false;
		for(int i=0;i<mobileNames.length;i++)
		{
			if(mobileNames[i].equals(oldMobileName))
				mobileNames[i]=updateMobileName;
			isUpdate=true;
		}
		return isUpdate;
	}
}