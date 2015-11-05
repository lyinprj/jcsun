package com.jni.QingTingSDK;

public class JNI_ST_RECENTLISTEN_LIST {

	private int ret;
	private int count;		// 最近收听节目数量						
	private JNI_ST_RECENTLISTENINFO[] pstRecentListenInfo;// 最近收听数组
	
	public int getret()
	{
		return ret;
	}
	public int getcount()
	{
		return count;
	}
	public JNI_ST_RECENTLISTENINFO[] getpstRecentListenInfo()
	{
		return pstRecentListenInfo;
	}
	
	
}
