package libraryPackage;

public class LibraryProject {
	
	public static void main(String[] args) {	
		Library myLibrary = new Library();

		myLibrary.insertNewBook("Другият", "Стивън Кинг", "Плеяда","9789544093976", 2019);
		System.out.println("Име: " + myLibrary.getLibraryList().get(0).getBookName());
		myLibrary.insertNewBook("Доктор Сън", "Стивън Кинг", "Плеяда","9789544093440", 2014);
		System.out.println("Име: " + myLibrary.getLibraryList().get(1).getBookName());
		myLibrary.insertNewBook("Преобърнатият човек", "Фред Варгас", "Колибри","9786190205760", 2020);
		System.out.println("Име: " + myLibrary.getLibraryList().get(2).getBookName());

	}
}
