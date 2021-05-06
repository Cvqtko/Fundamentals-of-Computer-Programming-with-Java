package exercise_18;

/* 18. ���� � ������ ���������� � �����. ����������� ������� ��������� �� ���������� � �����.
������������ ������ �� ������� ��� � ������ �� �����. ������� ������ �� �������� ���������� �� ��������,
�����, �����������, ������ �� �������� � ISBN-�����. � �����, ����� ������ ����������, 
�������� ������ �� �������� �� ����� ��� ������������, ������� �� ����� �� ������������� ������� �����,
��������� �� ���������� �� ������ ����� � ��������� �� ����� �� ������������.*/
import java.math.BigInteger;

public class Book {
	private String title;
	private String autor;
	private String publisher;
	private String yearOfPublishment;
	private BigInteger isbnNumber;

	public Book(String title, String autor, String publisher, String yearOfPublishment, BigInteger isbnNumber) {
		this.title = title;
		this.autor = autor;
		this.publisher = publisher;
		this.yearOfPublishment = yearOfPublishment;
		this.isbnNumber = isbnNumber;
	}

	public String getAuthor() {
		return this.autor;
	}

	public String getBookInfo() {
		return "Book [title=" + title + ", autor=" + autor + ", publisher=" + publisher + ", yearOfPublishment="
				+ yearOfPublishment + ", isbnNumber=" + isbnNumber + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Book other = (Book) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (isbnNumber == null) {
			if (other.isbnNumber != null)
				return false;
		} else if (!isbnNumber.equals(other.isbnNumber))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearOfPublishment == null) {
			if (other.yearOfPublishment != null)
				return false;
		} else if (!yearOfPublishment.equals(other.yearOfPublishment))
			return false;
		return true;
	}
}
