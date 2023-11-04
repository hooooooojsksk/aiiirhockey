package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.4R */
/* loaded from: assets/audience_network.dex */
public final class C4R extends C0469Go implements InterfaceC0459Gd {
    public static byte[] A01;
    public boolean A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_BACK, airhockey.J_GAME_EXIT, 96, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, 36, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GOO, 36, airhockey.J_REWARD, airhockey.J_SDKVER, airhockey.J_GAME_STANDBY, 96, 125};
    }

    public final synchronized void A06() {
        this.A00 = true;
    }

    public final synchronized boolean A07(AtomicReference<JSONObject> fingerprint, AtomicReference<JSONObject> atomicReference) {
        if (A8r()) {
            if (!this.A00) {
                atomicReference.set(A6n());
                return false;
            }
            fingerprint.set(A6P());
            atomicReference.set(A6n());
            this.A00 = false;
            return true;
        }
        throw new IllegalStateException(A00(0, 16, 62));
    }
}
