package com.ChrisIngram;

public class VehicleInfo {

  private int VIN;
  private double odometer;
  private double consumption;
  private double lastOilChange;
  private double engineSizeInL;


  public int getVIN() {
    return VIN;
  }

  public void setVIN(int VIN) {
    this.VIN = VIN;
  }

  public double getOdometer() {
    return odometer;
  }

  public void setOdometer(double odometer) {
    this.odometer = odometer;
  }

  public double getConsumption() {
    return consumption;
  }

  public void setConsumption(double consumption) {
    this.consumption = consumption;
  }

  public double getLastOilChange() {
    return lastOilChange;
  }

  public void setLastOilChange(double lastOilChange) {
    this.lastOilChange = lastOilChange;
  }

  public double getEngineSizeInL() {
    return engineSizeInL;
  }

  public void setEngineSizeInL(double engineSizeInL) {
    this.engineSizeInL = engineSizeInL;
  }
}
