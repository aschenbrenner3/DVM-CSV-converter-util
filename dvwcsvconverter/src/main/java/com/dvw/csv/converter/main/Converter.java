package com.dvw.csv.converter.main;

import com.dvw.csv.converter.service.ConverterImpl;

public class Converter {

    private static ConverterImpl dvwConverter;

    public static void main(String[] args) {

        System.out.println("Hello World!");

//        getConverter().readDvwFile();

        getConverter().writeCsvFile();
    }

    protected static ConverterImpl getConverter() {
        if (dvwConverter == null) {
            dvwConverter = new ConverterImpl();
        }
        return dvwConverter;
    }
}
