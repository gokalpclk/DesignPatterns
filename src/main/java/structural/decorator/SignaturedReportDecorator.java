package structural.decorator;

/**
 * @author Gokalp on 12.01.2023
 * @project DesignPatterns
 */
public class SignaturedReportDecorator extends ReportDecorator {

    public SignaturedReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getText() {
        String text = super.getText();
        String signatureText =ReportUtil.addSignature(text);
        return signatureText;
    }
}
