package com.ChrisIngram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        // It's gonna do some input stuff.
        // Make new Vehicleinfo object
        // for each field use scanner to read in values, populate.
        VehicleInfo vh = new VehicleInfo();
        vh.setVIN(12345);

        TelematicsService.report(vh);

    }
}
//    In the main() method of Main get the information for the VehicleInfo from the command line (i.e. Scanner).
//      Do not write code for error handling the input, just the green path (i.e. type in the correct stuff).
//
//