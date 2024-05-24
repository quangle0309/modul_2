package ss12_java_collection_framework.product.management.repositories;

import ss12_java_collection_framework.product.management.models.Product;

import java.util.ArrayList;

public class ProductRepo {
    private static ArrayList<Product> productList = new ArrayList<>();

    public void add (Product product) {
        productList.add(product);
    }
}
