package ss2_loop_in_java;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " is not Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++ ) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is Prime");
            } else {
                System.out.println(number + " is not Prime");
            }
        }
    }
}
