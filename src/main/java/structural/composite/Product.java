package structural.composite;

import java.math.BigDecimal;

/**
 * @author Gokalp on 9.01.2023
 * @project DesignPatterns
 */
public class Product implements Priceable {
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
