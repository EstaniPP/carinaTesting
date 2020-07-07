package com.solvd.CarinaTesting.api.medicalPersonnelMethods;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import java.util.Properties;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetMedicalPersonnelMethod extends AbstractApiMethodV2{

	public GetMedicalPersonnelMethod(){
		super(null,"api/medicalPersonnel/_get/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}