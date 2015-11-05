package com.jni.QingTingSDK;

public class JNI_ST_PROGRAM_LIST {

	private int ret;
	private String radioName;				// 电台名称	
	private int radioID;					// 电台ID
	private int collectStatus;			// 0收藏，1未收藏
	private String pictureUrl;			// 图片url	
	private int pagingSize;					// 分页size
	private JNI_ST_PROGRAMIFO[] pstProgramInfo;// 节目数组
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
