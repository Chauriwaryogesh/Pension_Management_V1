package com.pensionManagement.Modal;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PensionPolicyRequestDTO {

    // ---------------- Customer Details ----------------
    private String customerNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String phoneNumber;
    private String address;
    private String aadharNumber;
    private String panNumber;
    private String drivingLicense;
    private String gender;
    private String smokerStatus;        // Optional, for insurance risk
    private String userCode; 

    // ---------------- Policy Details ----------------
    
    private String action;              // CREATE, UPDATE, DELETE
    private String policyName;
    private String policyType;          // Pension, Annuity etc.
    private LocalDateTime policyStartDate;
    private LocalDateTime policyEndDate;
    private Integer policyTermYears;
    private BigDecimal premiumAmount;
    private String paymentFrequency;    // Monthly, Quarterly, Yearly
    private String annuityPayoutOption;
    private Integer benefitAge;         // Pension start age

    private String policyStatus;        // Active, Lapsed, Matured
    private String reason;              // Reason for status change

    private BigDecimal totalAmount;         // Total policy amount
    private BigDecimal monthlyInstallment;
    private int totalInstallments;
    private int totalInstallmentsPaid;
    private int totalInstallmentsUnPaid;
    private BigDecimal totalAmtPaidByInstallment;
    private BigDecimal totalAmtUnPaidByInstallment;

    private String requestNumber;       // Optional, for tracking API requests
    private String requestStatus;       // Optional
    private String verifierReason;      // Optional

    // ---------------- Pension Benefits ----------------
    private List<PensionBenefitDTO> benefits;

    // ---------------- Beneficiary Details ----------------
    private List<BeneficiaryDTO> beneficiaries;

    // ---------------- Audit / Tracking ----------------
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getDrivingLicense() {
		return drivingLicense;
	}
	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSmokerStatus() {
		return smokerStatus;
	}
	public void setSmokerStatus(String smokerStatus) {
		this.smokerStatus = smokerStatus;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public LocalDateTime getPolicyStartDate() {
		return policyStartDate;
	}
	public void setPolicyStartDate(LocalDateTime policyStartDate) {
		this.policyStartDate = policyStartDate;
	}
	public LocalDateTime getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolicyEndDate(LocalDateTime policyEndDate) {
		this.policyEndDate = policyEndDate;
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
	public String getRequestNumber() {
		return requestNumber;
	}
	public void setRequestNumber(String requestNumber) {
		this.requestNumber = requestNumber;
	}
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public String getVerifierReason() {
		return verifierReason;
	}
	public void setVerifierReason(String verifierReason) {
		this.verifierReason = verifierReason;
	}
	public List<PensionBenefitDTO> getBenefits() {
		return benefits;
	}
	public void setBenefits(List<PensionBenefitDTO> benefits) {
		this.benefits = benefits;
	}
	public List<BeneficiaryDTO> getBeneficiaries() {
		return beneficiaries;
	}
	public void setBeneficiaries(List<BeneficiaryDTO> beneficiaries) {
		this.beneficiaries = beneficiaries;
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