package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.4h */
/* loaded from: assets/audience_network.dex */
public final class C01834h {
    public static byte[] A09;
    public static String[] A0A = {"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    public C4g A01;
    public AbstractC01914p A04;
    public final /* synthetic */ E9 A08;
    public final ArrayList<AbstractC01934r> A05 = new ArrayList<>();
    public ArrayList<AbstractC01934r> A02 = null;
    public final ArrayList<AbstractC01934r> A06 = new ArrayList<>();
    public final List<AbstractC01934r> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, 30, 30, 43, 29, 44, -14, -53, -48, -62, -21, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -38, -33, 36, 37, 18, 37, 22, -21, -99, -69, -58, -58, -65, -66, airhockey.J_PURCHASE, -51, -67, -52, -69, -54, airhockey.J_PURCHASE, -48, -61, -65, -47, airhockey.J_PURCHASE, -47, -61, -50, -62, airhockey.J_PURCHASE, -69, -56, airhockey.J_PURCHASE, -61, -56, -48, -69, -58, -61, -66, airhockey.J_PURCHASE, -48, -61, -65, -47, -120, airhockey.J_PURCHASE, -93, -56, -48, -69, -58, -61, -66, airhockey.J_PURCHASE, -48, -61, -65, -47, -51, airhockey.J_PURCHASE, -67, -69, -56, -56, -55, -50, airhockey.J_PURCHASE, -68, -65, airhockey.J_PURCHASE, -52, -65, -49, -51, -65, -66, airhockey.J_PURCHASE, -64, -52, -55, -57, airhockey.J_PURCHASE, -51, -67, -52, -69, -54, -122, airhockey.J_PURCHASE, -50, -62, -65, -45, airhockey.J_PURCHASE, -51, -62, -55, -49, -58, -66, airhockey.J_PURCHASE, -52, -65, -68, -55, -49, -56, -66, airhockey.J_PURCHASE, -64, -52, -55, -57, airhockey.J_PURCHASE, -52, -65, -67, -45, -67, -58, -65, -52, airhockey.J_PURCHASE, -54, -55, -55, -58, -120, -7, 30, 19, 31, 30, 35, 25, 35, 36, 21, 30, 19, 41, -48, 20, 21, 36, 21, 19, 36, 21, 20, -34, -48, -7, 30, 38, 17, 28, 25, 20, -48, 25, 36, 21, 29, -48, 32, 31, 35, 25, 36, 25, 31, 30, -48, -13, 24, 13, 25, 24, 29, 19, 29, 30, 15, 24, 13, 35, -54, 14, 15, 30, 15, 13, 30, 15, 14, -40, -54, -13, 24, 32, 11, 22, 19, 14, -54, 32, 19, 15, 33, -54, 18, 25, 22, 14, 15, 28, -54, 11, 14, 11, 26, 30, 15, 28, -54, 26, 25, 29, 19, 30, 19, 25, 24, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, -31, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, -31, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, airhockey.J_DISCONNECT, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, airhockey.J_INVITE, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, airhockey.J_DISCONNECT, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -90, -8, -21, -6, -5, -8, -12, -21, -22, -90, -25, -90, -4, -17, -21, -3, -90, -6, -18, -25, -6, -90, -17, -7, -90, -17, -19, -12, -11, -8, -21, -22, -76, -90, -33, -11, -5, -90, -13, -5, -7, -6, -90, -23, -25, -14, -14, -90, -7, -6, -11, -10, -49, -19, -12, -11, -8, -17, -12, -19, -90, -24, -21, -20, -11, -8, -21, -90, -8, -21, -6, -5, -8, -12, -17, -12, -19, -90, -6, -18, -17, -7, -90, -4, -17, -21, -3, -76, -78, -80, -65, -95, -76, -80, -62, -111, -70, -67, -101, -70, -66, -76, -65, -76, -70, -71, -116, -71, -81, -97, -60, -69, -80, airhockey.J_GAME_ENEMYEXIT, -67, -80, -65, -64, -67, -71, -80, -81, airhockey.J_GAME_ENEMYEXIT, -84, airhockey.J_GAME_ENEMYEXIT, -63, -76, -80, -62, airhockey.J_GAME_ENEMYEXIT, -62, -77, -76, -82, -77, airhockey.J_GAME_ENEMYEXIT, -81, -70, -80, -66, airhockey.J_GAME_ENEMYEXIT, -71, -70, -65, airhockey.J_GAME_ENEMYEXIT, -77, -84, -63, -80, airhockey.J_GAME_ENEMYEXIT, -84, airhockey.J_GAME_ENEMYEXIT, -95, -76, -80, -62, -109, -70, -73, -81, -80, -67, -63, -74, -50, -60, -54, -55, airhockey.J_ERROR, -66, -61, -71, -70, -51, airhockey.J_ERROR, -56, -67, -60, -54, -63, -71, airhockey.J_ERROR, -61, -60, -55, airhockey.J_ERROR, -73, -70, airhockey.J_ERROR, -126, -122, airhockey.J_ERROR, -74, -69, -55, -70, -57, airhockey.J_ERROR, -54, -61, -67, -66, -71, -66, -61, -68, airhockey.J_ERROR, -74, airhockey.J_ERROR, -53, -66, -70, -52, -113, -25, -26, -50, -31, -35, -17, -54, -35, -37, -15, -37, -28, -35, -36};
    }

    static {
        A05();
    }

    public C01834h(E9 e9) {
        this.A08 = e9;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, LongCompanionObject.MAX_VALUE).A0H;
    }

    private final AbstractC01934r A01(int i) {
        int size;
        int A0D;
        ArrayList<AbstractC01934r> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC01934r abstractC01934r = this.A02.get(i2);
            if (!abstractC01934r.A0i()) {
                int i3 = abstractC01934r.A0I();
                if (i3 == i) {
                    abstractC01934r.A0T(32);
                    return abstractC01934r;
                }
            }
        }
        if (this.A08.A04.A0A() && (A0D = this.A08.A00.A0D(i)) > 0) {
            int offsetPosition = this.A08.A04.A0D();
            if (A0D < offsetPosition) {
                long A04 = this.A08.A04.A04(A0D);
                for (int i4 = 0; i4 < size; i4++) {
                    AbstractC01934r abstractC01934r2 = this.A02.get(i4);
                    if (!abstractC01934r2.A0i()) {
                        int offsetPosition2 = (abstractC01934r2.A0K() > A04 ? 1 : (abstractC01934r2.A0K() == A04 ? 0 : -1));
                        if (offsetPosition2 == 0) {
                            abstractC01934r2.A0T(32);
                            return abstractC01934r2;
                        }
                    }
                }
            }
        }
        return null;
    }

    private final AbstractC01934r A02(int i, boolean z) {
        View A08;
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC01934r abstractC01934r = this.A05.get(i2);
            if (!abstractC01934r.A0i()) {
                int scrapCount = abstractC01934r.A0I();
                if (scrapCount == i && !abstractC01934r.A0b() && (this.A08.A0s.A09 || !abstractC01934r.A0c())) {
                    abstractC01934r.A0T(32);
                    return abstractC01934r;
                }
            }
        }
        if (!z && (A08 = this.A08.A01.A08(i)) != null) {
            AbstractC01934r A0F = E9.A0F(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0W(A08);
                A0F.A0T(8224);
                return A0F;
            }
            throw new IllegalStateException(A04(727, 52, 27) + A0F + this.A08.A1I());
        }
        int size2 = this.A06.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC01934r abstractC01934r2 = this.A06.get(i3);
            if (!abstractC01934r2.A0b()) {
                int scrapCount2 = abstractC01934r2.A0I();
                if (scrapCount2 == i) {
                    if (!z) {
                        this.A06.remove(i3);
                    }
                    return abstractC01934r2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0046, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.AbstractC01934r A03(long r8, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01834h.A03(long, int, boolean):com.facebook.ads.redexgen.X.4r");
    }

    private final void A06() {
        boolean z;
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        z = E9.A1E;
        if (z) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0d(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                String str = strArr[7];
                String str2 = strArr[6];
                int charAt = str.charAt(8);
                int i = str2.charAt(8);
                if (charAt == i) {
                    throw new RuntimeException();
                }
                A0A[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    private void A09(AbstractC01934r abstractC01934r) {
        if (this.A08.A1t()) {
            View view = abstractC01934r.A0H;
            if (C3E.A00(view) == 0) {
                C3E.A09(view, 1);
            }
            if (!C3E.A0F(view)) {
                abstractC01934r.A0T(16384);
                C3E.A0B(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0A(AbstractC01934r abstractC01934r) {
        if (abstractC01934r.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC01934r.A0H, false);
        }
    }

    private final void A0B(AbstractC01934r abstractC01934r) {
        if (this.A08.A07 != null) {
            throw new NullPointerException(A04(779, 14, 62));
        }
        C4N c4n = this.A08.A04;
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC01934r);
        }
    }

    private final boolean A0C(AbstractC01934r abstractC01934r) {
        if (abstractC01934r.A0c()) {
            return this.A08.A0s.A07();
        }
        if (abstractC01934r.A03 >= 0 && abstractC01934r.A03 < this.A08.A04.A0D()) {
            if (!this.A08.A0s.A07()) {
                int A03 = this.A08.A04.A03(abstractC01934r.A03);
                int type = abstractC01934r.A0H();
                if (A03 != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0A() || abstractC01934r.A0K() == this.A08.A04.A04(abstractC01934r.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 112) + abstractC01934r + this.A08.A1I());
    }

    private boolean A0D(AbstractC01934r abstractC01934r, int i, int i2, long startBindNs) {
        abstractC01934r.A08 = this.A08;
        int A0H = abstractC01934r.A0H();
        long nanoTime = this.A08.getNanoTime();
        int viewType = (startBindNs > LongCompanionObject.MAX_VALUE ? 1 : (startBindNs == LongCompanionObject.MAX_VALUE ? 0 : -1));
        if (viewType != 0) {
            C4g c4g = this.A01;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int charAt = str.charAt(0);
            int viewType2 = str2.charAt(0);
            if (charAt == viewType2) {
                throw new RuntimeException();
            }
            A0A[0] = "We3abAYlnqMpJzTP";
            if (!c4g.A0A(A0H, nanoTime, startBindNs)) {
                return false;
            }
        }
        this.A08.A04.A09(abstractC01934r, i);
        this.A01.A05(abstractC01934r.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC01934r);
        if (this.A08.A0s.A07()) {
            abstractC01934r.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final C4g A0H() {
        if (this.A01 == null) {
            this.A01 = new C4g();
        }
        return this.A01;
    }

    @Nullable
    public final AbstractC01934r A0I(int i, boolean z, long j) {
        C01774a c01774a;
        boolean fromScrapOrHiddenOrCache;
        E9 A0H;
        AbstractC01914p abstractC01914p;
        View A00;
        if (i >= 0 && i < this.A08.A0s.A03()) {
            boolean z2 = false;
            AbstractC01934r abstractC01934r = null;
            boolean fromScrapOrHiddenOrCache2 = this.A08.A0s.A07();
            boolean z3 = true;
            if (fromScrapOrHiddenOrCache2) {
                abstractC01934r = A01(i);
                z2 = abstractC01934r != null;
            }
            if (abstractC01934r == null && (abstractC01934r = A02(i, z)) != null) {
                boolean fromScrapOrHiddenOrCache3 = A0C(abstractC01934r);
                if (!fromScrapOrHiddenOrCache3) {
                    if (!z) {
                        abstractC01934r.A0T(4);
                        boolean fromScrapOrHiddenOrCache4 = abstractC01934r.A0d();
                        if (fromScrapOrHiddenOrCache4) {
                            this.A08.removeDetachedView(abstractC01934r.A0H, false);
                            abstractC01934r.A0S();
                        } else {
                            boolean fromScrapOrHiddenOrCache5 = abstractC01934r.A0i();
                            if (fromScrapOrHiddenOrCache5) {
                                abstractC01934r.A0O();
                            }
                        }
                        A0b(abstractC01934r);
                    }
                    abstractC01934r = null;
                } else {
                    z2 = true;
                }
            }
            if (abstractC01934r == null) {
                int A0D = this.A08.A00.A0D(i);
                if (A0D >= 0 && A0D < this.A08.A04.A0D()) {
                    int A03 = this.A08.A04.A03(A0D);
                    boolean fromScrapOrHiddenOrCache6 = this.A08.A04.A0A();
                    if (fromScrapOrHiddenOrCache6 && (abstractC01934r = A03(this.A08.A04.A04(A0D), A03, z)) != null) {
                        abstractC01934r.A03 = A0D;
                        z2 = true;
                    }
                    if (abstractC01934r == null && (abstractC01914p = this.A04) != null && (A00 = abstractC01914p.A00(this, i, A03)) != null) {
                        abstractC01934r = this.A08.A1H(A00);
                        if (abstractC01934r != null) {
                            boolean fromScrapOrHiddenOrCache7 = abstractC01934r.A0h();
                            if (fromScrapOrHiddenOrCache7) {
                                throw new IllegalArgumentException(A04(540, 113, 76) + this.A08.A1I());
                            }
                        } else {
                            throw new IllegalArgumentException(A04(653, 74, 17) + this.A08.A1I());
                        }
                    }
                    if (abstractC01934r == null) {
                        C4g A0H2 = A0H();
                        String[] strArr = A0A;
                        if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                            A0A[4] = "3K2bfdY4Lns5cH4Uqi6qZhk44zURNmgZ";
                            abstractC01934r = A0H2.A03(A03);
                            if (abstractC01934r != null) {
                                abstractC01934r.A0Q();
                                boolean fromScrapOrHiddenOrCache8 = E9.A1C;
                                if (fromScrapOrHiddenOrCache8) {
                                    A0A(abstractC01934r);
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (abstractC01934r == null) {
                        long nanoTime = this.A08.getNanoTime();
                        if (j != LongCompanionObject.MAX_VALUE) {
                            boolean fromScrapOrHiddenOrCache9 = this.A01.A0B(A03, nanoTime, j);
                            if (!fromScrapOrHiddenOrCache9) {
                                return null;
                            }
                        }
                        C4N c4n = this.A08.A04;
                        E9 e9 = this.A08;
                        String[] strArr2 = A0A;
                        if (strArr2[5].charAt(0) == strArr2[3].charAt(0)) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A0A;
                        strArr3[5] = "ofPrqBOY4KV1O5mmTOXtQojU6rRVoJMb";
                        strArr3[3] = "dfUBDtyf096LhSCdUEMmmzbvfUZbBbNe";
                        abstractC01934r = c4n.A05(e9, A03);
                        fromScrapOrHiddenOrCache = E9.A1E;
                        if (fromScrapOrHiddenOrCache && (A0H = E9.A0H(abstractC01934r.A0H)) != null) {
                            abstractC01934r.A09 = new WeakReference<>(A0H);
                        }
                        this.A01.A06(A03, this.A08.getNanoTime() - nanoTime);
                    }
                } else {
                    throw new IndexOutOfBoundsException(A04(165, 46, 118) + i + A04(13, 8, 126) + A0D + A04(35, 8, 119) + this.A08.A0s.A03() + this.A08.A1I());
                }
            }
            if (z2 && !this.A08.A0s.A07() && abstractC01934r.A0k(8192)) {
                abstractC01934r.A0U(0, 8192);
                if (this.A08.A0s.A0C) {
                    int changeFlags = C4V.A00(abstractC01934r);
                    C4U info = this.A08.A05.A09(this.A08.A0s, abstractC01934r, changeFlags | 4096, abstractC01934r.A0L());
                    this.A08.A1n(abstractC01934r, info);
                }
            }
            boolean z4 = false;
            if (this.A08.A0s.A07() && abstractC01934r.A0a()) {
                abstractC01934r.A04 = i;
            } else if (!abstractC01934r.A0a() || abstractC01934r.A0g() || abstractC01934r.A0b()) {
                z4 = A0D(abstractC01934r, this.A08.A00.A0D(i), i, j);
            }
            ViewGroup.LayoutParams layoutParams = abstractC01934r.A0H.getLayoutParams();
            if (layoutParams == null) {
                c01774a = (C01774a) this.A08.generateDefaultLayoutParams();
                abstractC01934r.A0H.setLayoutParams(c01774a);
            } else if (!this.A08.checkLayoutParams(layoutParams)) {
                c01774a = (C01774a) this.A08.generateLayoutParams(layoutParams);
                abstractC01934r.A0H.setLayoutParams(c01774a);
            } else {
                if (A0A[0].length() == 16) {
                    A0A[4] = "WeHbAL2DpvJL4iRMn0O7hIhaGbvumhB7";
                    c01774a = (C01774a) layoutParams;
                }
                throw new RuntimeException();
            }
            c01774a.A00 = abstractC01934r;
            c01774a.A02 = (z2 && z4) ? false : false;
            return abstractC01934r;
        }
        throw new IndexOutOfBoundsException(A04(271, 22, 0) + i + A04(12, 1, 99) + i + A04(21, 14, 104) + this.A08.A0s.A03() + this.A08.A1I());
    }

    public final List<AbstractC01934r> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0M();
        }
        int i2 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i2; scrapCount++) {
            this.A05.get(scrapCount).A0M();
        }
        ArrayList<AbstractC01934r> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int scrapCount2 = str.charAt(0);
        int cachedCount = str2.charAt(0);
        if (scrapCount2 != cachedCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int scrapCount3 = 0; scrapCount3 < changedScrapCount; scrapCount3++) {
                this.A02.get(scrapCount3).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        ArrayList<AbstractC01934r> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            C01774a c01774a = (C01774a) this.A06.get(i).A0H.getLayoutParams();
            if (c01774a != null) {
                c01774a.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0A()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                AbstractC01934r abstractC01934r = this.A06.get(i);
                int i2 = A0A[0].length();
                if (i2 != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (abstractC01934r != null) {
                    abstractC01934r.A0T(6);
                    abstractC01934r.A0Y(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i;
        if (this.A08.A06 != null) {
            C4Z c4z = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                i = c4z.A00;
            }
            throw new RuntimeException();
        }
        i = 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i;
        int extraCache2 = this.A06.size();
        for (int i2 = extraCache2 - 1; i2 >= 0; i2--) {
            int size = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int i3 = str.charAt(0);
            int extraCache3 = str2.charAt(0);
            if (i3 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int extraCache4 = this.A00;
            if (size > extraCache4) {
                A07(i2);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(int i, int i2) {
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC01934r abstractC01934r = this.A06.get(i3);
            if (abstractC01934r != null) {
                int cachedCount = abstractC01934r.A03;
                if (cachedCount >= i) {
                    abstractC01934r.A0W(i2, true);
                }
            }
        }
    }

    public final void A0S(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i < i2) {
            i3 = i;
            i4 = i2;
            i5 = -1;
        } else {
            i3 = i2;
            i4 = i;
            i5 = 1;
        }
        int size = this.A06.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC01934r abstractC01934r = this.A06.get(i6);
            if (abstractC01934r != null) {
                int start = abstractC01934r.A03;
                if (start >= i3) {
                    int start2 = abstractC01934r.A03;
                    if (start2 > i4) {
                        continue;
                    } else {
                        int i7 = abstractC01934r.A03;
                        String[] strArr = A0A;
                        String str = strArr[5];
                        String str2 = strArr[3];
                        int end = str.charAt(0);
                        int start3 = str2.charAt(0);
                        if (end == start3) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[2] = "kvvW4F2OCwdEIl1qwIuxYVFpmp0ugJY5";
                        strArr2[1] = "kzcCp2wTfEGQm2KGuN32b5oIYABnQWPG";
                        if (i7 == i) {
                            int start4 = i2 - i;
                            abstractC01934r.A0W(start4, false);
                        } else {
                            abstractC01934r.A0W(i5, false);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void A0T(int i, int i2) {
        int positionEnd;
        int i3 = i + i2;
        for (int i4 = this.A06.size() - 1; i4 >= 0; i4--) {
            AbstractC01934r abstractC01934r = this.A06.get(i4);
            if (abstractC01934r != null && (positionEnd = abstractC01934r.A03) >= i && positionEnd < i3) {
                abstractC01934r.A0T(2);
                A07(i4);
            }
        }
    }

    public final void A0U(int i, int i2, boolean z) {
        int i3 = i + i2;
        int removedEnd = this.A06.size();
        for (int i4 = removedEnd - 1; i4 >= 0; i4--) {
            AbstractC01934r abstractC01934r = this.A06.get(i4);
            if (abstractC01934r != null) {
                int removedEnd2 = abstractC01934r.A03;
                if (removedEnd2 >= i3) {
                    int removedEnd3 = -i2;
                    abstractC01934r.A0W(removedEnd3, z);
                } else {
                    int removedEnd4 = abstractC01934r.A03;
                    if (removedEnd4 >= i) {
                        abstractC01934r.A0T(8);
                        A07(i4);
                    }
                }
            }
        }
    }

    public final void A0V(View view) {
        AbstractC01934r A0F = E9.A0F(view);
        A0F.A0F = null;
        A0F.A0G = false;
        A0F.A0O();
        A0b(A0F);
    }

    public final void A0W(View view) {
        AbstractC01934r A0F = E9.A0F(view);
        if (A0F.A0k(12) || !A0F.A0f() || this.A08.A21(A0F)) {
            boolean A0b = A0F.A0b();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!A0b || A0F.A0c() || this.A08.A04.A0A()) {
                A0F.A0X(this, false);
                this.A05.add(A0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 32) + this.A08.A1I());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0F.A0X(this, true);
        this.A02.add(A0F);
    }

    public final void A0X(View view) {
        AbstractC01934r A0F = E9.A0F(view);
        if (A0F.A0e()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0F.A0d()) {
            A0F.A0S();
        } else if (A0F.A0i()) {
            A0F.A0O();
        }
        A0b(A0F);
    }

    public final void A0Y(C4N c4n, C4N c4n2, boolean z) {
        A0P();
        A0H().A08(c4n, c4n2, z);
    }

    public final void A0Z(C4g c4g) {
        C4g c4g2 = this.A01;
        if (c4g2 != null) {
            c4g2.A04();
        }
        this.A01 = c4g;
        if (c4g != null) {
            this.A01.A07(this.A08.getAdapter());
        }
    }

    public final void A0a(AbstractC01914p abstractC01914p) {
        this.A04 = abstractC01914p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x009f, code lost:
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00bd, code lost:
        if (r5 > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00bf, code lost:
        r0 = r10.A0k(526);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00c5, code lost:
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00c7, code lost:
        r2 = r9.A06.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00cf, code lost:
        if (r2 < r9.A00) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00d1, code lost:
        if (r2 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d3, code lost:
        A07(0);
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d8, code lost:
        r0 = com.facebook.ads.redexgen.X.E9.A1E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00dc, code lost:
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00de, code lost:
        if (r2 <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00e0, code lost:
        r0 = r9.A08.A02.A05(r10.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00ea, code lost:
        if (r0 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00ec, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00ee, code lost:
        if (r2 < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00f0, code lost:
        r1 = r9.A06.get(r2).A03;
        r0 = r9.A08.A02.A05(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0102, code lost:
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0104, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0106, code lost:
        r9.A06.add(r2, r10);
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x010c, code lost:
        if (r7 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x010e, code lost:
        A0d(r10, true);
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0123, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x012d, code lost:
        if (r5 > 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0b(com.facebook.ads.redexgen.X.AbstractC01934r r10) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01834h.A0b(com.facebook.ads.redexgen.X.4r):void");
    }

    public final void A0c(AbstractC01934r abstractC01934r) {
        boolean z;
        z = abstractC01934r.A0G;
        if (z) {
            this.A02.remove(abstractC01934r);
        } else {
            this.A05.remove(abstractC01934r);
        }
        abstractC01934r.A0F = null;
        abstractC01934r.A0G = false;
        abstractC01934r.A0O();
    }

    public final void A0d(AbstractC01934r abstractC01934r, boolean z) {
        E9.A0s(abstractC01934r);
        if (abstractC01934r.A0k(16384)) {
            abstractC01934r.A0U(0, 16384);
            C3E.A0B(abstractC01934r.A0H, null);
        }
        if (z) {
            A0B(abstractC01934r);
        }
        abstractC01934r.A08 = null;
        A0H().A09(abstractC01934r);
    }
}
