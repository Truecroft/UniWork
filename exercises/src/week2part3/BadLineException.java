package week2part3;

public class BadLineException extends Exception {
	private String badLine;
	
	public String getBadLine() { return badLine; }
	
	BadLineException(String message, String badLine){
		super(message);
	}
}
