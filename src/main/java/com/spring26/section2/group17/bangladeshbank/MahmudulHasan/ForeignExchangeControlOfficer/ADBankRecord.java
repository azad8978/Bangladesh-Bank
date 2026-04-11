package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

public class ADBankRecord {

    private String bank;
    private String license;
    private double volume;
    private String status;

    public ADBankRecord(String bank, String license, double volume, String status) {
        this.bank = bank;
        this.license = license;
        this.volume = volume;
        this.status = status;
    }

    public String getBank() { return bank; }
    public String getLicense() { return license; }
    public double getVolume() { return volume; }
    public String getStatus() { return status; }
}