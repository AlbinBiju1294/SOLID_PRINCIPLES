package com.ilp.interfaces;

import com.ilp.entity.Profile;
import com.ilp.entity.VodContent;

public interface ContentManager {
	
	void addToWatchlist(Profile profile, VodContent content);
    void addToWatchHistory(Profile profile, VodContent content);

}
