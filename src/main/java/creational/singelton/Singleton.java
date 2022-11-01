package creational.singelton;

/**
 * @author Gokalp on 9/7/22
 */
public class Singleton {

    private Singleton() {
        System.out.println("*");
    }
    private static Singleton singleton;

    public static Singleton getSingleton() {

        //double-checked locking  supply lazy loading(with synchronized), threadsafe, performance
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }


}
