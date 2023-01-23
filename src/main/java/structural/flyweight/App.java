package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gokalp on 23.01.2023
 * @project DesignPatterns
 */
public class App {
    public static void main(String[] args) {
        List<Soldier> soldierList = new ArrayList<>();
        Lieutenant lieutenant = new Lieutenant();
        soldierList.add(lieutenant);


        for (int i =0; i<50; i++){
            Commando commando = new Commando();
            soldierList.add(commando);
        }

        for (Soldier soldier: soldierList){
            soldier.fire();
        }
    }
}
