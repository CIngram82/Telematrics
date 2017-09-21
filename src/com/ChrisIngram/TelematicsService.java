package com.ChrisIngram;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TelematicsService {
  static void report(VehicleInfo vehicleInfo){

    File f = new File(vehicleInfo.getVIN()+ ".json");

    try {
      FileWriter fw = new FileWriter(f);
      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writeValueAsString(vehicleInfo);
      fw.write(json);
      fw.close();

      ArrayList<VehicleInfo> vehicleInfos = new ArrayList<>();

      File file = new File(".");
      for (File currentFile : file.listFiles()) {
        if (currentFile.getName().endsWith(".json")) {

          String fileJson = getDataFromFile(currentFile);

          ObjectMapper om = new ObjectMapper();
          VehicleInfo vi = om.readValue(fileJson, VehicleInfo.class);
          vehicleInfos.add(vi);
        }
      }

      //TODO find a better home for all this.
      // Only lives here to show that I can make it work.
      double tempOdo = 0;
      double tempCons = 0;
      double tempOilChange = 0;
      double tempEngSiz = 0;
      for( int i = 0; i < vehicleInfos.size(); i++){
        tempOdo += vehicleInfos.get(i).getOdometer();
        tempCons += vehicleInfos.get(i).getConsumption();
        tempOilChange += vehicleInfos.get(i).getLastOilChange();
        tempEngSiz += vehicleInfos.get(i).getEngineSizeInL();

      }
      System.out.println("The total Odometer is :" + tempOdo);
      System.out.println("The average is :" + (tempOdo/vehicleInfos.size()));

      System.out.println("The total consumption is :" + tempCons);
      System.out.println("The average is :" + (tempCons/vehicleInfos.size()));

      System.out.println("The total lastOilChange is :" + tempOilChange);
      System.out.println("The average is :" + (tempOilChange/vehicleInfos.size()));

      System.out.println("The total engineSizeInL is :" + tempEngSiz);
      System.out.println("The average is :" + (tempEngSiz/vehicleInfos.size()));

      System.out.println("The average MPG is  :" + (tempCons/tempOdo));


      // when we get here we should hav a populated arraylist of vehivlesInfos.
      // we can use this list to write to the HTML.

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  private static String getDataFromFile(File f) throws FileNotFoundException {
    Scanner fileScanner = new Scanner(f);

    String results = "";
    String temp =fileScanner.nextLine();
    results += temp;
    // while fileScanner hasNext(),
    // add the next line from the file
    // to results

    return results;
  }

}


//    Update a dashboard.html (only show 1 place after the decimal for values that are doubles).
//      The dashboard.html should look something like this (with the '#' replaced with a number)