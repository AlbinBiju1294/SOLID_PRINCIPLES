package com.ilp.service;

import java.util.ArrayList;

import com.ilp.entity.Profile;
import com.ilp.entity.VodContent;
import com.ilp.interfaces.ContentManager;

public class ProfileContentManager implements ContentManager {

	@Override
	public void addToWatchlist(Profile profile, VodContent content) {
		
		ArrayList<VodContent> ContentList = profile.getVodContentWatchList();
		ContentList.add(content);
		profile.setVodContentWatchList(ContentList);
		System.out.println("Content added to watchlist");
		
		
	}

	@Override
	public void addToWatchHistory(Profile profile, VodContent content) {

		ArrayList<VodContent> ContentList = profile.getVodContentWatchHistory();
		ContentList.add(content);
		profile.setVodContentWatchHistory(ContentList);
		System.out.println("Content added to watchHistory");
		
	}

}
