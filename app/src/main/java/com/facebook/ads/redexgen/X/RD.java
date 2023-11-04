package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class RD extends K1 {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RA A02;
    public final /* synthetic */ Q7 A03;

    public RD(RA ra, Q7 q7, int i, int i2) {
        this.A02 = ra;
        this.A03 = q7;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        C0887Xc c0887Xc;
        Handler handler;
        C8U c8u;
        C0887Xc c0887Xc2;
        C8U c8u2;
        C0601Lx c0601Lx;
        Handler handler2;
        C0887Xc c0887Xc3;
        C8U c8u3;
        Handler handler3;
        C0887Xc c0887Xc4;
        C0887Xc c0887Xc5;
        C8U c8u4;
        NC nc;
        Handler handler4;
        C0887Xc c0887Xc6;
        C0887Xc c0887Xc7;
        Handler handler5;
        C8U c8u5;
        C8U c8u6;
        P8 p8;
        C0887Xc c0887Xc8;
        C8U c8u7;
        if (this.A03 == Q7.A07) {
            this.A02.A0L(EnumC0512Ih.A0q);
            c0887Xc8 = this.A02.A0A;
            c0887Xc8.A0E().A2x();
            c8u7 = this.A02.A0B;
            c8u7.A02(RA.A0C());
        } else if (this.A03 == Q7.A03) {
            this.A02.A0L(EnumC0512Ih.A0l);
            this.A02.A03 = true;
            c8u6 = this.A02.A0B;
            p8 = RA.A0G;
            c8u6.A02(p8);
            this.A02.A0K(this.A00);
        } else {
            Q7 q7 = this.A03;
            Q7 q72 = Q7.A06;
            String[] strArr = A04;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
            if (q7 == q72) {
                this.A02.A0L(EnumC0512Ih.A0k);
                c0887Xc7 = this.A02.A0A;
                c0887Xc7.A0E().A2p();
                this.A02.A03 = true;
                handler5 = this.A02.A07;
                handler5.removeCallbacksAndMessages(null);
                c8u5 = this.A02.A0B;
                int i = this.A01;
                c8u5.A02(new AnonymousClass72(i, i));
                this.A02.A0K(this.A01);
            } else if (this.A03 == Q7.A0A) {
                c0887Xc4 = this.A02.A0A;
                if (IK.A1Q(c0887Xc4)) {
                    c0887Xc6 = this.A02.A0A;
                    c0887Xc6.A0A().ADA();
                }
                this.A02.A0L(EnumC0512Ih.A0o);
                c0887Xc5 = this.A02.A0A;
                c0887Xc5.A0E().A34();
                c8u4 = this.A02.A0B;
                nc = RA.A0H;
                c8u4.A02(nc);
                handler4 = this.A02.A07;
                handler4.removeCallbacksAndMessages(null);
                this.A02.A0H();
            } else if (this.A03 == Q7.A05) {
                this.A02.A0L(EnumC0512Ih.A0n);
                c0887Xc3 = this.A02.A0A;
                c0887Xc3.A0E().A2t();
                c8u3 = this.A02.A0B;
                c8u3.A02(new PP(this.A00) { // from class: com.facebook.ads.redexgen.X.6z
                });
                handler3 = this.A02.A07;
                handler3.removeCallbacksAndMessages(null);
                this.A02.A0K(this.A00);
            } else if (this.A03 == Q7.A04) {
                this.A02.A0L(EnumC0512Ih.A0m);
                c0887Xc2 = this.A02.A0A;
                c0887Xc2.A0E().A2q();
                c8u2 = this.A02.A0B;
                c0601Lx = RA.A0K;
                c8u2.A02(c0601Lx);
                handler2 = this.A02.A07;
                handler2.removeCallbacksAndMessages(null);
            } else if (this.A03 == Q7.A09) {
                this.A02.A0L(EnumC0512Ih.A0k);
                c0887Xc = this.A02.A0A;
                c0887Xc.A0E().A2z();
                this.A02.A03 = true;
                handler = this.A02.A07;
                handler.removeCallbacksAndMessages(null);
                c8u = this.A02.A0B;
                c8u.A02(new AnonymousClass72(this.A00, this.A01));
                this.A02.A0K(this.A00);
            }
        }
    }
}
