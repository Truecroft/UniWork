package week4.FourSidedMayhem;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point pointToTest){
        return (Math.sqrt((pointToTest.getY() - this.y) * (pointToTest.getY() - this.y) + (pointToTest.getX() - this.x * (pointToTest.getX() - this.x))));
    }
    public double getX(){ return this.x; }
    public double getY() { return this.y; }
    public String toString() { return String.format("X:%.2f Y:%.2f", this.x, this.y); }
}
