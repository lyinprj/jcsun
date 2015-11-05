package com.jni.QingTingSDK;

public class JNI_ST_RESULTPROINFO {

	
	private int programID;	// 节目id
	private String name;			// 节目名称
	private String belong;		// 所属
	private int radioID;		// 电台id
	private int radioType;	// 电台类型
	private String pictureUrl;	// 图片url
	
	
	public int getproID()
	{
		return programID;
	}
	public String getname()
	{
		return name;
	}
	public String belong()
	{
		return belong;
	}
	public int getradioID()
	{
		return radioID;
	}
	public int getradioType()
	{
		return radioType;
	}
	public String getUrl()
	{
		return pictureUrl;
	}
}
