package com.ilp.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.AdultProfile;
import com.ilp.entity.ElderProfile;
import com.ilp.entity.KidsProfile;
import com.ilp.entity.Profile;
import com.ilp.entity.VodContent;

public class CreateProfileService {

	public static Profile createProfile() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter profile Id:");
		String pId = scanner.next();
		System.out.println("Enter profile name:");
		String pName = scanner.next();
		ArrayList<VodContent> VodContentWatchList = new ArrayList<VodContent>();
		ArrayList<VodContent> VodContentWatchHistory = new ArrayList<VodContent>();
		Profile profile = null;
		System.out.println("1.Kids profile\n2.Adult profile\n3.Elder profile");
		int profileChoice = scanner.nextInt();
		switch(profileChoice)
		{
			case 1:
				KidsProfile profile0 = new KidsProfile(pId,pName,"enabled",VodContentWatchList,VodContentWatchHistory);
				return profile0;
			case 2:
				System.out.println("Enter the password:");
				String password = scanner.next();
				AdultProfile profile1 = new AdultProfile(pId,pName,"enabled",VodContentWatchList,VodContentWatchHistory,password);
				return profile1;
			case 3:
				System.out.println("Enter the password:");
				String password2 = scanner.next();
				ElderProfile profile2 = new ElderProfile(pId,pName,"enabled",VodContentWatchList,VodContentWatchHistory,password2);
				return profile2;
			default:
				System.out.println("Invalid");
				break;
		}
		return profile;
		
	}

}
