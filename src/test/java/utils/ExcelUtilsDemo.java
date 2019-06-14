package utils;

public class ExcelUtilsDemo {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        String excelPath = "\\excel\\data.xlsx";
        String sheetName = "Tabelle1";
        ExcelUtils excel = new ExcelUtils(projectPath+ excelPath, sheetName);
        excel.countRows();
        ExcelUtils.countCols();
        ExcelUtils.getCellDataString(0,0);
        ExcelUtils.getCellDataNumeric(1,1);


    }
}
