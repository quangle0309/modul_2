package ss7_abstract_interface.reside_geometry;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(10, 20, "orange", true);
        System.out.println(rectangle);

        rectangle.resize(Math.floor(Math.random() * 100) / 100);
        System.out.println(rectangle);
    }
}
