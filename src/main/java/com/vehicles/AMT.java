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
}