package com.Selenium_for_intellij;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadData {
    public static void main(String[] args) throws Exception {
        try {
            File file = new File("C:\\Users\\301044130\\Desktop\\loginData.xlsx");
            FileInputStream inputStream = new FileInputStream(file);
            XSSFWorkbook wb = new XSSFWorkbook(inputStream);
            XSSFSheet sheet1 = wb.getSheetAt(0);

            int rowcount = sheet1.getLastRowNum() + 1;

            for (int i = 0; i < rowcount; i++) {
                XSSFRow row = sheet1.getRow(i);
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    System.out.println(row.getCell(j) + "|");
                }
                System.out.println();
            }
            inputStream.close();
            wb.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

