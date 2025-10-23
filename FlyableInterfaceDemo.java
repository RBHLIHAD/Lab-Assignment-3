interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft flies into space!");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane flies through the sky!");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter hovers and flies!");
    }
}

public class FlyableInterfaceDemo {
    public static void main(String[] args) {
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();

        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}