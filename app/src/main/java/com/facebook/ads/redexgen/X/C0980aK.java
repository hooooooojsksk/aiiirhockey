package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.aK */
/* loaded from: assets/audience_network.dex */
public final class C0980aK extends AbstractC00810f {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, airhockey.J_SAVEDGAME_SAVE, 123, 126, 119, airhockey.J_REWARD, 50, -122, -127, 50, -127, -126, 119, ByteCompanionObject.MIN_VALUE, 50, 126, 123, ByteCompanionObject.MIN_VALUE, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = C0980aK.class.getSimpleName();
    }

    public C0980aK(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, Uri uri) {
        super(c0887Xc, interfaceC0505Ia, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00810f
    public final void A0C() {
        try {
            KS.A0A(new KS(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
    }
}
