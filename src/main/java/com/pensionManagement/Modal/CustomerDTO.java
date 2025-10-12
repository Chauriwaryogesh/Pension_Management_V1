package com.pensionManagement.Modal;

import java.util.List;

public class CustomerDTO {

	private String name;
	private String middleName;
	private String surname;
	private String age;
	private String dateOfBirth;
	private String gender;
	private String phoneNumber;
	private String email;
	private String customerNo;
	private String userCode;
	private String smokerStatus;
	private String adminAccess;
	private Address address;
	private ContactDetails contactDetails;
	private List<String> roles;
	
	
	//
	private List<PolicyDTO> policy;
	private List<WorkItemDTO> workitems;
	private List<ComplaintDTO> complaint;
	private List<BankDetailsDTO> bank;
	private List<PaymentResponse> payments;
	
	
	
	

	public List<PolicyDTO> getPolicy() {
		return policy;
	}

	public void setPolicy(List<PolicyDTO> policy) {
		this.policy = policy;
	}

	public List<WorkItemDTO> getWorkitems() {
		return workitems;
	}

	public void setWorkitems(List<WorkItemDTO> workitems) {
		this.workitems = workitems;
	}

	public List<ComplaintDTO> getComplaint() {
		return complaint;
	}

	public void setComplaint(List<ComplaintDTO> complaint) {
		this.complaint = complaint;
	}

	public List<BankDetailsDTO> getBank() {
		return bank;
	}

	public void setBank(List<BankDetailsDTO> bank) {
		this.bank = bank;
	}

	public List<PaymentResponse> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentResponse> payments) {
		this.payments = payments;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getSmokerStatus() {
		return smokerStatus;
	}

	public void setSmokerStatus(String smokerStatus) {
		this.smokerStatus = smokerStatus;
	}

	public String getAdminAccess() {
		return adminAccess;
	}

	public void setAdminAccess(String adminAccess) {
		this.adminAccess = adminAccess;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

}
