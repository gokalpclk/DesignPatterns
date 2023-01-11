package structural.decorator;

/**
 * @author Gokalp on 11.01.2023
 * @project DesignPatterns
 */
public class ReportUtil {
    public static String getLineText(String text) {
        String[] rowList = text.split("\n");
        String result = "";
        for (String row : rowList) {
            String dashedRow = addDash(row);
            result +=dashedRow;
        }
        return result;
    }

    private static String addDash(String row) {
        String result;
        if(row.trim().length() == 0){
            result = "\n";
        }else {
            result =  "\n- " + row;
        }
        return result;
    }
}
