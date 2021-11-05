package org.ict.finprj.VO;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Header {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("columns")
    @Expose
    private List<String> columns = null;
    @SerializedName("stdrYm")
    @Expose
    private String stdrYm;
    @SerializedName("resultCode")
    @Expose
    private String resultCode;
    @SerializedName("resultMsg")
    @Expose
    private String resultMsg;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public String getStdrYm() {
        return stdrYm;
    }

    public void setStdrYm(String stdrYm) {
        this.stdrYm = stdrYm;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

}
