package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FB extends AbstractC0982aM {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{airhockey.J_PURCHASE, 93, 85, 80, 89, 88, 28, airhockey.P_GAME_MYLOSE, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, airhockey.P_GAME_REMATCH, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = FB.class.getSimpleName();
    }

    public FB(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, Uri uri, Map<String, String> mExtraData, @Nullable C00870m c00870m, boolean z) {
        super(c0887Xc, interfaceC0505Ia, str, c00870m, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00810f
    @Nullable
    public final EnumC00800e A0A() {
        try {
            KS.A09(new KS(), ((AbstractC00810f) this).A00, KT.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC00810f) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC00800e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0982aM
    public final void A0D() {
        EnumC00800e enumC00800e = null;
        if (((AbstractC0982aM) this).A02) {
            enumC00800e = A0A();
        }
        A0E(this.A01, enumC00800e);
    }
}
