package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;


public class BankDomainModels {

    // =========================
    // GOAL 1: Foreign Currency Transaction Control
    // =========================
    public static class ForeignCurrencyTransaction {
        public String sender;
        public String receiver;
        public double amount;
        public String purpose;
        public String status; // Pending / Approved / Rejected
    }

    // =========================
    // GOAL 2: Cross Border Trade Payment
    // =========================
    public static class TradePayment {
        public String lcNumber;
        public String invoiceNo;
        public String exporter;
        public String importer;
        public double amount;
        public String status;
    }

    // =========================
    // GOAL 3: FX Rate Stability
    // =========================
    public static class FXRateRecord {
        public String bank;
        public String currency;
        public double buyRate;
        public double sellRate;
        public String date;

        public double volatility;
        public double deviation;
    }

    // =========================
    // GOAL 4: AML Case
    // =========================
    public static class AMLCase {
        public String account;
        public String transactionId;
        public double amount;
        public String country;
        public String riskLevel;
    }

    // =========================
    // GOAL 5: AD Bank Supervision
    // =========================
    public static class ADBankReport {
        public String bankName;
        public String licenseNo;
        public double transactionVolume;
        public String reportSummary;
        public String complianceStatus;
    }

    // =========================
    // GOAL 6: FX Policy
    // =========================
    public static class FXPolicy {
        public String policyId;
        public String title;
        public String policyText;
        public String status; // Draft / Valid / Published / Archived
    }

    // =========================
    // GOAL 7: Remittance Flow
    // =========================
    public static class Remittance {
        public String sender;
        public String receiver;
        public double amount;
        public boolean verified;
        public String status;
    }

    // =========================
    // GOAL 8: FX Intelligence Reporting
    // =========================
    public static class FXReport {
        public String datasetType;
        public String period;
        public double avgRate;
        public String riskLevel;
        public String trend;
        public String reportText;
    }
}