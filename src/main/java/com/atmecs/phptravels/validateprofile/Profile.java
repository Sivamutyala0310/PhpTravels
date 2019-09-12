package com.atmecs.phptravels.validateprofile;

import com.atmecs.phptravels.helpers.ProfilePageData;
import com.atmecs.phptravels.pageactions.PageActions;
import com.atmecs.phptravels.testbase.TestBase;
import com.atmecs.phptravels.utils.LogReports;

public class Profile extends TestBase {
	static String actualFirstName;
	static String actualLastName;
	static String actualMobileNumber;
	static String actualEmail;
	static String actualProfile;
	static LogReports log = new LogReports();
	static ProfilePageData data = new ProfilePageData();

	public static String fetchingProfileData() throws Exception { 
		
		data.getData();
			PageActions.clickElement(driver, data.getProfileXpath());
			actualFirstName= PageActions.fetchAttributeValue(driver,data.getProfileFirstNameXpath());
			log.info("fetching firstname value from profile :"+actualFirstName); 
			actualLastName=  PageActions.fetchAttributeValue(driver,data.getProfileLastNameXpath());
			log.info("fetching Lastname value from profile :"+actualLastName);
			actualMobileNumber=  PageActions.fetchAttributeValue(driver, data.getProfileMobileNumberXpath());
			 log.info("fetching mobile number value from profile :"+actualMobileNumber); 
			 actualEmail= PageActions.fetchAttributeValue(driver, data.getProfileEmailXpath());
			 log.info("fetching email value from profile :"+actualEmail);
			 actualProfile=PageActions.fetchHtmlAttributeValue(driver, data.getValidateProfileXpath());
			 log.info(actualProfile);
			  return  actualProfile;
			  }

	public static String expectedProfile() {
		String expectedProfile = "Hi"+","+" " + actualFirstName +" "+ actualLastName;
		return expectedProfile;
	}
	
			  
	
}

 
 