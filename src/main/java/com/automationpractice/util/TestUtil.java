package com.automationpractice.util;

import com.automationpractice.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class TestUtil extends TestBase {

    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 10;

    public static String TESTDATA_SHEET_PATH = "/Users/guigasparotto/Documents/selenium_webdriver/minerva/" +
            "src/main/java/com/automationpractice/testdata/testData.xlsx";

    static Workbook book;
    static Sheet sheet;

    static DataFormatter objDefaultFormat = new DataFormatter();
    static FormulaEvaluator objFormulaEvaluator = new HSSFFormulaEvaluator((HSSFWorkbook) book);

    public static String createRandomEmail() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100000);
        return "testEmail" + randomInt + "@gmail.com";
    }


    public static Object[][] getTestData(String sheetName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum() - 1][sheet.getRow(0).getLastCellNum()];
//        System.out.println(sheet.getLastRowNum() + "--------");
//        sheet.getRow(0).getLastCellNum();
        for (int i = 0; i < sheet.getLastRowNum() - 1; i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = objDefaultFormat.formatCellValue(sheet.getRow(i + 1).getCell(j));
                System.out.println(data[i][j]);
            }
        }
        return data;
    }

    public static void takeScreenshotAtEndOfTest() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");

        // From dependency commons-io
        FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

    }
}
