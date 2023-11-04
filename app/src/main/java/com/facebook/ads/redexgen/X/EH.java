package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.RequiresApi;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

@RequiresApi(21)
/* loaded from: assets/audience_network.dex */
public class EH extends C0924Yn {
    public static byte[] A00;
    public static String[] A01 = {"lLTnlT7kdgZgpONat", "d79paUk3eSzGphhSN42PN5Aq8dj9iVyl", "SPt342n", "OIl1JjPDUNYuj0Z8zSbytdcas", "BSu1Ds7nymHwzPjWE4jzwGDd8JkRRJPQ", "PB1eQ9fbEyjMYRd9wV6iR7DUEeVSeCVP", "JUVWQPWt2QIcAEqAV6T0sxDALqwyj", "zKN2MvPWkZddLmlUYuVLkoywXLI"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[7].length() == 21) {
                throw new RuntimeException();
            }
            A01[7] = "QKmrPpG47xHIA";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{79, 11, 0, 10, 28, 79, 1, 0, 27, 79, 6, 2, 31, 3, 10, 2, 10, 1, 27, 79, 6, 1, 27, 10, 29, 9, 14, 12, 10, 79, 2, 10, 27, 7, 0, 11, 79, 0, 1, 33, 10, 28, 27, 10, 11, 41, 3, 6, 1, 8, 125, 57, 50, 56, 46, 125, 51, 50, 41, 125, 52, 48, 45, 49, 56, 48, 56, 51, 41, 125, 52, 51, 41, 56, 47, 59, 60, 62, 56, 125, 48, 56, 41, 53, 50, 57, 125, 50, 51, 19, 56, 46, 41, 56, 57, 13, 47, 56, 27, 49, 52, 51, 58, 5, 65, airhockey.P_GAME_EXIT, 64, 86, 5, 75, airhockey.P_GAME_EXIT, 81, 5, 76, airhockey.P_GAME_MYLOSE, 85, airhockey.P_GAME_REMATCH, 64, airhockey.P_GAME_MYLOSE, 64, 75, 81, 5, 76, 75, 81, 64, 87, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_BREAKBALLCOUNT, 64, 5, airhockey.P_GAME_MYLOSE, 64, 81, 77, airhockey.P_GAME_EXIT, 65, 5, airhockey.P_GAME_EXIT, 75, airhockey.J_GAME_ENEMYEXIT, 64, 86, 81, 64, 65, airhockey.J_ERROR, 87, 64, airhockey.J_REWARD, airhockey.P_GAME_BREAKBALLCOUNT, 87, airhockey.P_GAME_EXIT, airhockey.P_GAME_REMATCH, airhockey.P_GAME_REMATCH, 3, airhockey.P_GAME_MYWIN, 76, airhockey.P_GAME_BREAKBALLCOUNT, 80, 3, 77, 76, 87, 3, airhockey.P_GAME_EXIT, 78, 83, 79, airhockey.P_GAME_BREAKBALLCOUNT, 78, airhockey.P_GAME_BREAKBALLCOUNT, 77, 87, 3, airhockey.P_GAME_EXIT, 77, 87, airhockey.P_GAME_BREAKBALLCOUNT, 81, airhockey.P_GAME_STANDBY, airhockey.P_NATION, 64, airhockey.P_GAME_BREAKBALLCOUNT, 3, 78, airhockey.P_GAME_BREAKBALLCOUNT, 87, 75, 76, airhockey.P_GAME_MYWIN, 3, 76, 77, 109, airhockey.P_GAME_BREAKBALLCOUNT, 80, 87, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, airhockey.J_GOO, 64, 81, 76, 79, 79, 35, airhockey.J_ENEMYWIN, airhockey.J_GAME_DISCONNECT, 102, airhockey.J_GOO, 35, 109, airhockey.J_GAME_DISCONNECT, 119, 35, airhockey.J_GAME_EXIT, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, 111, 102, airhockey.J_INVITE, 102, 109, 119, 35, airhockey.J_GAME_EXIT, 109, 119, 102, airhockey.J_BACK, airhockey.J_GAME_STANDBY, airhockey.J_NATION, 96, 102, 35, airhockey.J_INVITE, 102, 119, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_ENEMYWIN, 35, airhockey.J_GAME_DISCONNECT, 109, 77, 102, airhockey.J_GOO, 119, 102, airhockey.J_ENEMYWIN, 80, 96, airhockey.J_BACK, airhockey.J_GAME_DISCONNECT, 111, 111, airhockey.P_NATION, 96, 96, 102, airhockey.J_SAVEDGAME_SAVE, 119, 102, airhockey.J_ENEMYWIN, 81, 21, 30, 20, 2, 81, 31, 30, 5, 81, 24, 28, 1, 29, 20, 28, 20, 31, 5, 81, 24, 31, 5, 20, 3, 23, 16, 18, 20, 81, 28, 20, 5, 25, 30, 21, 81, 30, 31, 34, 5, 16, 3, 5, 63, 20, 2, 5, 20, 21, 34, 18, 3, 30, 29, 29, 47, airhockey.J_GAME_ENEMYEXIT, 96, airhockey.J_GAME_EXIT, 124, 47, airhockey.J_SDKVER, 96, 123, 47, 102, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE, 99, airhockey.J_GAME_EXIT, airhockey.J_NATION, airhockey.J_GAME_EXIT, airhockey.J_SDKVER, 123, 47, 102, airhockey.J_SDKVER, 123, airhockey.J_GAME_EXIT, 125, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_EXIT, 47, airhockey.J_NATION, airhockey.J_GAME_EXIT, 123, airhockey.J_ENEMYWIN, 96, airhockey.J_GAME_ENEMYEXIT, 47, 96, airhockey.J_SDKVER, 92, 123, 96, ByteCompanionObject.MAX_VALUE, 65, airhockey.J_GAME_EXIT, 124, 123, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, 92, airhockey.J_GAME_DISCONNECT, 125, 96, 99, 99, 75, airhockey.J_DISCONNECT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_EXIT, 77, 124, 111, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_REMATCH, 61, 80, 111, 99, airhockey.J_BACK, 86, airhockey.J_ENEMYWIN, airhockey.J_DISCONNECT, 99, airhockey.J_ENEMYLOSE, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_STANDBY, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, airhockey.J_ENEMYWIN, airhockey.J_SAVEDGAME_RELOAD};
    }

    static {
        A02();
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A03(ViewParent viewParent, View view) {
        try {
            viewParent.onStopNestedScroll(view);
        } catch (AbstractMethodError e) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(323, 55, 53), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A04(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        try {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        } catch (AbstractMethodError e) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(157, 51, 25), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A05(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        try {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        } catch (AbstractMethodError e) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(103, 54, 31), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final void A06(ViewParent viewParent, View view, View view2, int i) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(208, 59, 57), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final boolean A07(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(50, 53, 103), e);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final boolean A08(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(0, 50, 85), e);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3T
    public final boolean A09(ViewParent viewParent, View view, View view2, int i) {
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e(A01(389, 16, 60), A01(378, 11, 39) + viewParent + A01(267, 56, 75), e);
            return false;
        }
    }
}
