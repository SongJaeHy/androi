package org.ict.libapi.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Row {

    @SerializedName("SCHDUL_ID")
    @Expose
    private String schdulId;
    @SerializedName("SCHDUL_TITLE")
    @Expose
    private String schdulTitle;
    @SerializedName("DATE_FROM")
    @Expose
    private String dateFrom;
    @SerializedName("DATE_TO")
    @Expose
    private String dateTo;
    @SerializedName("TIME_FROM")
    @Expose
    private String timeFrom;
    @SerializedName("TIME_TO")
    @Expose
    private String timeTo;
    @SerializedName("SCHDUL_TY")
    @Expose
    private String schdulTy;
    @SerializedName("SCHDUL_NM")
    @Expose
    private String schdulNm;
    @SerializedName("PERIOD")
    @Expose
    private String period;
    @SerializedName("PERIOD_NM")
    @Expose
    private String periodNm;
    @SerializedName("PERIOD_VALUE")
    @Expose
    private String periodValue;
    @SerializedName("SPNSER")
    @Expose
    private String spnser;
    @SerializedName("PLACE")
    @Expose
    private String place;
    @SerializedName("CITY")
    @Expose
    private String city;
    @SerializedName("REFER_URL")
    @Expose
    private String referUrl;
    @SerializedName("SCHDUL_CNTENT")
    @Expose
    private String schdulCntent;

    public String getSchdulId() {
        return schdulId;
    }

    public void setSchdulId(String schdulId) {
        this.schdulId = schdulId;
    }

    public String getSchdulTitle() {
        return schdulTitle;
    }

    public void setSchdulTitle(String schdulTitle) {
        this.schdulTitle = schdulTitle;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public String getSchdulTy() {
        return schdulTy;
    }

    public void setSchdulTy(String schdulTy) {
        this.schdulTy = schdulTy;
    }

    public String getSchdulNm() {
        return schdulNm;
    }

    public void setSchdulNm(String schdulNm) {
        this.schdulNm = schdulNm;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPeriodNm() {
        return periodNm;
    }

    public void setPeriodNm(String periodNm) {
        this.periodNm = periodNm;
    }

    public String getPeriodValue() {
        return periodValue;
    }

    public void setPeriodValue(String periodValue) {
        this.periodValue = periodValue;
    }

    public String getSpnser() {
        return spnser;
    }

    public void setSpnser(String spnser) {
        this.spnser = spnser;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReferUrl() {
        return referUrl;
    }

    public void setReferUrl(String referUrl) {
        this.referUrl = referUrl;
    }

    public String getSchdulCntent() {
        return schdulCntent;
    }

    public void setSchdulCntent(String schdulCntent) {
        this.schdulCntent = schdulCntent;
    }

}