package com.jni.QingTingSDK;

public class JNI_ST_DIMENSION_LIST {
	private int ret;
	private int classID;				// 分类id		
	private int classAreaID;						// 分类区号ID
	private int count;	// 维度个数
	private JNI_ST_DIMENSIONINFO[] pstDimensionInfo;// 维度数组
	
	
	public int getret()
	{
		return ret;
	}
	public int getclassID()
	{
		return classID;
	}
	public int getcount()
	{
		return count;
	}
	public JNI_ST_DIMENSIONINFO[] getpstDimensionInfo()
	{
		return pstDimensionInfo;
	}
	public int getClassAreaID() {
		return classAreaID;
	}
	public void setClassAreaID(int classAreaID) {
		this.classAreaID = classAreaID;
	}
}
