package com.ChrisIngram;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TelematicsService {
  static void report(VehicleInfo vehicleInfo){
    System.out.println("Hey ben its all working!");
    File f = new File(vehicleInfo.getVIN()+ ".json");
    try {
      FileWriter fw = new FileWriter(f);
      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writeValueAsString(vehicleInfo);
      fw.write(json);
      fw.close();

      //Goal: build arrayList of
      // we will get out vehicle info from json files


      File file = new File(".");
      for (File currentFile : file.listFiles()) {
        if (currentFile.getName().endsWith(".json")) {
          Scanner fileScanner = new Scanner(currentFile);

          // get the json from the file
          String fileJson = getDataFromFile(currentFile);

          // convert to
          ObjectMapper om = new ObjectMapper();
          VehicleInfo vi = om.readValue(fileJson, VehicleInfo.class);



        }
      }

      // when we get here we should hav a populated arraylist of vehivlesInfos.

      // we can use this list to write to the HTML.

    } catch (IOException e) {
      e.printStackTrace();


    }

  }
  private static String getDataFromFile(File f){

  }

}

//    Once all the info for a VehicleInfo has been entered and a VehicleInfo object has been created the
//      report(vehicleInfo) method in the TelematicsService should be called. This method should:
//
//    Write the VehicleInfo to a file as json using the VIN as the name of the file and a "json" extension
//      (e.g. "234235435.json"). The file will overwrite any existing files for the same VIN.

//    Find all the files that end with ".json" and convert back to a VehicleInfo object.

//    Update a dashboard.html (only show 1 place after the decimal for values that are doubles).
//      The dashboard.html should look something like this (with the '#' replaced with a number)