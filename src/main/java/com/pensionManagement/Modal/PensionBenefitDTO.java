package com.pensionManagement.Modal;

import java.math.BigDecimal;

public class PensionBenefitDTO {
	private String benefitName;
    private String benefitDescription;
    private BigDecimal benefitAmount;
	public String getBenefitName() {
		return benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}
	public String getBenefitDescription() {
		return benefitDescription;
	}
	public void setBenefitDescription(String benefitDescription) {
		this.benefitDescription = benefitDescription;
	}
	public BigDecimal getBenefitAmount() {
		return benefitAmount;
	}
	public void setBenefitAmount(BigDecimal benefitAmount) {
		this.benefitAmount = benefitAmount;
	}
}
