package com.solvd.CarinaTesting.api.medicalPersonnelMethods;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostSignInMedicalPersonnel extends AbstractApiMethodV2{
	
	public PostSignInMedicalPersonnel() {
		super("api/medicalPersonnel/_signin/rq.json","api/medicalPersonnel/_signin/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}