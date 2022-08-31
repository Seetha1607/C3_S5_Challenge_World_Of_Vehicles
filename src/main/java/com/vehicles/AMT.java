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
        super(transmissionType, modelNumber, forwardGears);
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
    }

    public AMT(String transmissionType, String modelNumber, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio, double fifthGearRatio) {
        super(transmissionType, modelNumber, forwardGears);
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
        this.fifthGearRatio = fifthGearRatio;
    }

    public double getFirstGearRatio() {
        return firstGearRatio;
    }


    public double getSecondGearRatio() {
        return secondGearRatio;
    }


    public double getThirdGearRatio() {
        return thirdGearRatio;
    }


    public double getFourthGearRatio() {
        return fourthGearRatio;
    }


    public double getFifthGearRatio() {
        return fifthGearRatio;
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