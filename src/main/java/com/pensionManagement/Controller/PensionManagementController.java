package com.pensionManagement.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generic.Modal.BankDetailsDTO;
import com.generic.Modal.CustomerDTO;
import com.generic.Modal.GroupedPolicyDTO;
import com.pensionManagement.CommonConstants.CommonConstant;
import com.pensionManagement.Service.IPensionService;
import com.pensionManagement.Service.ResponseEntity;

@RestController
@RequestMapping("/pensionServices")
public class PensionManagementController {
	
	@Autowired
	private IPensionService pensionSerice;
	
	@GetMapping("/customer-details")
	public ResponseEntity<List<CustomerDTO>> getCustomerlDetails(
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "customerNo", required = false) String customerNo,
			@RequestHeader(required = false) String userCode) {
		ResponseEntity<List<CustomerDTO>> emailResp = new ResponseEntity<>();

		List<CustomerDTO> customerDTO = pensionSerice.getCustomerDetails(email, customerNo, userCode);

		if (customerDTO != null && !customerDTO.isEmpty()) {
			emailResp.setData(customerDTO);
		} else {
			emailResp.setErrorMessage("Customer Details Not available ");
		}
		return emailResp;
	}
	
	@GetMapping("/pension-domain")
	public ResponseEntity<List<GroupedPolicyDTO>> getPolicyDomain(
			@RequestParam(value = "policyName", required = false) String policyName,
			@RequestParam(value = "productCode", required = false) String productCode,
			@RequestParam(value = "policyTAmount", required = false) String policyAmount,
			@RequestParam(value = "policyFrequency", required = false) String policyFrequency,
			@RequestParam(value = "policyInstallment", required = false) String policyInstallmentm,
			@RequestHeader(value = "useCode", required = false) String userCode) {
		ResponseEntity<List<GroupedPolicyDTO>> response = new ResponseEntity<>();
		List<GroupedPolicyDTO> policyDTO = pensionSerice.getDomainData(policyName,productCode,policyAmount,policyFrequency,policyInstallmentm, userCode);
		if (policyDTO != null && !policyDTO.isEmpty()) {
			response.setData(policyDTO);
			response.setStatus(CommonConstant.SUCCESS);
		} else {
			response.setErrorMessage("Error while fetching domin data ");
			response.setStatus(CommonConstant.FAILURE);
		}
		return response;
	}
	@GetMapping(value = "/bank-details")
	public ResponseEntity<Map<String, Object>> getBankDetails(
			@RequestParam(value = "bankId", required = false) String bankId,
			@RequestParam(value = "bankAccNo", required = false) String bankAccNo,
			@RequestParam(value = "policyNo", required = false) String policyNo,
			@RequestParam(value = "customerNo", required = false) String customerNo,
			@RequestParam(value = "holderName", required = false) String holderName,
			@RequestParam(value = "bankName", required = false) String bankName,
			@RequestParam(value = "accountType", required = false) String accountType,
			@RequestParam(value = "deletedFlag", required = false) String deletedFlag,
			@RequestParam(value = "status", required = false) String status, // e.g., "Active,Pending"
			@RequestParam(value = "createdDateFrom", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate createdDateFrom,
			@RequestParam(value = "createdDateTo", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate createdDateTo,
			@RequestParam(value = "search", required = false) String globalSearch, // For header search bar
			@RequestHeader(value = "userCode", required = false) String userCode,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "20") int size) {
		//ResponseEntity<Map<String, Object>> response = new ResponseEntity<>();
		ResponseEntity<Map<String, Object>> bankDetails = pensionSerice.getBankDetails(bankAccNo, policyNo, customerNo,
				holderName, bankName, accountType, status, createdDateFrom, createdDateTo, globalSearch, userCode,
				page,size,deletedFlag,bankId);
//		if (bankDetails != null && !bankDetails.isEmpty()) {
//			response.setData(bankDetails);
//			response.setStatus(CommonConstant.SUCCESS);
//		} else {
//			response.setErrorMessage("No Bank account found for Customer");
//			response.setStatus(CommonConstant.FAILURE);
//		}
		return bankDetails;
	}	
	
	
	
	@RequestMapping(value = "/count", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String getCount() {
		return "Hello world";
	}

	@RequestMapping(value = "/getPolicyDetails", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String getPolicyDetails() {
		return "Hello world";
	}

	@RequestMapping(value = "/getAllPolicies", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String getAllPolicies() {
		return "Hello world";
	}

	@RequestMapping(value = "/getContributiondetails", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String getContributiondetails() {
		return "Hello world";
	}

	@RequestMapping(value = "/updateContributiondetails", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String updateContributiondetails() {
		return "Hello world";
	}

	@RequestMapping(value = "/getFundInformation", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String getFundInformation() {
		return "Hello world";
	}

	@RequestMapping(value = "/updateFundInformation", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String updateFundInformation() {
		return "Hello world";
	}

	@RequestMapping(value = "/getNomineeDetails", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String getNomineeDetails() {
		return "Hello world";
	}

	@RequestMapping(value = "/updateNomineeDetails", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String updateNomineeDetails() {
		return "Hello world";
	}

	@RequestMapping(value = "/getBenefitsInformation", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String getBenefitsInformation() {
		return "Hello world";
	}

	@RequestMapping(value = "/updateBenefitsInformation", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String updateBenefitsInformation() {
		return "Hello world";
	}

	@RequestMapping(value = "/getPaymentHistory", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String getPaymentHistory() {
		return "Hello world";
	}

	@RequestMapping(value = "/makePayment", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String makePayment() {
		return "Hello world";
	}
}
