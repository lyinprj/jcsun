package com.jni.QingTingSDK;

import java.io.Serializable;

public class JNI_ST_CLASSINFO implements Serializable{
	
	private int classID;	// ����id
	private String className;	// ��������
	private int classAreaID;	
	// ��������ID
	public int getID()
	{
		return classID;
	}
	public String getName()
	{
		return className;
	}
	public int getClassAreaID() {
		return classAreaID;
	}
	public void setClassAreaID(int classAreaID) {
		this.classAreaID = classAreaID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
