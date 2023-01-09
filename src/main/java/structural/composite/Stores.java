package structural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gokalp on 9.01.2023
 * @project DesignPatterns
 */
public class Stores implements Priceable {

    private String name;
    private List<Product> productList;
    private List<Package> packageList;

    public Stores(String name) {
        this.name = name;
        this.packageList = new ArrayList<>();
        this.productList = new ArrayList<>();

    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal totalAmountOfProductList = PriceCalculateUtil.getTotalAmountOfProduct(productList);
        BigDecimal totalAmountOfPackageList = PriceCalculateUtil.getTotalAmountOfPackage(packageList);
        return totalAmountOfPackageList.add(totalAmountOfProductList);
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

    public List<Package> getPackageList() {
        return packageList;
    }

    public void setPackageList(List<Package> packageList) {
        this.packageList = packageList;
    }
}
