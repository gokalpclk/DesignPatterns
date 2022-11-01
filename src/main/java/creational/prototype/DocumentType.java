package creational.prototype;

/**
 * @author Gokalp on 9/24/22
 */
public class DocumentType implements Cloneable {
    private Long id;
    private String name;

    public DocumentType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    protected DocumentType clone() throws CloneNotSupportedException {
        return (DocumentType) super.clone();
    }
}
