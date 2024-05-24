package ss12_java_collection_framework.product.management.views;

import ss12_java_collection_framework.product.management.models.Product;

import java.util.Scanner;

public class ProductView {
    public int statusView() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            System.out.println("----------DANH-SÁCH-SẢN-PHẨM----------");
            System.out.println(" ");
            System.out.println("1.\tTHÊM SẢN PHẨM");
            System.out.println("2.\tCHỈNH SỬA");
            System.out.println("3.\tXÓA");
            System.out.println("4.\tTÌM KIẾM");
            System.out.println("5.\tSẮP XẾP DANH SÁCH");
            System.out.println("0.\tEND");
            System.out.println(" ");
            try {
                System.out.print("\nNhập vào lựa chọn: ");
                choice = Integer.parseInt(sc.nextLine());
                return choice;
            } catch (NumberFormatException e) {
                this.warring();
            }
        }
    }

    public Product viewAdd() {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double price;
        while (true) {
            try {
                System.out.print("NHẬP ID SẢN PHẨM: ");
                id = Integer.parseInt(sc.nextLine());
                System.out.print("NHẬP TÊN SẢN PHẨM: ");
                name = sc.nextLine();
                System.out.print("NHẬP GIÁ SẢN PHẨM: ");
                price = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai!! vui lòng thử lại");
            }
        }
        return new Product(id, name, price);
    }

    public void viewMessage(boolean result) {
        if (result) {
            System.out.println("Thao tác thành công!!!");
        } else {
            System.out.println("Thao tác thất bại!!!");
        }
    }

    public void warring() {
        System.out.println("Bạn đã nhập sai!!!");
    }

}
