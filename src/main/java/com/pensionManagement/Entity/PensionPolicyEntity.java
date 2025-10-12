package com.pensionManagement.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pension_policy")
public class PensionPolicyEntity {
	@Id
	@Column(nullable = false)
	private String pensionPolicyNumber;
	@Column(nullable = false)
	private String pensionPolicyName;
	@Column(nullable = false)
	private String customerNumber;
	// Policy Details
	private String policyType;
	private LocalDateTime policyStartDate;
	private LocalDateTime policyEndDate;
	private Integer policyTermYears;
	private BigDecimal premiumAmount;
	private String paymentFrequency;
	private String annuityPayoutOption;
	private Integer benefitAge;
	private String policyStatus;
	private String reason;
	private BigDecimal totalAmount;
	private BigDecimal monthlyInstallment;
	private int totalInstallments;
	private int totalInstallmentsPaid;
	private int totalInstallmentsUnPaid;
	private BigDecimal totalAmtPaidByInstallment;
	private BigDecimal totalAmtUnPaidByInstallment;
	// Audit
	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	// Benefits
	@OneToMany(mappedBy = "pensionPolicy", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PensionBenefitEntity> benefits;
	// Beneficiaries
	@OneToMany(mappedBy = "pensionPolicy", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<BeneficiaryEntity> beneficiaries;;

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public LocalDateTime getPolicyEndDate() {
		return policyEndDate;
	}

	public void setPolicyEndDate(LocalDateTime policyEndDate) {
		this.policyEndDate = policyEndDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getMonthlyInstallment() {
		return monthlyInstallment;
	}

	public void setMonthlyInstallment(BigDecimal monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}

	public int getTotalInstallments() {
		return totalInstallments;
	}

	public void setTotalInstallments(int totalInstallments) {
		this.totalInstallments = totalInstallments;
	}

	public int getTotalInstallmentsPaid() {
		return totalInstallmentsPaid;
	}

	public void setTotalInstallmentsPaid(int totalInstallmentsPaid) {
		this.totalInstallmentsPaid = totalInstallmentsPaid;
	}

	public int getTotalInstallmentsUnPaid() {
		return totalInstallmentsUnPaid;
	}

	public void setTotalInstallmentsUnPaid(int totalInstallmentsUnPaid) {
		this.totalInstallmentsUnPaid = totalInstallmentsUnPaid;
	}

	public BigDecimal getTotalAmtPaidByInstallment() {
		return totalAmtPaidByInstallment;
	}

	public void setTotalAmtPaidByInstallment(BigDecimal totalAmtPaidByInstallment) {
		this.totalAmtPaidByInstallment = totalAmtPaidByInstallment;
	}

	public BigDecimal getTotalAmtUnPaidByInstallment() {
		return totalAmtUnPaidByInstallment;
	}

	public void setTotalAmtUnPaidByInstallment(BigDecimal totalAmtUnPaidByInstallment) {
		this.totalAmtUnPaidByInstallment = totalAmtUnPaidByInstallment;
	}

	public List<BeneficiaryEntity> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<BeneficiaryEntity> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPensionPolicyNumber() {
		return pensionPolicyNumber;
	}

	public void setPensionPolicyNumber(String pensionPolicyNumber) {
		this.pensionPolicyNumber = pensionPolicyNumber;
	}

	public String getPensionPolicyName() {
		return pensionPolicyName;
	}

	public void setPensionPolicyName(String pensionPolicyName) {
		this.pensionPolicyName = pensionPolicyName;
	}

	public LocalDateTime getPolicyStartDate() {
		return policyStartDate;
	}

	public void setPolicyStartDate(LocalDateTime policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public Integer getPolicyTermYears() {
		return policyTermYears;
	}

	public void setPolicyTermYears(Integer policyTermYears) {
		this.policyTermYears = policyTermYears;
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

	public String getAnnuityPayoutOption() {
		return annuityPayoutOption;
	}

	public void setAnnuityPayoutOption(String annuityPayoutOption) {
		this.annuityPayoutOption = annuityPayoutOption;
	}

	public Integer getBenefitAge() {
		return benefitAge;
	}

	public void setBenefitAge(Integer benefitAge) {
		this.benefitAge = benefitAge;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
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

	public List<PensionBenefitEntity> getBenefits() {
		return benefits;
	}

	public void setBenefits(List<PensionBenefitEntity> benefits) {
		this.benefits = benefits;
	}

}
