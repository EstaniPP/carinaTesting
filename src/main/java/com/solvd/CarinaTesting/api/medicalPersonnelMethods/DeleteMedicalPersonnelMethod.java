package com.solvd.CarinaTesting.api.medicalPersonnelMethods;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteMedicalPersonnelMethod extends AbstractApiMethodV2 {

	public DeleteMedicalPersonnelMethod(){
		super(null,null,new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
		setHeaders("x-access-token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjEwQGdtYWlsLmNvbSIsImlhdCI6MTU5MzQ1MjY2MH0.55s7ossjTNpV9xQYeDkO2WQNKnWa4TLiF3Gk-kQ8L98");
	}
}