package com.jni.QingTingSDK;

public class JNI_ST_CLASS_LIST {
	private int ret;
	private int jxClassCount;				// ��ѡ�������
	private JNI_ST_CLASSINFO[] jxpstClassInfos;	// ��ѡ����
	private int gbClassCount;				// �㲥��̨�������
	private JNI_ST_CLASSINFO[] gbpstClassInfos;		// �㲥��̨����
	private int nrflClassCount;			// ���ݷ���������
	private JNI_ST_CLASSINFO[] nrflpstClassInfos;	// ���ݷ����������
	
	public int getret()
	{
		return ret;
	}
	public int getjxCount()
	{
		return jxClassCount;
	}
	public JNI_ST_CLASSINFO[] getjxInfo()
	{
		return jxpstClassInfos;
	}
	public int getgbCount()
	{
		return gbClassCount;
	}
	public JNI_ST_CLASSINFO[] getgbInfo()
	{
		return gbpstClassInfos;
	}
	public int nrCount()
	{
		return nrflClassCount;
	}
	public JNI_ST_CLASSINFO[] getnrInfo()
	{
		return nrflpstClassInfos;
	}

}
