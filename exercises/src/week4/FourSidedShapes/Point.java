package week4.FourSidedShapes;

public class Point {
    private double x;
    private double y;
    public double getX(){ return this.x; }
    public double getY() { return this.y; }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point pointToMeasure){
        return Math.sqrt(Math.pow((pointToMeasure.getX() - this.x), 2) + Math.pow((pointToMeasure.getY()- this.y), 2));
    }

    public String toString() { return String.format("X:%.2f Y:%.2f", this.x, this.y); }

    public static void main(String[] args){
        Point a = new Point(6, 9);
        Point b = new Point(1,1);
        double distanceFromAToB = a.distanceTo(b);
        System.out.println(distanceFromAToB);
    }
}
