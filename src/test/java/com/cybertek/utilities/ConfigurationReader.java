package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


  private static Properties properties=new Properties();  //1

    static {

        try {
            FileInputStream file= new FileInputStream("Configurations.properties");//2
            properties.load(file);//2
            file.close(); //4
        } catch (IOException e) {
            System.out.println("Properies file not found");
        }
    }



    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
