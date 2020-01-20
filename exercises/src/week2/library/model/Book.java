package week2.library.model;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
	public static void main(String[] args) {
		setPrice("10");
		setTitle("TestBook");
		addAuthors();
		getBook();
	}
	private String title;
	private String authors[] = new String[5];
	private String price;
	
	public String getTitle() {
		return title;
	}
	
	public String[] getAuthors() {
		return authors;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public void setPrice(String newPrice) {
		this.price = newPrice;
	}
	
	public void addAuthors() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an author");
		for (int newAuthor = 0; newAuthor < 5; newAuthor++) {
			authors[newAuthor] = input.next();
		}
		System.out.println(Arrays.toString(authors));
		input.close();
	}
	
	public void getBook() {
		String author1 = authors[0];
		String author2 = authors[1];
		String author3 = authors[2];
		String author4 = authors[3];
		String author5 = authors[4];
		
		String[] book = new String[] {title, author1, author2, author3, author4, author5, price};
		System.out.println(book);
		
	}
}

