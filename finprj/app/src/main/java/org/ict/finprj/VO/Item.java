package org.ict.finprj.VO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("bizesId")
    @Expose
    private String bizesId;
    @SerializedName("bizesNm")
    @Expose
    private String bizesNm;
    @SerializedName("brchNm")
    @Expose
    private String brchNm;
    @SerializedName("indsLclsCd")
    @Expose
    private String indsLclsCd;
    @SerializedName("indsLclsNm")
    @Expose
    private String indsLclsNm;
    @SerializedName("indsMclsCd")
    @Expose
    private String indsMclsCd;
    @SerializedName("indsMclsNm")
    @Expose
    private String indsMclsNm;
    @SerializedName("indsSclsCd")
    @Expose
    private String indsSclsCd;
    @SerializedName("indsSclsNm")
    @Expose
    private String indsSclsNm;
    @SerializedName("ksicCd")
    @Expose
    private String ksicCd;
    @SerializedName("ksicNm")
    @Expose
    private String ksicNm;
    @SerializedName("ctprvnCd")
    @Expose
    private String ctprvnCd;
    @SerializedName("ctprvnNm")
    @Expose
    private String ctprvnNm;
    @SerializedName("signguCd")
    @Expose
    private String signguCd;
    @SerializedName("signguNm")
    @Expose
    private String signguNm;
    @SerializedName("adongCd")
    @Expose
    private String adongCd;
    @SerializedName("adongNm")
    @Expose
    private String adongNm;
    @SerializedName("ldongCd")
    @Expose
    private String ldongCd;
    @SerializedName("ldongNm")
    @Expose
    private String ldongNm;
    @SerializedName("lnoCd")
    @Expose
    private String lnoCd;
    @SerializedName("plotSctCd")
    @Expose
    private String plotSctCd;
    @SerializedName("plotSctNm")
    @Expose
    private String plotSctNm;
    @SerializedName("lnoMnno")
    @Expose
    private Integer lnoMnno;
    @SerializedName("lnoSlno")
    @Expose
    private String lnoSlno;
    @SerializedName("lnoAdr")
    @Expose
    private String lnoAdr;
    @SerializedName("rdnmCd")
    @Expose
    private String rdnmCd;
    @SerializedName("rdnm")
    @Expose
    private String rdnm;
    @SerializedName("bldMnno")
    @Expose
    private Integer bldMnno;
    @SerializedName("bldSlno")
    @Expose
    private Integer bldSlno;
    @SerializedName("bldMngNo")
    @Expose
    private String bldMngNo;
    @SerializedName("bldNm")
    @Expose
    private String bldNm;
    @SerializedName("rdnmAdr")
    @Expose
    private String rdnmAdr;
    @SerializedName("oldZipcd")
    @Expose
    private String oldZipcd;
    @SerializedName("newZipcd")
    @Expose
    private String newZipcd;
    @SerializedName("dongNo")
    @Expose
    private String dongNo;
    @SerializedName("flrNo")
    @Expose
    private String flrNo;
    @SerializedName("hoNo")
    @Expose
    private String hoNo;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("lat")
    @Expose
    private Double lat;

    public String getBizesId() {
        return bizesId;
    }

    public void setBizesId(String bizesId) {
        this.bizesId = bizesId;
    }

    public String getBizesNm() {
        return bizesNm;
    }

    public void setBizesNm(String bizesNm) {
        this.bizesNm = bizesNm;
    }

    public String getBrchNm() {
        return brchNm;
    }

    public void setBrchNm(String brchNm) {
        this.brchNm = brchNm;
    }

    public String getIndsLclsCd() {
        return indsLclsCd;
    }

    public void setIndsLclsCd(String indsLclsCd) {
        this.indsLclsCd = indsLclsCd;
    }

    public String getIndsLclsNm() {
        return indsLclsNm;
    }

    public void setIndsLclsNm(String indsLclsNm) {
        this.indsLclsNm = indsLclsNm;
    }

    public String getIndsMclsCd() {
        return indsMclsCd;
    }

    public void setIndsMclsCd(String indsMclsCd) {
        this.indsMclsCd = indsMclsCd;
    }

    public String getIndsMclsNm() {
        return indsMclsNm;
    }

    public void setIndsMclsNm(String indsMclsNm) {
        this.indsMclsNm = indsMclsNm;
    }

    public String getIndsSclsCd() {
        return indsSclsCd;
    }

    public void setIndsSclsCd(String indsSclsCd) {
        this.indsSclsCd = indsSclsCd;
    }

    public String getIndsSclsNm() {
        return indsSclsNm;
    }

    public void setIndsSclsNm(String indsSclsNm) {
        this.indsSclsNm = indsSclsNm;
    }

    public String getKsicCd() {
        return ksicCd;
    }

    public void setKsicCd(String ksicCd) {
        this.ksicCd = ksicCd;
    }

    public String getKsicNm() {
        return ksicNm;
    }

    public void setKsicNm(String ksicNm) {
        this.ksicNm = ksicNm;
    }

    public String getCtprvnCd() {
        return ctprvnCd;
    }

    public void setCtprvnCd(String ctprvnCd) {
        this.ctprvnCd = ctprvnCd;
    }

    public String getCtprvnNm() {
        return ctprvnNm;
    }

    public void setCtprvnNm(String ctprvnNm) {
        this.ctprvnNm = ctprvnNm;
    }

    public String getSignguCd() {
        return signguCd;
    }

    public void setSignguCd(String signguCd) {
        this.signguCd = signguCd;
    }

    public String getSignguNm() {
        return signguNm;
    }

    public void setSignguNm(String signguNm) {
        this.signguNm = signguNm;
    }

    public String getAdongCd() {
        return adongCd;
    }

    public void setAdongCd(String adongCd) {
        this.adongCd = adongCd;
    }

    public String getAdongNm() {
        return adongNm;
    }

    public void setAdongNm(String adongNm) {
        this.adongNm = adongNm;
    }

    public String getLdongCd() {
        return ldongCd;
    }

    public void setLdongCd(String ldongCd) {
        this.ldongCd = ldongCd;
    }

    public String getLdongNm() {
        return ldongNm;
    }

    public void setLdongNm(String ldongNm) {
        this.ldongNm = ldongNm;
    }

    public String getLnoCd() {
        return lnoCd;
    }

    public void setLnoCd(String lnoCd) {
        this.lnoCd = lnoCd;
    }

    public String getPlotSctCd() {
        return plotSctCd;
    }

    public void setPlotSctCd(String plotSctCd) {
        this.plotSctCd = plotSctCd;
    }

    public String getPlotSctNm() {
        return plotSctNm;
    }

    public void setPlotSctNm(String plotSctNm) {
        this.plotSctNm = plotSctNm;
    }

    public Integer getLnoMnno() {
        return lnoMnno;
    }

    public void setLnoMnno(Integer lnoMnno) {
        this.lnoMnno = lnoMnno;
    }

    public String getLnoSlno() {
        return lnoSlno;
    }

    public void setLnoSlno(String lnoSlno) {
        this.lnoSlno = lnoSlno;
    }

    public String getLnoAdr() {
        return lnoAdr;
    }

    public void setLnoAdr(String lnoAdr) {
        this.lnoAdr = lnoAdr;
    }

    public String getRdnmCd() {
        return rdnmCd;
    }

    public void setRdnmCd(String rdnmCd) {
        this.rdnmCd = rdnmCd;
    }

    public String getRdnm() {
        return rdnm;
    }

    public void setRdnm(String rdnm) {
        this.rdnm = rdnm;
    }

    public Integer getBldMnno() {
        return bldMnno;
    }

    public void setBldMnno(Integer bldMnno) {
        this.bldMnno = bldMnno;
    }

    public Integer getBldSlno() {
        return bldSlno;
    }

    public void setBldSlno(Integer bldSlno) {
        this.bldSlno = bldSlno;
    }

    public String getBldMngNo() {
        return bldMngNo;
    }

    public void setBldMngNo(String bldMngNo) {
        this.bldMngNo = bldMngNo;
    }

    public String getBldNm() {
        return bldNm;
    }

    public void setBldNm(String bldNm) {
        this.bldNm = bldNm;
    }

    public String getRdnmAdr() {
        return rdnmAdr;
    }

    public void setRdnmAdr(String rdnmAdr) {
        this.rdnmAdr = rdnmAdr;
    }

    public String getOldZipcd() {
        return oldZipcd;
    }

    public void setOldZipcd(String oldZipcd) {
        this.oldZipcd = oldZipcd;
    }

    public String getNewZipcd() {
        return newZipcd;
    }

    public void setNewZipcd(String newZipcd) {
        this.newZipcd = newZipcd;
    }

    public String getDongNo() {
        return dongNo;
    }

    public void setDongNo(String dongNo) {
        this.dongNo = dongNo;
    }

    public String getFlrNo() {
        return flrNo;
    }

    public void setFlrNo(String flrNo) {
        this.flrNo = flrNo;
    }

    public String getHoNo() {
        return hoNo;
    }

    public void setHoNo(String hoNo) {
        this.hoNo = hoNo;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

}
