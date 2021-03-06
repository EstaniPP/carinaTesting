package com.solvd.CarinaTesting.api.medicalPersonnelMethods;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteMedicalPersonnelMethod extends AbstractApiMethodV2 {

	public DeleteMedicalPersonnelMethod(){
		super(null,null,new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}