package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class YL implements InterfaceC0587Lj {
    public static String[] A01 = {"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    public final WeakReference<C5F> A00;

    public YL(C5F c5f) {
        this.A00 = new WeakReference<>(c5f);
    }

    private void A00(C5F c5f) {
        C0676Ov c0676Ov;
        RelativeLayout relativeLayout;
        c0676Ov = c5f.A0B;
        if (c0676Ov != null) {
            relativeLayout = c5f.A06;
            relativeLayout.bringChildToFront(c0676Ov);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0587Lj
    public final void A3I(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        C5F c5f = this.A00.get();
        if (c5f != null) {
            relativeLayout = c5f.A06;
            relativeLayout.addView(view, i, layoutParams);
            A00(c5f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0587Lj
    public final void A3J(View view, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        C5F c5f = this.A00.get();
        if (c5f != null) {
            relativeLayout = c5f.A06;
            relativeLayout.addView(view, layoutParams);
            A00(c5f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0587Lj
    public void A3t(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0D(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0587Lj
    public void A3u(String str, C8T c8t) {
        if (this.A00.get() != null) {
            this.A00.get().A0F(str, c8t);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0587Lj
    public final void A8y(String str, C1V c1v) {
        if (this.A00.get() != null) {
            C5F c5f = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            c5f.A0E(str, c1v);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0587Lj
    public final void AAR(int i) {
        C5F activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}
