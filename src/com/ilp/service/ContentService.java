package com.ilp.service;

import java.util.ArrayList;

import com.ilp.entity.VodContent;

public class ContentService {

	public static ArrayList<VodContent> createContent()
	{
		ArrayList<VodContent> contentList = new ArrayList<>();
		VodContent vodContent1 = new VodContent("vod1","SpiderMan",2.15);
		contentList.add(vodContent1);
		VodContent vodContent2 = new VodContent("vod2","AquaMan",2.30);
		contentList.add(vodContent2);
		VodContent vodContent3 = new VodContent("vod3","superMan",2.45);
		contentList.add(vodContent2);
		return contentList;
	}
}
