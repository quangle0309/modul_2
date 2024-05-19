package ss7_abstract_interface.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[5];
        arr[0] = new Circle(5.0);
        arr[1] = new Rectangle(12, 24);
        arr[2] = new Square(15);
        arr[3] = new Circle(4);
        arr[4] = new Rectangle(9,12);

        for (Shape c: arr) {
            if (c instanceof Square) {
                ((Square) c).howToColor();
            } else {
                if (c instanceof Circle) {
                    System.out.println("Area is: " + ((Circle) c).getArea());
                } else {
                    System.out.println("Area is: " + ((Rectangle) c).getArea());
                }
            }
        }
    }
}
