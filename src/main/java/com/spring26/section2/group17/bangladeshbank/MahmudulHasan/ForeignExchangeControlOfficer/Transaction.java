package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

public class Transaction {

    private String sender;
    private String receiver;
    private double amount;
    private String purpose;
    private String status;

    public Transaction(String sender, String receiver, double amount, String purpose, String status) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.purpose = purpose;
        this.status = status;
    }

    public String getSender() { return sender; }
    public String getReceiver() { return receiver; }
    public double getAmount() { return amount; }
    public String getPurpose() { return purpose; }
    public String getStatus() { return status; }
}

