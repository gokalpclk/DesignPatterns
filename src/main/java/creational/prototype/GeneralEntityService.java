package creational.prototype;

/**
 * @author Gokalp on 10/3/22
 */
public class GeneralEntityService {
    public DocumentType findDocumentTypeById(Long id) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        DocumentType documentType = new DocumentType();
        documentType.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Personal";
        } else if (id.compareTo(2L) == 0) {
            name = "Corporate";
        } else {
            name = "General";
        }
        documentType.setName(name);
        return documentType;
    }

    public Category findCategoryById(Long id) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Category category = new Category();
        category.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Private";
        } else if (id.compareTo(2L) == 0) {
            name = "Work";
        } else {
            name = "General";
        }
        category.setName(name);

        return category;
    }

    public Document findDocumentById(Long id) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Document document = new Document();
        document.setId(id);
        document.setDocumentType(findDocumentTypeById(id));
        document.setCategory(findCategoryById(id));

        String name;
        String data;
        if (id.compareTo(1L) == 0) {
            name = "Latter";
            data = "My dear friend Ahmet, ...";
        } else if (id.compareTo(2L) == 0) {
            name = "Report";
            data = "This report prepare for give general manager";
        } else {
            name = "Traffic rules";
            data = "when turn right give way to pedestrian";
        }

        document.setName(name);
        document.setData(data);

        return document;
    }
}
