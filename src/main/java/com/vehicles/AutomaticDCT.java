/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 31-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class AutomaticDCT extends Transmission {
    private double firstGearRatio;
    private double secondGearRatio;
    private double thirdGearRatio;
    private double fourthGearRatio;
    private double fifthGearRatio;
    private double sixthGearRatio;
    private double seventhGearRatio;
    private double eightGearRatio;

    public AutomaticDCT(String transmissionType, String modelNumber, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio, double fifthGearRatio, double sixthGearRatio, double seventhGearRatio, double eightGearRatio) {
        super("Automatic-DCT", "DCT8", 8);
        this.firstGearRatio = 4.714;
        this.secondGearRatio = 3.143;
        this.thirdGearRatio = 2.106;
        this.fourthGearRatio = 1.667;
        this.fifthGearRatio = 1.285;
        this.sixthGearRatio = 1.000;
        this.seventhGearRatio = 0.839;
        this.eightGearRatio = 0.667;
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

    public double getSixthGearRatio() {
        return sixthGearRatio;
    }

    public void setSixthGearRatio(double sixthGearRatio) {
        this.sixthGearRatio = sixthGearRatio;
    }

    public double getSeventhGearRatio() {
        return seventhGearRatio;
    }

    public void setSeventhGearRatio(double seventhGearRatio) {
        this.seventhGearRatio = seventhGearRatio;
    }

    public double getEightGearRatio() {
        return eightGearRatio;
    }

    public void setEightGearRatio(double eightGearRatio) {
        this.eightGearRatio = eightGearRatio;
    }
}
