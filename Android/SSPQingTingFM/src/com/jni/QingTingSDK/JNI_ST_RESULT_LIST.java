package com.jni.QingTingSDK;

public class JNI_ST_RESULT_LIST {

	private int ret;
	private int count;					// �����������		
	private int radioCount;					// ��̨��
	private JNI_ST_RESULTINFO[] pstResultRadioList;	
	private int albumCount;				// ר����
	private JNI_ST_RESULTINFO[] pstResultAlbumList;	
	private int programCount;			// ��Ŀ��	
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
