package com.pensionManagement.Service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.pensionManagement.CommonConstants.CommonConstant;
import com.pensionManagement.Modal.CustomerDTO;
import com.pensionManagement.Modal.GroupedPolicyDTO;
import com.pensionManagement.Util.ApiClient;

@Service
public class PensionServiceImpl implements IPensionService {

	@Autowired
	private ApiClient apiClient;

	@Autowired
	Environment environment;

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
		// Base URL from properties
		String baseUrl = environment.getProperty(CommonConstant.POLICY_DOMAIN_API);

		// Build dynamic URL with query parameters
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
				.queryParam("policyName", policyName).queryParam("productCode", productCode)
				.queryParam("policyTAmount", policyAmount).queryParam("policyFrequency", policyFrequency)
				.queryParam("policyInstallment", policyInstallmentm);

		String url = builder.toUriString();

		// Call API using generic ApiClient (no headers → null)
		ResponseEntity<List<GroupedPolicyDTO>> response = apiClient.callApi(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<ResponseEntity<List<GroupedPolicyDTO>>>() {
				}, null);

		if (response != null && "Success".equalsIgnoreCase(response.getStatus())) {
			return response.getData();
		}
		return Collections.emptyList();
	}

}
