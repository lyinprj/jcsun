package com.jni.QingTingSDK;

public class JNI_ST_CURPROGRAM_INFO {

	private int  ret;                // 1
	private int collect_status;		// �ղ�״̬: 0���ղأ�1δ�ղ�
	private int iTotalTime;				// ��ʱ��
	private int iPlayStatus;			// ����״̬��0���ţ�1��ͣ
	private int iCutTime;			// ��ǰ����ʱ��		
	private int uiStartTime;			// ��Ŀ��ʼʱ��1
	private int uiEndTime;			// ��Ŀ����ʱ��1
	private String programName;		// ��Ŀ����	
	private String host;	// ������
	private int iRadioID;				// ��̨ID1
	private int iRadioType;			// ��̨Type1
	private String radioName;				// ��̨����1
	
	
	public int getradioid()
	{
		return iRadioID;
	}
	public int getradiotype()
	{
		return iRadioType;
	}
	public String getradioname()
	{
		return radioName;
	}
	public int getret()
	{
		return ret;
	}
	
	public  int getstatus()
	{
		return collect_status;
	}
	public int gettotaltime()
	{
		return iTotalTime;
	}
	public int getcutTime()
	{
		return iCutTime;
	}
	public int getstarttime()
	{
		return uiStartTime;
	}
	public int getendtime()
	{
		
		return uiEndTime;
	}
	
	
	public String getName()
	{
		return programName;
	}
	public String gethost()
	{
		return host;
	}
	public int getiPlayStatus() {
		return iPlayStatus;
	}
	public void setiPlayStatus(int iPlayStatus) {
		this.iPlayStatus = iPlayStatus;
	}
}
