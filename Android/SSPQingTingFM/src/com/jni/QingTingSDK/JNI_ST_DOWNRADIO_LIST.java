package com.jni.QingTingSDK;

public class JNI_ST_DOWNRADIO_LIST {

	private int  ret;
	private int count;			// ��̨����			
	private JNI_ST_DOWNRADIOINFO[] pstDownRadioInfo;// ����������
	
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
