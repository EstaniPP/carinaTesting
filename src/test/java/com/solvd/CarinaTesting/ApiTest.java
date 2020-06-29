package com.solvd.CarinaTesting;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.CarinaTesting.api.medicalPersonnelMethods.DeleteMedicalPersonnelMethod;
import com.solvd.CarinaTesting.api.medicalPersonnelMethods.GetMedicalPersonnelMethod;
import com.solvd.CarinaTesting.api.medicalPersonnelMethods.PostMedicalPersonnelMethod;
import com.solvd.CarinaTesting.api.medicalPersonnelMethods.PutMedicalPersonnelMethod;
import com.solvd.CarinaTesting.api.phoneNumbersMethods.DeletePhoneNumbersMethod;
import com.solvd.CarinaTesting.api.phoneNumbersMethods.GetPhoneNumbersMethod;
import com.solvd.CarinaTesting.api.phoneNumbersMethods.PostPhoneNumbersMethod;
import com.solvd.CarinaTesting.api.phoneNumbersMethods.PutPhoneNumbersMethod;
import com.solvd.CarinaTesting.api.userLanguageMethods.GetUserLanguageMethod;
import com.solvd.CarinaTesting.api.userLanguageMethods.PostUserLanguageMethod;

public class ApiTest{
	
	@Test(description = "Test GET Medical Personnel")
    @MethodOwner(owner = "Estani")
    public void testGetMedicalPersonnel() {
        GetMedicalPersonnelMethod getDeviceUserMethod = new GetMedicalPersonnelMethod();
        getDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getDeviceUserMethod.callAPI();
        getDeviceUserMethod.validateResponse();
    }
	
	@Test(description = "Test PUT Medical Personnel")
    @MethodOwner(owner = "Estani")
    public void testPutMedicalPersonnel() {
        PutMedicalPersonnelMethod putDeviceUserMethod = new PutMedicalPersonnelMethod();
        putDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        putDeviceUserMethod.callAPI();
    }

	@Test(description = "Test DELETE Medical Personnel")
    @MethodOwner(owner = "Estani")
    public void testDeleteMedicalPersonnel() {
		DeleteMedicalPersonnelMethod deleteDeviceUserMethod = new DeleteMedicalPersonnelMethod();
		deleteDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		deleteDeviceUserMethod.callAPI();
    }
	
	@Test(description = "Test POST Medical Personnel")
    @MethodOwner(owner = "Estani")
    public void testPostMedicalPersonnel() {
        PostMedicalPersonnelMethod postDeviceUserMethod = new PostMedicalPersonnelMethod();
        postDeviceUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        postDeviceUserMethod.callAPI();
        postDeviceUserMethod.validateResponse();
    }
	
	@Test(description = "Test GET Phone Number")
    @MethodOwner(owner = "Estani")
    public void testGetPhoneNumber() {
		GetPhoneNumbersMethod getPhoneNumbersMethod = new GetPhoneNumbersMethod();
		getPhoneNumbersMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getPhoneNumbersMethod.callAPI();
		getPhoneNumbersMethod.validateResponse();
    }
	@Test(description = "Test POST Phone Number")
    @MethodOwner(owner = "Estani")
    public void testPostPhoneNumber() {
		PostPhoneNumbersMethod postPhoneNumbersMethod = new PostPhoneNumbersMethod();
		postPhoneNumbersMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		postPhoneNumbersMethod.callAPI();
    }

	@Test(description = "Test PUT Phone Number")
    @MethodOwner(owner = "Estani")
    public void testPutPhoneNumber() {
        PutPhoneNumbersMethod putPhoneNumbersMethod = new PutPhoneNumbersMethod();
        putPhoneNumbersMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        putPhoneNumbersMethod.callAPI();
    }
	
	@Test(description = "Test DELETE Phone Number")
    @MethodOwner(owner = "Estani")
    public void testDeletePhoneNumber() {
		DeletePhoneNumbersMethod deletePhoneNumbersMethod = new DeletePhoneNumbersMethod();
		deletePhoneNumbersMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deletePhoneNumbersMethod.callAPI();
    }
	
	@Test(description = "Test GET User Language")
    @MethodOwner(owner = "Estani")
    public void testGetLanguage() {
		GetUserLanguageMethod getUserLanguageMethods = new GetUserLanguageMethod();
		getUserLanguageMethods.expectResponseStatus(HttpResponseStatusType.OK_200);
		getUserLanguageMethods.callAPI();
		getUserLanguageMethods.validateResponse();
    }
	
	@Test(description = "Test POST User Language")
    @MethodOwner(owner = "Estani")
    public void testPostUserLanguage() {
		PostUserLanguageMethod postUserLanguageMethods = new PostUserLanguageMethod();
		postUserLanguageMethods.expectResponseStatus(HttpResponseStatusType.OK_200);
		postUserLanguageMethods.callAPI();
    }
}