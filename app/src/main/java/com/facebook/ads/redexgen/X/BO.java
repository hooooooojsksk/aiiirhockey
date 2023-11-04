package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class BO extends VH implements EO {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final BY A05;
    public final GW A06;
    @Nullable
    public final Object A07;
    public final String A08;

    public BO(Uri uri, GW gw, BY by, int i, @Nullable String str, int i2, @Nullable Object obj) {
        this.A04 = uri;
        this.A06 = gw;
        this.A05 = by;
        this.A03 = i;
        this.A08 = str;
        this.A02 = i2;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
        A01(new V8(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.X.VH
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.X.VH
    public final void A03(InterfaceC0880Wv interfaceC0880Wv, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.X.ET
    public final VA A4T(ER er, GP gp) {
        HD.A03(er.A02 == 0);
        return new BR(this.A04, this.A06.A4H(), this.A05.A4L(), this.A03, A00(er), this, gp, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.ET
    public final void A9l() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.EO
    public final void ACa(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 == j && this.A01 == z) {
            return;
        }
        A00(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.ET
    public final void AE9(VA va) {
        ((BR) va).A0R();
    }
}
