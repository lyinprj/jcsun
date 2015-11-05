package com.jni.QingTingSDK;

public class JNI_ST_DIMENSIONINFO {
	private int dimensionID;			// 分类id	
	private String dimensionName;			// 分类名称		
	private int recomCount;	    	// 推荐个数
	private JNI_ST_RECOMMEND[] pstRecommend ;// 推荐数组
	
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
