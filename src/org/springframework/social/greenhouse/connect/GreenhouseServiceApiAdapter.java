/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.greenhouse.connect;

import org.springframework.social.connect.ServiceProviderUser;
import org.springframework.social.connect.spi.ServiceApiAdapter;
import org.springframework.social.greenhouse.GreenhouseApi;
import org.springframework.social.greenhouse.types.GreenhouseProfile;

/**
 * @author Roy Clarkson
 */
public class GreenhouseServiceApiAdapter implements ServiceApiAdapter<GreenhouseApi> {

	public boolean test(GreenhouseApi serviceApi) {
		// TODO call whatever api method should be used for testing
//		try {
//			serviceApi.userOperations().getUserProfile();
//			return true;
//		} catch (BadCredentialsException e) {
//			return false;
//		}
		return true;
	}

	public ServiceProviderUser getUser(GreenhouseApi serviceApi) {
		GreenhouseProfile profile = serviceApi.getUserProfile();
		return new ServiceProviderUser(Long.toString(profile.getId()), profile.getScreenName(), profile.getProfileUrl(), profile.getProfileImageUrl());
	}

	public void updateStatus(GreenhouseApi serviceApi, String message) {
		// TODO: add functionality	
//		serviceApi.timelineOperations().updateStatus(message);
	}

}