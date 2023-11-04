package com.facebook.ads.redexgen.X;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationManagerCompat;

/* renamed from: com.facebook.ads.redexgen.X.Dy */
/* loaded from: assets/audience_network.dex */
public final class C0405Dy {
    public final GU A00;
    public final GW A01;
    public final GW A02;
    public final InterfaceC0478Gx A03;
    public final C0487Hg A04;

    public C0405Dy(InterfaceC0478Gx interfaceC0478Gx, GW gw) {
        this(interfaceC0478Gx, gw, null, null, null);
    }

    public C0405Dy(InterfaceC0478Gx interfaceC0478Gx, GW gw, @Nullable GW gw2, @Nullable GU gu, @Nullable C0487Hg c0487Hg) {
        HD.A01(gw);
        this.A03 = interfaceC0478Gx;
        this.A02 = gw;
        this.A01 = gw2;
        this.A00 = gu;
        this.A04 = c0487Hg;
    }

    public final InterfaceC0478Gx A00() {
        return this.A03;
    }

    public final UU A01(boolean z) {
        GX c0817Uh;
        GV uv;
        GW gw = this.A01;
        if (gw != null) {
            c0817Uh = gw.A4H();
        } else {
            c0817Uh = new C0817Uh();
        }
        if (z) {
            return new UU(this.A03, C0818Ui.A02, c0817Uh, null, 1, null);
        }
        GU gu = this.A00;
        if (gu != null) {
            uv = gu.createDataSink();
        } else {
            uv = new UV(this.A03, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        }
        GX A4H = this.A02.A4H();
        C0487Hg c0487Hg = this.A04;
        if (c0487Hg != null) {
            A4H = new UZ(A4H, c0487Hg, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        }
        GX upstream = c0817Uh;
        return new UU(this.A03, A4H, upstream, uv, 1, null);
    }

    public final C0487Hg A02() {
        C0487Hg c0487Hg = this.A04;
        return c0487Hg != null ? c0487Hg : new C0487Hg();
    }
}
