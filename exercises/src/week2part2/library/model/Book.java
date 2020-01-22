package week2part2.library.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
	private static String title;
	private static String authors[] = new String[5];
	private static String price;
	public static ArrayList<String[]> books = new ArrayList<String[]>();
	
	public String getTitle() {
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
	
	public static void addAuthors() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an author");
		for (int newAuthor = 0; newAuthor < 5; newAuthor++) {
			authors[newAuthor] = input.next();
		}
		input.close();
	}
	
	public static void addBook(String[] bookToAdd) {
		books.add(bookToAdd);
		
	}
	
	public static ArrayList<String[]> getBooks(){
		return books;
	}
}

