package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YF extends AbstractC00890o {
    public static byte[] A03;
    @Nullable
    public View A00;
    public final C5A A01;
    public final C0402Dv A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, 26, -58, 22, 24, 11, 25, 11, 20, 26, -58, 20, 27, 18, 18, -58, 7, 10, -4, 15, 11, 29};
    }

    public YF(C5A c5a) {
        this.A02 = c5a.A09();
        this.A01 = c5a;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0C() {
        this.A02.A0E().A3e();
        C0547Js.A00(new YH(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0D() {
        this.A02.A0E().A3h();
        C0547Js.A00(new YG(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0E().A3g();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof C0766Sh) {
                JH.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            C0426Et controller = this.A01.A08();
            if (controller != null) {
                controller.A0H();
            }
            C0547Js.A00(new YI(this));
            C5A c5a = this.A01;
            c5a.A0B(c5a.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && IK.A10(this.A01.A07().getContext())) {
                final N8 n8 = new N8();
                this.A01.A0D(n8);
                n8.A0C(this.A01.getPlacementId());
                n8.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0G() != null) {
                    n8.A09(this.A01.A08().A0G().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C0766Sh) {
                    n8.A0A(((C0766Sh) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5J
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        View view4;
                        View view5;
                        View view6;
                        view4 = YF.this.A00;
                        if (view4 != null) {
                            N8 n82 = n8;
                            view5 = YF.this.A00;
                            int width = view5.getWidth();
                            view6 = YF.this.A00;
                            n82.setBounds(0, 0, width, view6.getHeight());
                            N8 n83 = n8;
                            n83.A0D(!n83.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(n8);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0F(InterfaceC00880n interfaceC00880n) {
        this.A02.A0E().A3f(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0I();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0G(JA ja) {
        this.A02.A0E().A2b(LC.A01(this.A01.A04()), ja.A03().getErrorCode(), ja.A04());
        C0547Js.A00(new YJ(this, ja));
    }
}
