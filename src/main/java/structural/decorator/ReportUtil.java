package structural.decorator;

import java.util.ArrayList;
import java.util.List;

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
            result += dashedRow;
        }
        return result;
    }

    private static String addDash(String row) {
        String result;
        if (row.trim().length() == 0) {
            result = "\n";
        } else {
            result = "\n- " + row;
        }
        return result;
    }

    public static String justifyText(String text, int weight) {
        String result = "";
        String[] rowList = text.split("\n");
        for (String row : rowList) {
            if (row.length() <= weight) {
                result = addAndNewLine(result, row);
            } else {
                List<String> smashedList = smash(row, weight);
                for (String smashed : smashedList) {
                    result = addAndNewLine(result, smashed);
                }
            }

        }
        return result;
    }

    private static String addAndNewLine(String mainText, String addedText) {
        return mainText + addedText + "\n";
    }

    private static List<String> smash(String row, int weight) {
        List<String> smashedRowList = new ArrayList<>();
        for (int i = 0; i <= row.length() / 30; i++){
            int firstRow = weight*i ;
            int lastRow = firstRow+weight;

            if(lastRow > row.length()){
                lastRow = row.length();
            }
            String smashedRow = row.substring(firstRow, lastRow);
            if(smashedRow.trim().length()>0){
                smashedRowList.add(smashedRow);
            }
        }
        return smashedRowList;
    }

    public static String addSignature(String text) {
        String signature = "\n\n+\t\t\t\t\t imza";
        return text+signature;
    }
}
