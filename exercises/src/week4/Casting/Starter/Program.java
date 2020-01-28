package week4.Casting.Starter;

import java.awt.Color;
import java.awt.Point;

public class Program {

	public static void main(String[] args) {
		 Shape blob = new Shape();
         blob.setColour(Color.GREEN);
         blob.setPosition(new Point(1, 3));

         Circle hoop = new Circle();
         hoop.setColour(Color.RED);
         hoop.setPosition(new Point(3, 4));
         hoop.setRadius(25.55);

         Sphere ball = new Sphere();
         ball.setColour(Color.BLUE);
         ball.setPosition(new Point(6, 6));
         ball.setRadius(25.55);

         Shape[] shapes = {blob, hoop, ball};
         for (Shape shape : shapes){
             shape.printCharacteristics();
             System.out.println();
         }

	}

}
