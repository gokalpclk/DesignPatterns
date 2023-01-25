package behavioural.chain;

/**
 * @author Gokalp on 25.01.2023
 * @project DesignPatterns
 */
public class GklpCargo {
    public static CargoCompany getCargoCompany() {
        KarabukBranch karabukBranch = new KarabukBranch();
        AnkaraBranch ankaraBranch = new AnkaraBranch();
        IstanbulBranch istanbulBranch = new IstanbulBranch();
        AntalyaBranch antalyaBranch = new AntalyaBranch();

        CargoCompany gklpCargo = karabukBranch.setNextCargoCompany(
                ankaraBranch.setNextCargoCompany(
                        istanbulBranch.setNextCargoCompany(
                                antalyaBranch)));

        return gklpCargo;
    }
}
