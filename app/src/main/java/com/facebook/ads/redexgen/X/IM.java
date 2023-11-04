package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.ByteCompanionObject;
import org.cocos2dx.lib.GameControllerDelegate;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public final class IM {
    public static byte[] A00;
    public static String[] A01 = {"UmMlfAJJysNoFzDVq3Qadmy32zpeb1XF", "HllnJbGbN3", "8LLGh47zYIGz9mlPEtFaTcZuh", "UxHymo9qL", "LEtC8FtnVg5ihxRCphfXt4mvpUeUrdN6", "uWIYhcHXlNvGJXs3GUOJ1PEuERlV4x7", "VZrIuYan0GxbimTZrmDwvEADARuUOj", "38Z9W6n0Eu6i9ylO2bMusVthcISfAJzl"};

    public static String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[2].length() == 18) {
                throw new RuntimeException();
            }
            A01[0] = "coY8s09zVAK7eBnMiZlV9B8LCQZOBRZX";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
            i4++;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static HashMap<String, Integer> A0M(Context context) throws JSONException {
        String A2K = IK.A0P(context).A2K(A0L(24, 35, 123), A0L(22, 2, 109));
        HashMap<String, Integer> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray(A2K);
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String A0L = A0L(0, 1, 69);
                if (optString.contains(A0L)) {
                    String[] split = optString.split(A0L);
                    try {
                        hashMap.put(split[0], Integer.valueOf(Integer.parseInt(split[1])));
                    } catch (NumberFormatException unused) {
                        throw new JSONException(A0L(1, 21, 121));
                    }
                } else {
                    hashMap.put(optString, -1);
                }
            }
        }
        return hashMap;
    }

    public static void A0N() {
        A00 = new byte[]{airhockey.J_BACK, 48, 18, 29, 84, 7, 83, 3, 18, 1, 0, 22, 83, 0, 18, 30, 3, 31, 26, 29, 20, 93, 60, 58, 16, 21, 21, 24, 5, 24, 30, 31, 16, 29, 46, 21, 20, 19, 4, 22, 46, 29, 30, 22, 22, 24, 31, 22, 46, 19, 29, 16, 18, 26, 46, 29, 24, 2, 5, 55, 50, 50, 63, 34, 63, 57, 56, 55, 58, 9, 50, 51, 52, 35, 49, 9, 58, 57, 49, 49, 63, 56, 49, 9, 52, 58, 55, 53, 61, 9, 58, 63, 37, 34, 9, 38, 51, 36, 53, 51, 56, 34, 55, 49, 51, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYSCORE, 78, 83, 78, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, airhockey.P_GAME_BREAKBALLCOUNT, 75, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, airhockey.P_GAME_STANDBY, 82, 64, airhockey.J_ACHIEVEMENTCALLBACK, 75, airhockey.P_GAME_MYLOSE, 64, 64, 78, airhockey.P_GAME_REMATCH, 64, airhockey.J_ACHIEVEMENTCALLBACK, 84, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_EXIT, 87, 75, 78, airhockey.P_GAME_REMATCH, 64, airhockey.J_ACHIEVEMENTCALLBACK, 87, airhockey.P_NATION, 85, airhockey.P_GAME_SELECTMAP, airhockey.P_NATION, airhockey.P_GAME_REMATCH, 83, airhockey.P_GAME_BREAKBALLCOUNT, 64, airhockey.P_NATION, 48, 53, 63, 38, 14, 48, 53, 53, 56, 37, 56, 62, 63, 48, 61, 14, 61, 62, 54, 54, 56, 63, 54, 14, 35, 52, 37, 35, 40, 14, 61, 56, 60, 56, 37, 9, 12, 6, 31, 55, 9, 12, 12, 1, 28, 1, 7, 6, 9, 4, 55, 4, 7, 15, 15, 1, 6, 15, 55, 29, 27, 13, 55, 28, 13, 5, 24, 55, 14, 1, 4, 13, 55, 14, 7, 26, 55, 26, 13, 31, 26, 1, 28, 13, 80, 85, 95, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_INVITE, 80, 95, 85, airhockey.P_GAME_MYSCORE, 94, 88, 85, airhockey.J_INVITE, 80, 93, airhockey.P_GAME_BREAKBALLCOUNT, 80, airhockey.P_GAME_MYLOSE, airhockey.P_NATION, airhockey.J_INVITE, 93, 94, 86, airhockey.J_INVITE, 82, 94, airhockey.P_GAME_MYSCORE, 84, airhockey.J_INVITE, 87, airhockey.P_GAME_SELECTMAP, 95, 95, 84, 93, airhockey.J_INVITE, 84, airhockey.P_GAME_MYWIN, 84, 95, airhockey.P_GAME_STANDBY, airhockey.P_NATION, 28, 25, 19, 10, 34, 28, 19, 25, 15, 18, 20, 25, 34, 30, 28, 30, 21, 24, 34, 25, 24, 31, 8, 26, 34, 24, 11, 24, 19, 9, 14, 34, 14, 28, 16, 13, 17, 20, 19, 26, 34, 15, 28, 9, 24, 17, 20, 30, 7, 47, 17, 30, 20, 2, 31, 25, 20, 47, 20, 25, 3, 0, 17, 4, 19, 24, 21, 2, 47, 25, 30, 25, 4, 25, 17, 28, 47, 2, 21, 4, 2, 9, 47, 20, 21, 28, 17, 9, 47, 29, 3, airhockey.J_BACK, airhockey.J_DISCONNECT, 126, airhockey.J_ENEMYWIN, 79, airhockey.J_BACK, 126, airhockey.J_DISCONNECT, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, airhockey.J_DISCONNECT, 79, airhockey.J_DISCONNECT, airhockey.J_WAIT, 99, 96, airhockey.J_BACK, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, airhockey.J_NATION, 79, 125, airhockey.J_BACK, airhockey.J_ENEMYLOSE, 79, airhockey.J_NATION, airhockey.J_ERROR, airhockey.J_ONREWARDED, airhockey.J_NATION, airhockey.J_GAME_REMATCH, 79, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_STANDBY, 126, airhockey.J_ONREWARDED, 8, 13, 7, 30, 54, 8, 7, 13, 27, 6, 0, 13, 54, 15, 28, 7, 7, 12, 5, 54, 13, 12, 11, 28, 14, 54, 12, 31, 12, 7, 29, 26, 54, 26, 8, 4, 25, 5, 0, 7, 14, 54, 27, 8, 29, 12, 16, 21, 31, 6, 46, 16, 31, 21, 3, 30, 24, 21, 46, 24, 1, 18, 46, 21, 20, 19, 4, 22, 46, 20, 7, 20, 31, 5, 2, 46, 2, 16, 28, 1, 29, 24, 31, 22, 46, 3, 16, 5, 20, airhockey.J_SAVEDGAME_RELOAD, 119, 125, airhockey.J_ONREWARDED, 76, airhockey.J_SAVEDGAME_RELOAD, 125, 119, airhockey.J_SDKVER, 124, airhockey.J_PURCHASE, 119, 76, ByteCompanionObject.MAX_VALUE, 124, airhockey.J_GOO, airhockey.J_SAVEDGAME_RELOAD, ByteCompanionObject.MAX_VALUE, 76, airhockey.J_GOO, 124, 102, 125, airhockey.J_ENEMYWIN, airhockey.J_REWARD, airhockey.J_SDKVER, 96, 76, 96, airhockey.J_SAVEDGAME_RELOAD, 126, 99, ByteCompanionObject.MAX_VALUE, airhockey.J_PURCHASE, 125, airhockey.J_DISCONNECT, 76, airhockey.J_SDKVER, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYWIN, airhockey.J_REWARD, 96, airhockey.J_GAME_STANDBY, 111, airhockey.J_REWARD, 94, 96, 111, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_SAVE, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, airhockey.J_GAME_STANDBY, 94, 111, 96, airhockey.J_ERROR, airhockey.J_ENEMYLOSE, 119, airhockey.J_ONREWARDED, 94, 119, airhockey.J_ENEMYLOSE, airhockey.J_ONREWARDED, airhockey.J_REWARD, 96, 99, airhockey.J_ENEMYLOSE, 109, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, airhockey.J_ACHIEVEMENTCALLBACK, 94, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ACHIEVEMENTCALLBACK, 94, airhockey.J_SAVEDGAME_RELOAD, 96, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, 109, airhockey.J_ENEMYLOSE, 111, 102, 94, airhockey.J_SAVEDGAME_SAVE, 96, airhockey.J_ERROR, airhockey.J_ONREWARDED, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 77, 84, 124, airhockey.P_NATION, 77, airhockey.P_GAME_MYWIN, 81, 76, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYWIN, 124, 77, airhockey.P_GAME_BREAKBALLCOUNT, 87, 84, 76, 81, airhockey.P_GAME_MYLOSE, 124, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 65, 86, airhockey.P_GAME_SELECTMAP, 124, airhockey.P_GAME_BREAKBALLCOUNT, 85, airhockey.P_GAME_BREAKBALLCOUNT, 77, 87, 80, 124, 80, airhockey.P_NATION, 78, 83, 79, airhockey.P_GAME_EXIT, 77, airhockey.P_GAME_SELECTMAP, 124, 81, airhockey.P_NATION, 87, airhockey.P_GAME_BREAKBALLCOUNT, 51, 54, 60, 37, 13, 51, 60, 54, 32, 61, 59, 54, 13, 39, 33, 55, 13, 62, 61, 49, 51, 62, 13, 49, 61, 39, 60, 38, 55, 32, 33, airhockey.P_GAME_EXIT, 79, airhockey.P_GAME_STANDBY, 92, airhockey.J_DISCONNECT, 79, 78, airhockey.P_GAME_REMATCH, 94, 76, airhockey.J_DISCONNECT, airhockey.P_GAME_MYWIN, airhockey.P_GAME_SELECTMAP, 76, airhockey.J_DISCONNECT, 77, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 78, airhockey.J_DISCONNECT, 88, airhockey.P_NATION, 81, 78, airhockey.J_DISCONNECT, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_NATION, 95, airhockey.J_DISCONNECT, airhockey.P_GAME_REMATCH, 82, 95, 78, 88, 94, 91, 81, airhockey.P_GAME_MYLOSE, 96, 91, 90, 93, airhockey.P_GAME_EXIT, 88, 96, 83, 80, 88, 88, 86, 81, 88, 44, 41, 35, 58, 18, 41, 40, 47, 56, 42, 18, 33, 34, 42, 42, 36, 35, 42, 18, 40, 59, 40, 35, 57, 18, 33, 36, 32, 36, 57, 15, 10, 0, 25, 49, 2, 1, 9, 49, 15, 10, 10, 7, 26, 7, 1, 0, 15, 2, 49, 2, 1, 9, 9, 7, 0, 9, 49, 11, 24, 11, 0, 26, 29, 49, 2, 7, 3, 7, 26, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_RELOAD, 90, airhockey.J_GAME_REMATCH, airhockey.J_GAME_EXIT, airhockey.J_NATION, 90, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_SDKVER, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, 90, airhockey.J_GAME_REMATCH, airhockey.J_GAME_EXIT, airhockey.J_NATION, airhockey.J_NATION, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, 90, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, 90, airhockey.J_ENEMYLOSE, 96, airhockey.J_ENEMYLOSE, airhockey.J_GAME_EXIT, 119, 124, 90, 96, airhockey.J_SAVEDGAME_SAVE, 96, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, airhockey.J_REWARD, 90, airhockey.J_GAME_REMATCH, airhockey.J_GAME_DISCONNECT, airhockey.J_ENEMYLOSE, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 77, 84, 124, 79, 76, airhockey.P_GAME_SELECTMAP, 124, airhockey.P_NATION, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYWIN, airhockey.P_GAME_EXIT, 87, airhockey.P_GAME_EXIT, 76, 77, airhockey.P_NATION, 79, 124, 79, 76, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_EXIT, 77, airhockey.P_GAME_SELECTMAP, 124, 80, airhockey.P_GAME_BREAKBALLCOUNT, 80, 80, airhockey.P_GAME_EXIT, 76, 77, 124, airhockey.P_GAME_BREAKBALLCOUNT, 85, airhockey.P_GAME_BREAKBALLCOUNT, 77, 87, 80, 124, airhockey.P_NATION, 79, 84, airhockey.P_NATION, 90, 80, 99, 102, airhockey.J_GAME_DISCONNECT, airhockey.J_ERROR, 93, airhockey.J_BACK, airhockey.J_ENEMYWIN, airhockey.J_GAME_DISCONNECT, 102, 93, 99, 102, 102, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, 109, airhockey.J_GAME_DISCONNECT, 99, airhockey.J_INVITE, 93, 102, airhockey.J_ENEMYWIN, 96, 119, airhockey.J_GAME_STANDBY, 93, airhockey.J_INVITE, 109, airhockey.J_GAME_STANDBY, airhockey.J_GAME_STANDBY, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, 93, airhockey.J_BACK, airhockey.J_REWARD, 99, airhockey.J_SDKVER, airhockey.J_GAME_REMATCH, airhockey.J_REWARD, airhockey.J_GOO, 99, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, 123, 126, airhockey.J_DISCONNECT, 109, airhockey.P_GAME_STANDBY, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 111, airhockey.J_REWARD, 126, airhockey.P_GAME_STANDBY, 111, airhockey.J_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_STANDBY, 124, airhockey.J_SAVEDGAME_SAVE, airhockey.J_REWARD, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, 123, airhockey.J_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, 126, airhockey.P_GAME_STANDBY, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, airhockey.J_ERROR, airhockey.J_ENEMYLOSE, 126, airhockey.P_GAME_STANDBY, 126, 123, airhockey.J_INVITE, 123, airhockey.J_ACHIEVEMENTCALLBACK, 123, airhockey.J_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, 35, 38, 44, 53, 29, 55, 49, 39, 29, 49, 42, 45, 48, 54, 29, 39, 44, 52, 29, 38, 35, 54, 35, 29, 
        36, 45, 48, 29, 35, 38, 38, 43, 54, 43, 45, 44, 35, 46, 29, 46, 45, 37, 37, 43, 44, 37, 123, 125, airhockey.P_GAME_BREAKBALLCOUNT, 125, airhockey.J_ACHIEVEMENTCALLBACK, 109, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_ERROR, airhockey.J_REWARD, 126, 126, airhockey.J_GOO, 119, 126, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_ERROR, airhockey.J_GOO, airhockey.J_DISCONNECT, airhockey.J_GOO, 109, 61, 38, 33, 46, 33, 45, 44, 23, 36, 39, 47, 47, 33, 38, 47, 23, 44, 33, 59, 56, 41, 60, 43, 32, 23, 33, 38, 60, 45, 58, 62, 41, 36, 23, 59, 45, 43, 39, 38, 44, 59, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, airhockey.J_SDKVER, airhockey.J_INVITE, airhockey.J_NATION, 99, 88, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYLOSE, 96, 96, airhockey.J_INVITE, airhockey.J_GAME_REMATCH, 96, 88, airhockey.J_NATION, airhockey.J_BACK, airhockey.J_NATION, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, 88, airhockey.J_GAME_ENEMYEXIT, airhockey.J_INVITE, airhockey.J_GAME_EXIT, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, 25, 2, 5, 10, 5, 9, 8, 51, 0, 3, 11, 11, 5, 2, 11, 51, 5, 1, 1, 9, 8, 5, 13, 24, 9, 51, 8, 9, 0, 13, 21, 51, 1, 31, 126, airhockey.J_GAME_STANDBY, airhockey.J_NATION, 109, airhockey.J_NATION, airhockey.J_INVITE, 111, 84, airhockey.J_ENEMYWIN, airhockey.J_ONREWARDED, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_DISCONNECT, airhockey.J_NATION, airhockey.J_GAME_STANDBY, airhockey.J_GAME_DISCONNECT, 84, airhockey.J_WAIT, airhockey.J_INVITE, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, airhockey.J_SAVEDGAME_RELOAD, 84, airhockey.J_ENEMYWIN, airhockey.J_NATION, 102, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE};
    }

    static {
        A0N();
    }

    public static int A00(Context context) {
        return IK.A0P(context).A2I(A0L(750, 40, 100), 10);
    }

    public static int A01(Context context) {
        return IK.A0P(context).A2I(A0L(790, 50, 15), 50);
    }

    public static int A02(Context context) {
        return IK.A0P(context).A2I(A0L(149, 35, 91), 1);
    }

    public static int A03(Context context) {
        return A0H(context, A0L(59, 46, 92), 0);
    }

    public static int A04(Context context) {
        return A0H(context, A0L(105, 44, 45), 0);
    }

    public static int A05(Context context) {
        return IK.A0P(context).A2I(A0L(GameControllerDelegate.BUTTON_SELECT, 21, 19), 10);
    }

    public static int A06(Context context) {
        return IK.A0P(context).A2I(A0L(275, 45, 119), 0);
    }

    public static int A07(Context context) {
        return IK.A0P(context).A2I(A0L(666, 36, 33), 10485760);
    }

    public static int A08(Context context) {
        return IK.A0P(context).A2I(A0L(720, 30, 71), 30);
    }

    public static int A09(Context context) {
        return IK.A0P(context).A2I(A0L(366, 39, 26), 5);
    }

    public static int A0A(Context context) {
        return IK.A0P(context).A2I(A0L(HttpStatus.SC_METHOD_NOT_ALLOWED, 46, 99), 0);
    }

    public static int A0B(Context context) {
        return IK.A0P(context).A2I(A0L(451, 43, 123), 0);
    }

    public static int A0C(Context context) {
        return IK.A0P(context).A2I(A0L(494, 41, 25), 0);
    }

    public static int A0D(Context context) {
        return IK.A0P(context).A2I(A0L(535, 53, 11), 0);
    }

    public static int A0E(Context context) {
        return IK.A0P(context).A2I(A0L(588, 47, 41), 0);
    }

    public static int A0F(Context context) {
        return IK.A0P(context).A2I(A0L(1084, 27, 13), 30);
    }

    public static int A0G(Context context) {
        return IK.A0P(context).A2I(A0L(1145, 27, 1), 20);
    }

    public static int A0H(Context context, String str, int i) {
        int A2I = IK.A0P(context).A2I(str, i);
        if (A2I >= 0 && A2I < 101) {
            return A2I;
        }
        return i;
    }

    public static long A0I(Context context) {
        return IK.A0P(context).A2J(A0L(320, 46, 122), 2000L);
    }

    public static long A0J(Context context) {
        return IK.A0P(context).A2I(A0L(1043, 41, 66), HttpStatus.SC_MULTIPLE_CHOICES) * 1000;
    }

    public static long A0K(Context context) {
        return IK.A0P(context).A2J(A0L(1111, 34, 102), 500L);
    }

    public static boolean A0O(Context context) {
        return IK.A0P(context).A2N(A0L(184, 49, 98), true);
    }

    public static boolean A0P(Context context) {
        return IK.A0P(context).A2N(A0L(702, 18, 53), false);
    }

    public static boolean A0Q(Context context) {
        return IK.A0P(context).A2N(A0L(840, 49, 41), true);
    }

    public static boolean A0R(Context context) {
        return IK.A0P(context).A2N(A0L(889, 45, 8), false);
    }

    public static boolean A0S(Context context) {
        return IK.A0P(context).A2N(A0L(233, 42, 59), true);
    }

    public static boolean A0T(Context context) {
        return IK.A0P(context).A2N(A0L(934, 42, 16), false);
    }

    public static boolean A0U(Context context) {
        return IK.A0P(context).A2N(A0L(635, 31, 88), false);
    }

    public static boolean A0V(Context context) {
        return IK.A0P(context).A2N(A0L(976, 46, 72), true);
    }
}
