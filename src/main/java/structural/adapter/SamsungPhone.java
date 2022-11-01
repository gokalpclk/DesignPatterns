package structural.adapter;

/**
 * @author Gokalp on 10/3/22
 */
public class SamsungPhone implements Phone{

    private int operationVoltage;

    public SamsungPhone() {
        operationVoltage = 5;
    }

    @Override
    public int chargeIt() {
        System.out.println("Samsung phone is charging");
        return operationVoltage;
    }
}
