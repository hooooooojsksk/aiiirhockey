package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class NL extends RelativeLayout {
    public static String[] A06 = {"GfXFZtEZk1NZfob7Kzf1xTq0EESlD7si", "ewzI1iE8tF5Z2B86REyPWWZDw7DKLBH9", "kOyZSgqEibXIKTIW7tLvn8rBuxcmsyDd", "XpDxTY", "v6DhXkGtrQWw75h", "XA27k4WXBENWs2k6KViFhCSGxV0pMN8g", "cLUj8uWE8C4NOcjwK2waVMiWyPuWQVsm", ""};
    public final int A00;
    public final LinearLayout A01;
    public final C0950Zq A02;
    public final C0887Xc A03;
    public final InterfaceC0505Ia A04;
    public final InterfaceC0587Lj A05;

    public NL(C0887Xc c0887Xc, C0950Zq c0950Zq, InterfaceC0505Ia interfaceC0505Ia, InterfaceC0587Lj interfaceC0587Lj, int i, int i2) {
        super(c0887Xc);
        this.A03 = c0887Xc;
        this.A02 = c0950Zq;
        this.A04 = interfaceC0505Ia;
        this.A05 = interfaceC0587Lj;
        this.A00 = i;
        C0634Ne.A00(this.A03, this, this.A02.A0e(0).A0h().A0D().A07());
        this.A01 = new LinearLayout(c0887Xc);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i2);
    }

    private void A00() {
        int i = 0;
        while (true) {
            C0950Zq c0950Zq = this.A02;
            if (A06[4].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "6kBjYVyQvbEVjVKJKeawSG2VEKMXDcJL";
            strArr[5] = "aQimcOJmMOk7TFcbK4Cqi1kaRliNN4Qj";
            int i2 = c0950Zq.A0c();
            if (i < i2) {
                C0763Se c0763Se = new C0763Se(this.A03, this.A02.A0e(i), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i3 = C0763Se.A0B;
                int i4 = C0763Se.A0B;
                int i5 = C0763Se.A0B;
                int i6 = C0763Se.A0B;
                layoutParams.setMargins(i3, i4, i5, i6);
                c0763Se.setLayoutParams(layoutParams);
                this.A01.addView(c0763Se);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i) {
        if (i == 1) {
            this.A01.setOrientation(1);
            LinearLayout linearLayout = this.A01;
            int i2 = this.A00;
            linearLayout.setPadding(0, (int) (i2 * 1.5d), 0, i2);
            return;
        }
        this.A01.setOrientation(0);
        LinearLayout linearLayout2 = this.A01;
        int i3 = this.A00;
        linearLayout2.setPadding(0, i3, 0, (int) (i3 * 0.25d));
    }
}
