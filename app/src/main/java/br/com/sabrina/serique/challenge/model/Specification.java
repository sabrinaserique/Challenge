
package br.com.sabrina.serique.challenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Specification {

    @SerializedName("fund_suitability_profile")
    @Expose
    private FundSuitabilityProfile fundSuitabilityProfile;
    @SerializedName("fund_risk_profile")
    @Expose
    private FundRiskProfile fundRiskProfile;
    @SerializedName("is_qualified")
    @Expose
    private Boolean isQualified;
    @SerializedName("fund_type")
    @Expose
    private String fundType;
    @SerializedName("fund_class")
    @Expose
    private String fundClass;
    @SerializedName("fund_macro_strategy")
    @Expose
    private FundMacroStrategy fundMacroStrategy;
    @SerializedName("fund_main_strategy")
    @Expose
    private FundMainStrategy fundMainStrategy;

    public FundSuitabilityProfile getFundSuitabilityProfile() {
        return fundSuitabilityProfile;
    }

    public void setFundSuitabilityProfile(FundSuitabilityProfile fundSuitabilityProfile) {
        this.fundSuitabilityProfile = fundSuitabilityProfile;
    }

    public FundRiskProfile getFundRiskProfile() {
        return fundRiskProfile;
    }

    public void setFundRiskProfile(FundRiskProfile fundRiskProfile) {
        this.fundRiskProfile = fundRiskProfile;
    }

    public Boolean getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(Boolean isQualified) {
        this.isQualified = isQualified;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getFundClass() {
        return fundClass;
    }

    public void setFundClass(String fundClass) {
        this.fundClass = fundClass;
    }

    public FundMacroStrategy getFundMacroStrategy() {
        return fundMacroStrategy;
    }

    public void setFundMacroStrategy(FundMacroStrategy fundMacroStrategy) {
        this.fundMacroStrategy = fundMacroStrategy;
    }

    public FundMainStrategy getFundMainStrategy() {
        return fundMainStrategy;
    }

    public void setFundMainStrategy(FundMainStrategy fundMainStrategy) {
        this.fundMainStrategy = fundMainStrategy;
    }

}
