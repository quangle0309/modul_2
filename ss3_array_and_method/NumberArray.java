package ss3_array_and_method;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int size;

        do {
            System.out.println("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20 || size < 0) {
                System.out.println("Enter the number between 0 and 20: ");
            }
        } while (size > 20);

        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }

}
