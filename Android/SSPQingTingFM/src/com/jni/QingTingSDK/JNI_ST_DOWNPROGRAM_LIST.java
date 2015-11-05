package com.jni.QingTingSDK;

public class JNI_ST_DOWNPROGRAM_LIST {

	private int ret;
	private int count;					// 节目数量	
	private JNI_ST_DOWNPROGRAMINFO[] pstDownProgramInfo;// 已下载数组

	private int radioID;							// 对应电台ID

	public int getret()
	{
		return ret;
	}
	public int getcount()
	{
		return count;
	}
	public JNI_ST_DOWNPROGRAMINFO[] getpstDownProgramInfo()
	{
		return pstDownProgramInfo;
	}
	public int getradioID()
	{
		return radioID;
	}
	
}
