package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class U9 extends K1 {
    public static byte[] A01;
    public final /* synthetic */ C7N A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{111, 99, airhockey.J_SDKVER, 34, airhockey.J_GAME_EXIT, 109, 111, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, 99, 99, airhockey.J_ENEMYWIN, 34, 109, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, 34, 64, airhockey.P_GAME_MYSCORE, 79, 77, 64, 83, 79, airhockey.P_GAME_MYSCORE, 89, airhockey.P_NATION, 88, airhockey.P_GAME_REMATCH, 94, 95, 88, 91, 87, 85, 88, airhockey.J_GAME_ENEMYEXIT, 87, 91, 65, 90, 64, 81, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, 84, 92, 88, airhockey.P_GAME_EXIT, 76, 75, 92, 93, 102, airhockey.P_GAME_EXIT, 92, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 80, 86, 87, 102, 80, 93, airhockey.J_GAME_DISCONNECT, airhockey.J_ONREWARDED, 96, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 94, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYLOSE, airhockey.J_INVITE, 111, 94, airhockey.J_ERROR, airhockey.J_ENEMYLOSE, airhockey.J_GAME_DISCONNECT, airhockey.J_ONREWARDED};
    }

    public U9(C7N c7n) {
        this.A00 = c7n;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        AtomicInteger atomicInteger;
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(0, 31, 63), this.A00), 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                C0516Il.A06(this.A00, QY.A00(this.A00), all);
            }
            sharedPreferences.edit().clear().apply();
            sharedPreferences.edit().putString(A00(45, 19, 10), this.A00.A08().A02()).putString(A00(64, 21, 50), LC.A02(this.A00.A08().A01())).apply();
        } catch (JSONException t) {
            this.A00.A07().A9C(A00(31, 14, 7), 3502, new C02637t(t));
            sharedPreferences.edit().clear().apply();
        }
        synchronized (C0516Il.class) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry : C0516Il.A02().entrySet()) {
                edit.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            edit.apply();
            atomicInteger = C0516Il.A04;
            atomicInteger.set(2);
        }
    }
}
