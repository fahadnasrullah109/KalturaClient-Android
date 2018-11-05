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
package com.kaltura.client.types;

import android.os.Parcel;
import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TrRdsDropFolder.Tokenizer.class)
public class TrRdsDropFolder extends SftpDropFolder {
	
	public interface Tokenizer extends SftpDropFolder.Tokenizer {
		String syncMetadataProfile();
		String targetMetadataProfile();
	}

	private Integer syncMetadataProfile;
	private Integer targetMetadataProfile;

	// syncMetadataProfile:
	public Integer getSyncMetadataProfile(){
		return this.syncMetadataProfile;
	}
	public void setSyncMetadataProfile(Integer syncMetadataProfile){
		this.syncMetadataProfile = syncMetadataProfile;
	}

	public void syncMetadataProfile(String multirequestToken){
		setToken("syncMetadataProfile", multirequestToken);
	}

	// targetMetadataProfile:
	public Integer getTargetMetadataProfile(){
		return this.targetMetadataProfile;
	}
	public void setTargetMetadataProfile(Integer targetMetadataProfile){
		this.targetMetadataProfile = targetMetadataProfile;
	}

	public void targetMetadataProfile(String multirequestToken){
		setToken("targetMetadataProfile", multirequestToken);
	}


	public TrRdsDropFolder() {
		super();
	}

	public TrRdsDropFolder(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		syncMetadataProfile = GsonParser.parseInt(jsonObject.get("syncMetadataProfile"));
		targetMetadataProfile = GsonParser.parseInt(jsonObject.get("targetMetadataProfile"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTrRdsDropFolder");
		kparams.add("syncMetadataProfile", this.syncMetadataProfile);
		kparams.add("targetMetadataProfile", this.targetMetadataProfile);
		return kparams;
	}


    public static final Creator<TrRdsDropFolder> CREATOR = new Creator<TrRdsDropFolder>() {
        @Override
        public TrRdsDropFolder createFromParcel(Parcel source) {
            return new TrRdsDropFolder(source);
        }

        @Override
        public TrRdsDropFolder[] newArray(int size) {
            return new TrRdsDropFolder[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.syncMetadataProfile);
        dest.writeValue(this.targetMetadataProfile);
    }

    public TrRdsDropFolder(Parcel in) {
        super(in);
        this.syncMetadataProfile = (Integer)in.readValue(Integer.class.getClassLoader());
        this.targetMetadataProfile = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}
