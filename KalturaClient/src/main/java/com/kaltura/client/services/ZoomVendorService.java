// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2018  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.services;

import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class ZoomVendorService {
	
	public static class DeAuthorizationZoomVendorBuilder extends RequestBuilder<String, String, DeAuthorizationZoomVendorBuilder> {
		
		public DeAuthorizationZoomVendorBuilder() {
			super(String.class, "vendor_zoomvendor", "deAuthorization");
		}
	}

    public static DeAuthorizationZoomVendorBuilder deAuthorization()  {
		return new DeAuthorizationZoomVendorBuilder();
	}
	
	public static class FetchRegistrationPageZoomVendorBuilder extends NullRequestBuilder {
		
		public FetchRegistrationPageZoomVendorBuilder(String tokensData, String iv) {
			super("vendor_zoomvendor", "fetchRegistrationPage");
			params.add("tokensData", tokensData);
			params.add("iv", iv);
		}
		
		public void tokensData(String multirequestToken) {
			params.add("tokensData", multirequestToken);
		}
		
		public void iv(String multirequestToken) {
			params.add("iv", multirequestToken);
		}
	}

    public static FetchRegistrationPageZoomVendorBuilder fetchRegistrationPage(String tokensData, String iv)  {
		return new FetchRegistrationPageZoomVendorBuilder(tokensData, iv);
	}
	
	public static class OauthValidationZoomVendorBuilder extends RequestBuilder<String, String, OauthValidationZoomVendorBuilder> {
		
		public OauthValidationZoomVendorBuilder() {
			super(String.class, "vendor_zoomvendor", "oauthValidation");
		}
	}

    public static OauthValidationZoomVendorBuilder oauthValidation()  {
		return new OauthValidationZoomVendorBuilder();
	}
	
	public static class RecordingCompleteZoomVendorBuilder extends NullRequestBuilder {
		
		public RecordingCompleteZoomVendorBuilder() {
			super("vendor_zoomvendor", "recordingComplete");
		}
	}

    public static RecordingCompleteZoomVendorBuilder recordingComplete()  {
		return new RecordingCompleteZoomVendorBuilder();
	}
	
	public static class SubmitRegistrationZoomVendorBuilder extends RequestBuilder<String, String, SubmitRegistrationZoomVendorBuilder> {
		
		public SubmitRegistrationZoomVendorBuilder(String defaultUserId, String zoomCategory, String accountId) {
			super(String.class, "vendor_zoomvendor", "submitRegistration");
			params.add("defaultUserId", defaultUserId);
			params.add("zoomCategory", zoomCategory);
			params.add("accountId", accountId);
		}
		
		public void defaultUserId(String multirequestToken) {
			params.add("defaultUserId", multirequestToken);
		}
		
		public void zoomCategory(String multirequestToken) {
			params.add("zoomCategory", multirequestToken);
		}
		
		public void accountId(String multirequestToken) {
			params.add("accountId", multirequestToken);
		}
	}

    public static SubmitRegistrationZoomVendorBuilder submitRegistration(String defaultUserId, String zoomCategory, String accountId)  {
		return new SubmitRegistrationZoomVendorBuilder(defaultUserId, zoomCategory, accountId);
	}
}
