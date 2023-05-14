class BankTester
{
	public static void main(String[]m)
	{
		Bank money=new Bank("Pavan",65421000008956l,"Kadur","aadhar",165426525685l);
		System.out.println(money.name+" "+money.acNo+" "+money.address+" "+money.idType+" "+money.idNo);
		
		Bank money1=new Bank("Bharath",31527028654l,"Haveri","aadhar",35666453971l);
		System.out.println(money1.name+" "+money1.acNo+" "+money1.address+" "+money1.idType+" "+money1.idNo);
		
		Bank money2=new Bank("Krishna",2554000004986l,"thumkur","aadhar",123445677890l);
		System.out.println(money2.name+" "+money2.acNo+" "+money2.address+" "+money2.idType+" "+money2.idNo);
	}
}