// Coffee class representing a coffee
class Coffee {
    private String name;
    private double price;

    // Constructor
    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Method to brew the coffee
    public void brew() {
        System.out.println("Brewing " + name + " coffee");
    }
}

// Subclass of Coffee representing a specific type of coffee
class Espresso extends Coffee {
    // Constructor
    public Espresso(String name, double price) {
        super(name, price);
    }

    // Overriding the brew method
    @Override
    public void brew() {
        System.out.println("Brewing " + getName() + " coffee using espresso machine");
    }
}

// Subclass of Coffee representing another type of coffee
class Latte extends Coffee {
    // Constructor
    public Latte(String name, double price) {
        super(name, price);
    }

    // Overriding the brew method
    @Override
    public void brew() {
        System.out.println("Brewing " + getName() + " coffee with steamed milk");
    }
}

// Main class to demonstrate the coffee application
public class Coffee_Main {
    public static void main(String[] args) {
        // Creating instances of different types of coffee
        Coffee coffee1 = new Coffee("Regular", 2.5);
        Espresso espresso = new Espresso("Espresso", 3.5);
        Latte latte = new Latte("Latte", 4.0);

        // Brewing different types of coffee
        coffee1.brew();
        espresso.brew();
        latte.brew();
    }
}