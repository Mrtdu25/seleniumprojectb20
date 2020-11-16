package com.cybertek.tests.day14_excel_io;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile_Mrt {

    public static void main(String[] args) throws IOException {

        String path="vytrack_testusers.xlsx";

        File file=new File(path);

        System.out.println(file.exists());

        Workbook workbook= WorkbookFactory.create(file);

        workbook.forEach(eachSheet -> System.out.println(eachSheet.getSheetName()));

        Sheet sheet = workbook.getSheet("QA1-short");

        Row row = sheet.getRow(0);

        Cell cell = row.getCell(0);

        String stringCellValue = cell.getStringCellValue();
        System.out.println(stringCellValue);

        System.out.println("============================================");

        String path1="vytrack_testusers.xlsx";

        File file1=new File(path1);

        Workbook workbook1=WorkbookFactory.create(file1);

        Sheet sheet1 = workbook1.getSheet("QA1-short");


        for (Row row1 : sheet1) {
            for (Cell cell1 : row1) {

                System.out.printf("%15s  ",cell1.getStringCellValue());

            }
            System.out.println();
        }












    }
}
