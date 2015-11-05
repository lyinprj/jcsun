package com.jni.QingTingSDK;

public class JNI_ST_CITY_LIST {

	
	private int ret;								
	private int count;		// 城市个数 		 
	private JNI_ST_CITYINFO[] pstCityInfo;	// 城市列表
	
	public int getret()
	{
		return ret;
	}
	public int getcount()
	{
		return count;
	}
	public JNI_ST_CITYINFO[] getpstCityInfo()
	{
		return pstCityInfo;
	}
	
}
