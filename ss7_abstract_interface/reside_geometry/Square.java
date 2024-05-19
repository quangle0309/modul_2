package ss7_abstract_interface.reside_geometry;

public class Square extends Shape implements Resizeable{
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
    public double getArea(double size){
        return size * size;
    }
    public double getPerimeter(double size){
        return 4 * size;
    }

    @Override
    public void resize(double percent) {
        this.size += percent * this.size;
    }

    @Override
    public String toString() {
        return "A Square with size = "
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }
}
