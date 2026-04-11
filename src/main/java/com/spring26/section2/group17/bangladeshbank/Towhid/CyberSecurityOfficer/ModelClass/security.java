package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer.ModelClass;

public class security {
    private String parameter;
    private String value;
    private String status;

    public String getParameter() {
        return parameter;
    }

    public String getValue() {
        return value;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "security{" +
                "parameter='" + parameter + '\'' +
                ", value='" + value + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
