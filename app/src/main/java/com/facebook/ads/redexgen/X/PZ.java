package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PZ implements View.OnClickListener {
    public final /* synthetic */ C0542Jn A00;

    public PZ(C0542Jn c0542Jn) {
        this.A00 = c0542Jn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0513Ii c0513Ii;
        C0887Xc c0887Xc;
        RA ra;
        boolean A07;
        RA ra2;
        RA ra3;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            c0513Ii = this.A00.A03;
            c0513Ii.A04(EnumC0512Ih.A0d, null);
            c0887Xc = this.A00.A02;
            c0887Xc.A0E().A30();
            ra = this.A00.A00;
            if (ra != null) {
                A07 = this.A00.A07();
                if (A07) {
                    ra3 = this.A00.A00;
                    ra3.setVolume(1.0f);
                } else {
                    ra2 = this.A00.A00;
                    ra2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
