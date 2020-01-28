package week4.Casting.Starter;

import java.awt.Color;
import java.awt.Point;

public class Shape {
    
	private Color colour;
	private Point position;
	
    public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	
	public Color getColour() { return colour; }
	public void setColour(Color colour) { this.colour = colour; }

	public void printCharacteristics(){
    	System.out.printf("This is a: %s\n", getClassNameOnly());
    	System.out.printf("Colour: %s\n", getColour());
    	System.out.printf("Position: %s\n", getPosition());

		if (getClassNameOnly().equals("Shape")){
			System.out.println();
		}

	}
	
	public String getClassNameOnly(){
    	String fullName = this.getClass().getName();
    	String[] parts = fullName.split("\\.");
    	return parts[parts.length - 1];
	}

    

  }
