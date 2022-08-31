/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 31-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class AutomaticDCT extends Transmission {
    private float firstGearRatio;
    private float secondGearRatio;
    private float thirdGearRatio;
    private float fourthGearRatio;
    private float fifthGearRatio;
    private float sixthGearRatio;
    private float seventhGearRatio;
    private float eightGearRatio;

    public AutomaticDCT(String transmissionType, String modelNumber, int forwardGears, float firstGearRatio, float secondGearRatio, float thirdGearRatio, float fourthGearRatio, float fifthGearRatio, float sixthGearRatio, float seventhGearRatio, float eightGearRatio) {
        super("Automatic-DCT", "DCT8", 8);
        this.firstGearRatio = 4.714f;
        this.secondGearRatio = 3.143f;
        this.thirdGearRatio = 2.106f;
        this.fourthGearRatio = 1.667f;
        this.fifthGearRatio = 1.285f;
        this.sixthGearRatio = 1.000f;
        this.seventhGearRatio = 0.839f;
        this.eightGearRatio = 0.667f;
    }

    public float getFirstGearRatio() {
        return firstGearRatio;
    }

    public void setFirstGearRatio(float firstGearRatio) {
        this.firstGearRatio = firstGearRatio;
    }

    public float getSecondGearRatio() {
        return secondGearRatio;
    }

    public void setSecondGearRatio(float secondGearRatio) {
        this.secondGearRatio = secondGearRatio;
    }

    public float getThirdGearRatio() {
        return thirdGearRatio;
    }

    public void setThirdGearRatio(float thirdGearRatio) {
        this.thirdGearRatio = thirdGearRatio;
    }

    public float getFourthGearRatio() {
        return fourthGearRatio;
    }

    public void setFourthGearRatio(float fourthGearRatio) {
        this.fourthGearRatio = fourthGearRatio;
    }

    public float getFifthGearRatio() {
        return fifthGearRatio;
    }

    public void setFifthGearRatio(float fifthGearRatio) {
        this.fifthGearRatio = fifthGearRatio;
    }

    public float getSixthGearRatio() {
        return sixthGearRatio;
    }

    public void setSixthGearRatio(float sixthGearRatio) {
        this.sixthGearRatio = sixthGearRatio;
    }

    public float getSeventhGearRatio() {
        return seventhGearRatio;
    }

    public void setSeventhGearRatio(float seventhGearRatio) {
        this.seventhGearRatio = seventhGearRatio;
    }

    public float getEightGearRatio() {
        return eightGearRatio;
    }

    public void setEightGearRatio(float eightGearRatio) {
        this.eightGearRatio = eightGearRatio;
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
