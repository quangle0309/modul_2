package ss13_sort_algorithm;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Nhập giá trị cần tìm kiếm: ");
        String x = sc.nextLine();
        boolean find = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(x)) {
                find = true;
                count = i;
                break;
            } 
        }
        if (find) {
            System.out.println("Vị trí của x ở trong mảng là: " + count);
        } else {
            System.out.println("Không tìm thấy phần tử " + x + " ở trong mảng!");
        }
    }
}

