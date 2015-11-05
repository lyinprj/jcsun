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
				LIVE_RADIO(0x00),		// ֱ����̨
				VIRUTLA_RADIO(0x01),			// �㲥��̨
				FROM_PROGRAM_SCHEDULE(0x02),	// ��Ŀ��
				FROM_COLLECTION(0x03),		// �ղ�
				FROM_RECENTLISTEN(0x04),		// �������
				FROM_DOWNLOAD(0x05),			// ����
				FROM_SEARCH_RADIO(0x06),		// ������̨
				FROM_SEARCH_ALBUM(0x07),		// ����ר��
				FROM_SEARCH_PROGRAM(0x08),	// ������Ŀ
				FROM_LIVE_RADIO_LIST(0x09),	// ֱ����̨�б�
				LIVE_PROGRAM(0x0a),			// ֱ����Ŀ
				VIRTUAL_PROGRAM(0x0b);	// �㲥��Ŀ
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
	//�ӿ�
	/* Function Introduction : 	��ʼ������									*/
	public native int  JNI_SSP_iQTFM_Init();
	/* Function Introduction : 	����ʼ������								*/
	public native int  JNI_SSP_iQTFM_UnInit();
	/* Function Introduction : 	������Դ·��								*/
	public native void  JNI_SSP_vQTFM_SetResourcePath(String str);
	/* Function Introduction : 	ȡ����һ������ӿ�							*/
	public native void  JNI_SSP_iQTFM_CancelLastAction();
	/* Function Introduction : 	����/��ͣ��ǰ��Ŀ							*/
	public native int  JNI_SSP_iQTFM_Request_PlayOrPause(int iIsPlay);
	/* Function Introduction : 	����ָ����Ŀ/ֱ����̨						*/
	public native int  JNI_SSP_iQTFM_Request_PlayProgram(long radioID,int radioType,long programID,int source);
	/* Function Introduction : 	������һ����Ŀ								*/
	public native int  JNI_SSP_iQTFM_Request_PlayNextProgram();
	/* Function Introduction : 	������һ����Ŀ								*/
	public native int  JNI_SSP_iQTFM_Request_PlayPreProgram();
	/* Function Introduction : 	�ղػ�ȡ���ղ� 0--�ղأ�1--ȡ��				*/
	public native int  JNI_SSP_iQTFM_Request_Collect(int iIsCollect, long radioID,int radioType);
	/* Function Introduction : 	�����б�									*/
	public native int  JNI_SSP_iQTFM_Request_ClassList();
	/* Function Introduction : 	ά���б�									*/
	public native int  JNI_SSP_iQTFM_Request_DimensionList(int classID,int classAreaID);
	/* Function Introduction : 	��̨�б�									*/
	public native int  JNI_SSP_iQTFM_Request_RadioList(int classID,int dimensionID,int alRadioCount);
	/* Function Introduction : 	��Ŀ�б�									*/
	public native int  JNI_SSP_iQTFM_Request_ProgramList(int radioID,int radioType,int alProgramCount);
	/* Function Introduction : 	�ղ��б�									*/
	public native int  JNI_SSP_iQTFM_Request_CollectList();
	/* Function Introduction : 	��������б�								*/
	public native int  JNI_SSP_iQTFM_Request_RecentList();
	/* Function Introduction : 	�����ص�̨�б�								*/
	public native int  JNI_SSP_iQTFM_Request_DownRadioList();
	/* Function Introduction : 	�����ؽ�Ŀ�б�								*/
	public native int  JNI_SSP_iQTFM_Request_DownProgramList(int radioID);
	/* Function Introduction : 	�����ؼ����б�								*/
	public native int  JNI_SSP_iQTFM_Request_KeywordList();
	/* Function Introduction : 	��������б�								*/
	public native int  JNI_SSP_iQTFM_Request_Search(String searchword);
	/* Function Introduction : 	�˳��ֻ�Ӧ��								*/
	public native int  JNI_SSP_iQTFM_Exit_PhoneAPP();
	/* Function Introduction : �����б�										*/
	public native int  JNI_SSP_iQTFM_Request_CityList();
	/* Function Introduction : 	ֱ����̨�б�`								*/
	public native int  JNI_SSP_iQTFM_Request_LiveRadioList(int id,int attrID);
	/* Function Introduction : 	��ȡ��̨ͼƬ`								*/
	public native int  JNI_SSP_iQTFM_Request_RadioPicture(String pictureUrl,long radioID);
	/* Function Introduction : 	����ֱ����̨�б�							*/
	public native int JNI_SSP_iQTFM_Request_LivingRadio();
	/* Function Introduction : 	��ѡά���б�									*/
	public native int JNI_SSP_iQTFM_Request_SelectList();
	
	
	
	/*ע��ص�����								*/
	/* Function Introduction : ����ͼƬ�ص����� 00000						*/
	public native void  JNI_SDK_PushPicture_RegistCallBack(JNI_PushPictureCallBackInterface cCallBack);
	/* Function Introduction : ����ͼƬ�ص����� 00000							*/
	public native void  JNI_SDK_Get_RadioPicture_RegistCallBack(JNI_Get_RadioPictureCallBackInterface cCallBack);
	/* Function Introduction : ��ǰ���Ž�Ŀ��Ϣ�ص�����333						*/	
	public native void  JNI_SDK_Get_CurProgramInfo_RegistCallBack(JNI_Get_CurProgramInfoCallBackInterface cCallBack ,JNI_ST_CURPROGRAM_INFO pstCurProgramInfo);
	/* Function Introduction : �ղؽ���ص�����00000								*/
	public native void  JNI_SDK_Get_CollectResult_RegistCallBack(JNI_Get_CollectResultCallBackInterface cCallBack);
	/* Function Introduction : ��ȡ�����б�ص�����	111						*/
	public native void  JNI_SDK_Get_ClassList_RegistCallBack(JNI_Get_ClassListCallBackInterface cCallBack ,JNI_ST_CLASS_LIST pstClassList,JNI_ST_CLASSINFO pstClassinfo,JNI_ST_RADIOCLASSINFO pstradioClassinfo);
	/* Function Introduction : ��ȡά���б�ص�����22222							*/
	public native void  JNI_SDK_Get_DimensionList_RegistCallBack(JNI_Get_DimensionListCallBackInterface cCallBack,JNI_ST_DIMENSION_LIST pstDimensionList,JNI_ST_DIMENSIONINFO pstDimensionInfo,JNI_ST_RECOMMEND pstRecommend);
	/* Function Introduction : ��ȡ��̨�б�ص�����	22222						*/
	public native void  JNI_SDK_Get_RadioList_RegistCallBack(JNI_Get_RadioListCallBackInterface cCallBack,JNI_ST_RADIO_LIST pstRadioList,JNI_ST_RADIOINFO pstRadioInfo);
	/* Function Introduction : ��ȡ��Ŀ�б�ص�����	111						*/
	public native void  JNI_SDK_Get_ProgramList_RegistCallBack(JNI_Get_ProgramListCallBackInterface cCallBack,JNI_ST_PROGRAM_LIST pstProgramList,JNI_ST_PROGRAMIFO pstProgramInfo);
	/* Function Introduction : ��ȡ�ղ��б�ص�����	33333						*/
	public native void  JNI_SDK_Get_CollectList_RegistCallBack(JNI_Get_CollectListCallBackInterface cCallBack,JNI_ST_COLLECT_LIST pstCollectList,JNI_ST_COLLECTINFO pstCollectInfo);
	/* Function Introduction : ��ȡ��������б�ص�����3333						*/
	public native void  JNI_SDK_Get_RecentList_RegistCallBack(JNI_Get_RecentListCallBackInterface cCallBack,JNI_ST_RECENTLISTEN_LIST pstRecentListenList,JNI_ST_RECENTLISTENINFO pstRecentListenInfo);
	/* Function Introduction : ��ȡ�����ص�̨�б�ص�����	3333				*/
	public native void  JNI_SDK_Get_DownRadioList_RegistCallBack(JNI_Get_DownRadioListCallBackInterface cCallBack,JNI_ST_DOWNRADIO_LIST pstDownRadioList,JNI_ST_DOWNRADIOINFO pstDownRadioInfo);
	/* Function Introduction : ��ȡ�����ؽ�Ŀ�б�ص�����	3333				*/
	public native void  JNI_SDK_Get_DownProgramList_RegistCallBack(JNI_Get_DownProgramListCallBackInterface cCallBack,JNI_ST_DOWNPROGRAM_LIST pstDownProgramList,JNI_ST_DOWNPROGRAMINFO pstDownProgramInfo);
	/* Function Introduction : ��ȡ�����ؼ����б�ص�����	3333				*/
	public native void  JNI_SDK_Get_KeywordList_RegistCallBack(JNI_Get_KeywordListCallBackInterface cCallBack,JNI_ST_KEYWORD_LIST pstKeywordList,JNI_ST_KEYWORD pstKeyword);
	/* Function Introduction : ��ȡ��������б�ص�����3333						*/
	public native void  JNI_SDK_Get_ResultList_RegistCallBack(JNI_Get_ResultListCallBackInterface cCallBack,JNI_ST_RESULT_LIST pstResultList,JNI_ST_RESULTINFO pstResultRadioList,JNI_ST_RESULTPROINFO pstResultProgramList);
	/* Function Introduction : �쳣�Ͽ��ص�����3333								*/
	public native void  JNI_SDK_DisConnect_RegistCallBack(JNI_DisConnectCallBackInterface cCallBack);
	/* Function Introduction : �����ֻ�APP�ص�111								*/
	public native void  JNI_SDK_WakeUp_PhoneAPP_RegistCallBack(JNI_WakeUp_PhoneAPPCallBackInterface cCallBack);
	/* Function Introduction : ��ȡ�����б�ص�����3333							*/
	public native void  JNI_SDK_Get_CityList_RegistCallBack(JNI_Get_CityListCallBackInterface cCallBack,JNI_ST_CITY_LIST pstCitylist ,JNI_ST_CITYINFO pstCityInfo);
	/* Function Introduction : ��ȡֱ����̨�б�ص�����22222						*/
	public native void  JNI_SDK_Get_LiveRadioList_RegistCallBack(JNI_Get_LiveRadioListCallBackInterface cCallBack,JNI_ST_LIVERADIO_LIST pstLiveRadioList,JNI_ST_LIVERADIOINFO pstLiveRadioInfo);
	/* Function Introduction : �ֻ���ͣ�򲥷����͸�����						*/
	public native void  JNI_SDK_Get_PhonePlayPause_RegistCallBack(JNI_Get_PhonePlayPauseCallBackInterface cCallBack);
	/* Function Introduction : ����ֱ����̨�б�						*/
	public native void  JNI_SDK_Get_LivingRadioList_RegistCallBack(JNI_Get_LivingRadioListCallBackInterface cCallBack,JNI_ST_LIVINGRADIOINFO livingRadioInfoClass);
	/* Function Introduction : ��ѡά���б�								*/
	public native void  JNI_SDK_Get_SelectList_RegistCallBack(JNI_Get_SelectListCallBackInterface cCallBack,JNI_ST_DIMENSIONINFO dimensionInfoClass,JNI_ST_RECOMMEND recommendClass);
	
	
}
