package structural.composite;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Gokalp on 9.01.2023
 * @project DesignPatterns
 */
public class PriceCalculateUtil {
    public static BigDecimal getTotalAmountOfProduct(List<Product> productList) {
        BigDecimal totalAmount = BigDecimal.ZERO;

        for (Product product : productList) {
            totalAmount = totalAmount.add(product.getPrice());
        }
        return totalAmount;
    }

    public static BigDecimal getTotalAmountOfPackage(List<Package> packageList) {
        BigDecimal totalAmount = BigDecimal.ZERO;

        for (Package pack : packageList) {
            totalAmount = totalAmount.add(pack.getPrice());
        }
        return totalAmount;
    }
}
