package week1;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.println("Please enter a year to check: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		boolean leap = false;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {leap = true;}
		if (leap) {System.out.println(year + " is a leap year");		}
		else {System.out.println(year + " is not a leap year");}
	}

}
