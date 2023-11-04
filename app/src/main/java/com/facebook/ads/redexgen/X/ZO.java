package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public abstract class ZO implements AnonymousClass27 {
    public static byte[] A05;
    public final InterfaceC01221v A00;
    public final C0887Xc A01;
    public final String A02 = UUID.randomUUID().toString();
    public final Handler A03;
    public final AnonymousClass22 A04;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-65, -46, -53, -63, -55, -62, -36, -62, -43, -47, -49, -66, -48, -36, -56, -62, -42, -46, -41, -35, -24, -50, -37, -37, -40, -37, -24, -52, -40, -51, -50, -24, -44, -50, -30, -83, -82, -84, -71, -101, -98, -71, -93, -98, -71, -91, -97, -77, -24, -23, -25, -12, -38, -25, -25, -28, -25, -12, -30, -38, -24, -24, -42, -36, -38, -12, -32, -38, -18};
    }

    public abstract void A05();

    public ZO(C0887Xc c0887Xc, AnonymousClass23 anonymousClass23) {
        this.A01 = c0887Xc;
        DynamicLoaderFactory.makeLoader(this.A01).getInitApi().onAdLoadInvoked(this.A01);
        this.A00 = new ZR(c0887Xc, this);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A04 = anonymousClass23.A4P(this.A00, this);
    }

    public final void A04() {
        if (!IK.A0p(this.A01)) {
            return;
        }
        LF.A00(new ZP(this));
    }

    public final void A06(int i, AdErrorType adErrorType, @Nullable String str) {
        Bundle bundle = new Bundle();
        String A02 = A02(48, 21, 113);
        if (str != null) {
            bundle.putString(A02, str);
        } else {
            bundle.putString(A02, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A02(17, 18, 101), adErrorType.getErrorCode());
        ABk(i, this.A02, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass27
    public final void ABk(int i, String str, @Nullable Bundle bundle) {
        Message obtain = Message.obtain((Handler) null, i);
        obtain.getData().putString(A02(35, 13, 54), str);
        if (bundle != null) {
            obtain.getData().putBundle(A02(0, 17, 89), bundle);
        }
        Runnable callbackApiRunnable = new ZQ(this, obtain);
        this.A03.post(callbackApiRunnable);
    }
}
