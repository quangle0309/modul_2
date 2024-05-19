package ss7_abstract_interface.reside_geometry;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(100, "indigo", false);
        System.out.println(circle);

        circle.resize(Math.floor(Math.random() * 100) / 100);
        System.out.println(circle);
    }
}