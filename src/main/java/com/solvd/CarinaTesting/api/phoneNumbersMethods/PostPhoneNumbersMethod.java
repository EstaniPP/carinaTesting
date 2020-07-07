package com.solvd.CarinaTesting.api.phoneNumbersMethods;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostPhoneNumbersMethod extends AbstractApiMethodV2{

	public PostPhoneNumbersMethod(){
		super("api/phoneNumbers/_post/rq.json","api/phoneNumbers/_post/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}