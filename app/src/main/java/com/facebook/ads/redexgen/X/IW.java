package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class IW {
    public double A00;
    public EnumC0507Ic A01;
    public EnumC0508Id A02;
    public String A03;
    public String A04;
    @Nullable
    public Map<String, String> A05;
    public boolean A06;

    public final IW A00(double d) {
        this.A00 = d;
        return this;
    }

    public final IW A01(EnumC0507Ic enumC0507Ic) {
        this.A01 = enumC0507Ic;
        return this;
    }

    public final IW A02(EnumC0508Id enumC0508Id) {
        this.A02 = enumC0508Id;
        return this;
    }

    public final IW A03(String str) {
        this.A03 = str;
        return this;
    }

    public final IW A04(String str) {
        this.A04 = str;
        return this;
    }

    public final IW A05(@Nullable Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final IW A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final IX A07(C7N c7n) {
        return new IX(c7n, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
