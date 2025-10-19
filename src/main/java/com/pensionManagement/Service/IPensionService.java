package com.pensionManagement.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.generic.Modal.BankDetailsDTO;
import com.generic.Modal.CustomerDTO;
import com.generic.Modal.GroupedPolicyDTO;



@Component
public interface IPensionService {

	List<CustomerDTO> getCustomerDetails(String email, String customerNo, String userCode);

	List<GroupedPolicyDTO> getDomainData(String policyName, String productCode, String policyAmount,
			String policyFrequency, String policyInstallmentm, String userCode);

	ResponseEntity<Map<String, Object>> getBankDetails(String bankAccNo, String policyNo, String customerNo, String holderName,
			String bankName, String accountType, String status, LocalDate createdDateFrom, LocalDate createdDateTo,
			String globalSearch, String userCode, int page, int size, String deletedFlag, String bankId);



}
