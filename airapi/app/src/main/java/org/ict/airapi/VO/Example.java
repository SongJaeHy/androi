package org.ict.airapi.VO;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Example {

    @SerializedName("ListAirQualityByDistrictService")
    @Expose
    private ListAirQualityByDistrictService listAirQualityByDistrictService;

    public ListAirQualityByDistrictService getListAirQualityByDistrictService() {
        return listAirQualityByDistrictService;
    }

    public void setListAirQualityByDistrictService(ListAirQualityByDistrictService listAirQualityByDistrictService) {
        this.listAirQualityByDistrictService = listAirQualityByDistrictService;
    }
}