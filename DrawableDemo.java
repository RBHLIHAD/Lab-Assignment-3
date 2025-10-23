interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

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
