package week2part2.library.model;

public class Location {
	public static String bookcaseNumber;
	public static int shelfNumber;
	
	public Location(String bookcaseNumber, int shelfNumber) {
		Location.bookcaseNumber = bookcaseNumber;
		Location.shelfNumber= shelfNumber;
		
	}
	
	public String getBookcaseNumber() {
		return bookcaseNumber;
	}
	
	public int getShelfNumber() {
		return shelfNumber;
	}
	
	public static void setBookaseNumber(String newBookcaseNumber) {
		bookcaseNumber = newBookcaseNumber;
	}
	
	public static void setShelfNumber(int newShelfNumber) {
		shelfNumber = newShelfNumber;
	}
	
	
}