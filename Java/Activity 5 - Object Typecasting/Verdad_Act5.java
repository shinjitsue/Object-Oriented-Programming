class Shape {

}

class Circle extends Shape {
    double radius;

    Circle(double radius) { 
        this.radius = radius; 
    }
    
    double area() {
        return Math.PI * radius * radius; 
    }
}

class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    double perimeter() {
        return 4 * side; 
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base; this.height = height; 
    }
    double hypotenuse() {
        return Math.sqrt(base * base + height * height); 
    }
}

class ShapeCalculator {
    static void calculateAndPrint(Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("Circle - Area: " + c.area());
            } else if (shape instanceof Square) {
                Square s = (Square) shape;
                System.out.println("Square - Perimeter: " + s.perimeter());
            } else if (shape instanceof Triangle) {
                Triangle t = (Triangle) shape;
                System.out.println("Triangle - Hypotenuse Length: " + t.hypotenuse());
            }
        }
    }
}

public class Verdad_Act5 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Square(4),
            new Triangle(3, 4)
        };
        ShapeCalculator.calculateAndPrint(shapes);
    }
}