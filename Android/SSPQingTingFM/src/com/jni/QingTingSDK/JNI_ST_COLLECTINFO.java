package com.jni.QingTingSDK;

public class JNI_ST_COLLECTINFO {
	private int radioType;			// ��̨Type
	private int radioID;			// ��̨id	
	private String radioName;			// ��̨����	
	private String newProgram;// ���½�Ŀ
	
	
	public int gettype()
	{
		return radioType;
	}
	public int getID()
	{
		return radioID;
	}
	public String getName()
	{
		return radioName;
	}
	public String getProgram()
	{
		return newProgram;
	}
}
