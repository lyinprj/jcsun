package com.jni.QingTingSDK;

public class JNI_ST_LIVINGRADIOINFO {
	private  int livingRadioID;		// ֱ����̨ID
	private String livingRadioName;		// ֱ����̨����
	private String livingName;		// ����ֱ����Ŀ����
	private String picUrl;		// ��̨ͼƬURL
	private int isCollect;	// �Ƿ��ղ�,0�ղأ�1δ�ղ�
	
	public int getLivingRadioID() {
		return livingRadioID;
	}
	public void setLivingRadioID(int livingRadioID) {
		this.livingRadioID = livingRadioID;
	}
	public String getLivingRadioName() {
		return livingRadioName;
	}
	public void setLivingRadioName(String livingRadioName) {
		this.livingRadioName = livingRadioName;
	}
	public String getLivingName() {
		return livingName;
	}
	public void setLivingName(String livingName) {
		this.livingName = livingName;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public int getIsCollect() {
		return isCollect;
	}
	public void setIsCollect(int isCollect) {
		this.isCollect = isCollect;
	}
}
