package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.android.gms.games.GamesStatusCodes;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class IK {
    public static IK A01;
    public static byte[] A02;
    public static String[] A03 = {"lby1W0wNbQrJZLPqMH4DTOw3yxUdqdf", "kgmV30Pytio8Y45c0SmevPSfJ", "GuqAlZnTPhAyqf6xpABukX78gW1eK", "0NViSQPmvGXLcgxETt4LuQqf8msO5qX", "Lug9XUXTwCkms8e17b8k", "9KOEFfUvG6glq1MfonBkT6Lvp1EWxJyS", "tUrZTe4M4NOwFWRIXhIm4QJOvCAxV", "2InOXM9Ds0dFubkAVSo31GYyY3vE8A8q"};
    public static final String[] A04;
    public static final String[] A05;
    public final SharedPreferences A00;

    public static String A0Q(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "rwxiKY1yX8M1uCycGOqUPfCL86zZ3gS";
            strArr[0] = "P38LhqS18Cw18aUWRDVsuYtPAT7MPJu";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
            i4++;
        }
    }

    public static void A0b() {
        A02 = new byte[]{airhockey.J_GAME_DISCONNECT, airhockey.P_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, 111, 102, 82, 126, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, airhockey.J_DISCONNECT, 3, 47, 46, 52, 41, 46, 53, 37, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_EXIT, 92, airhockey.P_GAME_BREAKBALLCOUNT, 19, airhockey.P_GAME_SELECTMAP, 90, 95, 95, 19, 81, 86, 19, airhockey.P_GAME_MYWIN, 82, 88, 86, 93, 19, airhockey.P_GAME_MYWIN, 92, 19, 82, 93, 92, airhockey.P_GAME_MYWIN, 91, 86, 65, 19, 87, 86, 64, airhockey.P_GAME_MYWIN, 90, 93, 82, airhockey.P_GAME_MYWIN, 90, 92, 93, 29, 6, 17, 25, 8, airhockey.J_GOO, 109, airhockey.J_GOO, 109, 0, 45, 58, 50, 35, 91, airhockey.P_GAME_MYWIN, 91, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_BREAKBALLCOUNT, 43, 123, airhockey.J_GAME_DISCONNECT, airhockey.J_ONREWARDED, airhockey.J_ERROR, 125, 12, 10, airhockey.J_WAIT, 123, 123, airhockey.J_BACK, 124, 125, airhockey.J_REWARD, airhockey.J_GAME_DISCONNECT, airhockey.J_WAIT, airhockey.J_DISCONNECT, airhockey.P_GAME_MYWIN, 123, airhockey.J_DISCONNECT, airhockey.J_BACK, 123, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_ENEMYEXIT, airhockey.P_GAME_MYWIN, 123, 119, airhockey.J_REWARD, 126, airhockey.J_BACK, ByteCompanionObject.MAX_VALUE, 34, 32, 32, 42, 39, 38, 45, 55, 34, 47, 28, 32, 47, 42, 32, 40, 48, 28, 32, 44, 45, 37, 42, 36, 109, 55, 52, 44, 28, 48, 55, 38, 51, 28, 32, 34, 45, 32, 38, 47, 28, 33, 54, 55, 55, 44, 45, 28, 55, 38, 59, 55, 25, 27, 27, 17, 28, 29, 22, 12, 25, 20, 39, 27, 20, 17, 27, 19, 11, 39, 27, 23, 22, 30, 17, 31, 86, 12, 15, 23, 39, 11, 12, 29, 8, 39, 27, 23, 22, 30, 17, 10, 21, 39, 26, 13, 12, 12, 23, 22, 39, 12, 29, 0, 12, 3, 1, 1, 11, 6, 7, 12, 22, 3, 14, 61, 1, 14, 11, 1, 9, 17, 61, 1, 13, 12, 4, 11, 5, 76, 22, 21, 13, 61, 17, 22, 7, 18, 61, 1, 13, 12, 4, 11, 16, 15, 3, 22, 11, 13, 12, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_BREAKBALLCOUNT, 76, 65, 64, 75, 81, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_REMATCH, airhockey.J_PURCHASE, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_REMATCH, 76, airhockey.P_GAME_BREAKBALLCOUNT, 78, 86, airhockey.J_PURCHASE, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_EXIT, 75, airhockey.P_GAME_MYSCORE, 76, airhockey.P_NATION, 11, 81, 82, airhockey.P_GAME_EXIT, airhockey.J_PURCHASE, 86, 81, 64, 85, airhockey.J_PURCHASE, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_EXIT, 75, airhockey.P_GAME_MYSCORE, 76, 87, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_SELECTMAP, 81, 76, airhockey.P_GAME_EXIT, 75, airhockey.J_PURCHASE, airhockey.P_GAME_MYWIN, airhockey.P_GAME_EXIT, 65, 92, 30, 28, 28, 22, 27, 26, 17, 11, 30, 19, 32, 28, 19, 22, 28, 20, 12, 32, 28, 16, 17, 25, 22, 24, 81, 11, 8, 16, 32, 12, 11, 26, 15, 32, 28, 16, 17, 25, 22, 13, 18, 30, 11, 22, 16, 17, 32, 11, 22, 11, 19, 26, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_RELOAD, 90, airhockey.J_ONREWARDED, 102, 102, 96, airhockey.J_ERROR, airhockey.J_BACK, airhockey.J_ONREWARDED, airhockey.J_ENEMYWIN, airhockey.J_GAME_REMATCH, 96, 90, airhockey.J_REWARD, airhockey.J_BACK, airhockey.J_ONREWARDED, 102, airhockey.J_INVITE, airhockey.J_BACK, 119, airhockey.J_ONREWARDED, 102, 96, 90, 102, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, 96, 125, airhockey.J_BACK, 90, 99, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_REMATCH, airhockey.J_BACK, 96, 119, 90, airhockey.J_REWARD, airhockey.J_GAME_DISCONNECT, ByteCompanionObject.MAX_VALUE, 96, 23, 18, 24, 1, 41, 23, 21, 21, 19, 6, 2, 23, 20, 26, 19, 41, 5, 2, 23, 21, 29, 2, 4, 23, 21, 19, 41, 26, 19, 24, 17, 2, 30, 63, 58, 48, 41, 1, 63, 58, 1, 58, 59, 42, 63, 55, 50, 45, 1, 61, 50, 55, 61, 53, 63, 60, 50, 59, airhockey.J_WAIT, 124, airhockey.J_REWARD, 111, airhockey.P_GAME_MYWIN, airhockey.J_WAIT, airhockey.J_REWARD, 124, airhockey.J_GAME_EXIT, 119, airhockey.J_BACK, 124, airhockey.P_GAME_MYWIN, airhockey.J_WAIT, airhockey.J_DISCONNECT, airhockey.J_DISCONNECT, 119, 111, airhockey.P_GAME_MYWIN, airhockey.J_DISCONNECT, 119, airhockey.J_WAIT, 124, airhockey.P_GAME_MYWIN, 124, 109, airhockey.J_GAME_EXIT, airhockey.J_BACK, airhockey.J_REWARD, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_MYWIN, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GOO, 119, 111, airhockey.J_BACK, airhockey.J_REWARD, ByteCompanionObject.MAX_VALUE, 31, 26, 16, 9, 33, 31, 16, 26, 12, 17, 23, 26, 33, 31, 16, 12, 33, 26, 27, 10, 27, 29, 10, 17, 12, 33, 27, 16, 31, 28, 18, 27, 46, 43, 33, 56, 16, 46, 33, 43, 61, 32, 38, 43, 16, 46, 33, 61, 16, 43, 42, 59, 42, 44, 59, 32, 61, 16, 59, 38, 34, 42, 32, 58, 59, 16, 34, 60, 62, 59, 49, 40, 0, 62, 49, 59, 45, 48, 54, 59, 0, 61, 62, 49, 49, 58, 45, 0, 58, 39, 43, 45, 62, 0, 55, 54, 49, 43, 44, 0, 57, 54, 39, 0, 58, 49, 62, 61, 51, 58, 59, airhockey.J_GOO, airhockey.J_ERROR, ByteCompanionObject.MAX_VALUE, 102, 78, airhockey.J_GOO, ByteCompanionObject.MAX_VALUE, airhockey.J_ERROR, 99, 126, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, 78, airhockey.J_SAVEDGAME_SAVE, 125, airhockey.J_GOO, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_PURCHASE, 125, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_NATION, airhockey.J_GAME_STANDBY, airhockey.J_DISCONNECT, airhockey.J_ERROR, 78, airhockey.J_ACHIEVEMENTCALLBACK, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_STANDBY, airhockey.J_DISCONNECT, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_STANDBY, 78, airhockey.J_ONREWARDED, 99, 125, 78, airhockey.J_SDKVER, 99, airhockey.J_DISCONNECT, 119, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, airhockey.J_NATION, 33, 36, 46, 55, 31, 33, 46, 36, 50, 47, 41, 36, 31, 34, 44, 47, 35, 43, 31, 53, 46, 51, 33, 38, 37, 31, 48, 44, 33, 57, 33, 34, 44, 37, 31, 39, 33, 45, 37, 51, 31, 35, 33, 35, 40, 37, 5, 0, 10, 19, 59, 5, 10, 0, 22, 11, 13, 0, 59, 6, 29, 20, 5, 23, 23, 59, 20, 5, 7, 15, 5, 3, 1, 59, 0, 1, 16, 1, 7, 16, 13, 11, 10, 59, 2, 11, 22, 59, 0, 1, 1, 20, 8, 13, 10, 15, 23, airhockey.J_SAVEDGAME_SAVE, airhockey.J_REWARD, 124, airhockey.J_GAME_STANDBY, 77, airhockey.J_SAVEDGAME_SAVE, 124, airhockey.J_REWARD, 96, 125, 123, airhockey.J_REWARD, 77, airhockey.J_BACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_BACK, airhockey.J_PURCHASE, 119, 77, ByteCompanionObject.MAX_VALUE, 125, airhockey.J_REWARD, airhockey.J_ENEMYWIN, 126, 119, 77, ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_EXIT, 77, airhockey.J_SDKVER, 123, airhockey.J_ENEMYLOSE, 119, 28, 25, 19, 10, 34, 28, 19, 25, 15, 18, 20, 25, 34, 30, 28, 30, 21, 24, 34, 16, 18, 25, 8, 17, 24, 34, 15, 24, 9, 15, 4, 34, 17, 20, 16, 20, 9, airhockey.P_GAME_STANDBY, 64, airhockey.P_GAME_EXIT, 83, 123, airhockey.P_GAME_STANDBY, airhockey.P_GAME_EXIT, 64, 86, 75, 77, 64, 123, airhockey.P_GAME_MYWIN, airhockey.P_GAME_STANDBY, 86, 75, 81, 87, 65, airhockey.P_GAME_MYLOSE, 123, 83, 76, 77, 80, 65, 123, 77, airhockey.P_GAME_EXIT, 80, 65, 86, 87, 80, 77, 80, 77, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYLOSE, airhockey.J_SDKVER, airhockey.J_ONREWARDED, airhockey.J_INVITE, 119, 95, airhockey.J_SDKVER, airhockey.J_INVITE, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_RELOAD, 111, airhockey.J_GAME_REMATCH, airhockey.J_ONREWARDED, 95, 99, 111, 109, airhockey.J_GOO, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_SAVE, 95, airhockey.J_GAME_REMATCH, 109, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_SAVE, 95, airhockey.J_ONREWARDED, airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, airhockey.J_ENEMYWIN, 95, airhockey.J_ONREWARDED, 111, 119, airhockey.J_INVITE, airhockey.J_GAME_DISCONNECT, 111, airhockey.J_SDKVER, airhockey.J_ONREWARDED, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.P_GAME_MYLOSE, 81, airhockey.J_WAIT, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYLOSE, airhockey.P_NATION, 84, airhockey.P_GAME_REMATCH, 79, airhockey.P_NATION, airhockey.J_WAIT, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 64, airhockey.P_GAME_MYWIN, 83, airhockey.P_GAME_EXIT, 82, airhockey.J_WAIT, airhockey.P_GAME_MYWIN, 85, 85, airhockey.P_GAME_MYSCORE, 82, airhockey.J_WAIT, 86, 84, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_EXIT, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.J_WAIT, 85, 79, 92, airhockey.P_GAME_MYSCORE, airhockey.J_WAIT, airhockey.P_GAME_SELECTMAP, 95, 82, airhockey.P_GAME_MYSCORE, 85, 126, 123, airhockey.J_BACK, airhockey.J_ENEMYLOSE, 64, 126, airhockey.J_BACK, 123, 109, airhockey.J_GOO, airhockey.J_REWARD, 123, 64, 123, airhockey.J_REWARD, airhockey.J_GAME_DISCONNECT, 126, 125, airhockey.J_SAVEDGAME_SAVE, airhockey.J_PURCHASE, 64, 111, airhockey.J_SAVEDGAME_SAVE, 126, 102, 126, 125, airhockey.J_SAVEDGAME_SAVE, airhockey.J_PURCHASE, 64, 111, 109, airhockey.J_PURCHASE, 124, 126, 
        124, 119, airhockey.J_PURCHASE, 125, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_ENEMYEXIT, airhockey.P_GAME_MYSCORE, 125, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ERROR, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_MYSCORE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_MYSCORE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ENEMYLOSE, airhockey.P_GAME_MYSCORE, airhockey.J_GAME_REMATCH, 111, airhockey.J_WAIT, airhockey.P_GAME_MYSCORE, 111, airhockey.J_ENEMYLOSE, 125, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, airhockey.P_GAME_MYSCORE, airhockey.J_DISCONNECT, 125, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GOO, airhockey.J_WAIT, airhockey.J_INVITE, 55, 50, 56, 33, 9, 55, 56, 50, 36, 57, 63, 50, 9, 51, 56, 55, 52, 58, 51, 9, 56, 55, 34, 63, 32, 51, 9, 48, 35, 56, 56, 51, 58, 80, 85, 95, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_INVITE, 80, 95, 85, airhockey.P_GAME_MYSCORE, 94, 88, 85, airhockey.J_INVITE, 84, airhockey.P_GAME_REMATCH, 94, airhockey.J_INVITE, 65, 93, 80, airhockey.P_GAME_MYLOSE, 84, airhockey.P_GAME_MYSCORE, airhockey.J_INVITE, 82, 80, 82, 89, 84, airhockey.J_INVITE, 92, 80, airhockey.P_GAME_REMATCH, airhockey.J_INVITE, airhockey.P_NATION, 88, 75, 84, 12, 9, 3, 26, 50, 12, 3, 9, 31, 2, 4, 9, 50, 11, 12, 4, 1, 50, 12, 9, 50, 1, 2, 12, 9, 50, 2, 3, 50, 9, 4, 30, 6, 50, 8, 31, 31, 2, 31, 30, airhockey.J_ACHIEVEMENTCALLBACK, 125, 119, airhockey.J_INVITE, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_ACHIEVEMENTCALLBACK, 119, 125, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, airhockey.J_GOO, 125, airhockey.P_GAME_BREAKBALLCOUNT, ByteCompanionObject.MAX_VALUE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GOO, airhockey.J_ERROR, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_REWARD, 119, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_INVITE, 124, 123, 111, airhockey.J_GOO, 124, airhockey.J_INVITE, airhockey.P_GAME_BREAKBALLCOUNT, 124, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, 111, airhockey.J_GAME_STANDBY, 124, 84, airhockey.J_GAME_EXIT, airhockey.J_GAME_STANDBY, 111, airhockey.J_WAIT, airhockey.J_ONREWARDED, airhockey.J_NATION, 111, 84, 109, airhockey.J_ONREWARDED, airhockey.J_WAIT, airhockey.J_ENEMYLOSE, airhockey.J_INVITE, 84, 99, airhockey.J_GAME_EXIT, airhockey.J_WAIT, 111, 124, airhockey.J_GAME_EXIT, airhockey.J_WAIT, airhockey.J_INVITE, 84, airhockey.J_GAME_EXIT, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYLOSE, airhockey.J_INVITE, airhockey.J_ENEMYWIN, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_GAME_EXIT, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 10, 15, 5, 28, 52, 10, 5, 15, 25, 4, 2, 15, 52, 3, 2, 15, 14, 52, 29, 2, 15, 14, 4, 27, 25, 4, 12, 25, 14, 24, 24, 52, 10, 5, 2, 6, 10, 31, 2, 4, 5, 21, 16, 26, 3, 43, 21, 26, 16, 6, 27, 29, 16, 43, 29, 25, 21, 19, 17, 43, 23, 21, 23, 28, 17, 43, 7, 0, 27, 6, 17, 43, 22, 13, 0, 17, 43, 23, 27, 1, 26, 0, airhockey.J_GAME_EXIT, 111, airhockey.J_GAME_STANDBY, 124, 84, airhockey.J_GAME_EXIT, airhockey.J_GAME_STANDBY, 111, airhockey.J_WAIT, airhockey.J_ONREWARDED, airhockey.J_NATION, 111, 84, airhockey.J_NATION, airhockey.J_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, airhockey.J_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, 84, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, 84, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, 124, 84, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_EXIT, airhockey.J_ACHIEVEMENTCALLBACK, 96, 43, 46, 36, 61, 21, 43, 36, 46, 56, 37, 35, 46, 21, 39, 47, 39, 37, 56, 51, 21, 37, 58, 62, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.P_GAME_MYLOSE, 81, airhockey.J_WAIT, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYLOSE, airhockey.P_NATION, 84, airhockey.P_GAME_REMATCH, 79, airhockey.P_NATION, airhockey.J_WAIT, 75, 84, airhockey.P_GAME_STANDBY, airhockey.J_WAIT, 79, 75, 86, 84, airhockey.P_GAME_MYSCORE, 85, 85, 79, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYLOSE, airhockey.J_WAIT, 64, airhockey.P_GAME_REMATCH, 84, airhockey.J_WAIT, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, 82, 79, 80, airhockey.P_GAME_MYSCORE, airhockey.J_WAIT, 80, 79, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_REMATCH, airhockey.J_WAIT, airhockey.P_GAME_MYWIN, airhockey.P_NATION, 85, airhockey.J_WAIT, 80, 20, airhockey.J_WAIT, 124, airhockey.J_REWARD, 111, airhockey.P_GAME_MYWIN, airhockey.J_WAIT, airhockey.J_REWARD, 124, airhockey.J_GAME_EXIT, 119, airhockey.J_BACK, 124, airhockey.P_GAME_MYWIN, airhockey.J_REWARD, airhockey.J_WAIT, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, airhockey.J_INVITE, 125, airhockey.P_GAME_MYWIN, 123, airhockey.J_WAIT, airhockey.J_GAME_EXIT, 119, 109, airhockey.J_GAME_ENEMYEXIT, 125, airhockey.J_DISCONNECT, airhockey.P_GAME_MYWIN, 125, 96, airhockey.J_GAME_DISCONNECT, 125, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, 119, airhockey.J_REWARD, airhockey.P_GAME_MYWIN, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_GAME_EXIT, airhockey.J_BACK, airhockey.J_WAIT, airhockey.J_REWARD, airhockey.J_GAME_DISCONNECT, airhockey.J_ENEMYWIN, airhockey.J_NATION, airhockey.J_ENEMYLOSE, airhockey.J_BACK, 89, airhockey.J_ENEMYWIN, airhockey.J_ENEMYLOSE, airhockey.J_NATION, airhockey.J_DISCONNECT, airhockey.J_GAME_REMATCH, 111, airhockey.J_NATION, 89, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYWIN, airhockey.J_SAVEDGAME_RELOAD, 111, airhockey.J_GOO, 99, 89, airhockey.J_ENEMYLOSE, 99, airhockey.J_BACK, 89, airhockey.J_GAME_STANDBY, airhockey.J_ENEMYWIN, airhockey.J_DISCONNECT, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ERROR, 99, airhockey.J_GAME_EXIT, 89, airhockey.J_NATION, 99, airhockey.J_ERROR, 111, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, 124, airhockey.J_WAIT, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_EXIT, airhockey.P_NATION, 124, airhockey.J_SAVEDGAME_SAVE, airhockey.J_WAIT, 111, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_DISCONNECT, airhockey.J_WAIT, airhockey.P_NATION, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, airhockey.J_GAME_EXIT, airhockey.J_SAVEDGAME_RELOAD, 111, airhockey.J_REWARD, airhockey.P_NATION, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, 123, 124, airhockey.J_ENEMYLOSE, airhockey.J_BACK, airhockey.J_GAME_REMATCH, airhockey.P_NATION, 126, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ACHIEVEMENTCALLBACK, 126, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, airhockey.P_NATION, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, airhockey.J_GOO, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, airhockey.P_NATION, airhockey.J_GOO, airhockey.J_INVITE, 56, 61, 55, 46, 6, 56, 55, 61, 43, 54, 48, 61, 6, 55, 60, 45, 46, 54, 43, 50, 6, 61, 60, 63, 56, 44, 53, 45, 6, 43, 60, 56, 61, 6, 45, 48, 52, 60, 54, 44, 45, 6, 52, 42, 86, 83, 89, 64, airhockey.J_ENEMYLOSE, 86, 89, 83, airhockey.P_GAME_STANDBY, 88, 94, 83, airhockey.J_ENEMYLOSE, 89, 82, airhockey.P_GAME_MYSCORE, 64, 88, airhockey.P_GAME_STANDBY, 92, airhockey.J_ENEMYLOSE, 83, 82, 81, 86, airhockey.P_NATION, 91, airhockey.P_GAME_MYSCORE, airhockey.J_ENEMYLOSE, airhockey.P_GAME_STANDBY, 82, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, 94, 82, airhockey.P_GAME_SELECTMAP, airhockey.J_ENEMYLOSE, 89, airhockey.P_NATION, 90, 91, 94, 84, 77, airhockey.J_GAME_STANDBY, 91, 84, 94, airhockey.P_GAME_MYLOSE, 85, 83, 94, airhockey.J_GAME_STANDBY, 84, 95, 78, 77, 85, airhockey.P_GAME_MYLOSE, 81, airhockey.J_GAME_STANDBY, 94, 95, 92, 91, 79, 86, 78, airhockey.J_GAME_STANDBY, 78, 82, airhockey.P_GAME_MYLOSE, 85, 78, 78, 86, 95, airhockey.J_GAME_STANDBY, 78, 83, 87, 95, 85, 79, 78, airhockey.J_GAME_STANDBY, 87, airhockey.P_GAME_REMATCH, 52, 49, 59, 34, 10, 52, 59, 49, 39, 58, 60, 49, 10, 59, 48, 33, 34, 58, 39, 62, 10, 49, 48, 51, 52, 32, 57, 33, 10, 33, 60, 56, 48, 58, 32, 33, 10, 56, 38, 14, 11, 1, 24, 48, 14, 1, 11, 29, 0, 6, 11, 48, 0, 27, 28, 3, 48, 10, 1, 14, 13, 3, 10, 11, 109, airhockey.J_ENEMYLOSE, airhockey.J_NATION, 123, 83, 109, airhockey.J_NATION, airhockey.J_ENEMYLOSE, 126, 99, airhockey.J_GAME_STANDBY, airhockey.J_ENEMYLOSE, 83, 126, airhockey.J_GAME_REMATCH, airhockey.J_SDKVER, 99, airhockey.J_PURCHASE, airhockey.J_GAME_REMATCH, 83, 125, airhockey.J_WAIT, airhockey.J_GAME_REMATCH, 126, airhockey.J_ERROR, 83, 124, 109, 126, airhockey.J_ACHIEVEMENTCALLBACK, 83, airhockey.J_GAME_EXIT, 126, 99, airhockey.J_SDKVER, 83, 111, 109, 111, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, 83, airhockey.J_ENEMYWIN, airhockey.J_GAME_REMATCH, airhockey.J_ERROR, 58, 63, 53, 44, 4, 58, 53, 63, 41, 52, 50, 63, 4, 41, 62, 43, 52, 41, 47, 4, 43, 41, 62, 40, 62, 53, 47, 58, 47, 50, 52, 53, 4, 62, 41, 41, 52, 41, 4, 44, 51, 62, 53, 4, 53, 52, 4, 50, 54, 43, 41, 62, 40, 40, 50, 52, 53, 35, 38, 44, 53, 29, 35, 44, 38, 48, 45, 43, 38, 29, 48, 39, 50, 45, 48, 54, 29, 50, 48, 39, 49, 39, 44, 54, 35, 54, 43, 45, 44, 29, 39, 48, 48, 45, 48, 49, 29, 43, 44, 49, 54, 39, 35, 38, 29, 45, 36, 29, 43, 44, 54, 39, 48, 44, 35, 46, 91, 94, 84, 77, airhockey.J_GAME_STANDBY, 91, 84, 94, airhockey.P_GAME_MYLOSE, 85, 83, 94, airhockey.J_GAME_STANDBY, airhockey.P_GAME_REMATCH, 82, 85, 79, 86, 94, airhockey.J_GAME_STANDBY, 88, 86, 85, 89, 81, airhockey.J_GAME_STANDBY, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYSCORE, 84, 89, airhockey.J_GAME_STANDBY, 85, 84, airhockey.J_GAME_STANDBY, 88, 91, 89, 81, 93, airhockey.P_GAME_MYLOSE, 85, 79, 84, 94, 45, 40, 34, 59, 19, 45, 34, 40, 62, 35, 37, 40, 19, 63, 36, 35, 57, 32, 40, 19, 36, 37, 40, 41, 19, 32, 35, 45, 40, 41, 62, 7, 2, 8, 17, 57, 7, 8, 2, 20, 9, 15, 2, 57, 21, 14, 9, 19, 10, 2, 57, 
        15, 8, 15, 18, 57, 19, 8, 21, 13, 15, 22, 22, 7, 4, 10, 3, 57, 21, 3, 5, 9, 8, 2, 21, 57, 5, 9, 11, 22, 10, 3, 18, 3, 41, 44, 38, 63, 23, 41, 38, 44, 58, 39, 33, 44, 23, 59, 32, 39, 61, 36, 44, 23, 36, 41, 61, 38, 43, 32, 23, 56, 36, 41, 49, 23, 59, 60, 39, 58, 45, 23, 33, 38, 23, 39, 62, 45, 58, 36, 41, 49, airhockey.J_SAVEDGAME_RELOAD, 119, 125, airhockey.J_ONREWARDED, 76, airhockey.J_SAVEDGAME_RELOAD, 125, 119, airhockey.J_SDKVER, 124, airhockey.J_PURCHASE, 119, 76, 96, 123, 124, 102, ByteCompanionObject.MAX_VALUE, 119, 76, airhockey.J_SDKVER, airhockey.J_REWARD, 96, airhockey.J_REWARD, airhockey.J_ENEMYWIN, 76, airhockey.J_ERROR, 124, airhockey.J_GOO, 102, 96, 76, 124, 125, 76, 125, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYWIN, airhockey.J_PURCHASE, airhockey.J_GAME_STANDBY, airhockey.J_REWARD, 76, airhockey.J_SDKVER, airhockey.J_REWARD, 99, 124, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, airhockey.J_PURCHASE, 125, airhockey.J_DISCONNECT, airhockey.J_PURCHASE, ByteCompanionObject.MAX_VALUE, airhockey.J_ERROR, airhockey.J_GAME_DISCONNECT, airhockey.P_GAME_SELECTMAP, airhockey.J_PURCHASE, airhockey.J_ERROR, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_SELECTMAP, airhockey.J_INVITE, airhockey.J_WAIT, 109, airhockey.J_GAME_REMATCH, airhockey.J_ACHIEVEMENTCALLBACK, 21, 16, 26, 3, 43, 21, 26, 16, 6, 27, 29, 16, 43, 1, 7, 17, 43, 23, 21, 23, 28, 17, 43, 25, 27, 16, 1, 24, 17, 43, 18, 27, 6, 43, 29, 25, 21, 19, 17, 7, 91, 94, 84, 77, airhockey.J_GAME_STANDBY, 91, 84, 94, airhockey.P_GAME_MYLOSE, 85, 83, 94, airhockey.J_GAME_STANDBY, 79, airhockey.P_GAME_REMATCH, 95, airhockey.J_GAME_STANDBY, airhockey.P_GAME_REMATCH, 78, 95, 91, 87, 83, 84, 93, airhockey.J_GAME_STANDBY, 83, 87, 91, 93, 95, airhockey.J_GAME_STANDBY, 94, 95, 89, 85, 94, 83, 84, 93, 51, 54, 60, 37, 13, 51, 60, 54, 32, 61, 59, 54, 13, 37, 58, 59, 38, 55, 62, 59, 33, 38, 55, 54, 13, 59, 60, 38, 55, 60, 38, 13, 39, 32, 62, 13, 34, 32, 55, 52, 59, 42, 55, 33, 35, 38, 44, 53, 29, 35, 49, 49, 39, 54, 29, 36, 39, 54, 33, 42, 43, 44, 37, 29, 55, 44, 43, 36, 43, 39, 38, 26, 31, 21, 12, 36, 25, 26, 21, 21, 30, 9, 36, 21, 20, 15, 18, 29, 2, 36, 26, 31, 36, 23, 20, 26, 31, 30, 31, 36, 20, 21, 36, 26, 8, 8, 30, 15, 8, 36, 23, 20, 26, 31, 30, 31, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 77, 84, 124, 65, airhockey.P_GAME_BREAKBALLCOUNT, 77, 64, 75, 78, airhockey.P_NATION, 81, airhockey.P_GAME_MYLOSE, 124, 81, airhockey.P_GAME_BREAKBALLCOUNT, 83, 76, 81, 87, 124, airhockey.P_GAME_EXIT, 77, 87, airhockey.P_GAME_BREAKBALLCOUNT, 81, 85, airhockey.P_NATION, 79, 124, 78, 80, 52, 49, 59, 34, 10, 55, 57, 58, 54, 62, 10, 57, 58, 54, 62, 38, 54, 39, 48, 48, 59, 37, 32, 42, 51, 27, 39, 40, 45, 39, 47, 55, 27, 55, 33, 39, 43, 42, 32, 27, 39, 44, 37, 42, 42, 33, 40, 27, 33, 42, 37, 38, 40, 33, 32, 89, 92, 86, 79, airhockey.J_ENEMYWIN, 91, airhockey.P_GAME_EXIT, 89, 75, 80, airhockey.J_ENEMYWIN, 75, 80, 81, 93, 84, 92, airhockey.J_ENEMYWIN, 93, 86, 89, 90, 84, 93, 92, 87, 82, 88, 65, airhockey.J_GAME_REMATCH, 85, airhockey.P_NATION, 87, airhockey.J_GAME_REMATCH, 87, 88, 95, 91, 87, airhockey.P_NATION, 95, 89, 88, airhockey.J_GAME_REMATCH, 82, 83, 90, 87, 79, airhockey.J_GAME_REMATCH, 91, airhockey.P_GAME_STANDBY, 58, 63, 53, 44, 4, 56, 47, 58, 4, 54, 50, 53, 4, 40, 56, 58, 55, 62, 4, 58, 53, 50, 54, 58, 47, 50, 52, 53, 4, 43, 62, 41, 56, 62, 53, 47, 58, 60, 62, 47, 42, 32, 57, 17, 42, 33, 17, 34, 43, 61, 61, 17, 61, 58, 60, 39, 45, 58, 17, 61, 43, 45, 33, 32, 42, 17, 45, 38, 47, 32, 32, 43, 34, 17, 39, 35, 62, 10, 15, 5, 28, 52, 14, 5, 10, 9, 7, 14, 52, 10, 30, 31, 4, 52, 15, 14, 24, 31, 25, 4, 18, 52, 7, 14, 10, 0, 24, 65, airhockey.P_GAME_SELECTMAP, 78, 87, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_STANDBY, 78, 65, airhockey.P_NATION, 76, airhockey.P_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, airhockey.P_NATION, airhockey.P_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, 82, ByteCompanionObject.MAX_VALUE, 84, 79, 75, airhockey.P_GAME_STANDBY, 78, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_REMATCH, 78, airhockey.P_GAME_BREAKBALLCOUNT, 79, 94, 91, 81, airhockey.P_GAME_MYLOSE, 96, 90, 81, 94, 93, 83, 90, 96, 91, 90, 93, airhockey.P_GAME_EXIT, 88, 96, 80, airhockey.P_GAME_REMATCH, 90, 77, 83, 94, airhockey.P_GAME_BREAKBALLCOUNT, 24, 29, 23, 14, 38, 28, 23, 24, 27, 21, 28, 38, 28, 1, 22, 9, 21, 24, 0, 28, 11, 38, 26, 24, 26, 17, 28, 13, 8, 2, 27, 51, 9, 2, 13, 14, 0, 9, 51, 9, 20, 3, 28, 0, 13, 21, 9, 30, 51, 15, 13, 15, 4, 9, 51, 10, 3, 30, 51, 8, 31, 0, 77, airhockey.P_GAME_MYLOSE, airhockey.P_NATION, 91, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_REMATCH, airhockey.P_NATION, 77, 78, 64, airhockey.P_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_REMATCH, 84, airhockey.P_GAME_MYSCORE, 92, 64, 77, 85, airhockey.P_GAME_REMATCH, 94, airhockey.J_SAVEDGAME_SAVE, 90, 30, 27, 30, 20, 13, 37, 31, 20, 27, 24, 22, 31, 37, 28, 15, 20, 20, 31, 22, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_RELOAD, 90, 96, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ONREWARDED, airhockey.J_ENEMYWIN, airhockey.J_GAME_REMATCH, 96, 90, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, 96, 90, 125, 90, airhockey.J_GAME_EXIT, airhockey.J_GOO, airhockey.J_BACK, 90, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, 90, 99, airhockey.J_GOO, airhockey.J_GAME_REMATCH, airhockey.J_GAME_REMATCH, airhockey.J_REWARD, 102, 119, 96, 96, airhockey.J_GAME_ENEMYEXIT, 90, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, 90, airhockey.J_REWARD, airhockey.J_SDKVER, airhockey.J_INVITE, 79, airhockey.P_GAME_EXIT, 64, 89, airhockey.J_BACK, 75, 64, 79, 76, airhockey.P_NATION, 75, airhockey.J_BACK, 64, 75, 90, 89, 65, 92, airhockey.P_GAME_STANDBY, 96, airhockey.J_GAME_STANDBY, 111, airhockey.J_REWARD, 94, airhockey.J_ONREWARDED, 111, 96, 99, 109, airhockey.J_ONREWARDED, 94, airhockey.J_BACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, 109, airhockey.J_INVITE, 96, airhockey.J_GAME_STANDBY, 15, 10, 0, 25, 49, 11, 0, 15, 12, 2, 11, 49, 28, 15, 9, 11, 49, 29, 6, 15, 5, 11, 20, 17, 27, 2, 42, 16, 27, 20, 23, 25, 16, 42, 6, 12, 27, 22, airhockey.J_ERROR, airhockey.J_GOO, airhockey.J_PURCHASE, 99, 75, airhockey.J_BACK, airhockey.J_PURCHASE, airhockey.J_GOO, 75, 119, airhockey.J_ERROR, 102, airhockey.J_GOO, airhockey.J_ENEMYWIN, 75, 119, airhockey.J_ACHIEVEMENTCALLBACK, 125, 119, ByteCompanionObject.MAX_VALUE, airhockey.J_ERROR, airhockey.J_REWARD, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_BACK, airhockey.J_WAIT, 124, airhockey.J_REWARD, 111, airhockey.P_GAME_MYWIN, 125, 96, airhockey.J_ENEMYLOSE, 119, airhockey.J_GAME_ENEMYEXIT, 125, airhockey.P_GAME_MYWIN, airhockey.J_INVITE, airhockey.J_BACK, 124, 125, 119, airhockey.P_GAME_MYWIN, 111, airhockey.J_WAIT, airhockey.J_GAME_DISCONNECT, 123, airhockey.J_GOO, airhockey.P_GAME_MYWIN, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, airhockey.J_ERROR, 125, 123, 126, airhockey.J_DISCONNECT, 109, airhockey.P_GAME_STANDBY, 124, airhockey.J_SAVEDGAME_SAVE, airhockey.J_REWARD, airhockey.J_INVITE, ByteCompanionObject.MAX_VALUE, airhockey.J_ENEMYLOSE, airhockey.P_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_SAVE, 126, 126, airhockey.J_SAVEDGAME_SAVE, airhockey.J_DISCONNECT, 125, airhockey.P_GAME_STANDBY, airhockey.J_INVITE, airhockey.J_ERROR, airhockey.J_BACK, ByteCompanionObject.MAX_VALUE, airhockey.J_DISCONNECT, 43, 46, 36, 61, 21, 44, 37, 56, 41, 47, 21, 46, 47, 60, 35, 41, 47, 21, 57, 41, 56, 47, 47, 36, 21, 43, 38, 61, 43, 51, 57, 21, 37, 36, 56, 61, 55, 46, 6, 48, 56, 59, 6, 58, 44, 42, 45, 54, 52, 6, 
        42, 58, 49, 60, 52, 56, 42, 6, 63, 48, 33, 6, 60, 55, 56, 59, 53, 60, 61, 109, airhockey.J_ENEMYLOSE, airhockey.J_NATION, 123, 83, airhockey.J_GAME_STANDBY, airhockey.J_SDKVER, 124, ByteCompanionObject.MAX_VALUE, 83, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_REMATCH, 111, 99, airhockey.J_NATION, airhockey.J_ENEMYLOSE, 83, 111, airhockey.J_ONREWARDED, 109, airhockey.J_NATION, airhockey.J_NATION, airhockey.J_GAME_REMATCH, 96, 83, airhockey.J_GAME_REMATCH, airhockey.J_NATION, 109, airhockey.J_INVITE, 96, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, 10, 15, 5, 28, 52, 2, 5, 31, 52, 2, 6, 10, 12, 14, 52, 10, 24, 52, 8, 31, 10, 52, 14, 5, 10, 9, 7, 14, 15, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_RELOAD, 90, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, 90, 119, airhockey.J_SAVEDGAME_SAVE, 90, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, airhockey.J_BACK, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, airhockey.J_GAME_REMATCH, 90, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, airhockey.J_ONREWARDED, airhockey.J_BACK, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, 0, 5, 15, 22, 62, 8, 15, 21, 62, 19, 23, 62, 23, 8, 5, 4, 14, 62, 0, 18, 62, 2, 21, 0, 62, 4, 15, 0, 3, 13, 4, 5, 23, 18, 24, 1, 41, 31, 24, 2, 19, 4, 5, 2, 31, 2, 31, 23, 26, 41, 24, 19, 1, 41, 31, 27, 23, 17, 19, 41, 18, 19, 5, 31, 17, 24, 52, 49, 59, 34, 10, 57, 58, 50, 10, 54, 38, 10, 54, 56, 37, 81, 84, 94, airhockey.P_GAME_MYWIN, 111, 92, 95, 87, 87, 89, 94, 87, 111, 85, 94, 84, 64, 95, 89, 94, airhockey.P_GAME_SELECTMAP, 111, 64, airhockey.P_NATION, 85, 86, 89, airhockey.P_GAME_MYLOSE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_REWARD, 124, airhockey.J_GAME_STANDBY, 77, 124, airhockey.J_SAVEDGAME_SAVE, 102, 123, airhockey.J_ONREWARDED, 119, 77, airhockey.J_BACK, airhockey.J_SAVEDGAME_SAVE, 96, 125, airhockey.J_ENEMYWIN, airhockey.J_SDKVER, 119, 126, 77, airhockey.J_BACK, 125, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, airhockey.J_SAVEDGAME_SAVE, airhockey.J_BACK, 102, 77, 102, airhockey.J_PURCHASE, 96, 119, airhockey.J_SDKVER, airhockey.J_PURCHASE, 125, 126, airhockey.J_REWARD, 61, 56, 50, 43, 3, 50, 61, 40, 53, 42, 57, 3, 42, 53, 56, 57, 51, 3, 48, 51, 51, 44, 53, 50, 59, 3, 57, 50, 61, 62, 48, 57, 56, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.P_GAME_MYLOSE, 81, airhockey.J_WAIT, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, 82, 79, 80, airhockey.P_GAME_MYSCORE, airhockey.J_WAIT, 80, 79, airhockey.P_GAME_MYSCORE, 81, airhockey.J_WAIT, 85, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, 86, 85, 78, airhockey.P_GAME_REMATCH, 82, airhockey.J_WAIT, airhockey.P_GAME_EXIT, airhockey.P_GAME_REMATCH, 65, 65, 79, airhockey.P_GAME_MYLOSE, 65, airhockey.J_WAIT, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, 99, 102, airhockey.J_GAME_DISCONNECT, airhockey.J_ERROR, 93, 109, airhockey.J_GAME_DISCONNECT, 102, airhockey.J_ENEMYWIN, airhockey.J_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, 93, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, airhockey.J_REWARD, 109, airhockey.J_GOO, 123, 93, 102, 99, airhockey.J_REWARD, 99, 93, airhockey.J_ENEMYWIN, airhockey.J_GAME_DISCONNECT, 99, 96, airhockey.J_INVITE, airhockey.J_ENEMYWIN, 102, 58, 63, 53, 44, 4, 52, 43, 62, 53, 4, 61, 57, 4, 58, 43, 43, 4, 58, 55, 44, 58, 34, 40, airhockey.J_WAIT, 124, airhockey.J_REWARD, 111, airhockey.P_GAME_MYWIN, airhockey.J_ENEMYLOSE, airhockey.J_DISCONNECT, airhockey.J_WAIT, airhockey.J_SDKVER, airhockey.J_WAIT, airhockey.J_PURCHASE, airhockey.J_DISCONNECT, 125, airhockey.P_GAME_MYWIN, 123, airhockey.J_DISCONNECT, airhockey.J_BACK, 123, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_MYWIN, airhockey.J_ERROR, airhockey.J_WAIT, 96, airhockey.P_GAME_MYWIN, 124, 125, airhockey.J_DISCONNECT, airhockey.J_WAIT, airhockey.J_SDKVER, airhockey.P_GAME_MYWIN, airhockey.J_ERROR, airhockey.J_GAME_ENEMYEXIT, 34, 39, 45, 52, 28, 51, 47, 34, 58, 34, 33, 47, 38, 28, 39, 42, 48, 34, 33, 47, 38, 28, 49, 38, 46, 44, 55, 38, 28, 44, 45, 28, 45, 38, 55, 52, 44, 49, 40, 28, 47, 44, 48, 48, 25, 28, 22, 15, 39, 8, 20, 25, 1, 25, 26, 20, 29, 11, 39, 20, 23, 31, 31, 17, 22, 31, 39, 29, 22, 25, 26, 20, 29, 28, 94, 91, 81, airhockey.P_GAME_MYLOSE, 96, 79, 83, 94, airhockey.P_GAME_BREAKBALLCOUNT, 94, 93, 83, 90, 76, 96, 81, 90, airhockey.P_GAME_MYLOSE, 96, 91, 90, 76, 86, 88, 81, 44, 41, 35, 58, 18, 61, 33, 44, 52, 44, 47, 33, 40, 62, 18, 62, 37, 34, 58, 18, 40, 35, 41, 46, 44, 63, 41, 32, 37, 47, 54, 30, 49, 51, 36, 45, 46, 32, 37, 30, 40, 47, 53, 36, 51, 50, 53, 40, 53, 40, 32, 45, 30, 37, 56, 47, 32, 44, 40, 34, 30, 54, 36, 35, 55, 40, 36, 54, 125, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_ENEMYEXIT, airhockey.P_GAME_MYSCORE, airhockey.J_GAME_DISCONNECT, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_GOO, airhockey.J_SAVEDGAME_SAVE, 125, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_MYSCORE, airhockey.J_SAVEDGAME_RELOAD, 125, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, airhockey.J_GAME_EXIT, airhockey.J_WAIT, airhockey.P_GAME_MYSCORE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, 125, airhockey.J_BACK, airhockey.J_ERROR, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_MYSCORE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_WAIT, 126, airhockey.J_GAME_EXIT, airhockey.J_ERROR, airhockey.J_WAIT, airhockey.J_GAME_ENEMYEXIT, airhockey.P_GAME_SELECTMAP, 65, 75, 82, airhockey.J_PURCHASE, 85, 87, 64, airhockey.P_GAME_REMATCH, airhockey.P_GAME_EXIT, airhockey.P_GAME_SELECTMAP, 65, airhockey.J_PURCHASE, 87, 83, airhockey.J_PURCHASE, 65, 92, 75, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYLOSE, 76, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_PURCHASE, 82, 64, airhockey.P_GAME_MYWIN, 83, 76, 64, 82, 34, 39, 45, 52, 28, 51, 49, 38, 53, 38, 45, 55, 28, 51, 47, 34, 58, 34, 33, 47, 38, 28, 34, 54, 55, 44, 28, 32, 47, 42, 32, 40, 10, 15, 5, 28, 52, 27, 30, 25, 12, 14, 52, 4, 5, 52, 95, 90, 88, 52, 25, 14, 24, 27, 4, 5, 24, 14, 46, 43, 33, 56, 16, 61, 42, 44, 32, 34, 63, 58, 59, 42, 16, 45, 59, 16, 46, 41, 59, 42, 61, 16, 42, 55, 59, 61, 46, 60, 16, 44, 39, 46, 33, 40, 42, 1, 4, 14, 23, 63, 18, 22, 63, 2, 21, 6, 6, 5, 18, 63, 3, 8, 5, 3, 11, 63, 5, 14, 1, 2, 12, 5, 4, 52, 49, 59, 34, 10, 39, 35, 10, 37, 57, 52, 44, 55, 52, 54, 62, 10, 54, 39, 52, 38, 61, 10, 51, 52, 57, 57, 55, 52, 54, 62, 76, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYSCORE, 90, airhockey.J_SAVEDGAME_RELOAD, 94, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_EXIT, airhockey.J_SAVEDGAME_RELOAD, 75, 95, airhockey.P_GAME_MYLOSE, 92, 88, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 78, 84, airhockey.J_SAVEDGAME_RELOAD, 78, 76, 93, 93, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_EXIT, airhockey.J_SAVEDGAME_RELOAD, 76, 65, 65, airhockey.P_NATION, 90, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 12, 9, 3, 26, 50, 30, 8, 25, 50, 25, 8, 21, 25, 50, 14, 2, 1, 2, 31, 50, 9, 20, 3, 12, 0, 4, 14, 12, 1, 1, 20, 79, airhockey.P_GAME_EXIT, 64, 89, airhockey.J_BACK, 93, airhockey.P_GAME_BREAKBALLCOUNT, 65, 91, airhockey.P_NATION, airhockey.P_GAME_EXIT, airhockey.J_BACK, 79, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, airhockey.J_BACK, 75, 86, 90, 75, 64, 93, airhockey.P_GAME_MYWIN, 65, 64, airhockey.J_BACK, 90, 65, airhockey.J_BACK, 94, airhockey.P_NATION, 79, 87, 79, 76, airhockey.P_NATION, 75, 93, 55, 50, 56, 33, 9, 37, 62, 57, 35, 58, 50, 9, 53, 58, 51, 55, 36, 9, 48, 51, 55, 34, 35, 36, 51, 9, 53, 57, 56, 48, 63, 49, 9, 57, 56, 9, 53, 36, 55, 37, 62, 51, 37, 126, 123, airhockey.J_BACK, airhockey.J_ENEMYLOSE, 64, airhockey.J_GAME_DISCONNECT, 119, airhockey.J_GOO, airhockey.J_GAME_EXIT, airhockey.J_SAVEDGAME_SAVE, 123, 64, airhockey.J_REWARD, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_BACK, airhockey.J_GOO, 109, airhockey.J_PURCHASE, 64, 123, airhockey.J_PURCHASE, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, 109, airhockey.J_GOO, 102, 64, 124, 126, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_SAVE, 3, 6, 12, 21, 61, 17, 10, 13, 23, 
        14, 6, 61, 11, 12, 1, 16, 7, 15, 7, 12, 22, 61, 16, 7, 22, 16, 27, 61, 1, 13, 23, 12, 22, 7, 16, 61, 13, 12, 61, 7, 15, 18, 22, 27, 61, 16, 7, 17, 18, 13, 12, 17, 7, airhockey.J_WAIT, 124, airhockey.J_REWARD, 111, airhockey.P_GAME_MYWIN, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GOO, 119, 109, airhockey.J_DISCONNECT, 124, airhockey.P_GAME_MYWIN, airhockey.J_BACK, airhockey.J_REWARD, airhockey.J_BACK, airhockey.J_GAME_DISCONNECT, airhockey.P_GAME_MYWIN, 126, airhockey.J_GAME_EXIT, 119, airhockey.J_ERROR, airhockey.P_GAME_MYWIN, 123, 119, airhockey.J_REWARD, airhockey.J_GAME_DISCONNECT, 125, airhockey.J_REWARD, airhockey.J_GAME_DISCONNECT, airhockey.P_GAME_MYWIN, airhockey.J_ENEMYLOSE, airhockey.J_GAME_EXIT, 119, airhockey.J_INVITE, airhockey.J_BACK, 124, 125, airhockey.J_GAME_EXIT, 33, 36, 46, 55, 31, 51, 40, 47, 53, 44, 36, 31, 41, 46, 41, 52, 31, 47, 46, 31, 35, 44, 33, 51, 51, 31, 44, 47, 33, 36, 41, 46, 39, airhockey.J_ENEMYLOSE, 109, airhockey.J_ENEMYWIN, 126, 86, airhockey.J_PURCHASE, airhockey.J_SDKVER, 102, 124, airhockey.J_GAME_STANDBY, 109, 86, airhockey.J_GAME_STANDBY, 102, airhockey.J_INVITE, 86, airhockey.J_ENEMYLOSE, airhockey.J_PURCHASE, airhockey.J_PURCHASE, airhockey.J_GAME_DISCONNECT, 125, 86, 124, 123, airhockey.J_GAME_STANDBY, 7, 2, 8, 17, 57, 21, 14, 9, 19, 10, 2, 57, 22, 20, 3, 5, 9, 11, 22, 19, 18, 3, 57, 4, 15, 2, 2, 3, 20, 57, 18, 9, 13, 3, 8, airhockey.J_NATION, airhockey.J_ENEMYWIN, 109, airhockey.J_DISCONNECT, 92, airhockey.J_GOO, airhockey.J_ENEMYLOSE, airhockey.J_GAME_EXIT, airhockey.J_SAVEDGAME_SAVE, 92, airhockey.J_ERROR, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, 102, airhockey.J_GAME_DISCONNECT, 92, 109, airhockey.J_GAME_DISCONNECT, 109, 92, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, airhockey.J_BACK, airhockey.J_ENEMYWIN, airhockey.J_DISCONNECT, airhockey.J_NATION, airhockey.J_BACK, 102, 92, airhockey.J_NATION, 96, 96, 102, 111, 102, airhockey.J_BACK, airhockey.J_NATION, 119, 102, airhockey.J_ENEMYWIN, 123, 126, airhockey.J_DISCONNECT, 109, airhockey.P_GAME_STANDBY, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, 123, airhockey.J_WAIT, airhockey.J_BACK, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, 123, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_STANDBY, 125, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, 111, airhockey.J_GAME_EXIT, airhockey.J_SAVEDGAME_SAVE, airhockey.J_DISCONNECT, 125, airhockey.P_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, airhockey.J_DISCONNECT, 123, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_REWARD, ByteCompanionObject.MAX_VALUE, 126, 35, 38, 44, 53, 29, 49, 59, 44, 33, 29, 35, 36, 54, 39, 48, 29, 35, 38, 29, 46, 45, 35, 38, 96, airhockey.J_GAME_STANDBY, 111, airhockey.J_REWARD, 94, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ACHIEVEMENTCALLBACK, 111, airhockey.J_NATION, 94, airhockey.J_ONREWARDED, 111, airhockey.J_GAME_STANDBY, airhockey.J_BACK, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, 111, airhockey.J_ERROR, 94, airhockey.J_BACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, airhockey.J_ENEMYWIN, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, airhockey.J_GAME_EXIT, 111, airhockey.J_GAME_STANDBY, 124, 84, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, 102, airhockey.J_INVITE, 84, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, 84, 124, airhockey.J_GAME_EXIT, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE, 84, 109, airhockey.J_ONREWARDED, airhockey.J_WAIT, 84, 125, airhockey.J_NATION, 111, airhockey.J_INVITE, airhockey.J_ONREWARDED, 84, 123, airhockey.J_ENEMYWIN, airhockey.J_GAME_EXIT, airhockey.J_SAVEDGAME_RELOAD, 84, 102, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_STANDBY, 64, airhockey.P_GAME_EXIT, 83, 123, 80, 77, airhockey.P_GAME_REMATCH, 65, 123, 80, 75, 123, 83, airhockey.P_GAME_STANDBY, 77, 80, 123, airhockey.P_NATION, 75, 86, 123, 82, 77, 64, 65, 75, 123, 84, 86, 65, 84, airhockey.P_GAME_STANDBY, 86, 65, 64, 123, airhockey.P_GAME_REMATCH, 87, 83, 86, 92, airhockey.P_GAME_STANDBY, 109, airhockey.P_GAME_BREAKBALLCOUNT, 91, 95, 87, 93, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 109, 64, 87, airhockey.P_GAME_STANDBY, 83, 64, 86, 87, 86, 109, airhockey.P_GAME_SELECTMAP, 91, 86, 87, 93, airhockey.J_SAVEDGAME_SAVE, airhockey.J_REWARD, 124, airhockey.J_GAME_STANDBY, 77, 102, 96, 123, airhockey.J_ERROR, airhockey.J_ERROR, 119, 96, 77, 124, airhockey.J_SAVEDGAME_SAVE, 102, 123, airhockey.J_ONREWARDED, 119, 77, 96, 119, airhockey.J_ERROR, 123, airhockey.J_SDKVER, 102, 119, 96, 77, airhockey.J_ONREWARDED, 123, 119, airhockey.J_GAME_STANDBY, 77, 119, 96, 96, 125, 96, 77, airhockey.J_BACK, airhockey.J_SAVEDGAME_SAVE, 126, 126, airhockey.J_GOO, airhockey.J_SAVEDGAME_SAVE, airhockey.J_BACK, airhockey.J_WAIT, 125, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_ENEMYEXIT, airhockey.P_GAME_MYSCORE, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 109, airhockey.J_GAME_REMATCH, airhockey.J_WAIT, airhockey.P_GAME_MYSCORE, airhockey.J_ACHIEVEMENTCALLBACK, 126, airhockey.P_GAME_MYSCORE, airhockey.J_SAVEDGAME_RELOAD, 125, airhockey.J_BACK, airhockey.J_WAIT, airhockey.P_GAME_MYSCORE, airhockey.J_GAME_DISCONNECT, airhockey.J_WAIT, airhockey.J_INVITE, airhockey.P_GAME_MYSCORE, airhockey.J_GAME_DISCONNECT, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, 111, 111, 54, 51, 57, 32, 8, 34, 39, 51, 54, 35, 50, 8, 50, 47, 35, 37, 54, 8, 63, 62, 57, 35, 36, 8, 49, 56, 37, 8, 52, 63, 54, 62, 57, 62, 57, 48, airhockey.P_GAME_MYLOSE, 77, airhockey.P_GAME_MYWIN, 94, airhockey.J_REWARD, 92, 90, 76, airhockey.J_REWARD, airhockey.P_GAME_MYLOSE, 89, 89, airhockey.J_REWARD, 77, 64, 78, 76, 90, 93, airhockey.J_REWARD, airhockey.P_GAME_MYLOSE, 89, 64, 50, 55, 61, 36, 12, 38, 32, 54, 12, 48, 50, 48, 59, 54, 55, 12, 54, 43, 54, 48, 38, 39, 60, 33, 12, 53, 60, 33, 12, 61, 54, 39, 36, 60, 33, 56, 53, 48, 58, 35, 11, 33, 39, 49, 11, 55, 53, 55, 60, 49, 48, 11, 49, 44, 49, 55, 33, 32, 59, 38, 11, 61, 58, 11, 55, 53, 55, 60, 49, 11, 57, 53, 58, 53, 51, 49, 38, airhockey.J_BACK, airhockey.J_DISCONNECT, 126, airhockey.J_ENEMYWIN, 79, airhockey.J_GAME_STANDBY, 99, airhockey.J_ERROR, 79, airhockey.J_NATION, airhockey.J_WAIT, 96, 96, 124, airhockey.J_ERROR, 79, airhockey.J_BACK, 126, airhockey.J_WAIT, 125, airhockey.J_BACK, airhockey.J_ONREWARDED, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, 126, 30, 27, 17, 8, 32, 10, 12, 26, 32, 12, 26, 28, 10, 13, 26, 32, 10, 13, 22, 32, 15, 30, 13, 12, 26, 13, 34, 39, 45, 52, 28, 53, 42, 39, 38, 44, 28, 48, 38, 32, 44, 45, 39, 28, 32, 43, 34, 45, 45, 38, 47, 28, 38, 45, 34, 33, 47, 38, 39, 31, 11, 10, 17, 12, 17, 10, 31, 10, 27, 33, 26, 23, 13, 31, 28, 18, 27, 26, 25, 13, 12, 23, 10, 23, 12, 25, 12, 29, 39, 29, 22, 25, 26, 20, 29, 28, airhockey.P_GAME_REMATCH, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_REMATCH, 65, 77, 95, 75, 88, 78, airhockey.J_ERROR, 94, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYWIN, 79, airhockey.J_ERROR, airhockey.P_GAME_MYWIN, 89, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYWIN, airhockey.J_GAME_STANDBY, 38, airhockey.J_INVITE, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, 109, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, airhockey.J_ENEMYWIN, 99, 38, airhockey.J_GAME_REMATCH, airhockey.J_GAME_DISCONNECT, 123, 38, 78, 77, airhockey.P_GAME_REMATCH, 92, 93, 90, 77, 87, 75, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 78, 65, 79, 38, 34, 37, 34, 38, 62, 38, 20, 46, 39, 42, 59, 56, 46, 47, 20, 63, 34, 38, 46, 20, 42, 45, 63, 46, 57, 20, 34, 38, 59, 57, 46, 56, 56, 34, 36, 37, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_REMATCH, airhockey.J_GOO, airhockey.J_GOO, 24, 15, 25, 30, 24, 3, 9, 30, 15, 14, 53, 14, 11, 30, 11, 53, 26, 24, 5, 9, 15, 25, 25, 3, 4, 13, 53, 9, 5, 7, 8, 3, 4, 11, 30, 3, 5, 4, 25, airhockey.J_GOO, 119, airhockey.J_NATION, 96, airhockey.J_ENEMYLOSE, 92, 119, airhockey.J_BACK, airhockey.J_NATION, 96, 102, 92, airhockey.J_GOO, airhockey.J_NATION, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, 111, 102, 92, airhockey.J_BACK, airhockey.J_NATION, 119, 102, 75, 84, 89, 88, 82, airhockey.J_NATION, 92, 83, 89, airhockey.J_NATION, 88, 83, 89, 94, 92, 79, 89, airhockey.J_NATION, 92, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 82, 79, 82, airhockey.P_GAME_REMATCH, 92, airhockey.P_GAME_REMATCH, 88, airhockey.P_NATION, airhockey.P_NATION, airhockey.P_NATION};
    }

    static {
        A0b();
        A04 = new String[0];
        A05 = new String[]{A0Q(86, 5, 14), A0Q(65, 9, 115), A0Q(74, 12, 88)};
    }

    public IK(Context context) {
        this.A00 = context.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A0Q(4750, 31, 38), context), 0);
    }

    public static float A00(Context context) {
        return A0P(context).A01(A0Q(2486, 39, 117), 0.98f);
    }

    private final float A01(String str, float f) {
        String string = this.A00.getString(str, String.valueOf(f));
        if (string != null) {
            try {
                String value = A0Q(4818, 4, 50);
                if (string.equals(value)) {
                    return f;
                }
                f = Float.parseFloat(string);
                return f;
            } catch (NumberFormatException unused) {
                return f;
            }
        }
        return f;
    }

    public static int A02(Context context) {
        return A0P(context).A2I(A0Q(HttpStatus.SC_EXPECTATION_FAILED, 33, 88), 100);
    }

    public static int A03(Context context) {
        return A0P(context).A2I(A0Q(2346, 33, 13), 0);
    }

    public static int A04(Context context) {
        return A0P(context).A2I(A0Q(2459, 27, 24), -1);
    }

    public static int A05(Context context) {
        return A0P(context).A2I(A0Q(799, 37, 83), 3);
    }

    public static int A06(Context context) {
        return A0P(context).A2I(A0Q(4732, 18, 4), 0);
    }

    public static int A07(Context context) {
        return A0P(context).A2I(A0Q(545, 36, 97), 3000);
    }

    public static int A08(Context context) {
        return A0P(context).A2I(A0Q(1498, 50, 51), 30000);
    }

    public static int A09(Context context) {
        return A0P(context).A2I(A0Q(1592, 40, 25), 3);
    }

    public static int A0A(Context context) {
        return A0P(context).A2I(A0Q(1548, 44, 119), GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY);
    }

    public static int A0B(Context context) {
        return A0P(context).A2I(A0Q(1632, 48, 20), 100);
    }

    public static int A0C(Context context) {
        return A0P(context).A2I(A0Q(1680, 39, 123), 60000);
    }

    public static int A0D(Context context) {
        return A0P(context).A2I(A0Q(3222, 38, 60), 225);
    }

    public static int A0E(Context context) {
        return A0P(context).A2I(A0Q(1267, 41, 90), 3145728);
    }

    public static int A0F(Context context) {
        return A0P(context).A2I(A0Q(4781, 37, 101), -1);
    }

    public static int A0G(Context context) {
        return A0P(context).A2I(A0Q(3391, 32, 54), 2000);
    }

    public static int A0H(Context context) {
        return A0P(context).A2I(A0Q(371, 46, 43), -1);
    }

    public static int A0I(Context context) {
        return A0P(context).A2I(A0Q(4861, 23, 45), 0);
    }

    public static int A0J(Context context) {
        return A0P(context).A2I(A0Q(4295, 35, 37), 3000);
    }

    public static int A0K(Context context) {
        return A0P(context).A2I(A0Q(4330, 39, 10), 3000);
    }

    public static int A0L(Context context) {
        return A0P(context).A2I(A0Q(1413, 46, 54), 0);
    }

    public static long A0M(Context context) {
        return A0P(context).A2J(A0Q(765, 34, 60), 67108864L);
    }

    public static long A0N(Context context) {
        return A0P(context).A2J(A0Q(920, 45, 8), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    public static long A0O(Context context) {
        return A0P(context).A2J(A0Q(1073, 38, 31), 33554432L);
    }

    public static synchronized IK A0P(Context context) {
        IK ik;
        synchronized (IK.class) {
            if (A01 == null) {
                A01 = new IK(context);
            }
            ik = A01;
        }
        return ik;
    }

    public static String A0R(Context context) {
        return A0P(context).A2K(A0Q(3194, 28, 30), A0Q(4912, 3, 27));
    }

    public static String A0S(Context context) {
        return A0P(context).A2K(A0Q(4270, 25, 47), A0Q(4912, 3, 27));
    }

    public static String A0T(Context context) {
        return A0P(context).A2K(A0Q(117, 52, 109), A0Q(1, 6, 36));
    }

    public static String A0U(Context context) {
        return A0P(context).A2K(A0Q(268, 51, 11), A0Q(24, 41, 29));
    }

    public static String A0V(Context context) {
        return A0P(context).A2K(A0Q(169, 53, 86), A0Q(7, 8, 63));
    }

    public static String A0W(Context context) {
        return A0P(context).A2K(A0Q(319, 52, 81), A0Q(15, 9, 110));
    }

    public static Set<String> A0X(Context context) {
        return A0P(context).A0a(A0Q(624, 44, 63), A04);
    }

    public static Set<String> A0Y(Context context) {
        return A0P(context).A0a(A0Q(4822, 39, 68), A05);
    }

    public static Set<String> A0Z(Context context) {
        return A0P(context).A0a(A0Q(2230, 44, 124), A04);
    }

    private Set<String> A0a(String str, String[] strArr) {
        JSONArray jSONArray;
        String jsonArrayString = A2K(str, null);
        try {
            if (jsonArrayString != null) {
                jSONArray = new JSONArray(jsonArrayString);
            } else {
                jSONArray = new JSONArray((Collection) Arrays.asList(strArr));
            }
            int length = jSONArray.length();
            LinkedHashSet linkedHashSet = new LinkedHashSet(length);
            for (int i = 0; i < length; i++) {
                linkedHashSet.add(jSONArray.getString(i));
            }
            return linkedHashSet;
        } catch (JSONException unused) {
            return new LinkedHashSet();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void A0c(Context context) {
        A0P(context).A00.edit().clear().commit();
    }

    private void A0d(@Nullable String str, @Nullable String str2) throws JSONException {
        if (str == null || str.isEmpty() || str.equals(A0Q(91, 2, 121))) {
            return;
        }
        JSONObject json = new JSONObject(str);
        A0e(json, str2);
    }

    private void A0e(JSONObject jSONObject, @Nullable String str) throws JSONException {
        SharedPreferences.Editor edit = this.A00.edit();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.equals(A0Q(93, 24, 54))) {
                A0d(jSONObject.getString(next), next);
            } else {
                String str2 = next;
                if (str != null) {
                    str2 = str + A0Q(0, 1, 108) + str2;
                }
                edit.putString(str2, jSONObject.getString(next));
            }
        }
        edit.apply();
    }

    public static boolean A0f(Context context) {
        return A0P(context).A2K(A0Q(4884, 28, 19), A0Q(4695, 19, 80)).equals(A0Q(4714, 18, 86));
    }

    public static boolean A0g(Context context) {
        return A0P(context).A2N(A0Q(475, 38, 54), false);
    }

    public static boolean A0h(Context context) {
        return A0P(context).A2N(A0Q(3714, 37, 97), false);
    }

    public static boolean A0i(Context context) {
        return A0P(context).A2N(A0Q(581, 43, 113), true);
    }

    public static boolean A0j(Context context) {
        return A0P(context).A2N(A0Q(2593, 29, 14), true);
    }

    public static boolean A0k(Context context) {
        return A0P(context).A2N(A0Q(3522, 27, 99), false);
    }

    public static boolean A0l(Context context) {
        return A0P(context).A2N(A0Q(876, 44, 46), true);
    }

    public static boolean A0m(Context context) {
        return A0P(context).A2N(A0Q(2434, 25, 22), true);
    }

    public static boolean A0n(Context context) {
        return A0P(context).A2N(A0Q(3423, 44, 109), true);
    }

    public static boolean A0o(Context context) {
        return A0P(context).A2N(A0Q(1003, 37, 50), true);
    }

    public static boolean A0p(Context context) {
        return A0P(context).A2N(A0Q(2563, 30, 69), false);
    }

    public static boolean A0q(Context context) {
        return A0P(context).A2N(A0Q(3080, 33, 43), false);
    }

    public static boolean A0r(Context context) {
        return A0P(context).A2N(A0Q(1040, 33, 120), true);
    }

    public static boolean A0s(Context context) {
        return A0P(context).A2N(A0Q(2897, 28, 54), false);
    }

    public static boolean A0t(Context context) {
        return A0P(context).A2N(A0Q(1111, 40, 67), true);
    }

    public static boolean A0u(Context context) {
        return A0P(context).A2N(A0Q(1151, 35, 55), false);
    }

    public static boolean A0v(Context context) {
        return A0P(context).A2N(A0Q(2733, 18, 84), false);
    }

    public static boolean A0w(Context context) {
        return A0P(context).A2N(A0Q(2984, 35, 119), true);
    }

    public static boolean A0x(Context context) {
        return A0P(context).A2N(A0Q(InputDeviceCompat.SOURCE_DPAD, 32, 80), false);
    }

    public static boolean A0y(Context context) {
        return A0P(context).A2N(A0Q(450, 25, 112), false);
    }

    public static boolean A0z(Context context) {
        return A0P(context).A2N(A0Q(2925, 25, 52), false);
    }

    public static boolean A10(Context context) {
        if (Build.VERSION.SDK_INT >= 18) {
            IK A0P = A0P(context);
            String A0Q = A0Q(2622, 25, 17);
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "eVi9wsoxiKuO8fS3Ni664QsxmOwf4Hz";
            strArr[0] = "nOcXZ0DMfofG3U9htYbEeRQSfAelmGW";
            return A0P.A2N(A0Q, false);
        }
        return false;
    }

    public static boolean A11(Context context) {
        return A0P(context).A2N(A0Q(2873, 24, 58), false);
    }

    public static boolean A12(Context context) {
        return A0P(context).A2N(A0Q(3334, 34, 44), false);
    }

    public static boolean A13(Context context) {
        return A0P(context).A2N(A0Q(3051, 29, 69), false);
    }

    public static boolean A14(Context context) {
        return A0P(context).A2N(A0Q(3113, 32, 79), false);
    }

    public static boolean A15(Context context) {
        return A0P(context).A2N(A0Q(1339, 23, 100), false);
    }

    public static boolean A16(Context context) {
        return A0P(context).A2N(A0Q(3293, 41, 8), false);
    }

    public static boolean A17(Context context) {
        return A0P(context).A2N(A0Q(2835, 22, 64), false);
    }

    public static boolean A18(Context context) {
        return A0P(context).A2N(A0Q(3751, 28, 78), true);
    }

    public static boolean A19(Context context) {
        return A0P(context).A2N(A0Q(3779, 31, 123), true);
    }

    public static boolean A1A(Context context) {
        return A0P(context).A2N(A0Q(4215, 32, 52), false);
    }

    public static boolean A1B(Context context) {
        return A0P(context).A2N(A0Q(222, 46, 76), false);
    }

    public static boolean A1C(Context context) {
        return A0P(context).A2N(A0Q(3260, 33, 114), false);
    }

    public static boolean A1D(Context context) {
        return A0P(context).A2N(A0Q(3179, 15, 123), false);
    }

    public static boolean A1E(Context context) {
        return A0P(context).A2N(A0Q(2525, 38, 96), false);
    }

    public static boolean A1F(Context context) {
        return A0P(context).A2N(A0Q(2797, 19, 0), true);
    }

    public static boolean A1G(Context context) {
        return A0P(context).A2N(A0Q(2301, 45, 85), false);
    }

    public static boolean A1H(Context context) {
        return A0P(context).A2N(A0Q(1719, 25, 65), true);
    }

    public static boolean A1I(Context context) {
        return A0P(context).A2N(A0Q(3549, 41, 111), true);
    }

    public static boolean A1J(Context context) {
        return A0P(context).A2N(A0Q(2816, 19, 47), true);
    }

    public static boolean A1K(Context context) {
        return A0P(context).A2N(A0Q(3590, 35, 50), true);
    }

    public static boolean A1L(Context context) {
        return A0P(context).A2N(A0Q(3625, 31, 11), true);
    }

    public static boolean A1M(Context context) {
        return A0P(context).A2N(A0Q(3656, 32, 109), true);
    }

    public static boolean A1N(Context context) {
        return A0P(context).A2N(A0Q(1744, 45, 34), true);
    }

    public static boolean A1O(Context context) {
        return A0P(context).A2N(A0Q(1789, 57, 117), false);
    }

    public static boolean A1P(Context context) {
        return A0P(context).A2N(A0Q(1846, 59, 108), true);
    }

    public static boolean A1Q(Context context) {
        return A0P(context).A2N(A0Q(3019, 32, 34), false);
    }

    public static boolean A1R(Context context) {
        return A0P(context).A2N(A0Q(4662, 33, 109), false);
    }

    public static boolean A1S(Context context) {
        return A0P(context).A2N(A0Q(3810, 38, 3), true);
    }

    public static boolean A1T(Context context) {
        return A0P(context).A2N(A0Q(3879, 38, 0), true);
    }

    public static boolean A1U(Context context) {
        return A0P(context).A2N(A0Q(3368, 23, 117), true);
    }

    public static boolean A1V(Context context) {
        return A0P(context).A2N(A0Q(2379, 21, 123), false);
    }

    public static boolean A1W(Context context) {
        return A0P(context).A2N(A0Q(1905, 44, 20), true);
    }

    public static boolean A1X(Context context) {
        return Build.VERSION.SDK_INT >= 16 && A0P(context).A2N(A0Q(668, 46, 110), false);
    }

    public static boolean A1Y(Context context) {
        return A0P(context).A2N(A0Q(714, 51, 74), true);
    }

    public static boolean A1Z(Context context) {
        return A0P(context).A2N(A0Q(3917, 43, 120), true);
    }

    public static boolean A1a(Context context) {
        return A0P(context).A2N(A0Q(965, 38, 49), false);
    }

    public static boolean A1b(Context context) {
        return A0P(context).A2N(A0Q(3467, 30, 86), true);
    }

    public static boolean A1c(Context context) {
        return A0P(context).A2N(A0Q(2274, 27, 108), false);
    }

    public static boolean A1d(Context context) {
        return A0P(context).A2N(A0Q(1362, 51, 8), false);
    }

    public static boolean A1e(Context context) {
        return A0P(context).A2N(A0Q(1186, 40, 37), true);
    }

    public static boolean A1f(Context context) {
        return A0P(context).A2N(A0Q(1949, 31, 98), false);
    }

    public static boolean A1g(Context context) {
        return A0P(context).A2N(A0Q(1226, 41, 69), false);
    }

    public static boolean A1h(Context context) {
        return A0P(context).A2N(A0Q(3960, 31, 49), false);
    }

    public static boolean A1i(Context context) {
        return A0P(context).A2N(A0Q(3991, 53, 76), false);
    }

    public static boolean A1j(Context context) {
        return A0P(context).A2N(A0Q(4044, 38, 54), true);
    }

    public static boolean A1k(Context context) {
        return A0P(context).A2N(A0Q(4082, 33, 110), false);
    }

    public static boolean A1l(Context context) {
        return A0P(context).A2N(A0Q(1980, 53, 72), false);
    }

    public static boolean A1m(Context context) {
        return A0P(context).A2N(A0Q(2950, 34, 100), false);
    }

    public static boolean A1n(Context context) {
        return A0P(context).A2N(A0Q(2033, 48, 102), false);
    }

    public static boolean A1o(Context context) {
        return A0P(context).A2N(A0Q(4115, 25, 39), false);
    }

    public static boolean A1p(Context context) {
        return A0P(context).A2N(A0Q(2400, 34, 106), false);
    }

    public static boolean A1q(Context context) {
        return A0P(context).A2N(A0Q(4140, 35, 72), false);
    }

    public static boolean A1r(Context context) {
        return A0P(context).A2N(A0Q(3688, 26, 69), false);
    }

    public static boolean A1s(Context context) {
        return A0P(context).A2N(A0Q(2081, 51, 61), true);
    }

    public static boolean A1t(Context context) {
        return A0P(context).A2N(A0Q(3848, 31, 67), false);
    }

    public static boolean A1u(Context context) {
        return A0P(context).A2N(A0Q(1308, 31, 37), false);
    }

    public static boolean A1v(Context context) {
        return A0P(context).A2N(A0Q(4247, 23, 108), true);
    }

    public static boolean A1w(Context context) {
        return A0P(context).A2N(A0Q(4369, 27, 28), false);
    }

    public static boolean A1x(Context context) {
        return A0P(context).A2N(A0Q(4475, 36, 121), false);
    }

    public static boolean A1y(Context context) {
        return A0P(context).A2N(A0Q(2751, 46, 43), true);
    }

    public static boolean A1z(Context context) {
        return A0P(context).A2N(A0Q(3145, 34, 88), false);
    }

    public static boolean A20(Context context) {
        return A0P(context).A2N(A0Q(4611, 25, 62), false);
    }

    public static boolean A21(Context context) {
        return A0P(context).A2N(A0Q(4444, 31, 50), false);
    }

    public static boolean A22(Context context) {
        return A0P(context).A2N(A0Q(4175, 40, 45), true);
    }

    public static boolean A23(Context context) {
        return A0P(context).A2N(A0Q(2857, 16, 91), true);
    }

    public static boolean A24(Context context) {
        return A0P(context).A2N(A0Q(4396, 48, 60), false);
    }

    public static boolean A25(Context context) {
        return A0P(context).A2N(A0Q(4511, 23, 7), true);
    }

    public static boolean A26(Context context) {
        return A0P(context).A2N(A0Q(2132, 18, 53), false);
    }

    public static boolean A27(Context context) {
        return A0P(context).A2N(A0Q(2150, 40, 90), false);
    }

    public static boolean A28(Context context) {
        return A0P(context).A2N(A0Q(4534, 36, 125), false);
    }

    public static boolean A29(Context context) {
        return A0P(context).A2N(A0Q(4570, 41, 122), true);
    }

    public static boolean A2A(Context context) {
        return A0P(context).A2N(A0Q(836, 40, 10), false);
    }

    public static boolean A2B(Context context) {
        return A0P(context).A2N(A0Q(1459, 39, 40), false);
    }

    public static boolean A2C(Context context) {
        return A0P(context).A2N(A0Q(3497, 25, 17), false);
    }

    public static boolean A2D(Context context) {
        return A0P(context).A2N(A0Q(4636, 26, 81), true);
    }

    public static boolean A2E(Context context) {
        return A0P(context).A2N(A0Q(2190, 40, 20), true);
    }

    public static boolean A2F(Context context, boolean z) {
        return A2H(context, z) && A0P(context).A2N(A0Q(2647, 27, 87), false);
    }

    public static boolean A2G(Context context, boolean z) {
        return Build.VERSION.SDK_INT >= 21 && A2F(context, z) && A0P(context).A2N(A0Q(2674, 35, 66), true);
    }

    public static boolean A2H(Context context, boolean z) {
        return z && Build.VERSION.SDK_INT >= 19 && A0P(context).A2N(A0Q(2709, 24, 2), false);
    }

    public final int A2I(String str, int i) {
        String string = this.A00.getString(str, String.valueOf(i));
        if (string != null) {
            try {
                String value = A0Q(4818, 4, 50);
                if (string.equals(value)) {
                    return i;
                }
                i = Integer.parseInt(string);
                return i;
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    public final long A2J(String str, long j) {
        String string = this.A00.getString(str, String.valueOf(j));
        if (string != null) {
            try {
                String value = A0Q(4818, 4, 50);
                if (string.equals(value)) {
                    return j;
                }
                j = Long.parseLong(string);
                return j;
            } catch (NumberFormatException unused) {
                return j;
            }
        }
        return j;
    }

    public final String A2K(String str, String str2) {
        String string = this.A00.getString(str, str2);
        if (string != null) {
            String value = A0Q(4818, 4, 50);
            return string.equals(value) ? str2 : string;
        }
        return str2;
    }

    public final void A2L(@Nullable String str) throws JSONException {
        A0d(str, null);
    }

    public final void A2M(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        A0e(jSONObject, null);
    }

    public final boolean A2N(String str, boolean z) {
        String string = this.A00.getString(str, String.valueOf(z));
        if (string != null) {
            String value = A0Q(4818, 4, 50);
            boolean equals = string.equals(value);
            if (A03[5].charAt(10) != 'g') {
                throw new RuntimeException();
            }
            A03[7] = "2ZyfpebDvRtNljKwQKDVcWpHPVLB6mST";
            return equals ? z : Boolean.parseBoolean(string);
        }
        return z;
    }
}
