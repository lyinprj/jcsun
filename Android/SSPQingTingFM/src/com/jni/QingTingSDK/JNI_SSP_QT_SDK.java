package com.jni.QingTingSDK;

import com.jni.QingTingSDK.JNI_SSP_QT_SDK;

public class JNI_SSP_QT_SDK {
	static
	{
		//load library
	    System.loadLibrary("SSP_SDK_Core");
	    System.loadLibrary("SSP_LINK_QT_SDK");
        System.loadLibrary("JNISSP_LINK_QT_SDK");
   
   
	}
	public enum TYPE{
				LIVE_RADIO(0x00),		// 直播电台
				VIRUTLA_RADIO(0x01),			// 点播电台
				FROM_PROGRAM_SCHEDULE(0x02),	// 节目单
				FROM_COLLECTION(0x03),		// 收藏
				FROM_RECENTLISTEN(0x04),		// 最近收听
				FROM_DOWNLOAD(0x05),			// 下载
				FROM_SEARCH_RADIO(0x06),		// 搜索电台
				FROM_SEARCH_ALBUM(0x07),		// 搜索专辑
				FROM_SEARCH_PROGRAM(0x08),	// 搜索节目
				FROM_LIVE_RADIO_LIST(0x09),	// 直播电台列表
				LIVE_PROGRAM(0x0a),			// 直播节目
				VIRTUAL_PROGRAM(0x0b);	// 点播节目
				int value;  
				TYPE( int value ) {  
			            this.value = value;  
			     }  
	}
	
	private static JNI_SSP_QT_SDK O_WeatherSDKobj = null;
	public static synchronized JNI_SSP_QT_SDK GetNewsSDK()
	{
		if(O_WeatherSDKobj == null)
		{
			O_WeatherSDKobj = new JNI_SSP_QT_SDK();
		}
		return O_WeatherSDKobj;
	}
	//接口
	/* Function Introduction : 	初始化函数									*/
	public native int  JNI_SSP_iQTFM_Init();
	/* Function Introduction : 	反初始化函数								*/
	public native int  JNI_SSP_iQTFM_UnInit();
	/* Function Introduction : 	设置资源路径								*/
	public native void  JNI_SSP_vQTFM_SetResourcePath(String str);
	/* Function Introduction : 	取消上一次请求接口							*/
	public native void  JNI_SSP_iQTFM_CancelLastAction();
	/* Function Introduction : 	播放/暂停当前节目							*/
	public native int  JNI_SSP_iQTFM_Request_PlayOrPause(int iIsPlay);
	/* Function Introduction : 	播放指定节目/直播电台						*/
	public native int  JNI_SSP_iQTFM_Request_PlayProgram(long radioID,int radioType,long programID,int source);
	/* Function Introduction : 	播放下一个节目								*/
	public native int  JNI_SSP_iQTFM_Request_PlayNextProgram();
	/* Function Introduction : 	播放上一个节目								*/
	public native int  JNI_SSP_iQTFM_Request_PlayPreProgram();
	/* Function Introduction : 	收藏或取消收藏 0--收藏，1--取消				*/
	public native int  JNI_SSP_iQTFM_Request_Collect(int iIsCollect, long radioID,int radioType);
	/* Function Introduction : 	分类列表									*/
	public native int  JNI_SSP_iQTFM_Request_ClassList();
	/* Function Introduction : 	维度列表									*/
	public native int  JNI_SSP_iQTFM_Request_DimensionList(int classID,int classAreaID);
	/* Function Introduction : 	电台列表									*/
	public native int  JNI_SSP_iQTFM_Request_RadioList(int classID,int dimensionID,int alRadioCount);
	/* Function Introduction : 	节目列表									*/
	public native int  JNI_SSP_iQTFM_Request_ProgramList(int radioID,int radioType,int alProgramCount);
	/* Function Introduction : 	收藏列表									*/
	public native int  JNI_SSP_iQTFM_Request_CollectList();
	/* Function Introduction : 	最近收听列表								*/
	public native int  JNI_SSP_iQTFM_Request_RecentList();
	/* Function Introduction : 	已下载电台列表								*/
	public native int  JNI_SSP_iQTFM_Request_DownRadioList();
	/* Function Introduction : 	已下载节目列表								*/
	public native int  JNI_SSP_iQTFM_Request_DownProgramList(int radioID);
	/* Function Introduction : 	搜索关键字列表								*/
	public native int  JNI_SSP_iQTFM_Request_KeywordList();
	/* Function Introduction : 	搜索结果列表								*/
	public native int  JNI_SSP_iQTFM_Request_Search(String searchword);
	/* Function Introduction : 	退出手机应用								*/
	public native int  JNI_SSP_iQTFM_Exit_PhoneAPP();
	/* Function Introduction : 城市列表										*/
	public native int  JNI_SSP_iQTFM_Request_CityList();
	/* Function Introduction : 	直播电台列表`								*/
	public native int  JNI_SSP_iQTFM_Request_LiveRadioList(int id,int attrID);
	/* Function Introduction : 	获取电台图片`								*/
	public native int  JNI_SSP_iQTFM_Request_RadioPicture(String pictureUrl,long radioID);
	/* Function Introduction : 	正在直播电台列表							*/
	public native int JNI_SSP_iQTFM_Request_LivingRadio();
	/* Function Introduction : 	精选维度列表									*/
	public native int JNI_SSP_iQTFM_Request_SelectList();
	
	
	
	/*注册回调函数								*/
	/* Function Introduction : 推送图片回调函数 00000						*/
	public native void  JNI_SDK_PushPicture_RegistCallBack(JNI_PushPictureCallBackInterface cCallBack);
	/* Function Introduction : 推送图片回调函数 00000							*/
	public native void  JNI_SDK_Get_RadioPicture_RegistCallBack(JNI_Get_RadioPictureCallBackInterface cCallBack);
	/* Function Introduction : 当前播放节目信息回调函数333						*/	
	public native void  JNI_SDK_Get_CurProgramInfo_RegistCallBack(JNI_Get_CurProgramInfoCallBackInterface cCallBack ,JNI_ST_CURPROGRAM_INFO pstCurProgramInfo);
	/* Function Introduction : 收藏结果回调函数00000								*/
	public native void  JNI_SDK_Get_CollectResult_RegistCallBack(JNI_Get_CollectResultCallBackInterface cCallBack);
	/* Function Introduction : 获取分类列表回调函数	111						*/
	public native void  JNI_SDK_Get_ClassList_RegistCallBack(JNI_Get_ClassListCallBackInterface cCallBack ,JNI_ST_CLASS_LIST pstClassList,JNI_ST_CLASSINFO pstClassinfo,JNI_ST_RADIOCLASSINFO pstradioClassinfo);
	/* Function Introduction : 获取维度列表回调函数22222							*/
	public native void  JNI_SDK_Get_DimensionList_RegistCallBack(JNI_Get_DimensionListCallBackInterface cCallBack,JNI_ST_DIMENSION_LIST pstDimensionList,JNI_ST_DIMENSIONINFO pstDimensionInfo,JNI_ST_RECOMMEND pstRecommend);
	/* Function Introduction : 获取电台列表回调函数	22222						*/
	public native void  JNI_SDK_Get_RadioList_RegistCallBack(JNI_Get_RadioListCallBackInterface cCallBack,JNI_ST_RADIO_LIST pstRadioList,JNI_ST_RADIOINFO pstRadioInfo);
	/* Function Introduction : 获取节目列表回调函数	111						*/
	public native void  JNI_SDK_Get_ProgramList_RegistCallBack(JNI_Get_ProgramListCallBackInterface cCallBack,JNI_ST_PROGRAM_LIST pstProgramList,JNI_ST_PROGRAMIFO pstProgramInfo);
	/* Function Introduction : 获取收藏列表回调函数	33333						*/
	public native void  JNI_SDK_Get_CollectList_RegistCallBack(JNI_Get_CollectListCallBackInterface cCallBack,JNI_ST_COLLECT_LIST pstCollectList,JNI_ST_COLLECTINFO pstCollectInfo);
	/* Function Introduction : 获取最近收听列表回调函数3333						*/
	public native void  JNI_SDK_Get_RecentList_RegistCallBack(JNI_Get_RecentListCallBackInterface cCallBack,JNI_ST_RECENTLISTEN_LIST pstRecentListenList,JNI_ST_RECENTLISTENINFO pstRecentListenInfo);
	/* Function Introduction : 获取已下载电台列表回调函数	3333				*/
	public native void  JNI_SDK_Get_DownRadioList_RegistCallBack(JNI_Get_DownRadioListCallBackInterface cCallBack,JNI_ST_DOWNRADIO_LIST pstDownRadioList,JNI_ST_DOWNRADIOINFO pstDownRadioInfo);
	/* Function Introduction : 获取已下载节目列表回调函数	3333				*/
	public native void  JNI_SDK_Get_DownProgramList_RegistCallBack(JNI_Get_DownProgramListCallBackInterface cCallBack,JNI_ST_DOWNPROGRAM_LIST pstDownProgramList,JNI_ST_DOWNPROGRAMINFO pstDownProgramInfo);
	/* Function Introduction : 获取搜索关键字列表回调函数	3333				*/
	public native void  JNI_SDK_Get_KeywordList_RegistCallBack(JNI_Get_KeywordListCallBackInterface cCallBack,JNI_ST_KEYWORD_LIST pstKeywordList,JNI_ST_KEYWORD pstKeyword);
	/* Function Introduction : 获取搜索结果列表回调函数3333						*/
	public native void  JNI_SDK_Get_ResultList_RegistCallBack(JNI_Get_ResultListCallBackInterface cCallBack,JNI_ST_RESULT_LIST pstResultList,JNI_ST_RESULTINFO pstResultRadioList,JNI_ST_RESULTPROINFO pstResultProgramList);
	/* Function Introduction : 异常断开回调函数3333								*/
	public native void  JNI_SDK_DisConnect_RegistCallBack(JNI_DisConnectCallBackInterface cCallBack);
	/* Function Introduction : 唤醒手机APP回调111								*/
	public native void  JNI_SDK_WakeUp_PhoneAPP_RegistCallBack(JNI_WakeUp_PhoneAPPCallBackInterface cCallBack);
	/* Function Introduction : 获取城市列表回调函数3333							*/
	public native void  JNI_SDK_Get_CityList_RegistCallBack(JNI_Get_CityListCallBackInterface cCallBack,JNI_ST_CITY_LIST pstCitylist ,JNI_ST_CITYINFO pstCityInfo);
	/* Function Introduction : 获取直播电台列表回调函数22222						*/
	public native void  JNI_SDK_Get_LiveRadioList_RegistCallBack(JNI_Get_LiveRadioListCallBackInterface cCallBack,JNI_ST_LIVERADIO_LIST pstLiveRadioList,JNI_ST_LIVERADIOINFO pstLiveRadioInfo);
	/* Function Introduction : 手机暂停或播放推送给车机						*/
	public native void  JNI_SDK_Get_PhonePlayPause_RegistCallBack(JNI_Get_PhonePlayPauseCallBackInterface cCallBack);
	/* Function Introduction : 正在直播电台列表						*/
	public native void  JNI_SDK_Get_LivingRadioList_RegistCallBack(JNI_Get_LivingRadioListCallBackInterface cCallBack,JNI_ST_LIVINGRADIOINFO livingRadioInfoClass);
	/* Function Introduction : 精选维度列表								*/
	public native void  JNI_SDK_Get_SelectList_RegistCallBack(JNI_Get_SelectListCallBackInterface cCallBack,JNI_ST_DIMENSIONINFO dimensionInfoClass,JNI_ST_RECOMMEND recommendClass);
	
	
}
