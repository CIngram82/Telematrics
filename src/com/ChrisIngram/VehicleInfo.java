package com.ChrisIngram;

public class VehicleInfo {

  private int VIN;
  private double odometer;
  private double comsumption;
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

  public void setOdometer(int odometer) {
    this.odometer = odometer;
  }

  public double getComsumption() {
    return comsumption;
  }

  public void setComsumption(double comsumption) {
    this.comsumption = comsumption;
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
