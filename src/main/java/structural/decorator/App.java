package structural.decorator;

/**
 * @author Gokalp on 12.01.2023
 * @project DesignPatterns
 */
public class App {
    public static void main(String[] args) {
        String content = getReportContent();
        String text ="";


        StandardReport standardReport = new StandardReport(content);
        //text = standardReport.getText();

        LineReportDecorator lineReportDecorator = new LineReportDecorator(standardReport);
        //text = lineReportDecorator.getText();

        SmallReportDecorator smallReportDecorator = new SmallReportDecorator(lineReportDecorator);
        text = smallReportDecorator.getText();
        System.out.println(text);
    }

    private static String getReportContent() {
        return "\nLorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdi" +
                "\nr. Lorem Ipsum, adı bilinmeyen bir matbaacının bir hurufat numune kitabı oluşturmak üzer" +
                "\ne bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte meti" +
                "\nnler olarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmek" +
                "\nle kalmamış, aynı zamanda pek değişmeden ele" +
                "\nktronik dizgiye de sıçramıştır. 1960'larda Lorem Ipsum pasajları da içeren" +
                "\n Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker gibi Lor" +
                "\nem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.";
    }
}
