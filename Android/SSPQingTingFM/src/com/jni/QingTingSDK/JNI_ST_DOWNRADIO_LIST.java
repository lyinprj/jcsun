package com.jni.QingTingSDK;

public class JNI_ST_DOWNRADIO_LIST {

	private int  ret;
	private int count;			// 电台数量			
	private JNI_ST_DOWNRADIOINFO[] pstDownRadioInfo;// 已下载数组
	
	public int getret()
	{
		return ret;
	}
	public int getcount()
	{
		return count;
	}
	public JNI_ST_DOWNRADIOINFO[] getpstDownRadioInfo()
	{
		return pstDownRadioInfo;
	}
	
}
