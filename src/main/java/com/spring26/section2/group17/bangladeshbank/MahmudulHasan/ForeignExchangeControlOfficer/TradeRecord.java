package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

public class TradeRecord {

    private String lc;
    private String invoice;
    private String exporter;
    private String importer;
    private String status;

    public TradeRecord(String lc, String invoice, String exporter, String importer, String status) {
        this.lc = lc;
        this.invoice = invoice;
        this.exporter = exporter;
        this.importer = importer;
        this.status = status;
    }

    public String getLc() { return lc; }
    public String getInvoice() { return invoice; }
    public String getExporter() { return exporter; }
    public String getImporter() { return importer; }
    public String getStatus() { return status; }
}