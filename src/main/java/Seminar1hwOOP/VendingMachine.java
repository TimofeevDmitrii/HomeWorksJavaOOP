package Seminar1hwOOP;

import java.util.List;

public interface VendingMachine {
    public void initProduct(List<Product> productList);
    public Product getProduct(String productName);
    public List<Product> getProductList();
}
