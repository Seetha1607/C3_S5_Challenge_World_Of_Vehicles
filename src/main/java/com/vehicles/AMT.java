/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 30-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class AMT extends Transmission {
    double firstGearRatio;
    double secondGearRatio;
    double thirdGearRatio;
    double fourthGearRatio;
    double fifthGearRatio;


    public AMT(String transmissionType, String modelNumber, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio) {
        super("AMT", "AMTP4", 4);
        this.firstGearRatio = 2.540;
        this.secondGearRatio = 1.920;
        this.thirdGearRatio = 1.510;
        this.fourthGearRatio = 1.000;
    }

    public AMT(String transmissionType, String modelNumber, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio, double fifthGearRatio) {
        super("AMT", "AMTD5", 5);
        this.firstGearRatio = 2.950;
        this.secondGearRatio = 1.940;
        this.thirdGearRatio = 1.340;
        this.fourthGearRatio = 1.000;
        this.fifthGearRatio = 0.630;
    }

    public double getFirstGearRatio() {
        return firstGearRatio;
    }

    public void setFirstGearRatio(double firstGearRatio) {
        this.firstGearRatio = firstGearRatio;
    }

    public double getSecondGearRatio() {
        return secondGearRatio;
    }

    public void setSecondGearRatio(double secondGearRatio) {
        this.secondGearRatio = secondGearRatio;
    }

    public double getThirdGearRatio() {
        return thirdGearRatio;
    }

    public void setThirdGearRatio(double thirdGearRatio) {
        this.thirdGearRatio = thirdGearRatio;
    }

    public double getFourthGearRatio() {
        return fourthGearRatio;
    }

    public void setFourthGearRatio(double fourthGearRatio) {
        this.fourthGearRatio = fourthGearRatio;
    }

    public double getFifthGearRatio() {
        return fifthGearRatio;
    }

    public void setFifthGearRatio(double fifthGearRatio) {
        this.fifthGearRatio = fifthGearRatio;
    }

    public void showSpecs() {
        System.out.println("Transmission Type: " + getTransmissionType());
        System.out.println("Transmission Model Number : " + getModelNumber());
        System.out.println();
        System.out.println("Key Specifications");
        System.out.println("1. Forward Gears : " + getForwardGears());
        System.out.println("2. 1st Gear Ratio : " + getFirstGearRatio());
        System.out.println("3. 2nd Gear Ratio : " + getSecondGearRatio());
        System.out.println("4. 3rd Gear Ratio : " + getThirdGearRatio());
        System.out.println("5. 4th Gear Ratio : " + getFourthGearRatio());
        System.out.println("6. 5th Gear Ratio : " + getFifthGearRatio());
    }
}