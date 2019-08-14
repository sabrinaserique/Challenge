
package br.com.sabrina.serique.challenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FundRiskProfile {

    @SerializedName("score_range_order")
    @Expose
    private Integer scoreRangeOrder;
    @SerializedName("name")
    @Expose
    private String name;

    public Integer getScoreRangeOrder() {
        return scoreRangeOrder;
    }

    public void setScoreRangeOrder(Integer scoreRangeOrder) {
        this.scoreRangeOrder = scoreRangeOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
