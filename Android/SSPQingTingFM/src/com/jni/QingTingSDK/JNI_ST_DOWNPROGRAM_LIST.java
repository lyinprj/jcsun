package com.jni.QingTingSDK;

public class JNI_ST_DOWNPROGRAM_LIST {

	private int ret;
	private int count;					// ��Ŀ����	
	private JNI_ST_DOWNPROGRAMINFO[] pstDownProgramInfo;// ����������

	private int radioID;							// ��Ӧ��̨ID

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
