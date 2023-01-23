package structural.flyweight;

/**
 * @author Gokalp on 23.01.2023
 * @project DesignPatterns
 */
public enum BulletSize {
    THREE(3),
    FIVE(5),
    SEVEN(7);

    private int size;

    BulletSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }

    public int getSize() {
        return size;
    }
}
