package com.kup.knoldus;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class CountNameFrequencyTest {


        Map<String, String> map = new HashMap<String, String>();
        final static String filePath = "src/main/java/Database/NameData";
        BufferedReader buff;
        File myFile = new File(filePath);

        @org.junit.jupiter.api.Test
        void makeMapfromTextFile() throws FileNotFoundException, IOException {


                buff = new BufferedReader(new FileReader(myFile));
                String lineBreak = null;
                while ((lineBreak = buff.readLine()) != null) {
                        String[] parts = lineBreak.split(" ");
                        for (String wordBreak : parts) {
                                map.put(wordBreak, (map.containsKey(wordBreak)) ? Integer.toString((Integer.parseInt(map.get(wordBreak)) + 1)) : "1");
                        }

                }

                        assert (!map.isEmpty());
                        assert (map.containsKey("Sakshi"));
                        assert (map.containsValue("3"));
        }
}