package com.ChrisIngram;

public class VehicleInfo {

  private int VIN;
  private int odometer;
  private double comsumption;
  private double lastOilChange;
  private double engineSizeInL;

  public VehicleInfo(int VIN,
                     int odometer,
                     double comsumption,
                     double lastOilChange,
                     double engineSizeInL) {
    this.VIN = VIN;
    this.odometer = odometer;
    this.comsumption = comsumption;
    this.lastOilChange = lastOilChange;
    this.engineSizeInL = engineSizeInL;
  }

  public int getVIN() {
    return VIN;
  }

  public void setVIN(int VIN) {
    this.VIN = VIN;
  }

  public int getOdometer() {
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
