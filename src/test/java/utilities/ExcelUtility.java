package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

    public static String getCellData() throws Exception {

        FileInputStream fis =
                new FileInputStream(
                "src/test/resources/testdata.xlsx");

        XSSFWorkbook wb =
                new XSSFWorkbook(fis);

        XSSFSheet sheet =
                wb.getSheet("Login");

        String data =
                sheet.getRow(1)
                     .getCell(0)
                     .getStringCellValue();

        wb.close();
        fis.close();

        return data;
    }
}