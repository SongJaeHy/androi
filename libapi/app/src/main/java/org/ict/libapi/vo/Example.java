package org.ict.libapi.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Example {

    @SerializedName("SeoulLibraryScheduleInfo")
    @Expose
    private SeoulLibraryScheduleInfo seoulLibraryScheduleInfo;

    public SeoulLibraryScheduleInfo getSeoulLibraryScheduleInfo() {
        return seoulLibraryScheduleInfo;
    }

    public void setSeoulLibraryScheduleInfo(SeoulLibraryScheduleInfo seoulLibraryScheduleInfo) {
        this.seoulLibraryScheduleInfo = seoulLibraryScheduleInfo;
    }

}
