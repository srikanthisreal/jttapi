package com.stech.jttapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author srikanth
 *
 */
@RestController
@RequestMapping(value = "/api/v1/domains/jttapi/", produces = MediaType.APPLICATION_JSON_VALUE)
public class AgreementController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AgreementController.class);
	
	/**
	 * 
	 * @param agreementId
	 * @return
	 */
	@GetMapping("/{ag_id}/agreement")
	public Agreement getAgreement(@PathVariable("ag_id") String agreementId) {
		LOGGER.trace("ENTRY: getAgreement {}, {}", agreementId);
		Agreement agreement = new Agreement();
		agreement.setAgId(001);
		agreement.setLicensee("test");
		agreement.setLicensor("test");
		LOGGER.trace("EXIT: getAgreement {}", agreement);
		return agreement;

	}
}
