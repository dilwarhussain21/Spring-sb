public class Main {

    public static void calculateCircleArea(double radius) {
        double area = Math.pi * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
    public static double calculateRectangleArea() {
    	double length = 3.8;
        double breadth = 8.2;
        return length * breadth;
    }
    public static double calculateSquareArea(double side) {
        return side * side;
    }
    public static void main(String[] args) {
    	calculateCircleArea(4.4);
    	
    	double rectangleArea = CalculateRectangleArea();
    	System.out.println("Area of the rectangle: " + rectangleArea);
    	
    	double squareArea = calculateSquareArea(5.2);
        System.out.println("Area of the square: " + squareArea);    	
        
    }
    }