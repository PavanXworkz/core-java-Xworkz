class Bank
{
	String name;
	long acNo;
	String address;
	String idType;
	long idNo;
	
	//parameterised constructor
	public Bank(String na,long acn,String add,String idt,long idn)
	{
		System.out.println("creating bank account");
		name=na;
		acNo=acn;
		address=add;
		idType=idt;
		idNo=idn;
	}
}