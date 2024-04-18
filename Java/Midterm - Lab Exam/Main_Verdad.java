class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Programmer extends Person {
    private String progLanguage;

    public Programmer(String name, int age, String progLanguage) {
        super(name, age);
        this.progLanguage = progLanguage;
    }

    public String getProgLanguage() {
        return progLanguage;
    }
    public void setProgLanguage(String progLanguage) {
        this.progLanguage = progLanguage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Programming Language: " + progLanguage);
    }
}

public class Main_Verdad{
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Joren", 22, "Python");
        Programmer programmer2 = new Programmer("Kol Buknoy", 69, "Java");

        System.out.println("Programmer No. 1");
        programmer.display();
        System.out.println("\nProgrammer No. 2");
        programmer2.display();
    }
}