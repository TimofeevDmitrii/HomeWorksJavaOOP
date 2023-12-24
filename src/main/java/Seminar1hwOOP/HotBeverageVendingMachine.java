package Seminar1hwOOP;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageVendingMachine implements VendingMachine{
    private List<Product> hotBeverageList = new ArrayList<>();

    @Override
    public void initProduct(List<Product> productList) {
        this.hotBeverageList = productList;
    }

    @Override
    public Product getProduct(String productName) {
        for (Product product: hotBeverageList)
            if (product.getName().equals(productName))
                return product;
        return null;
    }

    public Product getProduct(String productName, int cost) {
        for (Product product: hotBeverageList)
            if (product.getName().equals(productName) && product.getCost()==cost)
                return product;
        return null;
    }

    public Product getProduct(String productName, double volume, int temperature) {
        for (Product product: hotBeverageList)
            if (product.getName().equals(productName) && ((HotBeverage) product).getVolume()==volume &&
            ((HotBeverage) product).getTemperature()==temperature)
                return product;
        return null;
    }

    @Override
    public List<Product> getProductList() {
        return hotBeverageList;
    }
}
