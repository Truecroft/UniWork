package week4.FourSidedMayhem;

public class Point {
    private static double x = 0;
    private static double y = 0;
    public static Point point = new Point(x, y);

    public static void main(String[] args){
        double yeet = distanceTo(new Point(4,4));
        System.out.print(yeet);
    }

    public static double distanceTo(Point pointToTest) {
        double test = ((pointToTest.getY() - point.getY()) * (pointToTest.getY() - point.getY()) + (pointToTest.getX() - point.getX() * (pointToTest.getX() - point.getX())));
        return test;
    }
    public Point(double xCoord, double yCoord){

    }
    public static double getX() {
        return x;
    }

    public static double getY() {
        return y;
    }
}
