class Mart
{
	

	static String Groceries[]={"MoongDal","Groundnut","ChannaDal","Matki","MasoorDal","Atta","Sojji","RajmaChawal",
	"Udid","Chowli","ChannaGreen","Wal","Soyabean","kabuliChana","TurDal"};
	
	static String Chocolate[]={"KitKat","Snickers","milkyWay","FerreroRocher","5 Star","Galaxy","Fuse","Melody",
	"MarsBar","Lotus","Hershey's","Pacari","Eclaris","Coffybite","toblerone"};
	
	static String Shampoo[]={"AllClear","Pantene","Garnier","TRESemme","Dove","Sunsilk","Himalaya","L'oreal",
	"Head&Shoulder's","ClinicPlus+","Patanjali","ParkAvenue","Fiama","ManMatters","Mamaearth"};
	
	static String Perfume[]={"SetWet","Foog","WildStone","Brut","Axe","Nivea","Roadster","Denver","ParkAvenue",
	"CalvinKlein","Boss","Ajmal","Nautica","Davidoff","Villan"};
	
	
	static String Soap[]={"Pears","Santoor","MysoreSandal","Dettol","Lux","Liril","Medimix","Cinthol","Hamam","Lifebuoy","Biotique",
	"Fiama","KhadiNatural","Johnson and Johnson","Dove"};
	
	
	static String TshirtBrand[]={"Lee","DNMX","US Polo","Perfomax","Puma","NetPlay","Nike","Arrow","AllenSolly","Vnan Heusen",
	"Levi;s","Mufti","Jack&Jones","Aidas","Tommy Hilfiger"};
	
	  public static void main(String args[])
		{
			System.out.println("main starts");
			getGroceries();
			getChocolate();
			getShampoo();
			getPerfume();
			getSoap();
			getTshirtBrand();
			System.out.println("main ends");
		}
		
		
		public static void getGroceries()
		{
			for(int i=0;i<Groceries.length;i++)
			{
				System.out.println(Groceries[i]);
			}
				System.out.println("************************");
					return;
		}
		public static void getChocolate()
		{
			for(int n=0;n<Chocolate.length;n++)
			{
				System.out.println(Chocolate[n]);
			}
				System.out.println("************************");
					return;			
		}
		public static void getShampoo()
		{
			for(int m=0;m<Shampoo.length;m++)
			{
				System.out.println(Shampoo[m]);
			}
				System.out.println("************************");
					return;			
		}
		public static void getPerfume()
		{
			for(int o=0;o<Perfume.length;o++)
			{
				System.out.println(Perfume[o]);
			}
				System.out.println("************************");
					return;			
		}
		public static void getSoap()
		{
			for(int p=0;p<Soap.length;p++)
			{
				System.out.println(Chocolate[p]);
			}
				System.out.println("************************");
					return;			
		}
		public static void getTshirtBrand()
		{
			for(int q=0;q<TshirtBrand.length;q++)
			{
				System.out.println(Chocolate[q]);
			}
				System.out.println("************************");
					return;			
		}
}