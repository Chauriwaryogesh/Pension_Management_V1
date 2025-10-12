package com.pensionManagement.Entity;


import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pension_benefit")
public class PensionBenefitEntity {

    @Id
    private String benefitId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pensionPolicyNumber", nullable = false)
    private PensionPolicyEntity pensionPolicy;

    @Column(nullable = false)
    private String benefitName;

    private String benefitDescription;
    private BigDecimal benefitAmount;

    private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	
	public String getBenefitId() {
		return benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public PensionPolicyEntity getPensionPolicy() {
		return pensionPolicy;
	}
	public void setPensionPolicy(PensionPolicyEntity pensionPolicy) {
		this.pensionPolicy = pensionPolicy;
	}
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

