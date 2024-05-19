package ss7_abstract_interface.colorable;

public class Square extends Shape implements Colorable{
    private double size = 1.0;
    public Square() {};
    public Square(double size) {
        this.size = size;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public double getArea(){
        return size * size;
    }
    public double getPerimeter(){
        return 4 * size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "A Square with size = "
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }
}
