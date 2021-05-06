package exercise_18;

import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<Book> books;

	public Library(String name) {
		this.name = name;
		this.books = new ArrayList<>();
	}

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void deleteBook(Book book) {
		this.books.remove(book);
	}

	public void deleteAllBooksWithGivenAuthor(String author) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getAuthor().equals(author)) {
				books.remove(i);
				i--;
			}
		}
	}

	public void getAllBooksInfo() {
		for (Book book : this.books) {
			System.out.println(book.getBookInfo());
		}
	}

	public ArrayList<Book> searchBookByAuthor(String author) {
		ArrayList<Book> result = new ArrayList<>();
		for (Book book : this.books) {
			if (book.getAuthor().equals(author)) {
				result.add(book);
			}
		}
		return result;
	}
}
