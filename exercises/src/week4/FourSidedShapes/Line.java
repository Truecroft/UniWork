package week4.FourSidedShapes;

public class Line {
    public Point p1;
    public Point p2;
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public double getLength(){
        return p1.distanceTo(p2);
    }

    public double getSlope(){
        return ((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()));
    }

    public Point getPoint1() { return p1; }
    public Point getPoint2() { return p2; }
}
