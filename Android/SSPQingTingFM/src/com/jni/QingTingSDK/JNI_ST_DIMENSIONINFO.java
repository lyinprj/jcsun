package com.jni.QingTingSDK;

public class JNI_ST_DIMENSIONINFO {
	private int dimensionID;			// ����id	
	private String dimensionName;			// ��������		
	private int recomCount;	    	// �Ƽ�����
	private JNI_ST_RECOMMEND[] pstRecommend ;// �Ƽ�����
	
	public int getdimensionID()
	{
		return dimensionID;
	}
	public String getdimensionName()
	{
		return dimensionName;
	}
	public int getrecomCount()
	{
		return recomCount;
	}
	public JNI_ST_RECOMMEND[] getRecommend()
	{
		return pstRecommend;
	}
	
}
