package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class RV extends C4N<RM> {
    public static String[] A0H = {"U2dBX20JaeRgS8KUkn4U", "4wbYdEjd6EY1wYpAHERmBQ5UbLFk3rIE", "poCzv8x7tLJqIV5ZIWq", "9iyDRDGf0xWQ70I4mtfqA0IQycZfZ47C", "v2glKkwlOEfR0MfsI3TqmdNecXONmhZ3", "6XdF3RdtkhprEZiVEVCq65KOMzsBziM7", "2OiOSmaAlP7OTnmHwLOjTjXlL7jeDPuL", "nkMLdycTxYcJ5galJfvG8bjM9rVBse8i"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC0586Li A04;
    @Nullable
    public InterfaceC0587Lj A05;
    public String A06;
    public List<C0668On> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC0952Zs A0A;
    public final C6M A0B;
    public final C0887Xc A0C;
    public final InterfaceC0505Ia A0D;
    public final LD A0E;
    public final C0736Rd A0F;
    public final QA A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public RV(C0887Xc c0887Xc, List<C0668On> list, AbstractC0952Zs abstractC0952Zs, InterfaceC0505Ia interfaceC0505Ia, C6M c6m, QA qa, LD ld, InterfaceC0587Lj interfaceC0587Lj, String str, int i, int i2, int i3, int i4, C0736Rd c0736Rd, AbstractC0586Li abstractC0586Li) {
        this.A0C = c0887Xc;
        this.A0D = interfaceC0505Ia;
        this.A0B = c6m;
        this.A0G = qa;
        this.A0E = ld;
        this.A05 = interfaceC0587Lj;
        this.A0A = abstractC0952Zs;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = c0736Rd;
        this.A04 = abstractC0586Li;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    /* renamed from: A01 */
    public final RM A0C(ViewGroup viewGroup, int i) {
        return new RM(O8.A00(new C0641Nl(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0H(this.A04).A0J(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C);
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    /* renamed from: A02 */
    public final void A0E(RM rm, int i) {
        rm.A0l(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            rm.AEn();
            String[] strArr = A0H;
            if (strArr[3].charAt(29) == strArr[6].charAt(29)) {
                throw new RuntimeException();
            }
            A0H[1] = "f5MkbcX2dFxcVTBDK6f4VKhLC7wzzoeI";
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    public final int A0D() {
        return this.A07.size();
    }
}
