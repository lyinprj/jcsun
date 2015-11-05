package com.jni.QingTingSDK;

public class JNI_ST_RADIO_LIST {
	private int  ret;
	private int classID;			// 分类id
	private int dimensionID;		// 维度id
	private int pagingSize;			// 分页size
	private JNI_ST_RADIOINFO[] pstRadioInfo;// 电台数组
	
	public int getret()
	{
		return ret;
	}
	public int getclassID()
	{
		return classID;
	}
	public int getdimensionID()
	{
		return dimensionID;
	}
	public int getpagingSize()
	{
		return pagingSize;
	}
	public JNI_ST_RADIOINFO[] getpstRadioInfo()
	{
		return pstRadioInfo;
	}
}

