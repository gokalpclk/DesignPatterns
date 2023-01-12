package structural.decorator;

/**
 * @author Gokalp on 12.01.2023
 * @project DesignPatterns
 */
public class SmallReportDecorator extends ReportDecorator {
    private int weight;
    public SmallReportDecorator(Report report) {
        super(report);
        this.weight = 30;
    }



    @Override
    public String getText() {
        String text = super.getText();
        String smallText = ReportUtil.justifyText(text, weight);
        return smallText;
    }
}
