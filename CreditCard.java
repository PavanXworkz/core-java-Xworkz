class CreditCard
{
	static String bank[]={"HDFC","kotak mahindra","ICICI","HDFC","canara bank","SBI","Bank of Baroda","HDBI","HSBC","Doha","city bank","jp morgan"};
		public static void main(String[]swip)
		{
			System.out.println("banks issuing credit card"+bank.length);
			for(int i=0;i<bank.length;i++)
			{
				System.out.println(bank[i]);
			}
		}
}