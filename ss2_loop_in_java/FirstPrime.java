package ss2_loop_in_java;
import java.util.Scanner;

public class FirstPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < 100;i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    static void num(int a){}
    static void num(double b){}
    static void num(float c){}
    static void num(char d){}
}
