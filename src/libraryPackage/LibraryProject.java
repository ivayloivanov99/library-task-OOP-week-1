package libraryPackage;

public class LibraryProject {
	
	public static void main(String[] args) {	
		Library myLibrary = new Library();

		myLibrary.insertNewBook("�������", "������ ����", "������","9789544093976", 2019);
		System.out.println("���: " + myLibrary.getLibraryList().get(0).getBookName());
		myLibrary.insertNewBook("������ ���", "������ ����", "������","9789544093440", 2014);
		System.out.println("���: " + myLibrary.getLibraryList().get(1).getBookName());
		myLibrary.insertNewBook("������������� �����", "���� ������", "�������","9786190205760", 2020);
		System.out.println("���: " + myLibrary.getLibraryList().get(2).getBookName());

	}
}
