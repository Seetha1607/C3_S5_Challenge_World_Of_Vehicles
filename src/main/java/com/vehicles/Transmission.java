/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 30-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class Transmission {
    private String modelNumber;
    private int forwardGears;
    private float firstGearRatio;
    private float secondGearRatio;
    private float thirdGearRatio;
    private float fourthGearRatio;
    private float fifthGearRatio;
    private float sixthGearRatio;
    private float seventhGearRatio;
    private float eightGearRatio;

    public Transmission() {
    }

    public Transmission(String modelNumber,
                        int forwardGears,
                        float firstGearRatio,
                        float secondGearRatio,
                        float thirdGearRatio,
                        float fourthGearRatio,
                        float fifthGearRatio,
                        float sixthGearRatio,
                        float seventhGearRatio,
                        float eightGearRatio) {
        this.modelNumber = modelNumber;
        this.forwardGears = forwardGears;
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
        this.seventhGearRatio = seventhGearRatio;
        this.eightGearRatio = eightGearRatio;
    }
}
