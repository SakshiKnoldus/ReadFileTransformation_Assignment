package com.kup.knoldus;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Map;

public class DriverCode  {

        public static void main(String[] args) throws NoSuchFileException, IOException {

                Map<String, String> mapFromFile = new CountNameFrequency().makeMapfromTextFile();
                mapFromFile.forEach((key,value)->{
                        System.out.println(key+ " "+value);
                });



        }
}
