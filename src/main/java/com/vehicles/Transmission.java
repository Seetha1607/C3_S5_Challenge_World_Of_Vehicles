/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 30-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class Transmission {
    private String transmissionType;
    private String modelNumber;
    private int forwardGears;

    public Transmission() {
    }

    public Transmission(String transmissionType, String modelNumber, int forwardGears) {
        this.transmissionType = transmissionType;
        this.modelNumber = modelNumber;
        this.forwardGears = forwardGears;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
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

    public void showSpecs() {
    }
}