interface AnimalSound {
    void makeSound();
}

interface AnimalMovement {
    void move();
}

interface Animal extends AnimalSound, AnimalMovement {}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark!");
    }

    public void move() {
        System.out.println("The dog runs.");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void move() {
        System.out.println("The cat walks.");
    }
}

class Duck implements Animal {
    public void makeSound() {
        System.out.println("Quack!");
    }

    public void move() {
        System.out.println("The duck swims.");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Moo!");
    }

    public void move() {
        System.out.println("The cow walks.");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Duck(), new Cow()};

        for (Animal animal : animals) {
            animal.makeSound();
            animal.move();
        }
    }
}