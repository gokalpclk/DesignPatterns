package structural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gokalp on 9.01.2023
 * @project DesignPatterns
 */
public class Package implements Priceable {

    private String name;
    private List<Product> productList;

    public Package(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
    }

    @Override
    public BigDecimal getPrice() {
        return PriceCalculateUtil.getTotalAmountOfProduct(productList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
