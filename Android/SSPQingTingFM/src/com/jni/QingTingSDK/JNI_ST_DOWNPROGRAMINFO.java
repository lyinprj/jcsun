package com.jni.QingTingSDK;

public class JNI_ST_DOWNPROGRAMINFO {

	
	private int programID;		// 节目id		
	private String programName;				// 节目名称
	private int totalTime;	// 节目时长
	
	
	public int getID()
	{
		return programID;
	}
	public String getName()
	{
		return programName;
	}
	public int getTime()
	{
		return totalTime;
	}
}
