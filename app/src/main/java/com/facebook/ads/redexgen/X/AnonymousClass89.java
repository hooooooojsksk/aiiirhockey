package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.89 */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass89 extends AbstractC0664Oj {
    public static byte[] A01;
    public final /* synthetic */ OE A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-78, -65, -65, -68, -65};
    }

    public AnonymousClass89(OE oe) {
        this.A00 = oe;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A02 */
    public final void A03(P8 p8) {
        OD od;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new OC(this));
        od = this.A00.A0B;
        A03 = this.A00.A03();
        od.AD0(A00(0, 5, 60), A03);
    }
}
