package com.jni.QingTingSDK;

public class JNI_ST_RADIOCLASSINFO {

	
	private int classID;	// ����id
	private String className;	// ��������
	private int attrID;		// ����ID
	public int getID()
	{
		return classID;
	}
	public String getName()
	{
		return className;
	}

	public int getAttrID() {
		return attrID;
	}
	public void setAttrID(int attrID) {
		this.attrID = attrID;
	}
}
