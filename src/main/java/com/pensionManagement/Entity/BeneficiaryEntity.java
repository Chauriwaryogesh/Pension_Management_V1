package com.pensionManagement.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "beneficiary")
@Data
public class BeneficiaryEntity {

    @Id
    private String  beneficiaryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pension_policy_id")
    private PensionPolicyEntity pensionPolicy;

    private String beneficiaryName;
    private String beneficiaryRelationship;
    private String beneficiaryIdentityNumber;
    private String beneficiaryStatus;
    private String beneficiaryContactNumber;

 // Audit
 	private String createdBy;
 	private LocalDateTime createdDate;
 	private String updatedBy;
 	private LocalDateTime updatedDate;
	
	public String getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public PensionPolicyEntity getPensionPolicy() {
		return pensionPolicy;
	}
	public void setPensionPolicy(PensionPolicyEntity pensionPolicy) {
		this.pensionPolicy = pensionPolicy;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getBeneficiaryRelationship() {
		return beneficiaryRelationship;
	}
	public void setBeneficiaryRelationship(String beneficiaryRelationship) {
		this.beneficiaryRelationship = beneficiaryRelationship;
	}
	public String getBeneficiaryIdentityNumber() {
		return beneficiaryIdentityNumber;
	}
	public void setBeneficiaryIdentityNumber(String beneficiaryIdentityNumber) {
		this.beneficiaryIdentityNumber = beneficiaryIdentityNumber;
	}
	public String getBeneficiaryStatus() {
		return beneficiaryStatus;
	}
	public void setBeneficiaryStatus(String beneficiaryStatus) {
		this.beneficiaryStatus = beneficiaryStatus;
	}
	public String getBeneficiaryContactNumber() {
		return beneficiaryContactNumber;
	}
	public void setBeneficiaryContactNumber(String beneficiaryContactNumber) {
		this.beneficiaryContactNumber = beneficiaryContactNumber;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
}

