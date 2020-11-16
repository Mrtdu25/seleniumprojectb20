package com.cybertek.tests.day14_excel_io;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) throws Exception {

        String pathTxt="shopping_list.txt";
        File file=new File(pathTxt);
        Scanner scanner=new Scanner(file);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

        System.out.println("===============================");
        String pathCsv="grades.csv";
        File file1=new File(pathCsv);
        Scanner scanner1=new Scanner(file1);
        while (scanner1.hasNext()){
            System.out.println(scanner1.nextLine());
        }

        System.out.println("================================");
        String pathExcel="vytrack_testusers.xlsx";

        File file2=new File(pathExcel);

        Workbook worbook= WorkbookFactory.create(file2);

        worbook.forEach(e -> System.out.println(e.getSheetName()));

        Sheet sheet = worbook.getSheet("QA2-short");

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.printf("%15s",cell.getStringCellValue());
            }
            System.out.println();
        }


    }
}
