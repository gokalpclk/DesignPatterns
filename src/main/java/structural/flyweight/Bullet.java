package structural.flyweight;

/**
 * @author Gokalp on 23.01.2023
 * @project DesignPatterns
 */
public class Bullet {
    private BulletSize bulletSize;

    public Bullet(BulletSize bulletSize) {
        this.bulletSize = bulletSize;

        System.out.println(bulletSize.getSize()+"mm bullet generated");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fireBullet(){
        System.out.println("tak");
    }
}
