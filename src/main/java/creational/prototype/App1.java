package creational.prototype;

import java.util.Date;

/**
 * @author Gokalp on 10/3/22
 */
public class App1 {
    public static void main(String[] args) {
        GeneralEntityService generalEntityService = new GeneralEntityService();
        long id1 = 1L;


        Date firstDate = new Date();
        Document document1 = generalEntityService.findDocumentById(id1);
        Date lastDate = new Date();
        printTimeAndDocument(firstDate, document1, lastDate);

//        Date firstDate2 = new Date();
//        Document document2 = generalEntityService.findDocumentById(2L);
//        Date lastDate2 = new Date();
//        printTimeAndDocument(firstDate2, document2, lastDate2);

        Date firstDate3 = new Date();
        Document documentClone = null;
        try {
            documentClone = document1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        documentClone.setName("Diary");
        documentClone.setData("Dear Diary ....");
        documentClone.getDocumentType().setName("Personal 2");
        Date lastDate3 = new Date();
        printTimeAndDocument(firstDate3, documentClone ,lastDate3);

        System.out.println(document1);
    }

    private static void printTimeAndDocument(Date firstDate, Document document1, Date lastDate) {
        Long totalTime = getTotalTime(firstDate, lastDate);
        System.out.println(document1);
        System.out.println(totalTime);
        System.out.println("\n");
    }

    private static Long getTotalTime(Date firstDate, Date lastDate) {
        return lastDate.getTime() / 1000 - firstDate.getTime() / 1000;
    }
}
