package ss12_java_collection_framework.product.management.controllers;

import ss12_java_collection_framework.product.management.models.Product;
import ss12_java_collection_framework.product.management.services.ProductService;
import ss12_java_collection_framework.product.management.views.ProductView;

public class MainController {
    public static void main(String[] args) {
        ProductView productView = new ProductView();
        ProductService productService = new ProductService();
        int choice;
        Product product;
        boolean result;

        do {
            choice = productView.statusView();
            switch (choice) {
                case 1:
                    product = productView.viewAdd();
                    result = productService.add(product);
                    productView.viewMessage(result);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    productView.warring();
            }

        } while (choice != 0);
    }
}
