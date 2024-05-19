package ss4_OOP.Rectangle;

public class Rectangle {
    double width, weight;

    public Rectangle() {
    };

    public Rectangle(double width, double weight) {
        this.width = width;
        this.weight = weight;
    }
    public double getArea() {
        return width * weight;
    }
    public double getPerimeter() {
        return 2 * width + 2 * weight;
    }
    public String display() {
        return "Rectangle {width = " + width + ", weight = " + weight + "}";
    }
}
