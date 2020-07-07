package com.solvd.CarinaTesting.api.userLanguageMethods;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostUserLanguageMethod extends AbstractApiMethodV2{

	public PostUserLanguageMethod(){
		super("api/userLanguages/_post/rq.json","api/userLanguages/_post/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
}