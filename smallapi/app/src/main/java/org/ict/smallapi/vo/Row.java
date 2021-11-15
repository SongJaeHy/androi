package org.ict.smallapi.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row {

    @SerializedName("LBRRY_SEQ_NO")
    @Expose
    private String lbrrySeqNo;
    @SerializedName("LBRRY_NAME")
    @Expose
    private String lbrryName;
    @SerializedName("GU_CODE")
    @Expose
    private String guCode;
    @SerializedName("CODE_VALUE")
    @Expose
    private String codeValue;
    @SerializedName("ADRES")
    @Expose
    private String adres;
    @SerializedName("TEL_NO")
    @Expose
    private String telNo;
    @SerializedName("HMPG_URL")
    @Expose
    private String hmpgUrl;
    @SerializedName("OP_TIME")
    @Expose
    private String opTime;
    @SerializedName("FDRM_CLOSE_DATE")
    @Expose
    private String fdrmCloseDate;
    @SerializedName("LBRRY_SE_NAME")
    @Expose
    private String lbrrySeName;
    @SerializedName("XCNTS")
    @Expose
    private String xcnts;
    @SerializedName("YDNTS")
    @Expose
    private String ydnts;

    public String getLbrrySeqNo() {
        return lbrrySeqNo;
    }

    public void setLbrrySeqNo(String lbrrySeqNo) {
        this.lbrrySeqNo = lbrrySeqNo;
    }

    public String getLbrryName() {
        return lbrryName;
    }

    public void setLbrryName(String lbrryName) {
        this.lbrryName = lbrryName;
    }

    public String getGuCode() {
        return guCode;
    }

    public void setGuCode(String guCode) {
        this.guCode = guCode;
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getHmpgUrl() {
        return hmpgUrl;
    }

    public void setHmpgUrl(String hmpgUrl) {
        this.hmpgUrl = hmpgUrl;
    }

    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

    public String getFdrmCloseDate() {
        return fdrmCloseDate;
    }

    public void setFdrmCloseDate(String fdrmCloseDate) {
        this.fdrmCloseDate = fdrmCloseDate;
    }

    public String getLbrrySeName() {
        return lbrrySeName;
    }

    public void setLbrrySeName(String lbrrySeName) {
        this.lbrrySeName = lbrrySeName;
    }

    public String getXcnts() {
        return xcnts;
    }

    public void setXcnts(String xcnts) {
        this.xcnts = xcnts;
    }

    public String getYdnts() {
        return ydnts;
    }

    public void setYdnts(String ydnts) {
        this.ydnts = ydnts;
    }

}
