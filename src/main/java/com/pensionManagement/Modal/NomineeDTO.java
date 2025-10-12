package com.pensionManagement.Modal;

import java.time.LocalDateTime;

public class NomineeDTO {
	private String nomineeId; // Unique ID for the nominee record
    private String policyId;
    private String fullName;
    private String relationship;
    private LocalDateTime dateOfBirth;
    private Integer allocationPercentage; // Must sum to 100% across all nominees
    private String contactEmail;
    private Boolean isMinor;
	public String getNomineeId() {
		return nomineeId;
	}
	public void setNomineeId(String nomineeId) {
		this.nomineeId = nomineeId;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getAllocationPercentage() {
		return allocationPercentage;
	}
	public void setAllocationPercentage(Integer allocationPercentage) {
		this.allocationPercentage = allocationPercentage;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Boolean getIsMinor() {
		return isMinor;
	}
	public void setIsMinor(Boolean isMinor) {
		this.isMinor = isMinor;
	}
}
