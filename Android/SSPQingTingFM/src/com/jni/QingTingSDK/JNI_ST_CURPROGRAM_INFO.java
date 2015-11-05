package com.jni.QingTingSDK;

public class JNI_ST_CURPROGRAM_INFO {

	private int  ret;                // 1
	private int collect_status;		// 收藏状态: 0已收藏，1未收藏
	private int iTotalTime;				// 总时间
	private int iPlayStatus;			// 播放状态，0播放，1暂停
	private int iCutTime;			// 当前播放时间		
	private int uiStartTime;			// 节目开始时间1
	private int uiEndTime;			// 节目结束时间1
	private String programName;		// 节目名称	
	private String host;	// 主持人
	private int iRadioID;				// 电台ID1
	private int iRadioType;			// 电台Type1
	private String radioName;				// 电台名称1
	
	
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
