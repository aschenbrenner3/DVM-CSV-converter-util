package com.dvw.csv.converter.service;

import com.dvw.csv.converter.model.Touch;

import java.io.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConverterImpl {

    public static void readDvwFile() {
        // The name of the file to open.
        String inputFileName = "/Users/Shared/Jess/&2017-12-17 37172 NEB-UF(VM).dvw";

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
    }

    public static void writeCsvFile() {

        //Delimiter used in CSV file
        String COMMA_DELIMITER = ",";
        String NEW_LINE_SEPARATOR = "\n";
        Date date = new Date();

        //CSV file header
        String FILE_HEADER = "yearid,matchid,team,teamid,prgteamid,ply,plyid,plyprgid,plyteamprgid,sk,skty,skgrd,sk_grd,combo,tgt,strzn,endzn,endzn2,tysk,plys,special,custom,so_ps,rec_def,undefined1,x1,y1,x2,y2,x3,y3,hh_mm_ss,game,hrot,arot,movie,sec,undefined2,harea1,harea1id,harea1prgid,harea1teamprgid,harea2,harea2id,harea2prgid,harea2teamprgid,harea3,harea3id,harea2prgid,harea3teamprgid,harea4,harea4id,harea4prgid,harea4teamprgid,harea5,harea5id,harea5prgid,harea5teamprgid,harea6,harea6id,harea6prgid,harea6teamprgid,aarea1,aarea1id,aarea1prgid,aarea1teamprgid,aarea2,aarea2id,aarea2prgid,aarea2teamprgid,aarea3,aarea3id,aarea3prgid,aarea3teamprgid,aarea4,aarea4id,aarea4prgid,aarea4teamprgid,aarea5,aarea5id,aarea5prgid,aarea5teamprgid,aarea6,aarea6id,aarea6prgid,aarea6teamprgid,skscore,hpts,apts,ptsdiff,hptsdiff,aptsdiff,strrot,hset,hsetid,hsetprgid,hsetteamprgid,aset,asetid,asetprgid,asetteamprgid,pos,row,hlineup,alineup,h_Lineup_libero,a_Lineup_libero,hLibero,aLibero,lineup_Team_Prg_ID,lineup_Prg_ID,wonlost,Prg_Rally_Set_ID,Prg_Rally_Match_ID,Prg_Rally_Data_ID,Play_In_Rally";

        //CSV Output File Name
        String outputFileName = new StringBuilder("/Users/Shared/Jess/output_csv_test_")
              .append(new Timestamp(date.getTime())).append(".csv").toString();

//        Touch touch = new Touch();

        Touch touch1 = new Touch(99, 1, 2, 101614, 2, 8, "250114130119", 20, 6, 1, 3, 5, 5, 99, 99, 1, 5, 4, 99, 99, 99, 0, 99, 99, 99, 99, 99, 99, 99, 99, 99, "03_15_47", 1, 5, 6, 1, 104, 99, 22, "190815051809", 14, 14, 1, "11404130120", 1, 1, 2, "182119010118", 2, 2, 17, "81512130124", 10, 10, 11, "30818130903", 7, 7, 10, "100105200815", 6, 6, 8, "250114130119", 20, 6, 15, "180908011121", 25, 11, 1, "1520011109191900", 15, 1, 14, "91908252111", 24, 10, 9, "9040519012015", 21, 7, 2, "62111080904", 16, 2, 1, 0, 0, 0, 0, 0, 6, 11, "30818130903", 7, 7, 2, "62111080904", 16, 2, 2, "back", "11-10-22-1-2-17", "2-8-15-1-14-9", "11-10-L-1-2-17", "2-8-15-1-14-L", 1, 1, 1, 1, 1, 1, 1, 1, 1);

//            Touch touch2 = new Touch(2, "Sara", "Said", "F", 23);
//            Touch touch3 = new Touch(3, "Ali", "Hassan", "M", 24);
//            Touch touch4 = new Touch(4, "Sama", "Karim", "F", 20);

        //plyid need to add L to end of number
        //https://examples.javacodegeeks.com/core-java/writeread-csv-files-in-java-example/

        //Create a new list of Touch objects
        List<Touch> touches = new ArrayList<Touch>();
        touches.add(touch1);
//            touches.add(touch2);
//            touches.add(touch3);
//            touches.add(touch4);

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(outputFileName);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new touch object list to the CSV file
            for (Touch touch: touches) {
                fileWriter.append(String.valueOf(touch.getYearid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getMatchid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getTeam()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getTeamid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getPrgteamid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getPly()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch.getPlyid());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getPlyprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getPlyteamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getSk()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getSkty()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getSkgrd()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getSk_grd()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getCombo()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getTgt()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getStrzn()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getEndzn()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getEndzn2()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getTysk()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getPlys()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getSpecial()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getCustom()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getSo_ps()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getRec_def()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getUndefined1()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getX1()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getY1()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getX2()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getY2()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getX3()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getY3()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHh_mm_ss()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getGame()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHrot()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getArot()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getMovie()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getSec()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getUndefined2()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea1()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getHarea1id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea1prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea1teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea2()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getHarea2id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea2prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea2teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea3()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getHarea3id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea3prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea3teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea4()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getHarea4id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea4prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea4teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea5()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getHarea5id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea5prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea5teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea6()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getHarea6id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea6prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHarea6teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea1()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getAarea1id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea1prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea1teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea2()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getAarea2id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea2prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea2teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea3()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getAarea3id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea3prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea3teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea4()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getAarea4id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea4prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea4teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea5()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getAarea5id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea5prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea5teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea6()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getAarea6id());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea6prgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAarea6teamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getSkscore()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHpts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getApts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getPtsdiff()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHptsdiff()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAptsdiff()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getStrrot()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHset()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getHsetid());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHsetprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getHsetteamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAset()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getAsetid());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAsetprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getAsetteamprgid()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getPos()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getRow());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getHlineup());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getAlineup());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getH_Lineup_libero());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(touch1.getA_Lineup_libero());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.gethLibero()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getaLibero()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getLineup_Team_Prg_ID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getLineup_Prg_ID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getWonlost()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getPrg_Rally_Set_ID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getPrg_Rally_Match_ID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch1.getPrg_Rally_Data_ID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(touch.getPlay_In_Rally()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}
