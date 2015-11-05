package com.jni.QingTingSDK;

public class JNI_ST_RADIOINFO {
	private int radioType;				// 电台Type
	private int radioID;					// 电台ID
	private String radioName;				// 电台名称	
	private int collectStatus;			// 0收藏，1未收藏
	private String pictureUrl;// 图片url
	
	public int gettype()
	{
		return radioType;
	}
	public int getID()
	{
		return radioID;
	}
	public String getName()
	{
		return radioName;
	}
	public int getStatus()
	{
		return collectStatus;
	}
	public String getUrl()
	{
		return pictureUrl;
	}
}
