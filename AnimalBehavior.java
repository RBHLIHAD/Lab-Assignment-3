abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat.");
    }

    void sleep() {
        System.out.println("Lion sleeps in the den.");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger hunts and eats meat.");
    }

    void sleep() {
        System.out.println("Tiger sleeps under trees.");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats grass.");
    }

    void sleep() {
        System.out.println("Deer sleeps in open fields.");
    }
}

public class AnimalBehavior {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();
        lion.eat();
        lion.sleep();
        tiger.eat();
        tiger.sleep();
        deer.eat();
        deer.sleep();
    }
}