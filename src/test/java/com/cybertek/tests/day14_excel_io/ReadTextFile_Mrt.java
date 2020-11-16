package com.cybertek.tests.day14_excel_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile_Mrt {

    public static void main(String[] args) throws FileNotFoundException {
        String path="grades.csv";

        File file=new File(path);

        Scanner scanner=new Scanner(file);

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

        System.out.println("================================================");

        String path1="shopping_list.txt";

        File file1=new File(path1);

        System.out.println(file1.exists());
        Scanner scanner1=new Scanner(file1);


        while (scanner1.hasNext()){
            System.out.println(scanner1.nextLine());
        }



    }




}
