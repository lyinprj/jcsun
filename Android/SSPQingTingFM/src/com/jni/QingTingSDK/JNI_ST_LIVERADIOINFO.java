package com.jni.QingTingSDK;

public class JNI_ST_LIVERADIOINFO {

	
	private int liveRadioID;	// 直播电台ID	
	private String liveRadioName;	// 直播电台名称
	private String liveName;	// 正在直播节目名称
	private int isCollect;// 是否收藏,0收藏，1未收藏
	
	public int getID()
	{
		return liveRadioID;
	}
	public String getRName()
	{
		return liveRadioName;
	}
	public String getName()
	{
		return liveName;
	}
	public int getcollect()
	{
		return isCollect;
	}
	
}
