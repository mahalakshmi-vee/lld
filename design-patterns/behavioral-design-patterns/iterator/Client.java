package iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book(100, "Science"));
		books.add(new Book(200, "Maths"));
		books.add(new Book(300, "GK"));
		books.add(new Book(400, "Drawing"));

		Library library = new Library(books);
		Iterator iterator = library.createIterator();

		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName());
		}
	}
}
