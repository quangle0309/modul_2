package ss11_stack_queue.decimal.to.binary;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int number = Integer.parseInt(sc.nextLine());


        System.out.print("Binary is: ");
        while(number != 0) {
            int remainder = number % 2;
            System.out.print(remainder);
            number /= 2;
        }
    }
}
