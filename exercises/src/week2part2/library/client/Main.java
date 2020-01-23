package week2part2.library.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import week2part2.library.model.Book;

public class Main {

	public static void main(String[] args) {
		addBooks();
		// Get all books from the book model
		ArrayList<String[]> books = Book.getBooks();
		// Output each book from the books model
//		for (String[] book: books) {
//			System.out.println("Book: " + Arrays.toString(book));
//		}
		HashMap<String, String[]>  index = new HashMap<String, String[]>();
		String[] book1 = Book.books.get(0);
		String[] book2 = Book.books.get(1);
		String[] book3 = Book.books.get(2);
		String[] book4 = Book.books.get(3);
		String[] book5 = Book.books.get(4);
		index.put("Book 1", book1);
		index.put("Book 2", book2);
		index.put("Book 3", book3);
		index.put("Book 4", book4);
		index.put("Book 5", book5);

//		System.out.println("Hash print" + index);
//		System.out.println("Book: " + Arrays.toString(book1));

		for (Map.Entry<String, String[]> entry : index.entrySet()) {
			System.out.println("Book: " + entry.getKey() + Arrays.toString(entry.getValue()));
		}
			
		
		
	}
	public static void addBooks() {
		// Add each book to the books array
		Book.addBook(new String[] {"Book 1", "a1", "a2", "a3", "a4", "a5", "5", "bookcase: 1", "shelf 1"});
		Book.addBook(new String[] {"Book 2", "b1", "b2", "b3", "b4", "b5", "10", "bookcase: 2", "shelf 2"});
		Book.addBook(new String[] {"Book 3", "c1", "c2", "c3", "c4", "c5", "15", "bookcase: 3", "shelf 3"});
		Book.addBook(new String[] {"Book 4", "d1", "d2", "d3", "d4", "d5", "20", "bookcase: 4", "shelf 4"});
		Book.addBook(new String[] {"Book 5", "e1", "e2", "e3", "e4", "e5", "25", "bookcase: 5", "shelf 5"});
	}

}