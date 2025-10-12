package com.pensionManagement.Modal;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class FundInfoDTO {
	private String policyId;
    private BigDecimal totalFundValue;
    private String currentRiskProfile;
    private List<Map<String, Object>> allocations;
    private BigDecimal currentUnitValue;
	public List<Map<String, Object>> getAllocations() {
		return allocations;
	}
	public void setAllocations(List<Map<String, Object>> allocations) {
		this.allocations = allocations;
	}
	public BigDecimal getCurrentUnitValue() {
		return currentUnitValue;
	}
	public void setCurrentUnitValue(BigDecimal currentUnitValue) {
		this.currentUnitValue = currentUnitValue;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public BigDecimal getTotalFundValue() {
		return totalFundValue;
	}
	public void setTotalFundValue(BigDecimal totalFundValue) {
		this.totalFundValue = totalFundValue;
	}
	public String getCurrentRiskProfile() {
		return currentRiskProfile;
	}
	public void setCurrentRiskProfile(String currentRiskProfile) {
		this.currentRiskProfile = currentRiskProfile;
	}
}
