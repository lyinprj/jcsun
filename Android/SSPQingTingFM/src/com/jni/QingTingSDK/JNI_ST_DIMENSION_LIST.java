package com.jni.QingTingSDK;

public class JNI_ST_DIMENSION_LIST {
	private int ret;
	private int classID;				// ����id		
	private int classAreaID;						// ��������ID
	private int count;	// ά�ȸ���
	private JNI_ST_DIMENSIONINFO[] pstDimensionInfo;// ά������
	
	
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
