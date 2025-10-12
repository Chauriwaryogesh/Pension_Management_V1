package com.pensionManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PensionControllerUI {

	@RequestMapping("/PensionDashboardAdmin")
	public String getPensonDashboard(String userCode) {
		return "PensionManagementAdmin";
	}
	
	@RequestMapping("/CreatePensionPolicy")
	public String createPensionPolicyUi(String userCode) {
		return "CreatePensionPolicy";
	}

}
