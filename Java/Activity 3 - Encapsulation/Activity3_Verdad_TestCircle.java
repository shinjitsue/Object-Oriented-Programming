class Circle {
    private double radius;
    private double area;
    private double diameter;

    public Circle() {
        this.radius = 1;
        this.diameter = 2 * this.radius;
        this.area = 3.14 * this.radius * this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = 2 * this.radius;
        this.area = 3.14 * this.radius * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double computeDiameter() {
        return this.diameter;
    }

    public double computeArea() {
        return this.area;
    }
}

public class Activity3_Verdad_TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        circle1.setRadius(5);
        circle2.setRadius(10);

        double circle1Diameter = circle1.computeDiameter();
        double circle1Area = circle1.computeArea();

        double circle2Diameter = circle2.computeDiameter();
        double circle2Area = circle2.computeArea();
        
        double circle3Diameter = circle3.computeDiameter();
        double circle3Area = circle3.computeArea();

        System.out.println("Circle1 Diameter: " + circle1Diameter);
        System.out.println("Circle1 Area: " + circle1Area);
        System.out.println();

        System.out.println("Circle2 Diameter: " + circle2Diameter);
        System.out.println("Circle2 Area: " + circle2Area);
        System.out.println();

        System.out.println("Circle3 Diameter: " + circle3Diameter);
        System.out.println("Circle3 Area: " + circle3Area);
        System.out.println();
            
    }
}