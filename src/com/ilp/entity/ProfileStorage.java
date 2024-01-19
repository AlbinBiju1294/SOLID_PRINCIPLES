package com.ilp.entity;

import java.util.ArrayList;

public class ProfileStorage {
	
	private ArrayList<Profile> profileList = new ArrayList<>();

	public ProfileStorage(ArrayList<Profile> profileList) {
		super();
		this.profileList = profileList;
	}

	public ArrayList<Profile> getProfileList() {
		return profileList;
	}

	public void setProfileList(ArrayList<Profile> profileList) {
		this.profileList = profileList;
	}
	
}
