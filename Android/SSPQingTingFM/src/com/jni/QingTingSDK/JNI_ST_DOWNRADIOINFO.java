package com.jni.QingTingSDK;

public class JNI_ST_DOWNRADIOINFO {

	
	
	private int radioID;			// 电台id	
	private String radioName;				// 电台名称
	private int radioType;// 电台类型
	private String pictureUrl;				// 图片url
	private int fileCount;	// 文件个数
	
	
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
