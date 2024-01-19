package com.ilp.entity;

import java.util.ArrayList;

public abstract class Profile {
	
	private String profileId;
	private String profileName;
	private String parentalControlEnabled;
	private ArrayList<VodContent> VodContentWatchList;
	private ArrayList<VodContent> VodContentWatchHistory;
	
	public Profile(String profileId, String profileName, String parentalControlEnabled,
			ArrayList<VodContent> vodContentWatchList, ArrayList<VodContent> vodContentWatchHistory) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
		this.parentalControlEnabled = parentalControlEnabled;
		VodContentWatchList = vodContentWatchList;
		VodContentWatchHistory = vodContentWatchHistory;
	}
	
	
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getParentalControlEnabled() {
		return parentalControlEnabled;
	}
	public void setParentalControlEnabled(String parentalControlEnabled) {
		this.parentalControlEnabled = parentalControlEnabled;
	}
	public ArrayList<VodContent> getVodContentWatchList() {
		return VodContentWatchList;
	}
	public void setVodContentWatchList(ArrayList<VodContent> vodContentWatchList) {
		VodContentWatchList = vodContentWatchList;
	}
	public ArrayList<VodContent> getVodContentWatchHistory() {
		return VodContentWatchHistory;
	}
	public void setVodContentWatchHistory(ArrayList<VodContent> vodContentWatchHistory) {
		VodContentWatchHistory = vodContentWatchHistory;
	}
	
}
