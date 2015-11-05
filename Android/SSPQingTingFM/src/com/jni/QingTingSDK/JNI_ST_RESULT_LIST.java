package com.jni.QingTingSDK;

public class JNI_ST_RESULT_LIST {

	private int ret;
	private int count;					// 搜索结果总数		
	private int radioCount;					// 电台数
	private JNI_ST_RESULTINFO[] pstResultRadioList;	
	private int albumCount;				// 专辑数
	private JNI_ST_RESULTINFO[] pstResultAlbumList;	
	private int programCount;			// 节目数	
	private JNI_ST_RESULTPROINFO[] pstResultProgramList;
	
	
	
	public int getret()
	{
		return ret;
	}
	public int getcount()
	{
		return count;
	}
	public int getradioCount()
	{
		return radioCount;
	}
	public JNI_ST_RESULTINFO[] getpstResultRadioList()
	{
		return pstResultRadioList;
	}
	public JNI_ST_RESULTINFO[] getpstResultAlbumList()
	{
		return pstResultAlbumList;
	}
	public JNI_ST_RESULTPROINFO[] getpstResultProgramList()
	{
		return pstResultProgramList;
	}
}
