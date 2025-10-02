package com.pluralsight;

public class CellPhone {
    // Declared members
    private String model;
    private String carrier;
    private String owner;
    private String phoneNumber;
    private int serialNumber;

    // Parameterless constructor initializing members
    public CellPhone() {
        model = " ";
        carrier = " ";
        owner = " ";
        phoneNumber = " ";
        serialNumber = 0;
    }

    // Getters (accessors)
    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getOwner() {
        return owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    // Setters (mutators)
    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
