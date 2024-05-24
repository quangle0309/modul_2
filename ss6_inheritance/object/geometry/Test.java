package ss6_inheritance.object.geometry;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape shape2 = new Shape("Blue", false);
        System.out.println(shape);
        System.out.println(shape2);


        Circle circle = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(9, "Green", false);
        System.out.println(circle);
        System.out.println(circle2);
        System.out.println(circle3);

    }
}
