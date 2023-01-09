package structural.composite;

import java.math.BigDecimal;

/**
 * @author Gokalp on 9.01.2023
 * @project DesignPatterns
 */
public class App {
    public static void main(String[] args) {
        Product tomatoes = new Product("Tomatoes", BigDecimal.TEN);
        Product potatoes = new Product("Potatoes", BigDecimal.ONE);
        Product onion = new Product("Onion", BigDecimal.ONE);

        Package vegetablesPackage = new Package("Vegetables Package");
        vegetablesPackage.getProductList().add(tomatoes);
        vegetablesPackage.getProductList().add(potatoes);
        vegetablesPackage.getProductList().add(onion);

        Product soundSystem = new Product("Sound System", BigDecimal.valueOf(5000));
        Product headphone = new Product("Headphone", BigDecimal.valueOf(1000));

        Package technologyPackage = new Package("Technology Package");
        technologyPackage.getProductList().add(soundSystem);
        technologyPackage.getProductList().add(headphone);

        Product ball = new Product("Ball", BigDecimal.valueOf(100) );

        Cart cart = new Cart("Cart");
        cart.getPriceableList().add(vegetablesPackage);
        cart.getPriceableList().add(technologyPackage);
        cart.getPriceableList().add(ball);


        Stores stores = new Stores("Stores");
        stores.getPackageList().add(vegetablesPackage);
        stores.getProductList().add(ball);
        cart.getPriceableList().add(stores);

        BigDecimal totalAmount = cart.getTotalAmount();


        System.out.println("Total Amoun= " + totalAmount);

    }


}

