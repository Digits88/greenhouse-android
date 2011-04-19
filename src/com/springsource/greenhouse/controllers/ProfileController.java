package com.springsource.greenhouse.controllers;

import org.springframework.social.greenhouse.types.GreenhouseProfile;

import android.content.Context;

public class ProfileController extends BaseController {

	
	//***************************************
    // Constructors
    //***************************************
	public ProfileController(Context context) {
		super(context);
	}
	
	
	//***************************************
    // Public methods
    //***************************************
	public GreenhouseProfile getProfile() {
		return getGreenhouseApi().getUserProfile();
	}
}
