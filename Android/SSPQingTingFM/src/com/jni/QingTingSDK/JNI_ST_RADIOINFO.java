package com.jni.QingTingSDK;

public class JNI_ST_RADIOINFO {
	private int radioType;				// ��̨Type
	private int radioID;					// ��̨ID
	private String radioName;				// ��̨����	
	private int collectStatus;			// 0�ղأ�1δ�ղ�
	private String pictureUrl;// ͼƬurl
	
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
