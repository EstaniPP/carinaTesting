package com.solvd.CarinaTesting.api.userLanguageMethods;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetUserLanguageMethod extends AbstractApiMethodV2{
	public GetUserLanguageMethod(){
		super(null,"api/userLanguages/_get/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}