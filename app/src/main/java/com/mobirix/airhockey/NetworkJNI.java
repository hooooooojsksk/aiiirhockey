package com.mobirix.airhockey;

import android.os.Message;
import com.mobirix.airhockey.airhockey;

/* loaded from: classes2.dex */
public class NetworkJNI {
    public static void doAnalytics_Event(String str, String str2, String str3) {
    }

    public static void doJniMessage(int i, int i2, int i3) {
        try {
            airhockey.mAct.mHandler.sendMessage(Message.obtain(airhockey.mAct.mHandler, i, i2, i3));
        } catch (Exception unused) {
        }
    }

    public static void doGameCall(String str) {
        try {
            airhockey.mAct.mstrPid = str;
            airhockey.MyHandler myHandler = airhockey.mAct.mHandler;
            airhockey airhockeyVar = airhockey.mAct;
            airhockey.mAct.mHandler.sendMessage(Message.obtain(myHandler, 103));
        } catch (Exception unused) {
        }
    }

    public static void doSaveGame_SaveInfo(int i, String str, String str2) {
        try {
            airhockey airhockeyVar = airhockey.mAct;
            airhockey.my_debug("doSaveGame_SaveInfo saveKind =" + i + "//index = " + str + "//path =" + str2);
            airhockey.mAct.mStrSaveGameIndex[i] = str;
            airhockey.mAct.mStrSaveGamePath[i] = str2;
            airhockey airhockeyVar2 = airhockey.mAct;
            airhockey.my_debug("doSaveGame_SaveInfo2");
        } catch (Exception unused) {
        }
    }

    public static void doSaveGame_LoadInfo(int i, String str, String str2) {
        try {
            airhockey.mAct.mStrSaveGameIndex[i] = str;
            airhockey.mAct.mStrSaveGamePath[i] = str2;
        } catch (Exception unused) {
        }
    }

    public static void doAnalytics_ScreenName(String str) {
        try {
            airhockey.mAct.mGooglePlayHelper.setAnalytics(str);
        } catch (Exception unused) {
        }
    }

    public static void doMsgToast(String str) {
        try {
            airhockey.mAct.mStrToast = str;
            airhockey.MyHandler myHandler = airhockey.mAct.mHandler;
            airhockey airhockeyVar = airhockey.mAct;
            airhockey.mAct.mHandler.sendMessage(Message.obtain(myHandler, 93));
        } catch (Exception unused) {
        }
    }

    public static void doStringMessage(int i, String str) {
        if (i == 53) {
            try {
                airhockey airhockeyVar = airhockey.mAct;
                airhockey.mStrUUID = str;
                airhockey.MyHandler myHandler = airhockey.mAct.mHandler;
                airhockey airhockeyVar2 = airhockey.mAct;
                airhockey.mAct.mHandler.sendMessage(Message.obtain(myHandler, 53));
            } catch (Exception unused) {
            }
        }
    }
}
