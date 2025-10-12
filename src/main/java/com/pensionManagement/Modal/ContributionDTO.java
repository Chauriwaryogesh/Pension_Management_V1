package com.pensionManagement.Modal;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ContributionDTO {
	private String policyId;
	private BigDecimal premiumAmount;
	private String paymentFrequency; // e.g., "Monthly", "Annually"
	private LocalDateTime nextDueDate;
	private String paymentMethod; // e.g., "Auto-Debit", "Direct Transfer"
	private Boolean isAutomatic;
	private Integer gracePeriodDays;

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public BigDecimal getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(BigDecimal premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(String paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public LocalDateTime getNextDueDate() {
		return nextDueDate;
	}

	public void setNextDueDate(LocalDateTime nextDueDate) {
		this.nextDueDate = nextDueDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Boolean getIsAutomatic() {
		return isAutomatic;
	}

	public void setIsAutomatic(Boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public Integer getGracePeriodDays() {
		return gracePeriodDays;
	}

	public void setGracePeriodDays(Integer gracePeriodDays) {
		this.gracePeriodDays = gracePeriodDays;
	}
}
