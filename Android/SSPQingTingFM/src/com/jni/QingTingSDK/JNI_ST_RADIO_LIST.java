package com.jni.QingTingSDK;

public class JNI_ST_RADIO_LIST {
	private int  ret;
	private int classID;			// ����id
	private int dimensionID;		// ά��id
	private int pagingSize;			// ��ҳsize
	private JNI_ST_RADIOINFO[] pstRadioInfo;// ��̨����
	
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

