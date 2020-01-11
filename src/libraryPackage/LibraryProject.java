package libraryPackage;

public class LibraryProject {
	
	public static void main(String[] args) {	
		Library myLibrary = new Library();

		myLibrary.insertNewBook("Другият", "Стивън Кинг", "Плеяда","9789544093976", 2019);	
		myLibrary.insertNewBook("Преобърнатият човек", "Фред Варгас", "Колибри","9786190205760", 2020);
		myLibrary.insertNewBook("Хладнокръвно", "Труман Капоти", "Колибри","9786190205708", 2020);
		myLibrary.insertNewBook("Тайната на черната скала", "Джо Тод-Стантън", "Дакелче","9786199105351", 2017);
		myLibrary.insertNewBook("Доктор Сън", "Стивън Кинг", "Плеяда","9789544093440", 2014);
		myLibrary.insertNewBook("Щипка вкус", "Кейт Алинсън", "Книгомания","9786191952427", 2015);
		myLibrary.insertNewBook("Проклятието", "Стивън Кинг", "Бард","9789545859540", 2018);
		myLibrary.insertNewBook("Милионерът в Лисабон", "Жозе Родригеш душ Сантуш", "Хермес","9789542617471", 2019);	
		myLibrary.insertNewBook("Лятно пътуване", "Труман Капоти", "Колибри","9786190203971", 2019);
		
		myLibrary.displayAllBooks();
		myLibrary.searchBookAuthor("Труман Капоти");
		myLibrary.deleteBook("Стивън Кинг");
		myLibrary.displayAllBooks();
		
		
	}
}
