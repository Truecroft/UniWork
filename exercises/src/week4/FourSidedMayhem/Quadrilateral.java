package week4.FourSidedMayhem;

public class Quadrilateral {
    public Point point1, point2, point3, point4;
    public Line side1, side2, side3, side4;

    public String toString() {
        String points = String.format("Point 1: %s\n Point 2: %s\n Point 3: %s\n Point 4: %s\n", this.point1, this.point2, this.point3, this.point4);
        String sideLengths = String.format("Side 1 length: %.2f\n Side 2 length: %.2f\n Side 3 length: %.2f\n Side 4 length: %.2f\n", this.side1.getLength(), this.side2.getLength(), this.side3.getLength(), this.side4.getLength());
        String perimeter = String.format("Perimeter: %.2f\n", getPerimeter());
        String area = String.format("Area: %.2f\n", getArea());
        return (points + sideLengths + perimeter + area);
    }

    public double getPerimeter(){
        return (this.side1.getLength() + this.side2.getLength() + this.side3.getLength() + this.side4.getLength());
    }

    public double getArea() {
        return (side1.getLength() * side2.getLength());
    }

    public Line getSide1() { return side1; }
    public Line getSide2() { return side2; }
    public Line getSide3() { return side3; }
    public Line getSide4() { return side4; }
    public Point getPoint1() { return point1; }
    public Point getPoint2() { return point2; }
    public Point getPoint3() { return point3; }
    public Point getPoint4() { return point4; }

}
