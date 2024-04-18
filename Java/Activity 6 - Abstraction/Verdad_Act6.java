import java.util.*;

class Product {
    String name;
    int price;
    int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class VendingMachine {
    private Map<String, Product> products = new HashMap<>();
    private int balance = 0;

    void addProduct(Product product) {
        products.put(product.name, product);
    }

    void insertMoney(int amount) {
        balance += amount;
    }

    String selectProduct(String productName) {
        Product product = products.get(productName);
        if (product == null) {
            return "Product not found";
        } else if (product.quantity == 0) {
            return "Product is sold out";
        } else if (product.price > balance) {
            return "Insufficient balance";
        } else {
            product.quantity--;
            balance -= product.price;
            return "You bought " + productName;
        }
    }

    void showProducts() {
        for (Product product : products.values()) {
            System.out.println("Name: " + product.name + ", Price: " + product.price + ", Quantity: " + product.quantity);
        }
    }

    int checkBalance() {
        return balance;
    }
}

public class Verdad_Act6 {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("Coke", 10, 5));
        vm.addProduct(new Product("Pepsi", 15, 3));
        vm.addProduct(new Product("Soda", 20, 2));

        vm.showProducts();

        vm.insertMoney(50);
        System.out.println();
        
        System.out.println(vm.selectProduct("Coke"));
        System.out.println(vm.selectProduct("Soda"));
        System.out.println();

        System.out.println("Balance: " + vm.checkBalance());
        System.out.println();

        vm.showProducts();
    }
}