package week2part3;

public class BadLineException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String badLine;
	
	public String getBadLine() { return badLine; }
	
	BadLineException(String message, String badLine){
		super(message);
	}
}
