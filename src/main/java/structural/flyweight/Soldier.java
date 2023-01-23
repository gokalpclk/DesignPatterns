package structural.flyweight;

/**
 * @author Gokalp on 23.01.2023
 * @project DesignPatterns
 */
public abstract class Soldier {
    private BulletSize bulletSize;

    public Soldier(BulletSize bulletSize) {
        this.bulletSize = bulletSize;
    }

    public void fire (){
        //Bullet bullet = new Bullet(bulletSize);
        Bullet bullet = BulletFactory.bulletGenerator(bulletSize);

        bullet.fireBullet();
    }

}
