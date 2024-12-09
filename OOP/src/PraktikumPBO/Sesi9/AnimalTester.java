package PraktikumPBO.Sesi9;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal speaks");
    }
    
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof");
    }
}

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.speak();
    }
}
