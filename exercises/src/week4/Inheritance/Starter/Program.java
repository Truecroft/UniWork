package week4.Inheritance.Starter;


import java.awt.Color;
import java.awt.Point;

public class Program {

	public static void main(String[] args) {
		Shape blob = new Shape();
		blob.setColour(Color.GREEN);
		blob.setPosition(new Point(1,3));

		Circle hoop = new Circle();
		hoop.setColour(Color.RED);
		hoop.setPosition(new Point(5,5));
		hoop.setRadius(5);
		hoop.printCharacteristics();

		Sphere ball = new Sphere();
		ball.setColour(Color.BLUE);
		ball.setPosition(new Point(10,10));
		ball.setRadius(10);
		ball.printCharacteristics();

		System.out.print("\nBlob Characteristics\n");
		System.out.print("----------------------\n");
 		System.out.printf("Colour:        %s\n", blob.getColour());
 		System.out.printf("Position:      %s\n", blob.getPosition());
 		System.out.println();
	}

}
