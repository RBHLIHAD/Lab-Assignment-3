interface Drawable {
    void draw();
}

// Implementing class: Circle
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Implementing class: Rectangle
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Implementing class: Triangle
class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Main class to test the interface
public class DrawableDemo {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
