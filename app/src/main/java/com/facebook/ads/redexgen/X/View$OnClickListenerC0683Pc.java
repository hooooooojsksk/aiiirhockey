package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pc */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0683Pc implements View.OnClickListener {
    public final /* synthetic */ C6G A00;

    public View$OnClickListenerC0683Pc(C6G c6g) {
        this.A00 = c6g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RA videoView;
        C0513Ii c0513Ii;
        C0887Xc c0887Xc;
        RA videoView2;
        RA videoView3;
        RA videoView4;
        C0513Ii c0513Ii2;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                c0513Ii = this.A00.A02;
                if (c0513Ii != null) {
                    c0513Ii2 = this.A00.A02;
                    c0513Ii2.A04(EnumC0512Ih.A0p, null);
                }
                c0887Xc = this.A00.A01;
                c0887Xc.A0E().A2u();
                int[] iArr = C0684Pd.A00;
                videoView2 = this.A00.getVideoView();
                int i = iArr[videoView2.getState().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    videoView3 = this.A00.getVideoView();
                    videoView3.A0b(PK.A04, 12);
                } else if (i == 5) {
                    videoView4 = this.A00.getVideoView();
                    videoView4.A0e(true, 8);
                }
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
