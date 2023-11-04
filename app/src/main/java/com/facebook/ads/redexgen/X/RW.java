package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class RW extends AbstractC01934r implements InterfaceC0590Lm {
    @Nullable
    @DoNotStrip
    public Q9 A00;
    public QA A01;
    @Nullable
    public QA A02;
    public final int A03;
    public final SparseBooleanArray A04;
    public final C0887Xc A05;
    public final C9D A06;

    public RW(C9D c9d, SparseBooleanArray sparseBooleanArray, QA qa, int i, C0887Xc c0887Xc) {
        super(c9d);
        this.A05 = c0887Xc;
        this.A06 = c9d;
        this.A04 = sparseBooleanArray;
        this.A01 = qa;
        this.A03 = i;
    }

    private void A08(InterfaceC0505Ia interfaceC0505Ia, LD ld, String str, C0668On c0668On) {
        if (this.A04.get(c0668On.A02())) {
            return;
        }
        QA qa = this.A02;
        if (qa != null) {
            qa.A0V();
            this.A02 = null;
        }
        this.A00 = new RY(this, str, c0668On, interfaceC0505Ia, c0668On.A04(), ld);
        this.A02 = new QA(this.A06, 10, new WeakReference(this.A00), this.A05);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A06.setOnAssetsLoadedListener(new RX(this, c0668On));
    }

    public final void A0l(C0668On c0668On, InterfaceC0505Ia interfaceC0505Ia, C6M c6m, LD ld, String str, int i, int i2, int i3) {
        int leftMargin = c0668On.A02();
        this.A06.setTag(-1593835536, Integer.valueOf(leftMargin));
        this.A06.setupNativeCtaExtension(c0668On);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int i4 = leftMargin == 0 ? i3 : i2;
        if (leftMargin < this.A03 - 1) {
            i3 = i2;
        }
        marginLayoutParams.setMargins(i4, 0, i3, 0);
        String A07 = c0668On.A03().A0D().A07();
        String A08 = c0668On.A03().A0D().A08();
        this.A06.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A06.A0k()) {
            this.A06.setVideoPlaceholderUrl(A07);
            this.A06.setVideoUrl(c6m.A0S(A08));
        } else {
            this.A06.setImageUrl(A07);
        }
        this.A06.setLayoutParams(marginLayoutParams);
        this.A06.setCTAInfo(c0668On.A03().A0F(), c0668On.A04());
        this.A06.A0l(c0668On.A04());
        A08(interfaceC0505Ia, ld, str, c0668On);
    }

    public final void A0m(QA qa) {
        this.A01 = qa;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0590Lm
    public final void AEl(@Nullable ND nd) {
        this.A06.setAdDetailsClickListener(nd);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0590Lm
    public final void AEn() {
        this.A06.A0f();
    }
}
