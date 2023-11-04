package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Rd */
/* loaded from: assets/audience_network.dex */
public class C0736Rd extends AbstractC01814e {
    public static byte[] A0H;
    public static String[] A0I = {"vVts3290hN8iYOphvTtUHsw8p", "g", "QXZRYfiopoOIgyOb", "uRY3EBcOhcPzIFCW", "1yhQGC5wOot73mjsntHrCCOy6H7", "ngPHprqJPXgJBcmGEhNrmzVf2B4dA5Oh", "DCeBbFrEMIUsiq6", "addqTveDrmk"};
    @Nullable
    public O1 A02;
    public QA A04;
    @Nullable
    public List<C0668On> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C0915Ye A0C;
    public final AbstractC01884m A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final O5 A0F = new C0739Rg(this);
    public O3 A03 = new C0738Rf(this);
    public final O4 A0E = new C0737Re(this);

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0H = new byte[]{-26, -6, -7, -12, 4, -11, -15, -26, -2, 4, -22, -13, -26, -25, -15, -22, -23, 4, -11, -26, -9, -26, -14, 7, 17, 29, 4, 7, 16, 17, 18, 29, 20, 7, 2, 3, 13, 29, 14, -1, 16, -1, 11, -5, -12, -15, -6, -14, -22, 4, -15, -22, -5, -22, -15, 4, -11, -26, -9, -26, -14};
    }

    static {
        A08();
    }

    public C0736Rd(C2M c2m, int i, @Nullable List<C0668On> list, @Nullable QA qa, @Nullable Bundle bundle) {
        this.A0C = c2m.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = qa;
        this.A0D = new C0914Yd(c2m.getContext());
        this.A0B = c2m.getContext();
        c2m.A1k(this);
        A0D(bundle);
    }

    @Nullable
    private SF A03(int i, int i2) {
        return A04(i, i2, true);
    }

    @Nullable
    private SF A04(int i, int i2, boolean z) {
        SF sf = null;
        while (i <= i2) {
            SF sf2 = (SF) this.A0C.A1q(i);
            if (sf2 == null || sf2.A0j()) {
                return null;
            }
            boolean A0b = A0b(sf2);
            int i3 = A0I[2].length();
            if (i3 != 16) {
                throw new RuntimeException();
            }
            A0I[0] = "";
            if (sf == null && sf2.A0k() && A0b && !this.A0G.contains(Integer.valueOf(i)) && (!z || A0I(sf2, this.A0A))) {
                sf = sf2;
            }
            if (sf2.A0k() && !A0b) {
                A0C(i, false);
            }
            i++;
        }
        return sf;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A28();
        int firstVisibleItem = this.A0C.A29();
        SF A03 = A03(lastVisibleItem, firstVisibleItem);
        if (A03 != null) {
            A03.A0h();
        }
    }

    public void A07() {
        int A27 = this.A0C.A27();
        if (A27 != -1) {
            int curPos = this.A05.size();
            if (A27 < curPos - 1) {
                int curPos2 = A27 + 1;
                A0V(curPos2);
            }
        }
    }

    public void A09(int i) {
        SF A04 = A04(i + 1, this.A0C.A29(), false);
        if (A04 != null) {
            A04.A0h();
            A0V(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i2) {
        while (i <= i2) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i2) {
        A0S(i);
        A0S(i2);
    }

    public void A0C(int i, boolean z) {
        if (z) {
            this.A0G.add(Integer.valueOf(i));
        } else {
            this.A0G.remove(Integer.valueOf(i));
        }
    }

    private void A0D(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 39), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 39), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 64), true);
    }

    public boolean A0H() {
        return IK.A2A(this.A0B) || this.A0A == 1;
    }

    public static boolean A0I(AbstractC0638Ni abstractC0638Ni, int i) {
        int allowedAreaMaxX;
        int i2;
        if (i != 2) {
            allowedAreaMaxX = (int) (((abstractC0638Ni.getWidth() + Kk.A03.widthPixels) * 1.3f) / 2.0f);
        } else {
            int i3 = Kk.A03.widthPixels;
            if (A0I[5].charAt(29) != '5') {
                throw new RuntimeException();
            }
            A0I[0] = "Sny8hSa0LYjBAej7q";
            allowedAreaMaxX = i3 - 1;
        }
        if (i == 2) {
            i2 = 1;
        } else {
            int furthestX = Kk.A03.widthPixels;
            int allowedAreaMinX = abstractC0638Ni.getWidth();
            i2 = (int) (((furthestX - allowedAreaMinX) * 0.7f) / 2.0f);
        }
        float x = abstractC0638Ni.getX();
        int allowedAreaMinX2 = abstractC0638Ni.getWidth();
        if (((int) (x + allowedAreaMinX2)) <= allowedAreaMaxX) {
            int allowedAreaMinX3 = (abstractC0638Ni.getX() > i2 ? 1 : (abstractC0638Ni.getX() == i2 ? 0 : -1));
            if (allowedAreaMinX3 >= 0) {
                return true;
            }
        }
        return false;
    }

    private boolean A0J(SF sf) {
        if (this.A08 && sf.A0k()) {
            this.A08 = false;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01814e
    public void A0L(E9 e9, int i) {
        super.A0L(e9, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01814e
    public void A0M(E9 e9, int i, int i2) {
        super.A0M(e9, i, i2);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A28();
        int firstVisibleItem = this.A0C.A29();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0W(lastVisibleItem, firstVisibleItem, i);
    }

    public final O3 A0N() {
        return this.A03;
    }

    public final O4 A0O() {
        return this.A0E;
    }

    public final O5 A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int i = this.A0C.A29();
        for (int A28 = this.A0C.A28(); A28 <= i && A28 >= 0; A28++) {
            SF sf = (SF) this.A0C.A1q(A28);
            if (sf != null && sf.A0j()) {
                this.A01 = A28;
                sf.A0g();
                return;
            }
        }
    }

    public final void A0R() {
        SF sf = (SF) this.A0C.A1q(this.A01);
        if (sf != null && this.A01 >= 0) {
            sf.A0h();
        }
    }

    public final void A0S(int i) {
        SF sf = (SF) this.A0C.A1q(i);
        if (sf == null || A0b(sf)) {
            return;
        }
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[0] = "Vxamqv9qm4zlsVVB8";
        A0a(sf, false);
    }

    public final void A0T(int i) {
        List<C0668On> list;
        SF sf = (SF) this.A0C.A1q(i);
        if (sf == null) {
            return;
        }
        if (A0b(sf)) {
            A0a(sf, true);
        }
        if (!A0J(sf) || (list = this.A05) == null) {
            return;
        }
        this.A0F.setVolume(list.get(((Integer) sf.getTag(-1593835536)).intValue()).A03().A0D().A09() ? 0.0f : 1.0f);
    }

    public final void A0U(int i) {
        A0A(i, i);
    }

    public final void A0V(int i) {
        this.A0D.A0A(i);
        this.A0C.A1L(this.A0D);
    }

    public final void A0W(int i, int i2, int i3) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A27();
        if (recomputeFrom == -1) {
            recomputeFrom = i3 < 0 ? i : i2;
        }
        this.A02.AFj(recomputeFrom);
    }

    public final void A0X(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 39), this.A00);
        bundle.putBoolean(A05(0, 23, 39), this.A07);
        bundle.putBoolean(A05(23, 20, 64), this.A08);
    }

    public void A0Y(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Z(O1 o1) {
        this.A02 = o1;
    }

    public void A0a(SF sf, boolean z) {
        if (A0H()) {
            A0Y(sf, z);
        }
        if (z) {
            return;
        }
        boolean A0j = sf.A0j();
        String[] strArr = A0I;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0I[2] = "slnyAJQBNPORwedJ";
        if (A0j) {
            sf.A0g();
        }
    }

    public boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
