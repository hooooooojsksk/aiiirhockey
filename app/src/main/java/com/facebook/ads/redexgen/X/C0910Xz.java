package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Xz */
/* loaded from: assets/audience_network.dex */
public final class C0910Xz implements InterfaceC01191s {
    public static byte[] A03;
    public C5W A00;
    public C0887Xc A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, airhockey.J_ONREWARDED, ByteCompanionObject.MAX_VALUE, airhockey.J_PURCHASE, ByteCompanionObject.MAX_VALUE, 126, 102, ByteCompanionObject.MAX_VALUE};
    }

    public C0910Xz(C5W c5w, C0887Xc c0887Xc, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c5w;
        this.A01 = c0887Xc;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01191s
    public final void AAv(JA ja) {
        C0547Js.A00(new Y2(this, ja));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01191s
    public final void ABq(List<C0967a7> list) {
        C6M manager = new C6M(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C0967a7 c0967a7 : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c0967a7.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c0967a7.A0E().A0G() != null) {
                    manager.A0b(new C6K(c0967a7.A0E().A0G().getUrl(), c0967a7.A0E().A0G().getHeight(), c0967a7.A0E().A0G().getWidth(), c0967a7.A0G(), A02(0, 6, 2)));
                }
                if (c0967a7.A0E().A0F() != null) {
                    manager.A0b(new C6K(c0967a7.A0E().A0F().getUrl(), c0967a7.A0E().A0F().getHeight(), c0967a7.A0E().A0F().getWidth(), c0967a7.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c0967a7.A0E().A0d())) {
                    manager.A0a(new C6I(c0967a7.A0E().A0d(), c0967a7.A0G(), A02(0, 6, 2), c0967a7.A0E().A0A()));
                }
            }
        }
        manager.A0W(new Y0(this, list), new C6F(firstRequestId, A02(0, 6, 2)));
    }
}
