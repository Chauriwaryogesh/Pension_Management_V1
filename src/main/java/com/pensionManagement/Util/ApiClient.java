package com.pensionManagement.Util;

import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.pensionManagement.Service.ResponseEntity;

@Component
public class ApiClient {

	private final RestTemplate restTemplate = new RestTemplate();

	public <T> T callApi(String url, HttpMethod method, Object requestBody, ParameterizedTypeReference<T> responseType,
			Map<String, String> headersMap) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		if (headersMap != null) {
			headersMap.forEach(headers::set);
		}

		HttpEntity<?> entity = (requestBody != null) ? new HttpEntity<>(requestBody, headers)
				: new HttpEntity<>(headers);

		org.springframework.http.ResponseEntity<T> response = restTemplate.exchange(url, method, entity, responseType);
		return response.getBody();
	}
}
