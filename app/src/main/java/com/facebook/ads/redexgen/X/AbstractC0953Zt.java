package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zt */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0953Zt extends C4N<TF> {
    public static final int A05 = (int) (Kk.A02 * 4.0f);
    @Nullable
    public AnonymousClass17 A00;
    public final List<C0799Tp> A01;
    public final int A02;
    public final C0887Xc A03;
    @DoNotStrip
    public final Q9 A04 = new C0955Zv(this);

    public AbstractC0953Zt(AnonymousClass19 anonymousClass19, List<C0799Tp> list, C0887Xc c0887Xc) {
        this.A03 = c0887Xc;
        this.A02 = anonymousClass19.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        marginLayoutParams.setMargins(i2, 0, i >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    public final int A0D() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i) {
        C0799Tp c0799Tp = this.A01.get(i);
        C0529Iy adCoverImage = c0799Tp.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC0764Sf A04 = new AsyncTaskC0764Sf(imageView, this.A03).A04();
            A04.A06(new C0954Zu(this, i, c0799Tp));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(AnonymousClass17 anonymousClass17) {
        this.A00 = anonymousClass17;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    /* renamed from: A0H */
    public void A0E(TF tf, int i) {
        tf.A0l().setLayoutParams(A02(i));
    }
}
