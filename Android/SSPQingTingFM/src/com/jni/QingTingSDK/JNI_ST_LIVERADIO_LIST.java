package com.jni.QingTingSDK;

public class JNI_ST_LIVERADIO_LIST {

	private int ret;				
	private int classID;					// ����ID
	private int attrID;					// ����id
	private int count;				// ֱ����̨���� 	
	private JNI_ST_LIVERADIOINFO[] pstLiveRadioInfo;// �б�
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
