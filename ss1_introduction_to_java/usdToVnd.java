package ss1_introduction_to_java;
import java.util.Scanner;

public class usdToVnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        double usd;

        System.out.println("Enter usd: ");
        usd = sc.nextDouble();

        System.out.println(usd + "$ = " + (vnd * usd) + "VND");
    }
}
