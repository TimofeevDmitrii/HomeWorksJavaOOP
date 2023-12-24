package Seminar1hwOOP;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{

    private List <Product> bottleOfWaterList = new ArrayList();

    @Override
    public void initProduct(List<Product> productList) {
        this.bottleOfWaterList = productList;
    }

    @Override
    public Product getProduct(String productName) {
        for (Product product: bottleOfWaterList)
            if (product.getName().equals(productName))
                return product;
        return null;
    }

    public Product getProduct(String productName, int cost) {
        for (Product product: bottleOfWaterList)
            if (product.getName().equals(productName) && product.getCost()==cost)
                return product;
        return null;
    }

    public Product getProduct(String productName, double volume) {
        for (Product product: bottleOfWaterList)
            if (product.getName().equals(productName) && ((BottleOfWater) product).getVolume()==volume)
                return product;
        return null;
    }

    @Override
    public List<Product> getProductList() {
        return bottleOfWaterList;
    }
}
