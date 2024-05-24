package ss6_inheritance.object.geometry;

import java.util.Comparator;
import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(3.6);
        circle[1] = new Circle();
        circle[2] = new Circle(3.5, "indigo", false);

        System.out.println("pre-sorted: ");
        for (Circle c : circle) {
            System.out.println(c);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circle, circleComparator);

        System.out.println("After-sorted: ");
        for (Circle c : circle) {
            System.out.println(c);
        }
    }
}
