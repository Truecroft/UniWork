package week4.FourSidedShapes;

public class Quadrilateral {
    public Point point1, point2, point3, point4;
    public Line side1, side2, side3, side4;
    public Line getSide1() { return side1; }
    public Line getSide2() { return side2; }
    public Line getSide3() { return side3; }
    public Line getSide4() { return side4; }
    public Point getPoint1() { return point1; }
    public Point getPoint2() { return point2; }
    public Point getPoint3() { return point3; }
    public Point getPoint4() { return point4; }

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.side1 = new Line(point1, point2);
        this.side2 = new Line(point2, point3);
        this.side3 = new Line(point3, point4);
        this.side4 = new Line(point4, point1);
    }

    public double getPerimeter(){
        return (this.side1.getLength() + this.side2.getLength() + this.side3.getLength() + this.side4.getLength());
    }

    public double getArea() {
        return (side1.getLength() * side2.getLength());
    }



    public String toString() {
        String points = String.format("Point 1: %s\nPoint 2: %s\nPoint 3: %s\nPoint 4: %s\n", this.point1, this.point2, this.point3, this.point4);
        String sideLengths = String.format("Side 1 length: %.2f\nSide 2 length: %.2f\nSide 3 length: %.2f\nSide 4 length: %.2f\n", this.side1.getLength(), this.side2.getLength(), this.side3.getLength(), this.side4.getLength());
        String perimeter = String.format("Perimeter: %.2f\n", getPerimeter());
        String area = String.format("Area: %.2f\n", getArea());
        return (points + sideLengths + perimeter + area);
    }

    public static void main(String[] args){
        Point p = new Point(0,0);
        Point q = new Point(0,6);
        Point r = new Point(6,6);
        Point s = new Point(0,6);
        Quadrilateral quadrilateral = new Quadrilateral(p,q,r,s);
        System.out.println(quadrilateral);
    }
}
