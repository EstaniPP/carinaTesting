package com.solvd.CarinaTesting.api.phoneNumbersMethods;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeletePhoneNumbersMethod extends AbstractApiMethodV2{

	public DeletePhoneNumbersMethod(){
		super(null,null,new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}