package com.jni.QingTingSDK;

public class JNI_ST_DOWNRADIOINFO {

	
	
	private int radioID;			// ��̨id	
	private String radioName;				// ��̨����
	private int radioType;// ��̨����
	private String pictureUrl;				// ͼƬurl
	private int fileCount;	// �ļ�����
	
	
	public int getID()
	{
		return radioID;
	}
	public String getName()
	{
		return radioName;
	}
	public int gettype()
	{
		return radioType;
	}
	public String getUrl()
	{
		return pictureUrl;
	}
	public int getCount()
	{
		return fileCount;
	}
}
