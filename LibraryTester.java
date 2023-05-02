class LibraryTester{
	public static void main(String booknames[]){
	    Library.addBookNames("To kill a mockingbird");
		Library.addBookNames("Jane Eyre");
		Library.addBookNames("The catcher in the rye");
		Library.addBookNames("The great gatsby");
		Library.addBookNames("Nineteen Eightyfour");
		Library.addBookNames("Anna Karenina");
		Library.addBookNames("Ulysses");
		Library.addBookNames("Beloved");
		Library.addBookNames("Catch 22");
        Library.addBookNames("The sun also rises");
		Library.addBookNames("the lord of the rings");
		Library.addBookNames("pride and prejudice");
		Library.addBookNames("Don Quixote");
		Library.addBookNames("lord of the files");
		Library.addBookNames("the grapes of wrath");
		Library.getBookNames();
		Library.updateBookName("the lord of the rings","David copperfield");
		Library.getBookNames();
	}

}