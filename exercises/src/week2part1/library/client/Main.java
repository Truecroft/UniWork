package week2part1.library.client;

import java.util.ArrayList;
import java.util.Arrays;
import week2part1.library.model.*;

public class Main {

	public static void main(String[] args) {
		addBooks();
		outputBooks();
	}
	public static void addBooks() {
		// Add each book to the books array
		Book.addBook(new String[] {"Book 1", "a1", "a2", "a3", "a4", "a5", "5"});
		Book.addBook(new String[] {"Book 2", "b1", "b2", "b3", "b4", "b5", "10"});
		Book.addBook(new String[] {"Book 3", "c1", "c2", "c3", "c4", "c5", "15"});
		Book.addBook(new String[] {"Book 4", "d1", "d2", "d3", "d4", "d5", "20"});
		Book.addBook(new String[] {"Book 5", "e1", "e2", "e3", "e4", "e5", "25"});
	}
	public static void outputBooks() {
		// Get all books from the model
		ArrayList<String[]> books = Book.getBooks();
		// Output each book from the books model
		for (String[] book: books) {
			System.out.println("Book: " + Arrays.toString(book));
		}
	}

}
