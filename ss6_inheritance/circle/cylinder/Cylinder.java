package ss6_inheritance.circle.cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Thể tích hình trụ " + super.getColor() +
                " có bán kính: " + super.getRadius() +
                " và chiều cao: " + height + " là: " + getVolume();
    }

}
