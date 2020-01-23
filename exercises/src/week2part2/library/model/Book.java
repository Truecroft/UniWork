package week2part2.library.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import week2part2.library.model.Location;

public class Book {
	private static String title;
	private static String authors[] = new String[5];
	private static String price;
	public static ArrayList<String[]> books = new ArrayList<String[]>();
	private static Location location;
	public static ArrayList<String[]> addBook;
	
	public static String getTitle() {
		return title;
	}
	
	public String[] getAuthors() {
		return authors;
	}
	
	public String getPrice() {
		return price;
	}
	
	public static void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public static void setPrice(String newPrice) {
		price = newPrice;
	}
	
	public static void addAuthors(String[] authorToAdd) {
		books.add(authorToAdd);
	}
	
	public static void addBook(String[] bookToAdd) {
		books.add(bookToAdd);
		
	}
	
	public static ArrayList<String[]> getBooks(){
		return books;
	}
	
	public static Location getLocation() {
		return location;
	}

	public static void setLocation(Location location) {
		Book.location = location;
	}

}