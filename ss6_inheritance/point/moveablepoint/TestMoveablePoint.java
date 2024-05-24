package ss6_inheritance.point.moveablepoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint p1 = new MoveablePoint(2,4,1,1);

        System.out.println(p1);
        p1.move();
        System.out.println(p1);
        p1.setSpeed(3,3);
        p1.move();
        System.out.println(p1);
    }
}
