package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

public class RemittanceRecord {

    private String sender;
    private String receiver;
    private double amount;
    private String status;

    public RemittanceRecord(String sender, String receiver, double amount, String status) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.status = status;
    }

    public String getSender() { return sender; }
    public String getReceiver() { return receiver; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
}