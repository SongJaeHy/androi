package org.ict.finaprj.VO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Item {

    @SerializedName("numEf")
    @Expose
    private Integer numEf;
    @SerializedName("regId")
    @Expose
    private String regId;
    @SerializedName("rnYn")
    @Expose
    private Integer rnYn;
    @SerializedName("tmFc")
    @Expose
    private Long tmFc;
    @SerializedName("wd1")
    @Expose
    private String wd1;
    @SerializedName("wd2")
    @Expose
    private String wd2;
    @SerializedName("wdTnd")
    @Expose
    private String wdTnd;
    @SerializedName("wf")
    @Expose
    private String wf;
    @SerializedName("wfCd")
    @Expose
    private String wfCd;
    @SerializedName("wh1")
    @Expose
    private Double wh1;
    @SerializedName("wh2")
    @Expose
    private Double wh2;
    @SerializedName("ws1")
    @Expose
    private Integer ws1;
    @SerializedName("ws2")
    @Expose
    private Integer ws2;

    public Integer getNumEf() {
        return numEf;
    }

    public void setNumEf(Integer numEf) {
        this.numEf = numEf;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public Integer getRnYn() {
        return rnYn;
    }

    public void setRnYn(Integer rnYn) {
        this.rnYn = rnYn;
    }

    public Long getTmFc() {
        return tmFc;
    }

    public void setTmFc(Long tmFc) {
        this.tmFc = tmFc;
    }

    public String getWd1() {
        return wd1;
    }

    public void setWd1(String wd1) {
        this.wd1 = wd1;
    }

    public String getWd2() {
        return wd2;
    }

    public void setWd2(String wd2) {
        this.wd2 = wd2;
    }

    public String getWdTnd() {
        return wdTnd;
    }

    public void setWdTnd(String wdTnd) {
        this.wdTnd = wdTnd;
    }

    public String getWf() {
        return wf;
    }

    public void setWf(String wf) {
        this.wf = wf;
    }

    public String getWfCd() {
        return wfCd;
    }

    public void setWfCd(String wfCd) {
        this.wfCd = wfCd;
    }

    public Double getWh1() {
        return wh1;
    }

    public void setWh1(Double wh1) {
        this.wh1 = wh1;
    }

    public Double getWh2() {
        return wh2;
    }

    public void setWh2(Double wh2) {
        this.wh2 = wh2;
    }

    public Integer getWs1() {
        return ws1;
    }

    public void setWs1(Integer ws1) {
        this.ws1 = ws1;
    }

    public Integer getWs2() {
        return ws2;
    }

    public void setWs2(Integer ws2) {
        this.ws2 = ws2;
    }
}
