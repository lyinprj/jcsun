package com.jni.QingTingSDK;

public class JNI_ST_PROGRAM_LIST {

	private int ret;
	private String radioName;				// ��̨����	
	private int radioID;					// ��̨ID
	private int collectStatus;			// 0�ղأ�1δ�ղ�
	private String pictureUrl;			// ͼƬurl	
	private int pagingSize;					// ��ҳsize
	private JNI_ST_PROGRAMIFO[] pstProgramInfo;// ��Ŀ����
	public int getret()
	{
		return ret;
	}
	public String getName()
	{
		return radioName;
	}
	public int getID()
	{
		return radioID;
	}
	public int getstatus()
	{
		return collectStatus;
	}
	public String getUrl()
	{
		return pictureUrl;
	}
	public int getSize()
	{
		return pagingSize;
	}
	public JNI_ST_PROGRAMIFO[] getInfo()
	{
		return pstProgramInfo;
	}
	
	 
}
