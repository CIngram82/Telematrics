package com.ChrisIngram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        VehicleInfo vh = new VehicleInfo();

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter the VIN:");
        vh.setVIN(Integer.parseInt(inputScanner.nextLine()));

        System.out.println("Please enter the odometer:");
        vh.setOdometer(Double.parseDouble(inputScanner.nextLine()));

        System.out.println("Please enter the Gas used in gallons:");
        vh.setConsumption(Double.parseDouble(inputScanner.nextLine()));

        System.out.println("Please enter the odometer reading at the last Oil change:");
        vh.setLastOilChange(Double.parseDouble(inputScanner.nextLine()));

        System.out.println("Please enter the engine size in liters:");
        vh.setEngineSizeInL(Double.parseDouble(inputScanner.nextLine()));


        TelematicsService.report(vh);

    }
}
//    In the main() method of Main get the information for the VehicleInfo from the command line (i.e. Scanner).
//      Do not write code for error handling the input, just the green path (i.e. type in the correct stuff).
//
//