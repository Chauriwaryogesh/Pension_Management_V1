package com.pensionManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pensionManagement.CommonConstants.CommonConstant;
import com.pensionManagement.Modal.CustomerDTO;
import com.pensionManagement.Modal.GroupedPolicyDTO;
import com.pensionManagement.Service.IPensionService;
import com.pensionManagement.Service.ResponseEntity;

@RestController
@RequestMapping("/PensionServices")
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
