package com.atmecs.phptravels.tests;
import com.atmecs.phptravels.utils.LogReports;
import com.atmecs.phptravels.validateprofile.Profile;
import com.atmecs.phptravels.validateprofile.ValidateResult;

public class PhpTravels_profile extends PhpTravels_signUp {
	static String  expectedProfile;
	static String  actualProfile;
	static LogReports log = new LogReports();
	 
	public static void  fetchingProfileData() throws Exception {
		
		log.info("fetching data from profile");
		actualProfile=Profile.fetchingProfileData();
		log.info("fetching data from profile successfully");
	}
	
	public static void validateProfile()
	{
		expectedProfile=Profile.expectedProfile();
		
		 Boolean result= ValidateResult.validateData(actualProfile,expectedProfile,"profile validation");
		 
		 if(result=true)
		 {
		 System.out.println(result+" "+"Assertion passed");
		 }
		 else
		 {
			 System.out.println(result+" "+"Assertion failed");
		 }
	}
}
		
	
