package com.jni.QingTingSDK;

public class JNI_ST_RECENTLISTEN_LIST {

	private int ret;
	private int count;		// ���������Ŀ����						
	private JNI_ST_RECENTLISTENINFO[] pstRecentListenInfo;// �����������
	
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
