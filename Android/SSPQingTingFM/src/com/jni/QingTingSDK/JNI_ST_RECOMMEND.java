package com.jni.QingTingSDK;

public class JNI_ST_RECOMMEND {

	private int  recomRadioID;			// �Ƽ���̨id
	private int recomProgramID;		// �Ƽ���Ŀid
	private int recomProgramType;		// �Ƽ���Ŀ����
	private String recommendName;			// �Ƽ�����
	private String recommendUrl;			// �Ƽ�ͼƬUrl
	
	public int  getrecomID()
	{
		return recomRadioID;
	}
	public int getrecomProID()
	{
		return recomProgramID;
	}
	public int getrecomProgramType()
	{
		return recomProgramType;
	}
	public String getrecomName()
	{
		return recommendName;
	}
	public String getrecomUrl()
	{
		return recommendUrl;
	}
	
}
