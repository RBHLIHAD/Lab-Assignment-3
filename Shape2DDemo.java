abstract class Shape2D {
    abstract void draw();
    abstract void resize();
}

class Rectangle extends Shape2D {
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }

    void resize() {
        System.out.println("Resizing the Rectangle.");
    }
}

class Circle extends Shape2D {
    void draw() {
        System.out.println("Drawing a Circle.");
    }

    void resize() {
        System.out.println("Resizing the Circle.");
    }
}

public class Shape2DDemo {
    public static void main(String[] args) {
        Shape2D rectangle = new Rectangle();
        Shape2D circle = new Circle();

        rectangle.draw();
        rectangle.resize();

        circle.draw();
        circle.resize();
    }
}
