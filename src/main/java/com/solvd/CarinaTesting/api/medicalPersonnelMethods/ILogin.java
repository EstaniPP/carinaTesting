package com.solvd.CarinaTesting.api.medicalPersonnelMethods;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

import io.restassured.path.json.JsonPath;

public interface ILogin {

	public default String getToken() {
		
		PostSignInMedicalPersonnel postSignInMethod = new PostSignInMedicalPersonnel();
		postSignInMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rsSignIn = postSignInMethod.callAPI().asString();
        postSignInMethod.validateResponse();
      
        return JsonPath.from(rsSignIn).getString("token");
	}
}
