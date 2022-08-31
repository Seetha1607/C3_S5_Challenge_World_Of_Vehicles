/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 30-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class Transmission {
    private final String transmissionType;
    private final String modelNumber;
    private final int forwardGears;

    public Transmission(String transmissionType, String modelNumber, int forwardGears) {
        this.transmissionType = transmissionType;
        this.modelNumber = modelNumber;
        this.forwardGears = forwardGears;
    }

    public String getTransmissionType() {
        return transmissionType;
    }


    public String getModelNumber() {
        return modelNumber;
    }


    public int getForwardGears() {
        return forwardGears;
    }


    public void showSpecs() {
    }
}