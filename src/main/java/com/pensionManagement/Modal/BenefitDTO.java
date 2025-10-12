package com.pensionManagement.Modal;

import java.math.BigDecimal;

public class BenefitDTO {
	private String benefitCode; // Unique code for the benefit type (e.g., "Waiver_of_Premium")
    private String policyId;
    private String name;
    private String description;
    private BigDecimal sumAssured; // The value of the payout under this benefit
    private BigDecimal premiumCost; // The extra premium charged for this benefit (may be zero)
    private Boolean isActive;
	public String getBenefitCode() {
		return benefitCode;
	}
	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(BigDecimal sumAssured) {
		this.sumAssured = sumAssured;
	}
	public BigDecimal getPremiumCost() {
		return premiumCost;
	}
	public void setPremiumCost(BigDecimal premiumCost) {
		this.premiumCost = premiumCost;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}
