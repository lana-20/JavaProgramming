package academy.learnprogramming;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point point) {
//        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));

//      Or, create a Class called Point which is an object that contains data (x and y).
//      So distance (Point point) is passing the object Point to the method distance.
//      With encapsulation, we typically use getters because we are referring to a different Class and w
//      ant to access the instance variables that have private access modifier.
//      But since we are already in the Class Point, we have access to the instance variable even though they
//      have private access modifiers.  Both of these codes work:
//
//      // Use getters when encapsulation prevents access of private variables
//      public double distance(Point point) {
//      return distance(point.getX(), point.getY());
//}
//
//      // Don't need getters for this example because method is within the same Class Point
//      public double distance(Point point) {
        return distance(point.x, point.y); // i.e. object with instance variable x and y

    }
}

