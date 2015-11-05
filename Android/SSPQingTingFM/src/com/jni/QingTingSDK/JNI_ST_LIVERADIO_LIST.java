package com.jni.QingTingSDK;

public class JNI_ST_LIVERADIO_LIST {

	private int ret;				
	private int classID;					// 分类ID
	private int attrID;					// 属性id
	private int count;				// 直播电台个数 	
	private JNI_ST_LIVERADIOINFO[] pstLiveRadioInfo;// 列表
	public int getret()
	{
		return ret;
	}

	public int getcount()
	{
		return count;
	}
	public JNI_ST_LIVERADIOINFO[] getpstLiveRadioInfo()
	{
		return pstLiveRadioInfo;
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public int getAttrID() {
		return attrID;
	}
	public void setAttrID(int attrID) {
		this.attrID = attrID;
	}
	
}
