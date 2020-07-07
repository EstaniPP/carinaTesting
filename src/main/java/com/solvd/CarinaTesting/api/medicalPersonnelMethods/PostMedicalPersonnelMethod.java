package com.solvd.CarinaTesting.api.medicalPersonnelMethods;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostMedicalPersonnelMethod extends AbstractApiMethodV2{
	
	public PostMedicalPersonnelMethod(){
		super("api/medicalPersonnel/_post/rq.json","api/medicalPersonnel/_post/rs.json","api/medicalPersonnel/medical_personnel.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}