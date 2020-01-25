package week4.Starter;

public class Sphere extends Circle {
    public double getVolume(){
        return ((4/3.0) * Math.PI * Math.pow(getRadius(), 3));
    }
    public void printCharacteristics(){
        System.out.print("\nSphere Characteristics\n");
        System.out.print("----------------------\n");
        System.out.printf("Colour:        %s\n", getColour());
        System.out.printf("Position:      %s\n", getPosition());
        System.out.printf("Radius:        %7.2f\n", getRadius());
        System.out.printf("Diameter:      %7.2f\n", getDiameter());
        System.out.printf("Circumference: %7.2f\n", getCircumference());
        System.out.printf("Area:          %7.2f\n", getArea());
        System.out.printf("Volume:        %7.2f\n", getVolume());
    }
}
