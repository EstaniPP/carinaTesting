package com.solvd.CarinaTesting;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.CarinaTesting.api.medicalPersonnelMethods.DeleteMedicalPersonnelMethod;
import com.solvd.CarinaTesting.api.medicalPersonnelMethods.GetMedicalPersonnelMethod;
import com.solvd.CarinaTesting.api.medicalPersonnelMethods.PostMedicalPersonnelMethod;
import com.solvd.CarinaTesting.api.medicalPersonnelMethods.PostSignInMedicalPersonnel;
import com.solvd.CarinaTesting.api.medicalPersonnelMethods.PutMedicalPersonnelMethod;
import com.solvd.CarinaTesting.api.phoneNumbersMethods.DeletePhoneNumbersMethod;
import com.solvd.CarinaTesting.api.phoneNumbersMethods.GetPhoneNumbersMethod;
import com.solvd.CarinaTesting.api.phoneNumbersMethods.PostPhoneNumbersMethod;
import com.solvd.CarinaTesting.api.phoneNumbersMethods.PutPhoneNumbersMethod;
import com.solvd.CarinaTesting.api.userLanguageMethods.GetUserLanguageMethod;
import com.solvd.CarinaTesting.api.userLanguageMethods.PostUserLanguageMethod;

import io.restassured.path.json.JsonPath;

public class ApiTest{
	@Test(description = "Test GET Medical Personnel")
    @MethodOwner(owner = "Estani")
    public void testGetMedicalPersonnel() {

        PostMedicalPersonnelMethod postDeviceUserMethod = new PostMedicalPersonnelMethod();
        postDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rsSignIn = postDeviceUserMethod.callAPI().asString();
        postDeviceUserMethod.validateResponse();
	
		String token = JsonPath.from(rsSignIn).getString("token");
        
		GetMedicalPersonnelMethod getDeviceUserMethod = new GetMedicalPersonnelMethod();
		getDeviceUserMethod.setHeaders("x-access-token="+token);
        getDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getDeviceUserMethod.callAPI();
        getDeviceUserMethod.validateResponse();
        
        PutMedicalPersonnelMethod putDeviceUserMethod = new PutMedicalPersonnelMethod();
        putDeviceUserMethod.setHeaders("x-access-token="+token);
        putDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        putDeviceUserMethod.callAPI();

		DeleteMedicalPersonnelMethod deleteDeviceUserMethod = new DeleteMedicalPersonnelMethod();
		deleteDeviceUserMethod.setHeaders("x-access-token="+token);
        deleteDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deleteDeviceUserMethod.callAPI();
    
    }
	
	@Test(description = "Test Phone Number")
    @MethodOwner(owner = "Estani")
    public void testGetPhoneNumber() {
		
		PostSignInMedicalPersonnel postSignInMethod = new PostSignInMedicalPersonnel();
		postSignInMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rsSignIn = postSignInMethod.callAPI().asString();
        postSignInMethod.validateResponse();
	
		String token = JsonPath.from(rsSignIn).getString("token");

		PostPhoneNumbersMethod postPhoneNumbersMethod = new PostPhoneNumbersMethod();
		postPhoneNumbersMethod.setHeaders("x-access-token="+token);
		postPhoneNumbersMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String phoneNumberRs = postPhoneNumbersMethod.callAPI().asString();
		String phoneNumberId = JsonPath.from(phoneNumberRs).getString("insertId");
        
		GetPhoneNumbersMethod getPhoneNumbersMethod = new GetPhoneNumbersMethod();
		postPhoneNumbersMethod.setHeaders("x-access-token="+token);
		getPhoneNumbersMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getPhoneNumbersMethod.replaceUrlPlaceholder("phone_number_id", phoneNumberId);
		getPhoneNumbersMethod.callAPI();
		getPhoneNumbersMethod.validateResponse();

        PutPhoneNumbersMethod putPhoneNumbersMethod = new PutPhoneNumbersMethod();
        putPhoneNumbersMethod.setHeaders("x-access-token="+token);
		putPhoneNumbersMethod.replaceUrlPlaceholder("phone_number_id", phoneNumberId);
        putPhoneNumbersMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        putPhoneNumbersMethod.callAPI();

		DeletePhoneNumbersMethod deletePhoneNumbersMethod = new DeletePhoneNumbersMethod();
		deletePhoneNumbersMethod.replaceUrlPlaceholder("phone_number_id", phoneNumberId);
		deletePhoneNumbersMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deletePhoneNumbersMethod.callAPI();
    }
	
	@Test(description = "Test User Language")
    @MethodOwner(owner = "Estani")
    public void testGetLanguage() {

		PostSignInMedicalPersonnel postSignInMethod = new PostSignInMedicalPersonnel();
		postSignInMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rsSignIn = postSignInMethod.callAPI().asString();
        postSignInMethod.validateResponse();
	
		String token = JsonPath.from(rsSignIn).getString("token");

		PostUserLanguageMethod postUserLanguageMethods = new PostUserLanguageMethod();
		postUserLanguageMethods.setHeaders("x-access-token="+token);
		postUserLanguageMethods.expectResponseStatus(HttpResponseStatusType.OK_200);
		postUserLanguageMethods.callAPI();
        String userLanguageRs = postUserLanguageMethods.callAPI().asString();
		String userLanguageId = JsonPath.from(userLanguageRs).getString("insertId");
		
		GetUserLanguageMethod getUserLanguageMethods = new GetUserLanguageMethod();
		getUserLanguageMethods.replaceUrlPlaceholder("user_language_id", userLanguageId);
		getUserLanguageMethods.expectResponseStatus(HttpResponseStatusType.OK_200);
		getUserLanguageMethods.callAPI();
		getUserLanguageMethods.validateResponse();

    }
}