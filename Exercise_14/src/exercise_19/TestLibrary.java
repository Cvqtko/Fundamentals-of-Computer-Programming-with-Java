package exercise_19;

import java.math.BigInteger;
import java.util.ArrayList;

import exercise_18.Book;
import exercise_18.Library;

/* 19. Напишете тестов клас, който създава обект от тип библиотека, 
добавя няколко книги към него и извежда информация за всяка една от тях.
Имплементирайте тестова функционалност, която намира всички книги, чийто автор е Стивън Кинг 
и ги изтрива. Накрая, отново изведете информация за всяка една от оставащите книги.*/
public class TestLibrary {
	public static void main(String[] args) {
		Library library = new Library("Paisii Hilendarski");
		library.addBook(new Book("Intro To JAVA programming", "Y. Daniel Liang", "Pearson Education", "2015",
				new BigInteger("2012363290")));
		library.addBook(new Book("Cracking the coding interview", "Gayle Laakmann Mcdowell", "CareerCup", "2015",
				new BigInteger("201236340")));
		library.addBook(new Book("Intro To JAVA programming 2nd Eddition", "Y. Daniel Liang", "Pearson Education",
				"2017", new BigInteger("2012363290")));

		library.getAllBooksInfo();
		System.out.println();

		ArrayList<Book> search = library.searchBookByAuthor("Y. Daniel Liang");

		for (Book book : search) {
			System.out.println(book.getBookInfo());
		}

		library.deleteBook(new Book("Intro To JAVA programming", "Y. Daniel Liang", "Pearson Education", "2015",
				new BigInteger("2012363290")));

		System.out.println();
		search = library.searchBookByAuthor("Y. Daniel Liang");

		for (Book book : search) {
			System.out.println(book.getBookInfo());
		}

		library.addBook(new Book("Intro To JAVA programming", "Y. Daniel Liang", "Pearson Education", "2015",
				new BigInteger("2012363290")));
		library.deleteAllBooksWithGivenAuthor("Y. Daniel Liang");
		System.out.println();
		library.getAllBooksInfo();
	}
}
