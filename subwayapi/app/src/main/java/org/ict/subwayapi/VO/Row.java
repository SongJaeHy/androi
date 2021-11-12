package org.ict.subwayapi.VO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Row {

    @SerializedName("USE_DT")
    @Expose
    private String useDt;
    @SerializedName("LINE_NUM")
    @Expose
    private String lineNum;
    @SerializedName("SUB_STA_NM")
    @Expose
    private String subStaNm;
    @SerializedName("RIDE_PASGR_NUM")
    @Expose
    private Double ridePasgrNum;
    @SerializedName("ALIGHT_PASGR_NUM")
    @Expose
    private Double alightPasgrNum;
    @SerializedName("WORK_DT")
    @Expose
    private String workDt;

    public String getUseDt() {
        return useDt;
    }

    public void setUseDt(String useDt) {
        this.useDt = useDt;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getSubStaNm() {
        return subStaNm;
    }

    public void setSubStaNm(String subStaNm) {
        this.subStaNm = subStaNm;
    }

    public Double getRidePasgrNum() {
        return ridePasgrNum;
    }

    public void setRidePasgrNum(Double ridePasgrNum) {
        this.ridePasgrNum = ridePasgrNum;
    }

    public Double getAlightPasgrNum() {
        return alightPasgrNum;
    }

    public void setAlightPasgrNum(Double alightPasgrNum) {
        this.alightPasgrNum = alightPasgrNum;
    }

    public String getWorkDt() {
        return workDt;
    }

    public void setWorkDt(String workDt) {
        this.workDt = workDt;
    }

}
