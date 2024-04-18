abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Must be positive.");
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("Must be positive.");
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    double base, height;
    double[] sideLengths;

    Triangle(double base, double height, double[] sideLengths) {
        if (base <= 0 || height <= 0 || sideLengths[0] <= 0 || sideLengths[1] <= 0 || sideLengths[2] <= 0)
            throw new IllegalArgumentException("Must be positive.");
        this.base = base;
        this.height = height;
        this.sideLengths = sideLengths;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }

    double calculatePerimeter() {
        return sideLengths[0] + sideLengths[1] + sideLengths[2];
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}

class EquilateralTriangle extends Triangle {
    EquilateralTriangle(double side) {
        super(side, Math.sqrt(3) / 2 * side, new double[]{side, side, side});
    }
}

public class Verdad_AbstractCM {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 4, new double[]{3, 4, 5});
        Square square = new Square(4);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);

        System.out.println("Circle area: " + circle.calculateArea() + ", perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea() + ", perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea() + ", perimeter: " + triangle.calculatePerimeter());
        System.out.println("Square area: " + square.calculateArea() + ", perimeter: " + square.calculatePerimeter());
        System.out.println("Equilateral Triangle area: " + equilateralTriangle.calculateArea() + ", perimeter: " + equilateralTriangle.calculatePerimeter());
    }
}