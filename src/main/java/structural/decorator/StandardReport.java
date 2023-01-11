package structural.decorator;

/**
 * @author Gokalp on 11.01.2023
 * @project DesignPatterns
 */
public class StandardReport implements Report {
    private String text;

    public StandardReport(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
