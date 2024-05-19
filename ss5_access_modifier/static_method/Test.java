package ss5_access_modifier.static_method;

public class Test {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Quang");

        s1.display();
        s2.display();
        s3.display();
    }
}
