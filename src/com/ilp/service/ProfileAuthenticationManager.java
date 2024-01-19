package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.AdultProfile;
import com.ilp.entity.ElderProfile;
import com.ilp.entity.KidsProfile;
import com.ilp.entity.Profile;
import com.ilp.interfaces.AuthenticationManager;

public class ProfileAuthenticationManager implements AuthenticationManager {

	@Override
	public void profileLogout(Profile profile) {
		System.out.println("Logged out");
	}
	

	@Override
	public Profile profileLogin(ArrayList<Profile> profileList, String name) {
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		for(Profile profile:profileList)
		{
			if(profile.getProfileName().equals(name))
			{
				flag = true;
				if(profile instanceof KidsProfile)
				{
					System.out.println("Logged to kids profile");
					return profile;
				}
				else
				{
					System.out.println("Enter your password");
					String password = scanner.next();
					if(profile instanceof AdultProfile)
					{
						AdultProfile adultProfile = (AdultProfile)profile;
						String adultPassword = adultProfile.getPassword();
						if(password.equals(adultPassword))
						{
							System.out.println("Successfully logged in");
							return profile;
						}
						else
						{
							System.out.println("Invalid");
							return null;
						}
					}
					else
					{
						ElderProfile elderProfile = (ElderProfile)profile;
						String elderPassword = elderProfile.getPassword();
						if(password.equals(elderPassword))
						{
							System.out.println("Successfully logged in");
							return profile;
						}
						else
						{
							System.out.println("Invalid");
							return null;
						}
					}
				}
			}
			
		}
		if(!flag)
		{
			System.out.println("Profile not available");
		}
		return null;
	}
	
}
