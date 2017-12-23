package com.dvw.csv.converter.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Converter {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // The name of the file to open.
        String inputFileName = "temp.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(inputFileName);


            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            inputFileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + inputFileName + "'");


        }
//
//        final FileWriter sw = new FileWriter("myfile.csv");
//        final CSVPrinter printer = new CSVPrinter(sw, format);
//
//
//        for (int i = 0; i < nLines; i++) {
//            printer.printRecord(lines[i]);
//        }
//
//        printer.flush();
//        printer.close();

        // Store home and away team


    }
}
