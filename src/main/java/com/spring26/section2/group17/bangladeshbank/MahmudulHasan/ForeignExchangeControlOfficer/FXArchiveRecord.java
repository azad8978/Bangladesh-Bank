package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;



public class FXArchiveRecord {

    private String dataset;
    private String period;
    private double avgRate;
    private String risk;

    public FXArchiveRecord(String dataset, String period, double avgRate, String risk) {
        this.dataset = dataset;
        this.period = period;
        this.avgRate = avgRate;
        this.risk = risk;
    }

    public String getDataset() { return dataset; }
    public String getPeriod() { return period; }
    public double getAvgRate() { return avgRate; }
    public String getRisk() { return risk; }
}