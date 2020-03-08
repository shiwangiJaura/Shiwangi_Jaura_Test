package com.Selenium_for_intellij;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteData {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\301044130\\Desktop\\loginData.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        XSSFSheet sheet1 = wb.getSheetAt(0);
        //for defining headers
        sheet1.getRow(0).createCell(0).setCellValue("Email");
        sheet1.getRow(0).createCell(1).setCellValue("Password");

        //First Record
        sheet1.getRow(1).createCell(0).setCellValue("Shiwangi2309@gmail.com\n");
        sheet1.getRow(1).createCell(1).setCellValue("Shiwangi23");


        System.out.println("Writing data in excel");
        FileOutputStream output = new FileOutputStream(file);
        wb.write(output);
        wb.close();
    }
}


