package com.pensionManagement.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.pensionManagement.Modal.CustomerDTO;
import com.pensionManagement.Modal.GroupedPolicyDTO;

@Component
public interface IPensionService {

	List<CustomerDTO> getCustomerDetails(String email, String customerNo, String userCode);

	List<GroupedPolicyDTO> getDomainData(String policyName, String productCode, String policyAmount,
			String policyFrequency, String policyInstallmentm, String userCode);



}
