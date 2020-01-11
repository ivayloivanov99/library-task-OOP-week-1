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
	
	//�������� �� ���� �����
	public void insertNewBook(String name, String author, String publisher, String isbn, int year) {			
			
		Book newBook = new Book(name,author,publisher,year,isbn);
		libraryList.add(newBook);
		
	}
	
	//������� �� ����� �� ������������� ������� �����
	public void searchBookAuthor(String author) {
		System.out.println("\n===== ����� � �����: " + author + " =====\n");
		for(int i =0; i < libraryList.size();i++) {
			if(author == libraryList.get(i).getBookAuthor()) {
				System.out.println("���: "+ libraryList.get(i).getBookName() + "  | �����: " 
									+ libraryList.get(i).getBookAuthor() + "  | �������: " 
									+ libraryList.get(i).getBookPublisher() + "  | ������ �� ��������: " 
									+ libraryList.get(i).getBookYear() + "  | ISBN �����: " 
									+ libraryList.get(i).getBookISBN() + "\n");
			
			}	
		}
	}
	
	//��������� �� ���������� �� ������ �����
	public void displayAllBooks() {
		System.out.println("\n===== ������ ����� � ������������ =====\n");
		for(int i =0; i < libraryList.size();i++) {
				System.out.println("���: "+ libraryList.get(i).getBookName() + "  | �����: " 
									+ libraryList.get(i).getBookAuthor() + "  | �������: " 
									+ libraryList.get(i).getBookPublisher() + "  | ������ �� ��������: " 
									+ libraryList.get(i).getBookYear() + "  | ISBN �����: " 
									+ libraryList.get(i).getBookISBN()+ "\n");
		    }
		}
	
	//��������� �� ����� �� ������������
	public void deleteBook(String author) {
		System.out.println("\n!=====! ��������� �� ����� � �����: " + author + " !=====!\n");
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
