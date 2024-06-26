package ss4_OOP.rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the height: ");
        double height = Double.parseDouble(sc.nextLine());

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your rectangle: " + rectangle.display());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
