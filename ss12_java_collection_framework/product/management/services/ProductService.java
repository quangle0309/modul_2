package ss12_java_collection_framework.product.management.services;

import ss12_java_collection_framework.product.management.models.Product;
import ss12_java_collection_framework.product.management.repositories.ProductRepo;

public class ProductService {
    ProductRepo productRepo = new ProductRepo();

    public boolean add(Product product) {
        if (product.getName().equals("")) {
            return false;
        }
        if (product.getId() < 0 || product.getId() > 100000) {
            return false;
        }
        if (product.getPrice() < 0 || product.getPrice() > 1000000000) {
            return false;
        }
        productRepo.add(product);
        return true;
    }

//    public void checkNumber()
}
