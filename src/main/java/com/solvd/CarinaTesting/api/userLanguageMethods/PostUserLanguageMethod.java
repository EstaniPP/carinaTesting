package com.solvd.CarinaTesting.api.userLanguageMethods;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostUserLanguageMethod extends AbstractApiMethodV2{

	public PostUserLanguageMethod(){
		super("api/userLanguages/_post/rq.json",null,new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
		setHeaders("x-access-token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6InRlc3RtZWRpY2FsMzJAZ21haWwuY29tIiwiaWF0IjoxNTkyOTY1MTA4fQ.sVbImVN19Etvz5Q5X4_ZwIEMQz10oAVg0xdUyKZLgJw");
	}
}