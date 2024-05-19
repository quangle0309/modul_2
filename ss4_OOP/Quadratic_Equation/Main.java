package ss4_OOP.Quadratic_Equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a, b ,c: ");
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt: " + equation.getRoots1() + " và " + equation.getRoots2());
        } else if (delta == 0) {
            System.out.println("Phương trình có 2 nghiệm bằng nhau: " + equation.getRoots1());
        } else {
            System.out.println("Phương trình vô nghiệm!!!");
        }
    }
}
