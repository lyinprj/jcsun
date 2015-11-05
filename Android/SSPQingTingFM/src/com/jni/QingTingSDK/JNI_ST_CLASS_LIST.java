package com.jni.QingTingSDK;

public class JNI_ST_CLASS_LIST {
	private int ret;
	private int jxClassCount;				// 精选分类个数
	private JNI_ST_CLASSINFO[] jxpstClassInfos;	// 精选数组
	private int gbClassCount;				// 广播电台分类个数
	private JNI_ST_CLASSINFO[] gbpstClassInfos;		// 广播电台数组
	private int nrflClassCount;			// 内容分类分类个数
	private JNI_ST_CLASSINFO[] nrflpstClassInfos;	// 内容分类分类数组
	
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
