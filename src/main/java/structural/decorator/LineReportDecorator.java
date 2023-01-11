package structural.decorator;

/**
 * @author Gokalp on 11.01.2023
 * @project DesignPatterns
 */
public class LineReportDecorator extends ReportDecorator {
    public LineReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getText() {
        String text = super.getText();
        String lineText = ReportUtil.getLineText(text);
        return lineText;
    }
}
