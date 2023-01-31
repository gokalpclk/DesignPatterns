package behavioural.observer;

import java.math.BigDecimal;

/**
 * @author Gokalp on 31.01.2023
 * @project DesignPatterns
 */
public class App {
    public static void main(String[] args) {
        BigDecimal minTemperature = BigDecimal.valueOf(23);
        BigDecimal maxTemperature = BigDecimal.valueOf(28);
        Thermometer thermometer = new Thermometer(minTemperature, maxTemperature);
        Parent mom = new Parent("Mom");
        Parent dad = new Parent("Dad");
        thermometer.add(mom);
        thermometer.add(dad);
        for(int i = thermometer.getCurrentTemperature().intValue(); i<=30; i++){
            thermometer.setCurrentTemperature(BigDecimal.valueOf(i));
        }

        for(int i = thermometer.getCurrentTemperature().intValue(); i>=22; i--){
            thermometer.setCurrentTemperature(BigDecimal.valueOf(i));

        }

    }
}
