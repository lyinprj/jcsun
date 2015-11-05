package com.jni.QingTingSDK;

public class JNI_ST_LIVINGRADIOINFO {
	private  int livingRadioID;		// 直播电台ID
	private String livingRadioName;		// 直播电台名称
	private String livingName;		// 正在直播节目名称
	private String picUrl;		// 电台图片URL
	private int isCollect;	// 是否收藏,0收藏，1未收藏
	
	public int getLivingRadioID() {
		return livingRadioID;
	}
	public void setLivingRadioID(int livingRadioID) {
		this.livingRadioID = livingRadioID;
	}
	public String getLivingRadioName() {
		return livingRadioName;
	}
	public void setLivingRadioName(String livingRadioName) {
		this.livingRadioName = livingRadioName;
	}
	public String getLivingName() {
		return livingName;
	}
	public void setLivingName(String livingName) {
		this.livingName = livingName;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public int getIsCollect() {
		return isCollect;
	}
	public void setIsCollect(int isCollect) {
		this.isCollect = isCollect;
	}
}
