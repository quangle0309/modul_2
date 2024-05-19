package ss7_abstract_interface.colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.getColor());
        System.out.println(square.getSize());
        System.out.println(square.getArea());
        square.howToColor();
    }
}
