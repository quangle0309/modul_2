package ss5_access_modifier.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area of circle with radius " + c.getRadius() + " is: " + c.getArea());
    }
}
