package structural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gokalp on 9.01.2023
 * @project DesignPatterns
 */
public class Cart {
    private String name;
    private List<Priceable> priceableList;

    public Cart(String name) {
        this.name = name;
        this.priceableList = new ArrayList<>();
    }

    public BigDecimal getTotalAmount() {
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (Priceable priceable : priceableList){
            totalAmount = totalAmount.add(priceable.getPrice());
        }
        return totalAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Priceable> getPriceableList() {
        return priceableList;
    }

    public void setPriceableList(List<Priceable> priceableList) {
        this.priceableList = priceableList;
    }
}
