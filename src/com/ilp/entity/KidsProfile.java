package com.ilp.entity;

import java.util.ArrayList;

public class KidsProfile extends Profile {

	public KidsProfile(String profileId, String profileName, String parentalControlEnabled,
			ArrayList<VodContent> vodContentWatchList, ArrayList<VodContent> vodContentWatchHistory) {
		super(profileId, profileName, parentalControlEnabled, vodContentWatchList, vodContentWatchHistory);
		
		
	}

}
