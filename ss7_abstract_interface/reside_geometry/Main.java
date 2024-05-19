package ss7_abstract_interface.reside_geometry;

public class Main {
    public static void main(String[] args) {
        double percent = Math.floor(Math.random() * 100) / 100;
        Shape geometry[] = new Shape[3];
        geometry[0] = new Circle(5.0);
        geometry[1] = new Rectangle(10, 20);
        geometry [2] = new Square(30);

        System.out.println("pri-resize: ");
        for (Shape c: geometry){
            System.out.println(c);
        }
        ((Circle) geometry[0]).resize(percent);
        ((Rectangle) geometry[1]).resize(percent);
        ((Square) geometry[2]).resize(percent);

        System.out.println("After-resize: ");
        for (Shape c: geometry){
            System.out.println(c);
        }
    }
}
