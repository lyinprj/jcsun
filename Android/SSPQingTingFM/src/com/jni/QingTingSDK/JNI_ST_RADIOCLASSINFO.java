package com.jni.QingTingSDK;

public class JNI_ST_RADIOCLASSINFO {

	
	private int classID;	// 分类id
	private String className;	// 分类名称
	private int attrID;		// 属性ID
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
