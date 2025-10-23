interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + width);
    }

    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + height);
    }

    void display() {
        System.out.println("Rectangle [Width: " + width + ", Height: " + height + "]");
    }
}

public class ResizableRectangleDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        rect.display();
        rect.resizeWidth(15);
        rect.resizeHeight(25);
        rect.display();
    }
}