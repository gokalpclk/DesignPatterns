package structural.flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Gokalp on 23.01.2023
 * @project DesignPatterns
 */
public class BulletFactory {
    private static Map<BulletSize, Bullet> pool = new LinkedHashMap<>();

    public static Bullet bulletGenerator(BulletSize bulletSize) {
        Bullet bullet = pool.get(bulletSize);
        if (bullet == null) {
            bullet = new Bullet(bulletSize);
            pool.put(bulletSize, bullet);
        }
        return bullet;

    }
}
