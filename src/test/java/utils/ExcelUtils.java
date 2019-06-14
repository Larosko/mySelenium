package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class ExcelUtils {

    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;

//    public static void main(String[] args) {
//        countRows();
//        countCols();
//        getCellDataString(0,0);
//        getCellDataNumeric(1,1);
//    }

    ExcelUtils(String excelPath, String sheetName) {
        try {
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            System.out.println(e.getMessage() + "\n" + e.getCause());
            e.printStackTrace();
        }
    }

    int countRows(){
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("Number of Rows: " + rowCount);
        return rowCount;
    }

    static int countCols(){
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Number of Columns: " + colCount);
        return colCount;
    }

    static String getCellDataString(int rowNum, int cellNum) {
//        new ExcelUtils(excelPath, sheetName);

        String cellData = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
//        System.out.println(cellData);
//        System.out.println(sheet.isSelected());

//        try {
//            XSSFSheet sheet2 = workbook.getSheet("Tabelle2");
//            System.out.println(sheet2.isSelected());
//        } catch (NullPointerException en) {
//            System.out.println("Page is absent");
//            System.out.println(en.getMessage() + "\n" + en.getCause());
//            en.printStackTrace();
        return cellData;
    }

    public static double getCellDataNumeric(int rowNum, int cellNum) {
//        ExcelUtils(excelPath, sheetName);
        XSSFSheet sheet = workbook.getSheet("Tabelle1");
        double cellData = sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
//        System.out.println(cellData);
        return cellData;
    }
}
