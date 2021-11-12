package org.ict.subwayapi.VO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Example {

    @SerializedName("CardSubwayStatsNew")
    @Expose
    private CardSubwayStatsNew cardSubwayStatsNew;

    public CardSubwayStatsNew getCardSubwayStatsNew() {
        return cardSubwayStatsNew;
    }

    public void setCardSubwayStatsNew(CardSubwayStatsNew cardSubwayStatsNew) {
        this.cardSubwayStatsNew = cardSubwayStatsNew;
    }
}

