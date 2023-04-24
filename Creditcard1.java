class CreditCard1
{
		public static void main(String[]swip)
		{
				 String bank[]={"HDFC","kotak mahindra","ICICI","HDFC","canara bank","SBI","Bank of Baroda","HDBI","HSBC","Doha","city bank","jp morgan"};

			System.out.println("main starts");
			getbank(bank);
			System.out.println("main ends");
		}	
			public static void getbank(String bank[])
			{
			System.out.println("banks issuing credit card"+bank.length);
			for(int i=0;i<bank.length;i++)
			{
				System.out.println(bank[i]);
			}
		}
}