package ss8_mvc_cleancode.views;

import java.util.Scanner;

public class StudentView {
    Scanner sc = new Scanner(System.in);
    public int viewMainStatus(){
        System.out.println("---------Student View---------");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Display all Students");
        System.out.println("0. End program");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
