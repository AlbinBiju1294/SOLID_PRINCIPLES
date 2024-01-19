package com.ilp.service;
import java.util.ArrayList;
import java.util.Scanner;
import com.ilp.entity.Profile;
import com.ilp.entity.VodContent;
import com.ilp.interfaces.AuthenticationManager;
import com.ilp.interfaces.ContentManager;

public class ProfileService {
    private AuthenticationManager authenticationManager;
    private ContentManager contentManager;
    private ArrayList<Profile> profileList;
    private Profile currentProfile;

    public ProfileService(AuthenticationManager authenticationManager, ContentManager contentManager) {
        this.authenticationManager = authenticationManager;
        this.contentManager = contentManager;
        this.profileList = new ArrayList<>();
    }

    public ArrayList<Profile> getProfileList() {
		return profileList;
	}

	public void setProfileList(ArrayList<Profile> profileList) {
		this.profileList = profileList;
	}

	public Profile getCurrentProfile() {
		return currentProfile;
	}

	public void setCurrentProfile(Profile currentProfile) {
		this.currentProfile = currentProfile;
	}

    public void addToWatchList(ArrayList<VodContent> contentList) {
    	Scanner in = new Scanner(System.in);
        System.out.println("Select the content to add to watch list");
        displayContentList(contentList);

        int contentChoice = in.nextInt();
        contentManager.addToWatchlist(currentProfile, contentList.get(contentChoice - 1));
    }

    public void addToWatchHistory(ArrayList<VodContent> contentList) {
    	Scanner in = new Scanner(System.in);
        System.out.println("Select the content to add to watch history");
        displayContentList(contentList);

        int contentChoice = in.nextInt();
        contentManager.addToWatchHistory(currentProfile, contentList.get(contentChoice - 1));
    }
    
    public Profile profileLogin(String profileName)
    {
    	return authenticationManager.profileLogin(profileList, profileName);
    }
    
    public void profileLogout() {
		authenticationManager.profileLogout(currentProfile);
	}

    public void displayContentList(ArrayList<VodContent> contentList) {
        for (int i = 0; i < contentList.size(); i++) {
            VodContent content = contentList.get(i);
            System.out.println((i + 1) + " " + content.getContentId() + " " + content.getContentTitle());
        }
    }

}

