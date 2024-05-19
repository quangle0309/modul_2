package ss4_OOP.fan;

public class TestFan {
    public static void main (String[] args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.On();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.Off();

        System.out.println(fan1);
        System.out.println(fan2);

    }
}
