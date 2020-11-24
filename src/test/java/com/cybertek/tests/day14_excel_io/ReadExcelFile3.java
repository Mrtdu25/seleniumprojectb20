package com.cybertek.tests.day14_excel_io;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile3 {

    public static void main(String[] args) throws IOException {

        String path="vytrack_testusers.xlsx";
        File file=new File(path);
        Workbook workbook= WorkbookFactory.create(file);
        int numberOfSheets = workbook.getNumberOfSheets();
        System.out.println(numberOfSheets);
        workbook.forEach(p-> System.out.println(p.getSheetName()));
        Sheet sheet = workbook.getSheet("QA3-short");

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.printf("%15s",cell.getStringCellValue());
            }
            System.out.println();
        }


    }



}
