class Library{
	static String bookNames[]={null, null, null, null, null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addBookName(String bookName){
		System.out.println("addBookName method started");
		boolean isAdded=false;
		if(bookName!=null){
			bookNames[index++]=bookName;
			isAdded=true;
		}
		else{
		System.out.println("Enter valid bookName");
		}
		System.out.println("addBookName method ended");
		return isAdded;
	}
	public static void getBookNames(){
		System.out.println("getBookName method started");
		for(int i=0;i<bookNames.length;i++){
			System.out.println(bookNames[index]);
			
		}
		
	}
	public static boolean updateBookName(String oldBookName ,String updatedBookName){
		System.out.println("updateBookName method started");
		boolean isUpdated=false;
		for(int i=0;i<bookNames.length;i++){
			if(bookNames[index].equals(oldBookName)){
			bookNames[index]=updatedBookName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateBookName method ended");
		return isUpdated;
	}
}