package com.pensionManagement.Modal;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class CreatePolicyRequestDTO {
	private String clientId; // The unique ID of the customer
	private String planCode;
	private LocalDateTime startDate;
	private BigDecimal premiumAmount;
	private String paymentFrequency; // e.g., "Monthly", "Annually"
	private LocalDateTime maturityDate;
	private String payoutScheme;
	private String serviceAgentId;
	private Map<String, Integer> initialFundAllocation;
	private List<String> riderBenefitCodes;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
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

	public LocalDateTime getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDateTime maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getPayoutScheme() {
		return payoutScheme;
	}

	public void setPayoutScheme(String payoutScheme) {
		this.payoutScheme = payoutScheme;
	}

	public String getServiceAgentId() {
		return serviceAgentId;
	}

	public void setServiceAgentId(String serviceAgentId) {
		this.serviceAgentId = serviceAgentId;
	}

	public Map<String, Integer> getInitialFundAllocation() {
		return initialFundAllocation;
	}

	public void setInitialFundAllocation(Map<String, Integer> initialFundAllocation) {
		this.initialFundAllocation = initialFundAllocation;
	}

	public List<String> getRiderBenefitCodes() {
		return riderBenefitCodes;
	}

	public void setRiderBenefitCodes(List<String> riderBenefitCodes) {
		this.riderBenefitCodes = riderBenefitCodes;
	}
}
