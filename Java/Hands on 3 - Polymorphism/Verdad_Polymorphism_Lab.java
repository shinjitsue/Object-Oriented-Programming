class Shape {
    double calculateArea() {
		return 0;
	}
}

class Circle extends Shape {
	double PI = 3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    double calculateArea() {
        return PI * radius * radius;
    }
}

class Rectangle extends Shape {
	double length;
	double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    double calculateArea() {
        return length * width;
    }
}

public class Verdad_Polymorphism_Lab {

	public static void main(String[] args) {
        Shape cir = new Circle(10.0);
        Shape rec = new Rectangle(5.0, 10.0);

        double circleArea = cir.calculateArea();
        double rectangleArea = rec.calculateArea(); 

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);

	}

}
