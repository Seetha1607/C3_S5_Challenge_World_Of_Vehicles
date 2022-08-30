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

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getForwardGears() {
        return forwardGears;
    }

    public void setForwardGears(int forwardGears) {
        this.forwardGears = forwardGears;
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
}
