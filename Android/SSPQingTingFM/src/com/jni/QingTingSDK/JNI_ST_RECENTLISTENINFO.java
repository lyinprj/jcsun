package com.jni.QingTingSDK;

public class JNI_ST_RECENTLISTENINFO {

	
	private int radioType;	// ��Ŀ����
	private int radioID;		// ��Ŀid
	private int programType;// ��Ŀ����
	private int programID;	// ��Ŀid
	private String pictureUrl;	// ͼƬurl
	private String name;			// ����
	private String lastTime;	// ����ʱ��
	
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
