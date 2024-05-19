package ss3_array_and_method;
import java.util.Scanner;
public class StudentArray {
    public static void main(String[] args) {
        String[] student = {"Quang", "Ky", "Phong", "Linh", "Hieu", "Thanh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name student: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + input_name + " in the list");
        }
    }
}
