package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dk */
/* loaded from: assets/audience_network.dex */
public class RunnableC0391Dk implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"trtHxdWfI8aUUasJnLCFOWNhTEgT5SfR", "ildDLLQ3Py5XZqRSamTTI6YoT50zpskF", "dVw5UxmZMKob3SUb3uvB6OES0lFAFJfM", "IR8fXYoB6j0jxnrkbU78JZ5o5XE94BNQ", "b3RCFjVWO3b8eRQaxF9", "jCTIeE11ZTJ65IoFy1xYkV7ELZ3vCqIN", "TgSfnKfrSSedvNLmmcoIbwvrw3BnVtDY", "eNW8IuS2yi6nO7dU30TIFIzk8f1M77f"};
    public final /* synthetic */ C0400Dt A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 26;
            if (A02[0].charAt(19) == 't') {
                throw new RuntimeException();
            }
            A02[6] = "Wfj4XOUJd4uRzIFmDg2tyEJWBqTNOatQ";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{76, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_ONREWARDED, airhockey.J_NATION, 99, 45, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, 45, airhockey.J_SDKVER, airhockey.J_NATION, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_REMATCH, airhockey.J_ONREWARDED, 99, airhockey.J_GAME_EXIT, 45, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, 35, 12, 39, 63, 38, 36, 39, 41, 44, 5, 41, 38, 41, 47, 45, 58};
    }

    static {
        A01();
    }

    public RunnableC0391Dk(C0400Dt c0400Dt) {
        this.A00 = c0400Dt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DZ dz;
        DownloadAction.Deserializer[] deserializerArr;
        Handler handler;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            dz = this.A00.A09;
            deserializerArr = this.A00.A0E;
            DownloadAction[] actions = dz.A03(deserializerArr);
            handler = this.A00.A07;
            handler.post(new RunnableC0390Dj(this, actions));
        }
    }
}
