package com.jni.QingTingSDK;

public class JNI_ST_RECENTLISTENINFO {

	
	private int radioType;	// 节目类型
	private int radioID;		// 节目id
	private int programType;// 节目类型
	private int programID;	// 节目id
	private String pictureUrl;	// 图片url
	private String name;			// 名称
	private String lastTime;	// 收听时间
	
	public int gettype()
	{
		return radioType;
	}
	public int getID()
	{
		return radioID;
	}
	public int getprotype()
	{
		return programType;
	}
	public int getproID()
	{
		return programID;
	}
	public String geturl()
	{
		return pictureUrl;
	}
	public String getname()
	{
		return name;
	}
	public String getLtime()
	{
		return lastTime;
	}
}
