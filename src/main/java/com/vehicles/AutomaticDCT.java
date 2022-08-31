/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 31-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class AutomaticDCT extends Transmission {
    private final float firstGearRatio;
    private final float secondGearRatio;
    private final float thirdGearRatio;
    private final float fourthGearRatio;
    private final float fifthGearRatio;
    private final float sixthGearRatio;
    private final float seventhGearRatio;
    private final float eightGearRatio;

    public AutomaticDCT(String transmissionType, String modelNumber, int forwardGears, float firstGearRatio, float secondGearRatio, float thirdGearRatio, float fourthGearRatio, float fifthGearRatio, float sixthGearRatio, float seventhGearRatio, float eightGearRatio) {
        super(transmissionType, modelNumber, forwardGears);
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
        this.seventhGearRatio = seventhGearRatio;
        this.eightGearRatio = eightGearRatio;
    }

    public float getFirstGearRatio() {
        return firstGearRatio;
    }


    public float getSecondGearRatio() {
        return secondGearRatio;
    }


    public float getThirdGearRatio() {
        return thirdGearRatio;
    }


    public float getFourthGearRatio() {
        return fourthGearRatio;
    }


    public float getFifthGearRatio() {
        return fifthGearRatio;
    }


    public float getSixthGearRatio() {
        return sixthGearRatio;
    }


    public float getSeventhGearRatio() {
        return seventhGearRatio;
    }


    public float getEightGearRatio() {
        return eightGearRatio;
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
        System.out.println("7. 6th Gear Ratio : " + getSixthGearRatio());
        System.out.println("8. 7th Gear Ratio : " + getSeventhGearRatio());
        System.out.println("9. 8th Gear Ratio : " + getEightGearRatio());
    }
}
