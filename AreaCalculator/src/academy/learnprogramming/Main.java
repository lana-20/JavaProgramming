package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        System.out.println(area(5.0));
//        System.out.println(area(1));
//        System.out.println(area(7, 9));
//        System.out.println(area(0, 8));
    }
//    public static class AreaCalculator {
//        double area (double radius){
//            if(radius < 0){
//                return -1.0;
//            }
//            double r = radius;
//            double square = Math.pow(radius, 2);
//            double circleArea = square * Math.PI;
//            return circleArea;
//        }
//        public static double area (double x, double y){
//            if ((x < 0) || (y < 0)){
//                return -1.0;
//            }
//            double rectangleArea = x*y;
//            return rectangleArea;
//        }
//    }
    public static class AreaCalculator {
        double area(double radius) {
            return (radius < 0) ? -1 : radius * radius * Math.PI;
        }

        public static double area(double x, double y) {
            return (x < 0 || y < 0) ? -1 : x * y;
        }
    }
}
