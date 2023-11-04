package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.So */
/* loaded from: assets/audience_network.dex */
public final class C0773So extends C4N<RW> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC0587Lj A03;
    public QA A04;
    public String A05;
    public List<C0668On> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC0952Zs A08;
    public final C6M A09;
    public final C0887Xc A0A;
    public final InterfaceC0505Ia A0B;
    public final C0799Tp A0C;
    public final LD A0D;
    public final C03019g A0E;
    public final JW A0F;

    public C0773So(C0887Xc c0887Xc, List<C0668On> list, AbstractC0952Zs abstractC0952Zs, InterfaceC0505Ia interfaceC0505Ia, C0799Tp c0799Tp, InterfaceC0587Lj interfaceC0587Lj, String str, C03019g c03019g, @Nullable JW jw) {
        this.A0A = c0887Xc;
        this.A0B = interfaceC0505Ia;
        this.A0C = c0799Tp;
        this.A09 = c0799Tp.A10();
        this.A04 = c0799Tp.A1A();
        this.A0D = c0799Tp.A19();
        this.A03 = interfaceC0587Lj;
        this.A08 = abstractC0952Zs;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c03019g;
        this.A0F = jw;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    /* renamed from: A01 */
    public final RW A0C(ViewGroup viewGroup, int i) {
        return new RW(NJ.A00(new C0641Nl(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0J(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    /* renamed from: A02 */
    public final void A0E(RW rw, int i) {
        rw.A0m(this.A04);
        rw.A0l(this.A06.get(i), this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A06();
        }
    }

    public final void A0G(QA qa) {
        this.A04 = qa;
    }
}
