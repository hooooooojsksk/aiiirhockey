package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4Z */
/* loaded from: assets/audience_network.dex */
public abstract class C4Z {
    public static byte[] A0I;
    public static String[] A0J = {"NGwI4w5wjKKwr8vIXUEBgcadgt82Mvhc", "UEWVJJvMFTFlt7hH7ERCIJOXwkHPD", "VrTEPZjwbsMyuvHOm", "2WwBzOWctlsBfaK16SO", "SN9IkStz5", "kDHla2kaeJhueA2usdy0jZceB2KGO", "Oz8ehwpCKAgd43CqPtwSSE9zN5", "pRsAYaXPUkY6EiG3qKZOmbtQ8"};
    public int A00;
    public C01743x A01;
    @Nullable
    public AbstractC01884m A02;
    public E9 A03;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final InterfaceC01964u A0G = new YW(this);
    public final InterfaceC01964u A0H = new YV(this);
    public C01984w A04 = new C01984w(this.A0G);
    public C01984w A05 = new C01984w(this.A0H);
    public boolean A09 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A0F = true;
    public boolean A0E = true;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        byte[] bArr = {-2, 33, 33, 34, 33, -35, 19, 38, 34, 52, -35, 37, 30, 48, -35, 15, 34, 32, 54, 32, 41, 34, 47, 19, 38, 34, 52, -35, 30, 48, -35, 45, 30, 47, 34, 43, 49, -35, 31, 50, 49, -35, 51, 38, 34, 52, -35, 38, 48, -35, 43, 44, 49, -35, 30, -35, 47, 34, 30, 41, -35, 32, 37, 38, 41, 33, -21, -35, 18, 43, 35, 38, 41, 49, 34, 47, 34, 33, -35, 38, 43, 33, 34, 53, -9, -35, -5, 8, 8, 9, 14, -70, 7, 9, 16, -1, -70, -5, -70, -3, 2, 3, 6, -2, -70, 0, 12, 9, 7, -70, 8, 9, 8, -57, -1, 18, 3, 13, 14, 3, 8, 1, -70, 3, 8, -2, -1, 18, -44, -80, -61, -63, -41, -63, -54, -61, -48, -76, -57, -61, -43, 9, 31, 37, -48, 29, 37, 35, 36, -48, 31, 38, 21, 34, 34, 25, 20, 21, -48, 31, 30, -4, 17, 41, 31, 37, 36, -13, 24, 25, 28, 20, 34, 21, 30, -40, 2, 21, 19, 41, 19, 28, 21, 34, -48, 34, 21, 19, 41, 19, 28, 21, 34, -36, -48, 3, 36, 17, 36, 21, -48, 35, 36, 17, 36, 21, -39, -48, -78, -56, -50, airhockey.J_WAIT, -58, -50, -52, -51, airhockey.J_WAIT, -56, -49, -66, -53, -53, -62, -67, -66, airhockey.J_WAIT, -52, -58, -56, -56, -51, -63, -84, -68, -53, -56, -59, -59, -83, -56, -87, -56, -52, -62, -51, -62, -56, -57, airhockey.J_WAIT, -51, -56, airhockey.J_WAIT, -52, -50, -55, -55, -56, -53, -51, airhockey.J_WAIT, -52, -58, -56, -56, -51, -63, airhockey.J_WAIT, -52, -68, -53, -56, -59, -59, -62, -57, -64};
        String[] strArr = A0J;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0J[6] = "kyP20liVKsmkdJ";
        A0I = bArr;
    }

    public abstract C01774a A1s();

    static {
        A08();
    }

    public static int A00(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int mode2 = Math.max(i2, i3);
            return Math.min(size, mode2);
        } else if (mode != 1073741824) {
            int mode3 = Math.max(i2, i3);
            return mode3;
        } else {
            return size;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0061, code lost:
        if (r7 != 1073741824) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            int r6 = r6 - r8
            r0 = 0
            int r6 = java.lang.Math.max(r0, r6)
            r3 = 0
            r2 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2
            r0 = -1
            if (r10 == 0) goto L2b
            if (r9 < 0) goto L5b
            r3 = r9
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4Z.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L87
        L25:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2b:
            if (r9 < 0) goto L31
            r3 = r9
            r2 = 1073741824(0x40000000, float:2.0)
            goto L90
        L31:
            if (r9 != r0) goto L36
            r3 = r6
            r2 = r7
            goto L90
        L36:
            if (r9 != r1) goto L90
            r3 = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4Z.A0J
            r0 = 0
            r1 = r1[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            r0 = 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L25
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4Z.A0J
            java.lang.String r1 = "mbdH64CAyADsqDHKi"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "uvhJn14mL"
            r0 = 4
            r2[r0] = r1
            if (r7 == r4) goto L58
            if (r7 != r5) goto L85
        L58:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L90
        L5b:
            if (r9 != r0) goto L6a
            if (r7 == r4) goto L67
            if (r7 == 0) goto L64
            if (r7 == r5) goto L67
            goto L90
        L64:
            r3 = 0
            r2 = 0
            goto L90
        L67:
            r3 = r6
            r2 = r7
            goto L90
        L6a:
            if (r9 != r1) goto L90
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C4Z.A0J
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 8
            if (r1 == r0) goto L83
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4Z.A0J
            java.lang.String r1 = "MUtJOOU4WeR0TtYG1JH"
            r0 = 7
            r2[r0] = r1
            r2 = 0
            goto L90
        L83:
            r2 = 0
            goto L90
        L85:
            r2 = 0
            goto L90
        L87:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4Z.A0J
            java.lang.String r1 = "ru0BYCJI67FO4KgBABZqajada"
            r0 = 6
            r2[r0] = r1
            r2 = 1073741824(0x40000000, float:2.0)
        L90:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4Z.A01(int, int, int, int, boolean):int");
    }

    private final int A02(View view) {
        return ((C01774a) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C01774a) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C01774a) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C01774a) view.getLayoutParams()).A03.top;
    }

    private final int A06(C01834h c01834h, C01904o c01904o) {
        return 0;
    }

    private final void A09(int i) {
        A0C(i, A0t(i));
    }

    private final void A0A(int i) {
        View child = A0t(i);
        if (child != null) {
            this.A01.A0D(i);
        }
    }

    private final void A0B(int i, int i2) {
        View view = A0t(i);
        if (view != null) {
            A09(i);
            A0E(view, i2);
            return;
        }
        throw new IllegalArgumentException(A07(85, 44, 79) + i + this.A03.toString());
    }

    private void A0C(int i, View view) {
        this.A01.A0C(i);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i) {
        A0F(view, i, (C01774a) view.getLayoutParams());
    }

    private final void A0F(View view, int i, C01774a c01774a) {
        AbstractC01934r A0F = E9.A0F(view);
        if (A0F.A0c()) {
            this.A03.A0t.A09(A0F);
        } else {
            C02014z c02014z = this.A03.A0t;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[0] = "mtQ3Ck4zhf6OC1ISSa3eadAcnNcPftbe";
            c02014z.A0A(A0F);
        }
        this.A01.A0H(view, i, c01774a, A0F.A0c());
    }

    private void A0G(View view, int i, boolean z) {
        AbstractC01934r A0F = E9.A0F(view);
        if (z || A0F.A0c()) {
            this.A03.A0t.A09(A0F);
        } else {
            this.A03.A0t.A0A(A0F);
        }
        C01774a c01774a = (C01774a) view.getLayoutParams();
        if (A0F.A0i() || A0F.A0d()) {
            if (A0F.A0d()) {
                A0F.A0S();
            } else {
                A0F.A0O();
            }
            this.A01.A0H(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            E9 e9 = this.A03;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "5ABI9jSeQ";
            if (parent == e9) {
                int A07 = this.A01.A07(view);
                if (i == -1) {
                    i = this.A01.A05();
                }
                if (A07 != -1) {
                    if (A07 != i) {
                        this.A03.A06.A0B(A07, i);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 114) + this.A03.indexOfChild(view) + this.A03.A1I());
                }
            } else {
                this.A01.A0I(view, i, false);
                c01774a.A01 = true;
                AbstractC01884m abstractC01884m = this.A02;
                if (abstractC01884m != null && abstractC01884m.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c01774a.A02) {
            A0F.A0H.invalidate();
            c01774a.A02 = false;
        }
    }

    private final void A0H(View view, Rect rect) {
        E9.A0o(view, rect);
    }

    private void A0J(C01834h c01834h, int i, View view) {
        AbstractC01934r A0F = E9.A0F(view);
        if (A0F.A0h()) {
            return;
        }
        if (A0F.A0b() && !A0F.A0c() && !this.A03.A04.A0A()) {
            A0A(i);
            c01834h.A0b(A0F);
            return;
        }
        A09(i);
        c01834h.A0W(view);
        this.A03.A0t.A0C(A0F);
    }

    private final void A0K(C01834h c01834h, C01904o c01904o, AccessibilityEvent accessibilityEvent) {
        E9 e9 = this.A03;
        if (e9 == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (A0J[6].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "A1LbQwkKC8kdEmdjm";
        strArr[4] = "mpAFCzQjd";
        if (!e9.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (A0J[7].length() != 8) {
            A0J[0] = "LKoEdNrfwYhRE769hHSL4lsoF7TmWWKx";
            if (this.A03.A04 == null) {
                return;
            }
        } else if (this.A03.A04 == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.A03.A04.A0D());
    }

    private final void A0L(C01834h c01834h, C01904o c01904o, C01553d c01553d) {
        if (this.A03.canScrollVertically(-1) || this.A03.canScrollHorizontally(-1)) {
            c01553d.A0N(8192);
            c01553d.A0R(true);
        }
        if (this.A03.canScrollVertically(1) || this.A03.canScrollHorizontally(1)) {
            c01553d.A0N(4096);
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[2] = "WKK7ZU1nOyoZ4isR3";
            strArr2[4] = "S1xUaVTVF";
            c01553d.A0R(true);
        }
        C01523a collectionInfo = C01523a.A00(A0r(c01834h, c01904o), A0q(c01834h, c01904o), A0P(c01834h, c01904o), A06(c01834h, c01904o));
        c01553d.A0P(collectionInfo);
    }

    public void A0M(AbstractC01884m abstractC01884m) {
        if (this.A02 == abstractC01884m) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        AbstractC01884m abstractC01884m = this.A02;
        return abstractC01884m != null && abstractC01884m.A0F();
    }

    public static boolean A0O(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        } else if (mode != 0) {
            return mode == 1073741824 && size == i;
        } else {
            return true;
        }
    }

    private final boolean A0P(C01834h c01834h, C01904o c01904o) {
        return false;
    }

    private final boolean A0Q(C01834h c01834h, C01904o c01904o, int i, Bundle bundle) {
        E9 e9 = this.A03;
        if (e9 == null) {
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        if (i == 4096) {
            if (e9.canScrollVertically(1)) {
                i2 = (A0X() - A0g()) - A0d();
            }
            if (this.A03.canScrollHorizontally(1)) {
                int A0h = A0h();
                int hScroll = A0e();
                if (A0J[7].length() == 8) {
                    throw new RuntimeException();
                }
                A0J[7] = "6TTpYbQ6a4";
                i3 = (A0h - hScroll) - A0f();
            }
        } else if (i == 8192) {
            if (e9.canScrollVertically(-1)) {
                i2 = -((A0X() - A0g()) - A0d());
            }
            if (this.A03.canScrollHorizontally(-1)) {
                i3 = -((A0h() - A0e()) - A0f());
            }
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        this.A03.scrollBy(i3, i2);
        return true;
    }

    private final boolean A0R(C01834h c01834h, C01904o c01904o, View view, int i, Bundle bundle) {
        return false;
    }

    private boolean A0S(E9 e9, int i, int i2) {
        View focusedChild = e9.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentBottom = A0e();
        int parentRight = A0g();
        int parentTop = A0h();
        int parentTop2 = parentTop - A0f();
        int parentLeft = A0X();
        int parentLeft2 = parentLeft - A0d();
        Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - i >= parentTop2 || rect.right - i <= parentBottom || rect.top - i2 >= parentLeft2 || rect.bottom - i2 <= parentRight) {
            return false;
        }
        if (A0J[3].length() != 28) {
            A0J[0] = "D1nd79aIos3YYe4Hq7EzCaafqnQh2NEe";
            return true;
        }
        throw new RuntimeException();
    }

    @Deprecated
    private final boolean A0T(E9 e9, View view, View view2) {
        return A0N() || e9.A1v();
    }

    private int[] A0U(View view, Rect rect) {
        int[] iArr = new int[2];
        int offScreenRight = A0e();
        int offScreenTop = A0g();
        int dy = A0h() - A0f();
        int offScreenLeft = A0X() - A0d();
        int childBottom = (view.getLeft() + rect.left) - view.getScrollX();
        int childRight = (view.getTop() + rect.top) - view.getScrollY();
        int childTop = rect.width() + childBottom;
        int parentLeft = rect.height();
        int childLeft = Math.min(0, childBottom - offScreenRight);
        int parentBottom = Math.min(0, childRight - offScreenTop);
        int parentTop = Math.max(0, childTop - dy);
        int parentLeft2 = Math.max(0, (parentLeft + childRight) - offScreenLeft);
        if (A0a() == 1) {
            if (parentTop == 0) {
                parentTop = Math.max(childLeft, childTop - dy);
            }
        } else {
            parentTop = childLeft != 0 ? childLeft : Math.min(childBottom - offScreenRight, parentTop);
        }
        if (parentBottom == 0) {
            parentBottom = Math.min(childRight - offScreenTop, parentLeft2);
        }
        iArr[0] = parentTop;
        iArr[1] = parentBottom;
        if (A0J[0].charAt(31) != 'p') {
            A0J[0] = "97vXAXgJ0WxvI5IvBZpOR2Ky1DZNuVnu";
            return iArr;
        }
        throw new RuntimeException();
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        C01743x c01743x = this.A01;
        if (c01743x != null) {
            return c01743x.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        E9 e9 = this.A03;
        C4N a = e9 != null ? e9.getAdapter() : null;
        if (a != null) {
            return a.A0D();
        }
        return 0;
    }

    public final int A0a() {
        return C3E.A01(this.A03);
    }

    public final int A0b() {
        return C3E.A02(this.A03);
    }

    public final int A0c() {
        return C3E.A03(this.A03);
    }

    public final int A0d() {
        E9 e9 = this.A03;
        if (e9 != null) {
            return e9.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        E9 e9 = this.A03;
        if (e9 != null) {
            return e9.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        E9 e9 = this.A03;
        if (e9 != null) {
            return e9.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        E9 e9 = this.A03;
        if (e9 != null) {
            return e9.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C01774a) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C01774a) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C01774a) view.getLayoutParams()).A00();
    }

    public int A0q(C01834h c01834h, C01904o c01904o) {
        E9 e9 = this.A03;
        if (e9 == null || e9.A04 == null || !A24()) {
            return 1;
        }
        return this.A03.A04.A0D();
    }

    public int A0r(C01834h c01834h, C01904o c01904o) {
        E9 e9 = this.A03;
        if (e9 == null || e9.A04 == null || !A25()) {
            return 1;
        }
        return this.A03.A04.A0D();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View A0s() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.E9 r0 = r6.A03
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            android.view.View r3 = r0.getFocusedChild()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4Z.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4Z.A0J
            java.lang.String r1 = "iiKud1wfkCloFGZ1U"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L4c
            com.facebook.ads.redexgen.X.3x r4 = r6.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4Z.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L4d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4Z.A0J
            java.lang.String r1 = "7ET4ZuKdeEmot2qkcvXky1gJdqYIXUUX"
            r0 = 0
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
        L4c:
            return r5
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C4Z.A0J
            java.lang.String r1 = "xPYIlKgRfeB9qWlMIQGlIgoODb"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
            goto L4c
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4Z.A0s():android.view.View");
    }

    public final View A0t(int i) {
        C01743x c01743x = this.A01;
        if (c01743x != null) {
            return c01743x.A09(i);
        }
        return null;
    }

    public final View A0u(View view, int i) {
        return null;
    }

    public C01774a A0v(Context context, AttributeSet attributeSet) {
        return new C01774a(context, attributeSet);
    }

    public C01774a A0w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C01774a) {
            return new C01774a((C01774a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C01774a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C01774a(layoutParams);
    }

    public final void A0x() {
        AbstractC01884m abstractC01884m = this.A02;
        if (abstractC01884m != null) {
            abstractC01884m.A09();
        }
    }

    public final void A0y() {
        E9 e9 = this.A03;
        if (e9 != null) {
            e9.requestLayout();
        }
    }

    public final void A0z(int i) {
        E9 e9 = this.A03;
        if (e9 != null) {
            e9.A1U(i);
        }
    }

    public final void A10(int i) {
        E9 e9 = this.A03;
        if (e9 != null) {
            e9.A1V(i);
        }
    }

    public final void A11(int i, int i2) {
        this.A0C = View.MeasureSpec.getSize(i);
        this.A0D = View.MeasureSpec.getMode(i);
        if (this.A0D == 0 && !E9.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i2);
        this.A0B = View.MeasureSpec.getMode(i2);
        if (this.A0B == 0 && !E9.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int i, int i2) {
        int A0W = A0W();
        if (A0W == 0) {
            this.A03.A1b(i, i2);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int maxX = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < A0W; i5++) {
            View A0t = A0t(i5);
            Rect rect = this.A03.A0p;
            A0H(A0t, rect);
            int count = rect.left;
            if (count < i3) {
                i3 = rect.left;
            }
            int count2 = rect.right;
            if (count2 > maxY) {
                maxY = rect.right;
            }
            int count3 = rect.top;
            if (count3 < i4) {
                i4 = rect.top;
            }
            int count4 = rect.bottom;
            if (count4 > maxX) {
                maxX = rect.bottom;
            }
        }
        this.A03.A0p.set(i3, i4, maxY, maxX);
        String[] strArr = A0J;
        String str = strArr[2];
        String str2 = strArr[4];
        int minX = str.length();
        int count5 = str2.length();
        if (minX == count5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[2] = "hT857kPIBtMq0qM94";
        strArr2[4] = "qfhhOTku3";
        A15(this.A03.A0p, i, i2);
    }

    public final void A13(int i, int i2) {
        this.A03.setMeasuredDimension(i, i2);
    }

    public final void A14(int i, C01834h c01834h) {
        View view = A0t(i);
        A0A(i);
        c01834h.A0X(view);
    }

    public void A15(Rect rect, int i, int i2) {
        int usedHeight = rect.width() + A0e() + A0f();
        int height = rect.height();
        int usedWidth = A0g();
        int i3 = height + usedWidth;
        int usedWidth2 = A0d();
        int width = i3 + usedWidth2;
        int usedWidth3 = A0c();
        int usedHeight2 = A00(i, usedHeight, usedWidth3);
        int usedWidth4 = A0b();
        A13(usedHeight2, A00(i2, width, usedWidth4));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i) {
        A0G(view, i, true);
    }

    public final void A19(View view, int i) {
        A0G(view, i, false);
    }

    public final void A1A(View view, int i, int i2) {
        C01774a c01774a = (C01774a) view.getLayoutParams();
        Rect A1D = this.A03.A1D(view);
        int i3 = i + A1D.left + A1D.right;
        int i4 = i2 + A1D.top + A1D.bottom;
        int A01 = A01(A0h(), A0i(), A0e() + A0f() + c01774a.leftMargin + c01774a.rightMargin + i3, c01774a.width, A24());
        int A0X = A0X();
        int A0Y = A0Y();
        int widthSpec = A0g();
        int A012 = A01(A0X, A0Y, widthSpec + A0d() + c01774a.topMargin + c01774a.bottomMargin + i4, c01774a.height, A25());
        if (A1a(view, A01, A012, c01774a)) {
            view.measure(A01, A012);
        }
    }

    public final void A1B(View view, int i, int i2, int i3, int i4) {
        C01774a c01774a = (C01774a) view.getLayoutParams();
        Rect rect = c01774a.A03;
        view.layout(rect.left + i + c01774a.leftMargin, rect.top + i2 + c01774a.topMargin, (i3 - rect.right) - c01774a.rightMargin, (i4 - rect.bottom) - c01774a.bottomMargin);
    }

    public final void A1C(View view, C01553d c01553d) {
        AbstractC01934r A0F = E9.A0F(view);
        if (A0F != null && !A0F.A0c() && !this.A01.A0K(A0F.A0H)) {
            A1K(this.A03.A0r, this.A03.A0s, view, c01553d);
        }
    }

    public final void A1D(View view, C01834h c01834h) {
        A0D(view);
        c01834h.A0X(view);
    }

    public final void A1E(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C01774a) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.A03 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int floor = (int) Math.floor(rectF.left);
            int floor2 = (int) Math.floor(rectF.top);
            float f = rectF.right;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "WbBFuKAltYM";
            rect.set(floor, floor2, (int) Math.ceil(f), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(C01553d c01553d) {
        A0L(this.A03.A0r, this.A03.A0s, c01553d);
    }

    public final void A1G(C01834h c01834h) {
        int A0E = c01834h.A0E();
        for (int i = A0E - 1; i >= 0; i--) {
            View A0F = c01834h.A0F(i);
            AbstractC01934r A0F2 = E9.A0F(A0F);
            if (!A0F2.A0h()) {
                A0F2.A0Z(false);
                if (A0F2.A0e()) {
                    this.A03.removeDetachedView(A0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(A0F2);
                }
                A0F2.A0Z(true);
                c01834h.A0V(A0F);
            }
        }
        c01834h.A0L();
        if (A0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(C01834h c01834h) {
        int childCount = A0W();
        for (int i = childCount - 1; i >= 0; i--) {
            A0J(c01834h, i, A0t(i));
        }
    }

    public final void A1I(C01834h c01834h) {
        for (int A0W = A0W() - 1; A0W >= 0; A0W--) {
            if (!E9.A0F(A0t(A0W)).A0h()) {
                A14(A0W, c01834h);
            }
        }
    }

    public void A1J(C01834h c01834h, C01904o c01904o, int i, int i2) {
        this.A03.A1b(i, i2);
    }

    public void A1K(C01834h c01834h, C01904o c01904o, View view, C01553d c01553d) {
        int A0p = A25() ? A0p(view) : 0;
        int A0p2 = A24() ? A0p(view) : 0;
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0J[3] = "h476R5jl";
        C01533b itemInfo = C01533b.A00(A0p, 1, A0p2, 1, false, false);
        c01553d.A0Q(itemInfo);
    }

    public final void A1L(AbstractC01884m abstractC01884m) {
        AbstractC01884m abstractC01884m2 = this.A02;
        if (abstractC01884m2 != null && abstractC01884m != abstractC01884m2 && abstractC01884m2.A0F()) {
            this.A02.A09();
        }
        this.A02 = abstractC01884m;
        this.A02.A0D(this.A03, this);
    }

    public void A1M(E9 e9) {
    }

    public final void A1N(E9 e9) {
        this.A07 = true;
    }

    public final void A1O(E9 e9) {
        A11(View.MeasureSpec.makeMeasureSpec(e9.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(e9.getHeight(), 1073741824));
    }

    public final void A1P(E9 e9) {
        if (e9 == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = e9;
            this.A01 = e9.A01;
            this.A0C = e9.getWidth();
            this.A0A = e9.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public void A1Q(E9 e9, int i, int i2) {
    }

    public void A1R(E9 e9, int i, int i2) {
    }

    public void A1S(E9 e9, int i, int i2, int i3) {
    }

    public void A1T(E9 e9, int i, int i2, Object obj) {
    }

    public final void A1U(E9 e9, C01834h c01834h) {
        this.A07 = false;
        A20(e9, c01834h);
    }

    public final void A1V(boolean z) {
        this.A06 = z;
    }

    public final boolean A1W() {
        int A0W = A0W();
        for (int i = 0; i < A0W; i++) {
            ViewGroup.LayoutParams layoutParams = A0t(i).getLayoutParams();
            int childCount = layoutParams.width;
            if (childCount < 0) {
                int childCount2 = layoutParams.height;
                if (childCount2 < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A1X() {
        E9 e9 = this.A03;
        return e9 != null && e9.A0B;
    }

    public final boolean A1Y() {
        return this.A0E;
    }

    public final boolean A1Z(int i, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i, bundle);
    }

    public final boolean A1a(View view, int i, int i2, C01774a c01774a) {
        return (!view.isLayoutRequested() && this.A0F && A0O(view.getWidth(), i, c01774a.width) && A0O(view.getHeight(), i2, c01774a.height)) ? false : true;
    }

    public final boolean A1b(View view, int i, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i, bundle);
    }

    public boolean A1c(C01774a c01774a) {
        return c01774a != null;
    }

    public final boolean A1d(E9 e9, View view, Rect rect, boolean z) {
        return A1e(e9, view, rect, z, false);
    }

    public final boolean A1e(E9 e9, View view, Rect rect, boolean z, boolean z2) {
        int[] scrollAmount = A0U(view, rect);
        int i = scrollAmount[0];
        int i2 = scrollAmount[1];
        if ((z2 && !A0S(e9, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            e9.scrollBy(i, i2);
        } else {
            e9.A1f(i, i2);
        }
        return true;
    }

    public final boolean A1f(E9 e9, C01904o c01904o, View view, View view2) {
        return A0T(e9, view, view2);
    }

    public final boolean A1g(E9 e9, ArrayList<View> views, int i, int i2) {
        return false;
    }

    public int A1h(int i, C01834h c01834h, C01904o c01904o) {
        return 0;
    }

    public int A1i(int i, C01834h c01834h, C01904o c01904o) {
        return 0;
    }

    public int A1j(C01904o c01904o) {
        return 0;
    }

    public int A1k(C01904o c01904o) {
        return 0;
    }

    public int A1l(C01904o c01904o) {
        return 0;
    }

    public int A1m(C01904o c01904o) {
        return 0;
    }

    public int A1n(C01904o c01904o) {
        return 0;
    }

    public int A1o(C01904o c01904o) {
        return 0;
    }

    public Parcelable A1p() {
        return null;
    }

    @Nullable
    public View A1q(int i) {
        int A0W = A0W();
        for (int i2 = 0; i2 < A0W; i2++) {
            View child = A0t(i2);
            AbstractC01934r A0F = E9.A0F(child);
            if (A0F != null) {
                int childCount = A0F.A0I();
                if (childCount == i && !A0F.A0h() && (this.A03.A0s.A07() || !A0F.A0c())) {
                    return child;
                }
            }
        }
        return null;
    }

    @Nullable
    public View A1r(View view, int i, C01834h c01834h, C01904o c01904o) {
        return null;
    }

    public void A1t(int i) {
    }

    public void A1u(int i, int i2, C01904o c01904o, C4X c4x) {
    }

    public void A1v(int i, C4X c4x) {
    }

    public void A1w(Parcelable parcelable) {
    }

    public void A1x(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1y(C01834h c01834h, C01904o c01904o) {
        Log.e(A07(129, 12, 19), A07(141, 67, 101));
    }

    public void A1z(C01904o c01904o) {
    }

    @CallSuper
    public void A20(E9 e9, C01834h c01834h) {
    }

    public void A21(E9 e9, C01904o c01904o, int i) {
        Log.e(A07(129, 12, 19), A07(208, 68, 14));
    }

    public void A22(String str) {
        E9 e9 = this.A03;
        if (e9 != null) {
            e9.A1q(str);
        }
    }

    public boolean A23() {
        return false;
    }

    public boolean A24() {
        return false;
    }

    public boolean A25() {
        return false;
    }

    public boolean A26() {
        return false;
    }
}
