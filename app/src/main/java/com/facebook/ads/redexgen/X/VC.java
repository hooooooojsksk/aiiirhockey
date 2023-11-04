package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class VC implements FF {
    @Nullable
    public BY A02;
    @Nullable
    public Object A03;
    @Nullable
    public String A04;
    public boolean A05;
    public final GW A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public VC(GW gw) {
        this.A06 = gw;
    }

    public final VC A00(String str) {
        HD.A04(!this.A05);
        this.A04 = str;
        return this;
    }

    public final BO A01(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new WX();
        }
        return new BO(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}
