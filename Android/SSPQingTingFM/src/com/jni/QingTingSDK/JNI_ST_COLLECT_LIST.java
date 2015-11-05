package com.jni.QingTingSDK;

public class JNI_ST_COLLECT_LIST {

	private int ret;
	private int count;			// 收藏数量		
	private JNI_ST_COLLECTINFO[] pstCollectInfo;		// 收藏数组
	
	public int getret()
	{
		return ret;
	}
	public int getcount()
	{
		return count;
	}
	public JNI_ST_COLLECTINFO[] getpstCollectInfo()
	{
		return pstCollectInfo;
	}
	
	
}
