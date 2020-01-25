package week4.Starter;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public double getDiameter(){
        return radius * 2;
    }

    public double getCircumference(){
        return radius * 2 * Math.PI;
    }

    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

    public void setRadius(double radius) {
        if (radius >= 0){
            this.radius = radius;
        }
    }

    public void printCharacteristics(){
        System.out.print("\nCircle Characteristics\n");
        System.out.print("----------------------\n");
        System.out.printf("Colour:        %s\n", getColour());
        System.out.printf("Position:      %s\n", getPosition());
        System.out.printf("Radius:        %7.2f\n", getRadius());
        System.out.printf("Diameter:      %7.2f\n", getDiameter());
        System.out.printf("Circumference: %7.2f\n", getCircumference());
        System.out.printf("Area:          %7.2f\n", getArea());
    }





}
