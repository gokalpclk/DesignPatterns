package behavioural.observer;

import java.math.BigDecimal;

/**
 * @author Gokalp on 31.01.2023
 * @project DesignPatterns
 */
public class Thermometer extends Observable {
    private BigDecimal currentTemperature;
    private BigDecimal minTemperature;
    private BigDecimal maxTemperature;

    public Thermometer(BigDecimal minTemperature, BigDecimal maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.currentTemperature = BigDecimal.valueOf(24);
    }

    public BigDecimal getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(BigDecimal currentTemperature) {
        this.currentTemperature = currentTemperature;
        System.out.println(currentTemperature);
        checkTemperature();
    }

    private void checkTemperature() {
        boolean isHigh = currentTemperature.compareTo(maxTemperature) >= 0;
        boolean isLow = currentTemperature.compareTo(minTemperature) <= 0;
        if(isHigh || isLow){
            notification();
        }
    }
}
