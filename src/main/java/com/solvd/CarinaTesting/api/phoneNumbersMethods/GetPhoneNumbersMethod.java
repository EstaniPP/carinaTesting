package com.solvd.CarinaTesting.api.phoneNumbersMethods;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetPhoneNumbersMethod extends AbstractApiMethodV2{

	public GetPhoneNumbersMethod(){
		super(null,"api/phoneNumbers/_get/rs.json",new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
		setHeaders("x-access-token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6InRlc3RtZWRpY2FsMzJAZ21haWwuY29tIiwiaWF0IjoxNTkyOTY1MTA4fQ.sVbImVN19Etvz5Q5X4_ZwIEMQz10oAVg0xdUyKZLgJw");
	}
}