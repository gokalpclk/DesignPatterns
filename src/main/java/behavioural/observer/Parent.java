package behavioural.observer;

/**
 * @author Gokalp on 31.01.2023
 * @project DesignPatterns
 */
public class Parent implements Observer {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        Thermometer thermometer = (Thermometer) observable;
        System.out.println(name + " Temperature: " + thermometer.getCurrentTemperature());

    }
}
