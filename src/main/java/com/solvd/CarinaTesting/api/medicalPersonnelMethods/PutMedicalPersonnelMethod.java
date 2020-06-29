package com.solvd.CarinaTesting.api.medicalPersonnelMethods;

import java.util.Properties;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PutMedicalPersonnelMethod extends AbstractApiMethodV2{

	public PutMedicalPersonnelMethod(){
		super("api/medicalPersonnel/_put/rq.json",null,new Properties());
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
		setHeaders("x-access-token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6InRlc3RtZWRpY2FsMzJAZ21haWwuY29tIiwiaWF0IjoxNTkzMDE1NjA1fQ.lRDIWcXw_WujnFq186Fta6_1CDxv_Ocb8qmjbGllUrk");
	}
}