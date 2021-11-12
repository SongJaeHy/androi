package org.ict.busapi.VO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Example {

    @SerializedName("CardBusTimeNew")
    @Expose
    private CardBusTimeNew cardBusTimeNew;

    public CardBusTimeNew getCardBusTimeNew() {
        return cardBusTimeNew;
    }

    public void setCardBusTimeNew(CardBusTimeNew cardBusTimeNew) {
        this.cardBusTimeNew = cardBusTimeNew;
    }
}

