package com.ilp.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Profile;
import com.ilp.entity.VodContent;
import com.ilp.interfaces.AuthenticationManager;
import com.ilp.interfaces.ContentManager;
import com.ilp.service.ContentService;
import com.ilp.service.CreateProfileService;
import com.ilp.service.ProfileAuthenticationManager;
import com.ilp.service.ProfileContentManager;
import com.ilp.service.ProfileService;

public class ProfileMainUtility {

	public static void main(String[] args) {

		AuthenticationManager authenticationManager = new ProfileAuthenticationManager();
        ContentManager contentManager = new ProfileContentManager();
        ProfileService profileService = new ProfileService(authenticationManager, contentManager);
        
        Scanner in = new Scanner(System.in);
        ArrayList<VodContent> contentList = ContentService.createContent();

        char outerChoice;
        do {
        	Profile currentProfile = profileService.getCurrentProfile();
        	ArrayList<Profile> profileList = profileService.getProfileList();
            System.out.println("Enter your choice:");
            System.out.println("1.Create profile\n2.Login\n3.Logout\n4.Add to watchList\n5.Add to watch history");
            int serviceChoice = in.nextInt();

            switch (serviceChoice) {
                case 1:
                    Profile profile = CreateProfileService.createProfile();
                    profileList.add(profile);
                    profileService.setProfileList(profileList);
                    break;
                case 2:
                    System.out.println("Enter profile name");
                    String profileName = in.next();
                    currentProfile = profileService.profileLogin(profileName);
                    profileService.setCurrentProfile(currentProfile);
                    break;
                case 3:
                    profileService.profileLogout();
                    profileService.setCurrentProfile(null);
                    break;
                case 4:
                    profileService.addToWatchList(contentList);
                    break;
                case 5:
                	profileService.addToWatchHistory(contentList);
                    break;
                default:
                	System.out.println("Invalid");
                	break;
            }

            System.out.println("Do you want to continue(y/n)");
            outerChoice = in.next().charAt(0);
        } while (outerChoice == 'y');

	}

}
