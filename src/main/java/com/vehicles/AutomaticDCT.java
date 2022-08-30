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
}
