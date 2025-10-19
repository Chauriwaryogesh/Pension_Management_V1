package com.pensionManagement.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.generic.Modal.CustomerDTO;
import com.generic.Modal.GroupedPolicyDTO;
import com.pensionManagement.CommonConstants.CommonConstant;
import com.pensionManagement.Util.ApiClient;

@Service
public class PensionServiceImpl implements IPensionService {

	@Autowired
	private ApiClient apiClient;

	@Autowired
	Environment environment;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public List<CustomerDTO> getCustomerDetails(String email, String customerNo, String userCode) {
		String url = "http://localhost:8081/Security/customer-details?customerNo=" + customerNo;
		ResponseEntity<List<CustomerDTO>> response = apiClient.callApi(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<ResponseEntity<List<CustomerDTO>>>() {
				}, null);
		if (response != null && "Success".equalsIgnoreCase(response.getStatus())) {
			return response.getData();
		}
		return Collections.emptyList();
	}

	@Override
	public List<GroupedPolicyDTO> getDomainData(String policyName, String productCode, String policyAmount,
			String policyFrequency, String policyInstallmentm, String userCode) {
		String baseUrl = environment.getProperty(CommonConstant.POLICY_DOMAIN_API);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl).queryParam("policyName", policyName)
				.queryParam("productCode", productCode).queryParam("policyTAmount", policyAmount)
				.queryParam("policyFrequency", policyFrequency).queryParam("policyInstallment", policyInstallmentm);
		String url = builder.toUriString();
		ResponseEntity<List<GroupedPolicyDTO>> response = apiClient.callApi(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<ResponseEntity<List<GroupedPolicyDTO>>>() {
				}, null);
		if (response != null && "Success".equalsIgnoreCase(response.getStatus())) {
			return response.getData();
		}
		return Collections.emptyList();
	}

	@Override
	public ResponseEntity<Map<String, Object>> getBankDetails(String bankAccNo, String policyNo, String customerNo,
			String holderName, String bankName, String accountType, String status, LocalDate createdDateFrom,
			LocalDate createdDateTo, String globalSearch, String userCode, int page, int size, String deletedFlag,
			String bankId) {

		String baseUrl = environment.getProperty("bank.search.api"); // your property key

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl).queryParam("bankId", bankId)
				.queryParam("bankAccNo", bankAccNo).queryParam("policyNo", policyNo)
				.queryParam("customerNo", customerNo).queryParam("holderName", holderName)
				.queryParam("bankName", bankName).queryParam("accountType", accountType)
				.queryParam("deletedFlag", deletedFlag).queryParam("status", status)
				.queryParam("createdDateFrom", createdDateFrom).queryParam("createdDateTo", createdDateTo)
				.queryParam("search", globalSearch).queryParam("page", page).queryParam("size", size);

		String url = builder.toUriString();
		Map<String, Object> response = restTemplate.getForObject(url, Map.class);
		@SuppressWarnings("unchecked")
		Map<String, Object> dataMap = (Map<String, Object>) response.get("data");
		ResponseEntity<Map<String, Object>> customResponse = new ResponseEntity<>();
		customResponse.setData(dataMap);
		customResponse.setStatus((String) response.get("status"));
		customResponse.setErrorMessage((String) response.get("errorMessage"));

		return customResponse;
	}

}
