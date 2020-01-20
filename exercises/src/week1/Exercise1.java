package week1;

public class Exercise1 {
	public static void main(String[] args) {
		// Set name and age then print them to the console
		String name = "Tom";
		int age = 18;
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);		
		// Define variables and then work out the equation of a line using y=m*x+c
		int m = 1, c = 15;
		double x = 0.5;		
		// Calculate the equation of the line
		double y = m*x+c;
		System.out.println("y = " + y);		
		// Booleans of happy and isRaining
		boolean isRaining = false;
		boolean happy = true;
		if (isRaining && happy) {System.out.println("It is raining and we're happy");}
		else if(isRaining && !happy) {System.out.println("It is raining and we're not happy");}
		else if (!isRaining && happy) {System.out.println("It isn't raining and we're happy");}
		else {System.out.println("It isn't raining and we're not happy");}		
	}
}
