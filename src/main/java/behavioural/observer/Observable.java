package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gokalp on 31.01.2023
 * @project DesignPatterns
 */
public abstract class Observable {
    private List<Observer> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void add(Observer observer){
        observerList.add(observer);
    }

    public void remove(Observer observer){
        observerList.remove(observer);
    }

    public void notification(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
