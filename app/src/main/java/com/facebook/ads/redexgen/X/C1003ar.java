package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.ar */
/* loaded from: assets/audience_network.dex */
public final class C1003ar {
    public final C1014b2 A00;
    public final C1012b0 A01;

    public C1003ar(AbstractC1019b7 abstractC1019b7, C1012b0 c1012b0, C1014b2 c1014b2) {
        this.A00 = c1014b2;
        this.A01 = c1012b0;
        abstractC1019b7.A02(new C0448Fr(c1012b0));
    }

    public static C1003ar A00(AbstractC1019b7 abstractC1019b7, InterfaceC1023bB interfaceC1023bB, InterfaceC0449Fs interfaceC0449Fs) {
        C1014b2 c1014b2 = new C1014b2();
        C1012b0 viewpointScanner = new C1012b0(interfaceC1023bB, new C0455Fy(), interfaceC0449Fs, c1014b2, new Handler(Looper.getMainLooper()));
        return new C1003ar(abstractC1019b7, viewpointScanner, c1014b2);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C1021b9 c1021b9) {
        this.A00.A02(view, c1021b9);
    }

    public final void A03(@Nullable InterfaceC1018b6 interfaceC1018b6) {
        this.A01.A09(interfaceC1018b6);
    }

    public final void A04(@Nullable InterfaceC1016b4 interfaceC1016b4) {
        this.A01.A0A(interfaceC1016b4);
    }
}
