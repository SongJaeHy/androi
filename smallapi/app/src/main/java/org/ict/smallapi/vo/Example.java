package org.ict.smallapi.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Example {

    @SerializedName("SeoulSmallLibraryInfo")
    @Expose
    private SeoulSmallLibraryInfo seoulSmallLibraryInfo;

    public SeoulSmallLibraryInfo getSeoulSmallLibraryInfo() {
        return seoulSmallLibraryInfo;
    }

    public void setSeoulSmallLibraryInfo(SeoulSmallLibraryInfo seoulSmallLibraryInfo) {
        this.seoulSmallLibraryInfo = seoulSmallLibraryInfo;
    }

}