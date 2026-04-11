package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

public class AMLRecord {

    private String account;
    private String txn;
    private double amount;
    private double risk;

    public AMLRecord(String account, String txn, double amount, double risk) {
        this.account = account;
        this.txn = txn;
        this.amount = amount;
        this.risk = risk;
    }

    public String getAccount() { return account; }
    public String getTxn() { return txn; }
    public double getAmount() { return amount; }
    public double getRisk() { return risk; }
}