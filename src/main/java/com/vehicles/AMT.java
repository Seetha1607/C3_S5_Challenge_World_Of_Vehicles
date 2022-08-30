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

    public AMT(String modelNumber, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio) {
        super("AMTP4", 4);
        this.firstGearRatio = 2.540;
        this.secondGearRatio = 1.920;
        this.thirdGearRatio = 1.510;
        this.fourthGearRatio = 1.000;
    }

    public AMT(String modelNumber, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio, double fifthGearRatio) {
        super("AMTD5", 5);
        this.firstGearRatio = 2.950;
        this.secondGearRatio = 1.940;
        this.thirdGearRatio = 1.340;
        this.fourthGearRatio = 1.000;
        this.fifthGearRatio = 0.630;
    }
}
