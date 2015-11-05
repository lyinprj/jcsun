package com.jni.QingTingSDK;

public class JNI_ST_COLLECTINFO {
	private int radioType;			// 电台Type
	private int radioID;			// 电台id	
	private String radioName;			// 电台名称	
	private String newProgram;// 最新节目
	
	
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
