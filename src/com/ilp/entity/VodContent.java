package com.ilp.entity;

public class VodContent {
	
	private String contentId;
	private String contentTitle;
	private double contentRuntime;
	public VodContent(String contentId, String contentTitle, double contentRuntime) {
		super();
		this.contentId = contentId;
		this.contentTitle = contentTitle;
		this.contentRuntime = contentRuntime;
	}
	public String getContentId() {
		return contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentTitle() {
		return contentTitle;
	}
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}
	public double getContentRuntime() {
		return contentRuntime;
	}
	public void setContentRuntime(double contentRuntime) {
		this.contentRuntime = contentRuntime;
	}
	
}
