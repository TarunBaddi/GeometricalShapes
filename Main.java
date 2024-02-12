
public class Main {
    public static double TriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double RectangleArea(double length, double width) {
        return length * width;
    }

    public static double CircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double SquareArea(double side) {
        return Math.pow(side, 2);
    }

    public static void main(String[] args){
        double triangleArea = TriangleArea(5,5);
        double rectangleArea = RectangleArea(8,8);
        double circleArea = CircleArea(7);
        double squareArea = SquareArea(4);

        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Square Area: " + squareArea);
    }
}