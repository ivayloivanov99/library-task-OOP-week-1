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
	
	//Добавяне на нова книга
	public void insertNewBook(String name, String author, String publisher, String isbn, int year) {			
			
		Book newBook = new Book(name,author,publisher,year,isbn);
		libraryList.add(newBook);
		
	}
	
	//Търсене на книга по предварително зададен автор
	public void searchBookAuthor(String author) {
		System.out.println("\n===== Книги с автор: " + author + " =====\n");
		for(int i =0; i < libraryList.size();i++) {
			if(author == libraryList.get(i).getBookAuthor()) {
				System.out.println("Име: "+ libraryList.get(i).getBookName() + "  | Автор: " 
									+ libraryList.get(i).getBookAuthor() + "  | Издател: " 
									+ libraryList.get(i).getBookPublisher() + "  | Година на издаване: " 
									+ libraryList.get(i).getBookYear() + "  | ISBN номер: " 
									+ libraryList.get(i).getBookISBN() + "\n");
			
			}	
		}
	}
	
	//Извеждане на информация за всички книги
	public void displayAllBooks() {
		System.out.println("\n===== Всички книги в библиотеката =====\n");
		for(int i =0; i < libraryList.size();i++) {
				System.out.println("Име: "+ libraryList.get(i).getBookName() + "  | Автор: " 
									+ libraryList.get(i).getBookAuthor() + "  | Издател: " 
									+ libraryList.get(i).getBookPublisher() + "  | Година на издаване: " 
									+ libraryList.get(i).getBookYear() + "  | ISBN номер: " 
									+ libraryList.get(i).getBookISBN()+ "\n");
		    }
		}
	
	//Изтриване на книга от библиотеката
	public void deleteBook(String author) {
		System.out.println("\n!=====! Изтриване на книги с автор: " + author + " !=====!\n");
		for(int i =0; i < libraryList.size();i++) {
			if(author == libraryList.get(i).getBookAuthor()) {
				libraryList.remove(i);
				}
			}	
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
