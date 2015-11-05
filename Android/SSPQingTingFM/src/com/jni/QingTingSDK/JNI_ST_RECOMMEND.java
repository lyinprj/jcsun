package com.jni.QingTingSDK;

public class JNI_ST_RECOMMEND {

	private int  recomRadioID;			// 推荐电台id
	private int recomProgramID;		// 推荐节目id
	private int recomProgramType;		// 推荐节目类型
	private String recommendName;			// 推荐名称
	private String recommendUrl;			// 推荐图片Url
	
	public int  getrecomID()
	{
		return recomRadioID;
	}
	public int getrecomProID()
	{
		return recomProgramID;
	}
	public int getrecomProgramType()
	{
		return recomProgramType;
	}
	public String getrecomName()
	{
		return recommendName;
	}
	public String getrecomUrl()
	{
		return recommendUrl;
	}
	
}
