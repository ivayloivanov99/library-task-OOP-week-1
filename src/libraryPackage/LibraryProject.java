package libraryPackage;

public class LibraryProject {
	
	public static void main(String[] args) {	
		Library myLibrary = new Library();

		myLibrary.insertNewBook("�������", "������ ����", "������","9789544093976", 2019);	
		myLibrary.insertNewBook("������������� �����", "���� ������", "�������","9786190205760", 2020);
		myLibrary.insertNewBook("������������", "������ ������", "�������","9786190205708", 2020);
		myLibrary.insertNewBook("������� �� ������� �����", "��� ���-�������", "�������","9786199105351", 2017);
		myLibrary.insertNewBook("������ ���", "������ ����", "������","9789544093440", 2014);
		myLibrary.insertNewBook("����� ����", "���� �������", "����������","9786191952427", 2015);
		myLibrary.insertNewBook("�����������", "������ ����", "����","9789545859540", 2018);
		myLibrary.insertNewBook("���������� � �������", "���� �������� ��� ������", "������","9789542617471", 2019);	
		myLibrary.insertNewBook("����� ��������", "������ ������", "�������","9786190203971", 2019);
		
		myLibrary.displayAllBooks();
		myLibrary.searchBookAuthor("������ ������");
		myLibrary.deleteBook("������ ����");
		myLibrary.displayAllBooks();
		
		
	}
}
