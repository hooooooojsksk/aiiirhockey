package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Rc */
/* loaded from: assets/audience_network.dex */
public final class C0735Rc extends C4N<RW> {
    public int A00;
    public int A01;
    public int A02;
    public AbstractC0586Li A03;
    @Nullable
    public InterfaceC0587Lj A04;
    public String A05;
    public List<C0668On> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC0952Zs A08;
    public final C6M A09;
    public final C0887Xc A0A;
    public final InterfaceC0505Ia A0B;
    public final LD A0C;
    public final C0736Rd A0D;
    public final JW A0E;
    public final QA A0F;

    public C0735Rc(C0887Xc c0887Xc, List<C0668On> list, AbstractC0952Zs abstractC0952Zs, InterfaceC0505Ia interfaceC0505Ia, C6M c6m, QA qa, LD ld, InterfaceC0587Lj interfaceC0587Lj, String str, C0736Rd c0736Rd, JW jw, AbstractC0586Li abstractC0586Li) {
        this.A0A = c0887Xc;
        this.A0B = interfaceC0505Ia;
        this.A09 = c6m;
        this.A0F = qa;
        this.A0C = ld;
        this.A04 = interfaceC0587Lj;
        this.A08 = abstractC0952Zs;
        this.A06 = list;
        this.A05 = str;
        this.A0D = c0736Rd;
        this.A0E = jw;
        this.A03 = abstractC0586Li;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    @Nullable
    /* renamed from: A01 */
    public final RW A0C(ViewGroup viewGroup, int i) {
        InterfaceC0587Lj interfaceC0587Lj = this.A04;
        if (interfaceC0587Lj == null || this.A00 == 0) {
            return null;
        }
        return new RW(NJ.A01(new C0641Nl(this.A0A, this.A0B, interfaceC0587Lj, this.A08, null, this.A0F, this.A0C).A0I(this.A0E).A0H(this.A03).A0J(), this.A05, this.A0D), this.A07, this.A0F, this.A06.size(), this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    /* renamed from: A02 */
    public final void A0E(RW rw, int i) {
        rw.A0l(this.A06.get(i), this.A0B, this.A09, this.A0C, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }
}
