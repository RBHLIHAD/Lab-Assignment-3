interface Animal {
    void bark();
}

class Dog implements Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class AnimalInterfaceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}