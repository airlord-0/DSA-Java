package Problems;

public class prime {
    public static void main (String[] args) {
    Dog d = new Dog();
    
    }
}
class Animal {
    String name;

    // Parent class constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    int age;

    // Constructor 1
    Dog() {
        this("Golden Retriever", 3);
        System.out.println("Default Dog constructor called");
    }

    // Constructor 2
    Dog(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Parameterized Dog constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

