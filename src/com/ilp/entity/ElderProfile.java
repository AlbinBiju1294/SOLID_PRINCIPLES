package com.ilp.entity;

import java.util.ArrayList;

public class ElderProfile extends Profile {
	
	private String password;
	
	public ElderProfile(String profileId, String profileName, String parentalControlEnabled,
			ArrayList<VodContent> vodContentWatchList, ArrayList<VodContent> vodContentWatchHistory, String password) {
		super(profileId, profileName, parentalControlEnabled, vodContentWatchList, vodContentWatchHistory);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
