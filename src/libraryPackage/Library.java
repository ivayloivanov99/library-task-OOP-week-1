package libraryPackage;

import java.util.ArrayList;

public class Library extends Book{
	
	private String libraryName;
	private ArrayList<Book> libraryList;	
	
	public Library() {
		super();
		libraryList = new ArrayList<Book>();
	}

	public Library(String libraryName, ArrayList<Book> libraryList) {
		super();
		this.libraryName = libraryName;
		this.libraryList = libraryList;
	}

	public void insertNewBook(String name, String author, String isbn, String publisher, int year) {			
			
		Book newBook = new Book(name,author,publisher,year,isbn);
		libraryList.add(newBook);
		
	}
	
	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public ArrayList<Book> getLibraryList() {
		return libraryList;
	}

	public void setLibraryList(ArrayList<Book> libraryList) {
		this.libraryList = libraryList;
	}
}
