package org.ict.airapi.VO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row {

    @SerializedName("MSRDATE")
    @Expose
    private String msrdate;
    @SerializedName("MSRADMCODE")
    @Expose
    private String msradmcode;
    @SerializedName("MSRSTENAME")
    @Expose
    private String msrstename;
    @SerializedName("MAXINDEX")
    @Expose
    private String maxindex;
    @SerializedName("GRADE")
    @Expose
    private String grade;
    @SerializedName("POLLUTANT")
    @Expose
    private String pollutant;
    @SerializedName("NITROGEN")
    @Expose
    private String nitrogen;
    @SerializedName("OZONE")
    @Expose
    private String ozone;
    @SerializedName("CARBON")
    @Expose
    private String carbon;
    @SerializedName("SULFUROUS")
    @Expose
    private String sulfurous;
    @SerializedName("PM10")
    @Expose
    private String pm10;
    @SerializedName("PM25")
    @Expose
    private String pm25;

    public String getMsrdate() {
        return msrdate;
    }

    public void setMsrdate(String msrdate) {
        this.msrdate = msrdate;
    }

    public String getMsradmcode() {
        return msradmcode;
    }

    public void setMsradmcode(String msradmcode) {
        this.msradmcode = msradmcode;
    }

    public String getMsrstename() {
        return msrstename;
    }

    public void setMsrstename(String msrstename) {
        this.msrstename = msrstename;
    }

    public String getMaxindex() {
        return maxindex;
    }

    public void setMaxindex(String maxindex) {
        this.maxindex = maxindex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPollutant() {
        return pollutant;
    }

    public void setPollutant(String pollutant) {
        this.pollutant = pollutant;
    }

    public String getNitrogen() {
        return nitrogen;
    }

    public void setNitrogen(String nitrogen) {
        this.nitrogen = nitrogen;
    }

    public String getOzone() {
        return ozone;
    }

    public void setOzone(String ozone) {
        this.ozone = ozone;
    }

    public String getCarbon() {
        return carbon;
    }

    public void setCarbon(String carbon) {
        this.carbon = carbon;
    }

    public String getSulfurous() {
        return sulfurous;
    }

    public void setSulfurous(String sulfurous) {
        this.sulfurous = sulfurous;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

}
