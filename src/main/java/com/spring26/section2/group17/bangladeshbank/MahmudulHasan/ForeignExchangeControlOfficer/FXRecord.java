package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

public class FXRecord {

    private String bank;
    private String currency;
    private double buy;
    private double sell;
    private double volatility;

    public FXRecord(String bank, String currency, double buy, double sell, double volatility) {
        this.bank = bank;
        this.currency = currency;
        this.buy = buy;
        this.sell = sell;
        this.volatility = volatility;
    }

    public String getBank() { return bank; }
    public String getCurrency() { return currency; }
    public double getBuy() { return buy; }
    public double getSell() { return sell; }
    public double getVolatility() { return volatility; }
}