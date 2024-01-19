package com.ilp.interfaces;

import java.util.ArrayList;

import com.ilp.entity.Profile;

public interface AuthenticationManager {
	Profile profileLogin(ArrayList<Profile> profileList,String name);
	void profileLogout(Profile profile);
}
