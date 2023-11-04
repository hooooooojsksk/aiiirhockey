package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3S */
/* loaded from: assets/audience_network.dex */
public class C3S extends ViewGroup {
    public static byte[] A0u;
    public static String[] A0v = {"Pb5dMBpLoD8olSqqN3M1wt71s6WfJWWx", "mawes8eGWKEfT5kg0DwbKE", "yCX0UAcI", "nBGVAWTalDrx8Q3Q0HTp4hPpqgaJoZ5h", "", "", "gKpLqM1fc4CgqUT7jB7tIrf4xsKdVFyY", "wKHjR3FqXT8StRIGs0zAAfuJmbbhub4H"};
    public static final int[] A0w;
    public static final Interpolator A0x;
    public static final C3R A0y;
    public static final Comparator<C3K> A0z;
    public int A00;
    public AbstractC01512z A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public C3N A0Y;
    public C3N A0Z;
    public C3O A0a;
    public C3P A0b;
    public ClassLoader A0c;
    public ArrayList<View> A0d;
    public List<ViewPager.OnAdapterChangeListener> A0e;
    public List<C3N> A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final Rect A0q;
    public final C3K A0r;
    public final Runnable A0s;
    public final ArrayList<C3K> A0t;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C3K A03() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.A0M / clientWidth : 0.0f;
        int i = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = true;
        C3K c3k = null;
        int i2 = 0;
        while (i2 < this.A0t.size()) {
            C3K c3k2 = this.A0t.get(i2);
            if (!z && c3k2.A02 != i + 1) {
                c3k2 = this.A0r;
                c3k2.A00 = f2 + f3 + f;
                c3k2.A02 = i + 1;
                c3k2.A01 = this.A01.A04(c3k2.A02);
                i2--;
            }
            f2 = c3k2.A00;
            float f4 = c3k2.A01 + f2 + f;
            if (!z) {
                int i3 = (scrollX > f2 ? 1 : (scrollX == f2 ? 0 : -1));
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[3] = "VrUwTTzuyHD2SkMMCenWDHvarMqbXCCI";
                strArr2[6] = "LX2NnyEsDXWEx3dFbPH8p7fzI1U1dTZ8";
                if (i3 < 0) {
                    return c3k;
                }
            }
            if (scrollX >= f4) {
                int size = this.A0t.size() - 1;
                String[] strArr3 = A0v;
                if (strArr3[3].charAt(15) != strArr3[6].charAt(15)) {
                    A0v[2] = "sbP3P6ChvdnfvWI";
                    if (i2 != size) {
                        z = false;
                        i = c3k2.A02;
                        f3 = c3k2.A01;
                        c3k = c3k2;
                        i2++;
                    }
                } else {
                    A0v[1] = "kvGf4Zg53U8bz7GLeUNnCLzy4o";
                    if (i2 != size) {
                        z = false;
                        i = c3k2.A02;
                        f3 = c3k2.A01;
                        c3k = c3k2;
                        i2++;
                    }
                }
            }
            return c3k2;
        }
        return c3k;
    }

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0u, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0u = new byte[]{-99, -70, -69, -99, -62, -14, 3, 9, 7, 20, -62, 5, 14, 3, 21, 21, -36, -62, -48, 0, 17, 23, 21, 34, -48, 25, 20, -22, -48, -34, 14, 48, 45, 32, 42, 35, 43, 31, 50, 39, 33, -34, 31, 34, 31, 46, 50, 35, 48, -8, -34, -30, 54, 49, 49, -30, 53, 47, 35, 46, 46, -3, -30, 38, 39, 40, 35, 55, 46, 54, 43, 48, 41, -30, 54, 49, -30, -66, -78, -8, 1, 7, 0, -10, -52, -78, -69, -39, -26, -26, -25, -20, -104, -39, -36, -36, -104, -24, -39, -33, -35, -22, -104, -36, -35, -37, -25, -22, -104, -18, -31, -35, -17, -104, -36, -19, -22, -31, -26, -33, -104, -28, -39, -15, -25, -19, -20, -10, 9, 21, 25, 9, 23, 24, 9, 8, -60, 19, 10, 10, 23, 7, 22, 9, 9, 18, -60, 20, 5, 11, 9, -60, 16, 13, 17, 13, 24, -60, -10, 10, 7, -62, 3, 18, 18, 14, 11, 5, 3, 22, 11, 17, 16, -55, 21, -62, -14, 3, 9, 7, 20, -29, 6, 3, 18, 22, 7, 20, -62, 5, 10, 3, 16, 9, 7, 6, -62, 22, 10, 7, -62, 3, 6, 3, 18, 22, 7, 20, -55, 21, -62, 5, 17, 16, 22, 7, 16, 22, 21, -62, 25, 11, 22, 10, 17, 23, 22, -62, 5, 3, 14, 14, 11, 16, 9, -62, -14, 3, 9, 7, 20, -29, 6, 3, 18, 22, 7, 20, -59, 16, 17, 22, 11, 8, 27, -26, 3, 22, 3, -11, 7, 22, -27, 10, 3, 16, 9, 7, 6, -61, -62, -25, 26, 18, 7, 5, 22, 7, 6, -62, 3, 6, 3, 18, 22, 7, 20, -62, 11, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -62, -19, 0, -4, 14, -25, -8, -2, -4, 9, 25, 42, 42, 39, 47, 11, 27, 42, 39, 36, 36, -40, 44, 42, 33, 29, 28, -40, 44, 39, -40, 30, 33, 38, 28, -40, 30, 39, 27, 45, 43, -40, 26, 25, 43, 29, 28, -40, 39, 38, -40, 38, 39, 38, -27, 27, 32, 33, 36, 28, -40, 27, 45, 42, 42, 29, 38, 44, -40, 30, 39, 27, 45, 43, 29, 28, -40, 46, 33, 29, 47, -40, 76, 75, 30, 65, 62, 77, 81, airhockey.P_NATION, 79, 32, airhockey.P_GAME_STANDBY, 62, 75, airhockey.P_GAME_SELECTMAP, airhockey.P_NATION, 65, 19, 18, -12, 5, 11, 9, -9, 7, 22, 19, 16, 16, 9, 8, -60, 8, 13, 8, -60, 18, 19, 24, -60, 7, 5, 16, 16, -60, 23, 25, 20, 9, 22, 7, 16, 5, 23, 23, -60, 13, 17, 20, 16, 9, 17, 9, 18, 24, 5, 24, 13, 19, 18, 85, 83, airhockey.P_NATION, 79, 84, airhockey.P_GAME_MYWIN, 80, 83, 78, 49, airhockey.P_NATION, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_BREAKBALLCOUNT};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final void A0G(int i) {
        String hexString;
        C3K c3k;
        float f;
        C3K c3k2 = null;
        int i2 = this.A00;
        if (i2 != i) {
            c3k2 = A04(i2);
            this.A00 = i;
        }
        if (this.A01 == null) {
            A0B();
        } else if (this.A0o) {
            A0B();
        } else if (getWindowToken() != null) {
            int i3 = this.A0L;
            int max = Math.max(0, this.A00 - i3);
            int A05 = this.A01.A05();
            int min = Math.min(A05 - 1, this.A00 + i3);
            if (A05 != this.A0G) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException unused) {
                    int id = getId();
                    if (A0v[2].length() != 14) {
                        A0v[2] = "3cJ8G";
                        hexString = Integer.toHexString(id);
                    }
                }
                throw new IllegalStateException(A08(158, 142, 58) + this.A0G + A08(77, 9, 42) + A05 + A08(18, 11, 72) + hexString + A08(4, 14, 58) + getClass() + A08(29, 22, 86) + this.A01.getClass());
            }
            C3K c3k3 = null;
            if (A0v[2].length() != 14) {
                A0v[1] = "Tot0RAE";
                int i4 = 0;
                while (true) {
                    if (i4 >= this.A0t.size()) {
                        break;
                    }
                    C3K c3k4 = this.A0t.get(i4);
                    if (c3k4.A02 < this.A00) {
                        i4++;
                    } else if (c3k4.A02 == this.A00) {
                        c3k3 = c3k4;
                    }
                }
                if (c3k3 == null && A05 > 0) {
                    int i5 = this.A00;
                    if (A0v[1].length() != 12) {
                        A0v[2] = "0";
                        c3k3 = A05(i5, i4);
                    } else {
                        String[] strArr = A0v;
                        strArr[4] = "";
                        strArr[5] = "";
                        c3k3 = A05(i5, i4);
                    }
                }
                if (c3k3 != null) {
                    float f2 = 0.0f;
                    int i6 = i4 - 1;
                    if (i6 >= 0) {
                        C3K c3k5 = this.A0t.get(i6);
                        String[] strArr2 = A0v;
                        if (strArr2[3].charAt(15) != strArr2[6].charAt(15)) {
                            A0v[1] = "VNMCyWdkMCax4jTa2KYBa9F64T8dlp";
                            c3k = c3k5;
                        }
                    } else {
                        c3k = null;
                    }
                    int clientWidth = getClientWidth();
                    float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - c3k3.A01);
                    for (int i7 = this.A00 - 1; i7 >= 0; i7--) {
                        if (f2 < paddingLeft || i7 >= max) {
                            if (c3k == null || i7 != c3k.A02) {
                                f2 += A05(i7, i6 + 1).A01;
                                i4++;
                                c3k = i6 >= 0 ? this.A0t.get(i6) : null;
                            } else {
                                f2 += c3k.A01;
                                String[] strArr3 = A0v;
                                if (strArr3[7].charAt(10) == strArr3[0].charAt(10)) {
                                    String[] strArr4 = A0v;
                                    strArr4[4] = "";
                                    strArr4[5] = "";
                                    i6--;
                                    c3k = i6 >= 0 ? this.A0t.get(i6) : null;
                                }
                            }
                        } else if (c3k == null) {
                            break;
                        } else if (i7 == c3k.A02 && !c3k.A04) {
                            this.A0t.remove(i6);
                            this.A01.A0B(this, i7, c3k.A03);
                            i6--;
                            i4--;
                            c3k = i6 >= 0 ? this.A0t.get(i6) : null;
                        }
                    }
                    float f3 = c3k3.A01;
                    int i8 = i4 + 1;
                    if (f3 < 2.0f) {
                        C3K c3k6 = i8 < this.A0t.size() ? this.A0t.get(i8) : null;
                        if (clientWidth <= 0) {
                            f = 0.0f;
                        } else {
                            float paddingRight = getPaddingRight();
                            float f4 = clientWidth;
                            String[] strArr5 = A0v;
                            if (strArr5[4].length() != strArr5[5].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0v;
                            strArr6[4] = "";
                            strArr6[5] = "";
                            f = (paddingRight / f4) + 2.0f;
                        }
                        for (int i9 = this.A00 + 1; i9 < A05; i9++) {
                            if (f3 < f || i9 <= min) {
                                if (c3k6 == null || i9 != c3k6.A02) {
                                    C3K A052 = A05(i9, i8);
                                    i8++;
                                    f3 += A052.A01;
                                    c3k6 = i8 < this.A0t.size() ? this.A0t.get(i8) : null;
                                } else {
                                    f3 += c3k6.A01;
                                    i8++;
                                    c3k6 = i8 < this.A0t.size() ? this.A0t.get(i8) : null;
                                }
                            } else if (c3k6 == null) {
                                break;
                            } else if (i9 == c3k6.A02 && !c3k6.A04) {
                                this.A0t.remove(i8);
                                this.A01.A0B(this, i9, c3k6.A03);
                                c3k6 = i8 < this.A0t.size() ? this.A0t.get(i8) : null;
                            }
                        }
                    }
                    A0Q(c3k3, i4, c3k2);
                }
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    C3L c3l = (C3L) childAt.getLayoutParams();
                    c3l.A01 = i10;
                    if (!c3l.A05 && c3l.A00 == 0.0f) {
                        C3K A07 = A07(childAt);
                        String[] strArr7 = A0v;
                        if (strArr7[7].charAt(10) != strArr7[0].charAt(10)) {
                            if (A07 == null) {
                            }
                            c3l.A00 = A07.A01;
                            c3l.A02 = A07.A02;
                        } else {
                            A0v[1] = "EEa7ILjnbFiKaMBJBW0FEjvS9loAIL";
                            if (A07 == null) {
                            }
                            c3l.A00 = A07.A01;
                            c3l.A02 = A07.A02;
                        }
                    }
                }
                A0B();
                String[] strArr8 = A0v;
                if (strArr8[4].length() != strArr8[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr9 = A0v;
                strArr9[7] = "fAvJTe45YQ8jwRLJzle6w88GhXZAW5fe";
                strArr9[0] = "XHTmtVqtTM8ykl9XiQ4ZuPNQzfhQsr72";
                if (hasFocus()) {
                    View findFocus = findFocus();
                    String[] strArr10 = A0v;
                    if (strArr10[3].charAt(15) == strArr10[6].charAt(15)) {
                        throw new RuntimeException();
                    }
                    String[] strArr11 = A0v;
                    strArr11[3] = "98nQxxcA6vj5924MyChW7mkeiNJnWKv2";
                    strArr11[6] = "ju5RZqhAYuaQhiOPGNIJcLOaoEeV3OP8";
                    C3K A06 = findFocus != null ? A06(findFocus) : null;
                    if (A06 == null || A06.A02 != this.A00) {
                        for (int i11 = 0; i11 < getChildCount(); i11++) {
                            View childAt2 = getChildAt(i11);
                            C3K A072 = A07(childAt2);
                            if (A072 != null && A072.A02 == this.A00 && childAt2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0J(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.A0X;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.A0l ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float A00 = i6 + (i6 * A00(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth)));
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            float f = abs2;
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[4] = "";
            strArr[5] = "";
            abs = Math.round(Math.abs(A00 / f) * 1000.0f) * 4;
        } else {
            abs = (int) ((1.0f + (Math.abs(i4) / (this.A0M + (clientWidth * this.A01.A04(this.A00))))) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.A0l = false;
        this.A0X.startScroll(scrollX, scrollY, i4, i5, min);
        C3E.A07(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C3K A07;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A07 = A07(childAt)) != null && A07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C3L c3l;
        int i3;
        int i4;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.A0I = Math.min(measuredWidth / 10, this.A0E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                this.A0B = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
                this.A0A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                this.A0j = true;
                A0f();
                this.A0j = false;
                int childCount2 = getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && ((c3l = (C3L) childAt.getLayoutParams()) == null || !c3l.A05)) {
                        float f = paddingLeft;
                        String[] strArr = A0v;
                        if (strArr[4].length() == strArr[5].length()) {
                            A0v[1] = "11cm9STM7FlxGR3";
                            childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c3l.A00), 1073741824), this.A0A);
                        }
                    }
                }
                return;
            }
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                C3L c3l2 = (C3L) childAt2.getLayoutParams();
                if (A0v[1].length() == 12) {
                    break;
                }
                String[] strArr2 = A0v;
                strArr2[4] = "";
                strArr2[5] = "";
                if (c3l2 != null && c3l2.A05) {
                    int i7 = c3l2.A04 & 7;
                    int i8 = c3l2.A04 & 112;
                    int i9 = Integer.MIN_VALUE;
                    int i10 = Integer.MIN_VALUE;
                    boolean z = i8 == 48 || i8 == 80;
                    boolean z2 = i7 == 3 || i7 == 5;
                    if (z) {
                        i9 = 1073741824;
                    } else if (z2) {
                        i10 = 1073741824;
                    }
                    if (c3l2.width != -2) {
                        i9 = 1073741824;
                        i3 = c3l2.width != -1 ? c3l2.width : paddingLeft;
                    } else {
                        i3 = paddingLeft;
                    }
                    if (c3l2.height != -2) {
                        i10 = 1073741824;
                        if (c3l2.height != -1) {
                            i4 = c3l2.height;
                            if (A0v[1].length() != 12) {
                                A0v[1] = "VKsSzAx6pk9J5wmYrW5ACp";
                            }
                        } else {
                            i4 = measuredHeight;
                        }
                    } else {
                        i4 = measuredHeight;
                    }
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i3, i9), View.MeasureSpec.makeMeasureSpec(i4, i10));
                    if (z) {
                        measuredHeight -= childAt2.getMeasuredHeight();
                    } else if (z2) {
                        paddingLeft -= childAt2.getMeasuredWidth();
                    }
                }
            }
            i5++;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC01512z abstractC01512z;
        if (this.A0h) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC01512z = this.A01) == null || abstractC01512z.A05() == 0) {
            return false;
        }
        if (this.A0U == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        boolean z = false;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.A0X.abortAnimation();
            this.A0o = false;
            A0f();
            float x = motionEvent.getX();
            this.A03 = x;
            this.A05 = x;
            float y = motionEvent.getY();
            this.A04 = y;
            this.A06 = y;
            this.A08 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.A0k) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.A08);
                    if (findPointerIndex == -1) {
                        z = A0U();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.A05);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.A06);
                        if (abs > this.A0R && abs > abs2) {
                            this.A0k = true;
                            A0T(true);
                            float f = this.A03;
                            this.A05 = x2 - f > 0.0f ? f + this.A0R : f - this.A0R;
                            this.A06 = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.A0k) {
                    z = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.A05 = motionEvent.getX(actionIndex);
                    this.A08 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    A0P(motionEvent);
                    this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                }
            } else if (this.A0k) {
                A0M(this.A00, true, 0, false);
                z = A0U();
            }
        } else if (this.A0k) {
            VelocityTracker velocityTracker = this.A0U;
            velocityTracker.computeCurrentVelocity(1000, this.A0J);
            int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
            this.A0o = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C3K A03 = A03();
            A0O(A01(A03.A02, ((scrollX / clientWidth) - A03.A00) / (A03.A01 + (this.A0M / clientWidth)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.A08)) - this.A03)), true, true, xVelocity);
            z = A0U();
        }
        if (z) {
            C3E.A07(this);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3R] */
    static {
        A0C();
        A0w = new int[]{16842931};
        A0z = new Comparator<C3K>() { // from class: com.facebook.ads.redexgen.X.3G
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(C3K c3k, C3K c3k2) {
                return c3k.A02 - c3k2.A02;
            }
        };
        A0x = new Interpolator() { // from class: com.facebook.ads.redexgen.X.3H
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        A0y = new Comparator<View>() { // from class: com.facebook.ads.redexgen.X.3R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(View view, View view2) {
                C3L c3l = (C3L) view.getLayoutParams();
                C3L c3l2 = (C3L) view2.getLayoutParams();
                if (c3l.A05 != c3l2.A05) {
                    return c3l.A05 ? 1 : -1;
                }
                return c3l.A02 - c3l2.A02;
            }
        };
    }

    public C3S(Context context) {
        super(context);
        this.A0t = new ArrayList<>();
        this.A0r = new C3K();
        this.A0q = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0c = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0i = true;
        this.A0n = false;
        this.A0s = new Runnable() { // from class: com.facebook.ads.redexgen.X.3I
            @Override // java.lang.Runnable
            public final void run() {
                C3S.this.setScrollState(0);
                C3S.this.A0f();
            }
        };
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.A0H && Math.abs(i2) > this.A0K) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            int targetPage = this.A00;
            float truncator = i >= targetPage ? 0.4f : 0.6f;
            i += (int) (f + truncator);
        }
        int targetPage2 = this.A0t.size();
        if (targetPage2 > 0) {
            C3K lastItem = this.A0t.get(0);
            ArrayList<C3K> arrayList = this.A0t;
            int targetPage3 = arrayList.size();
            return Math.max(lastItem.A02, Math.min(i, arrayList.get(targetPage3 - 1).A02));
        }
        return i;
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.C3K A04(int r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r3.A0t
            int r0 = r0.size()
            if (r2 >= r0) goto L19
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r3.A0t
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.redexgen.X.3K r1 = (com.facebook.ads.redexgen.X.C3K) r1
            int r0 = r1.A02
            if (r0 != r4) goto L16
            return r1
        L16:
            int r2 = r2 + 1
            goto L1
        L19:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.A04(int):com.facebook.ads.redexgen.X.3K");
    }

    private final C3K A05(int i, int i2) {
        C3K c3k = new C3K();
        c3k.A02 = i;
        c3k.A03 = this.A01.A08(this, i);
        c3k.A01 = this.A01.A04(i);
        if (i2 < 0 || i2 >= this.A0t.size()) {
            this.A0t.add(c3k);
        } else {
            this.A0t.add(i2, c3k);
        }
        return c3k;
    }

    private final C3K A06(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A07(view);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.C3K A07(android.view.View r5) {
        /*
            r4 = this;
            r3 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r4.A0t
            int r0 = r0.size()
            if (r3 >= r0) goto L1f
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r4.A0t
            java.lang.Object r2 = r0.get(r3)
            com.facebook.ads.redexgen.X.3K r2 = (com.facebook.ads.redexgen.X.C3K) r2
            com.facebook.ads.redexgen.X.2z r1 = r4.A01
            java.lang.Object r0 = r2.A03
            boolean r0 = r1.A0C(r5, r0)
            if (r0 == 0) goto L1c
            return r2
        L1c:
            int r3 = r3 + 1
            goto L1
        L1f:
            r3 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3S.A0v
            r0 = 4
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L38
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L38:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3S.A0v
            java.lang.String r1 = "T6ty"
            r0 = 1
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.A07(android.view.View):com.facebook.ads.redexgen.X.3K");
    }

    private void A09() {
        this.A0k = false;
        this.A0m = false;
        VelocityTracker velocityTracker = this.A0U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0v[1] = "yoRarqzFlsm2scdQtgnfRphmjo";
            this.A0U = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0A() {
        /*
            r2 = this;
            r1 = 0
        L1:
            int r0 = r2.getChildCount()
            if (r1 >= r0) goto L1d
            android.view.View r0 = r2.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            com.facebook.ads.redexgen.X.3L r0 = (com.facebook.ads.redexgen.X.C3L) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L1a
            r2.removeViewAt(r1)
            int r1 = r1 + (-1)
        L1a:
            int r1 = r1 + 1
            goto L1
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.A0A():void");
    }

    private void A0B() {
        if (this.A0F != 0) {
            ArrayList<View> arrayList = this.A0d;
            if (arrayList == null) {
                this.A0d = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0d.add(getChildAt(i));
            }
            Collections.sort(this.A0d, A0y);
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0x);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f);
        this.A0C = (int) (2.0f * f);
        this.A0E = (int) (16.0f * f);
        C3E.A0B(this, new C0925Yp(this));
        if (C3E.A00(this) == 0) {
            C3E.A09(this, 1);
        }
        C3E.A0C(this, new C0926Yq(this));
    }

    private void A0E(int i) {
        C3N c3n = this.A0Z;
        List<C3N> list = this.A0f;
        if (list != null) {
            int i2 = list.size();
            for (int i3 = 0; i3 < i2; i3++) {
                this.A0f.get(i3);
            }
        }
        C3N c3n2 = this.A0Y;
    }

    private void A0F(int i) {
        C3N c3n = this.A0Z;
        List<C3N> list = this.A0f;
        if (list != null) {
            int i2 = list.size();
            for (int i3 = 0; i3 < i2; i3++) {
                this.A0f.get(i3);
            }
        }
        C3N c3n2 = this.A0Y;
    }

    private void A0H(int i, float f, int i2) {
        C3N c3n = this.A0Z;
        List<C3N> list = this.A0f;
        if (list != null) {
            int i3 = list.size();
            for (int i4 = 0; i4 < i3; i4++) {
                this.A0f.get(i4);
            }
        }
        C3N c3n2 = this.A0Y;
    }

    @CallSuper
    private final void A0I(int childOffset, float f, int i) {
        int i2;
        if (this.A0D > 0) {
            int hgrav = getScrollX();
            int childCount = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int scrollX = A0v[1].length();
            if (scrollX == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "hSwONVQ9BwzgmNPK4tziO3X6uj4eQvsQ";
            strArr[6] = "gKhZoL4mhYlFRC9fFMXnjqdiW6EOuKfZ";
            int width = getWidth();
            int paddingLeft = getChildCount();
            for (int i3 = 0; i3 < paddingLeft; i3++) {
                View childAt = getChildAt(i3);
                C3L c3l = (C3L) childAt.getLayoutParams();
                if (c3l.A05) {
                    int i4 = c3l.A04 & 7;
                    if (i4 == 1) {
                        i2 = Math.max((width - childAt.getMeasuredWidth()) / 2, childCount);
                    } else if (i4 == 3) {
                        i2 = childCount;
                        childCount += childAt.getWidth();
                    } else if (i4 != 5) {
                        i2 = childCount;
                    } else {
                        i2 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    int i5 = (i2 + hgrav) - childAt.getLeft();
                    if (i5 != 0) {
                        childAt.offsetLeftAndRight(i5);
                    }
                }
            }
        }
        A0H(childOffset, f, i);
        if (this.A0a != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if (!((C3L) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A08(450, 13, 121));
                }
            }
        }
        this.A0g = true;
    }

    private void A0K(int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            ArrayList<C3K> arrayList = this.A0t;
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0v[1] = "xS6wP2kv8Ukjp2mlI4OFB7EI";
            if (!arrayList.isEmpty()) {
                boolean isFinished = this.A0X.isFinished();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[2] = "M3IvNYMGgF0qb538wmgDMK0nNkgqAt";
                if (!isFinished) {
                    this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                    return;
                }
                int widthWithMargin = getPaddingLeft();
                int i5 = i2 - widthWithMargin;
                int widthWithMargin2 = getPaddingRight();
                int widthWithMargin3 = getScrollX();
                int oldWidthWithMargin = (int) ((((i - getPaddingLeft()) - getPaddingRight()) + i3) * (widthWithMargin3 / ((i5 - widthWithMargin2) + i4)));
                int widthWithMargin4 = getScrollY();
                scrollTo(oldWidthWithMargin, widthWithMargin4);
                return;
            }
        }
        C3K ii = A04(this.A00);
        float scrollOffset = ii != null ? Math.min(ii.A00, this.A07) : 0.0f;
        int paddingLeft = (int) (((i - getPaddingLeft()) - getPaddingRight()) * scrollOffset);
        if (paddingLeft != getScrollX()) {
            A0R(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    private final void A0L(int i, boolean z) {
        this.A0o = false;
        A0N(i, z, false);
    }

    private void A0M(int i, boolean z, int i2, boolean z2) {
        C3K A04 = A04(i);
        int i3 = 0;
        if (A04 != null) {
            i3 = (int) (getClientWidth() * Math.max(this.A02, Math.min(A04.A00, this.A07)));
        }
        int destX = A0v[2].length();
        if (destX == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0v;
        strArr[3] = "qWyJthdIKprwmupmlWytZXkwKuTz6nwm";
        strArr[6] = "fDmSwMvEmt93O90vXMKXMmFP8biUMO95";
        if (z) {
            A0J(i3, 0, i2);
            if (z2) {
                A0E(i);
                return;
            }
            return;
        }
        if (z2) {
            A0E(i);
        }
        A0R(false);
        scrollTo(i3, 0);
        A0Z(i3);
    }

    private final void A0N(int i, boolean z, boolean z2) {
        A0O(i, z, z2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0065, code lost:
        if (r6 < r4) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0O(int r6, boolean r7, boolean r8, int r9) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.2z r0 = r5.A01
            r1 = 0
            if (r0 == 0) goto Lb
            int r0 = r0.A05()
            if (r0 > 0) goto Lf
        Lb:
            r5.setScrollingCacheEnabled(r1)
            return
        Lf:
            if (r8 != 0) goto L21
            int r0 = r5.A00
            if (r0 != r6) goto L21
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r5.A0t
            int r0 = r0.size()
            if (r0 == 0) goto L21
            r5.setScrollingCacheEnabled(r1)
            return
        L21:
            r2 = 1
            if (r6 >= 0) goto L48
            r6 = 0
        L25:
            int r1 = r5.A0L
            int r4 = r5.A00
            int r0 = r4 + r1
            if (r6 > r0) goto L67
            int r4 = r4 - r1
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.C3S.A0v
            r0 = 7
            r1 = r3[r0]
            r0 = 0
            r3 = r3[r0]
            r0 = 10
            char r1 = r1.charAt(r0)
            char r0 = r3.charAt(r0)
            if (r1 == r0) goto L59
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L48:
            com.facebook.ads.redexgen.X.2z r0 = r5.A01
            int r0 = r0.A05()
            if (r6 < r0) goto L25
            com.facebook.ads.redexgen.X.2z r0 = r5.A01
            int r0 = r0.A05()
            int r6 = r0 + (-1)
            goto L25
        L59:
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.C3S.A0v
            java.lang.String r1 = "HdD8kb8A1NTv0LjA3C8pNf8B8Uhf5Rjf"
            r0 = 3
            r3[r0] = r1
            java.lang.String r1 = "hEPxY7plOgAB5ujpSYVhyDABeqG0KedF"
            r0 = 6
            r3[r0] = r1
            if (r6 >= r4) goto L7d
        L67:
            r1 = 0
        L68:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r5.A0t
            int r0 = r0.size()
            if (r1 >= r0) goto L7d
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r5.A0t
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.3K r0 = (com.facebook.ads.redexgen.X.C3K) r0
            r0.A04 = r2
            int r1 = r1 + 1
            goto L68
        L7d:
            int r0 = r5.A00
            if (r0 == r6) goto L97
        L81:
            boolean r0 = r5.A0i
            if (r0 == 0) goto L90
            r5.A00 = r6
            if (r2 == 0) goto L8c
            r5.A0E(r6)
        L8c:
            r5.requestLayout()
        L8f:
            return
        L90:
            r5.A0G(r6)
            r5.A0M(r6, r7, r9, r2)
            goto L8f
        L97:
            r2 = 0
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.A0O(int, boolean, boolean, int):void");
    }

    private void A0P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int pointerIndex = this.A08;
        if (pointerId == pointerIndex) {
            int i = actionIndex == 0 ? 1 : 0;
            this.A05 = motionEvent.getX(i);
            String[] strArr = A0v;
            String str = strArr[4];
            String str2 = strArr[5];
            int pointerId2 = str.length();
            int pointerIndex2 = str2.length();
            if (pointerId2 != pointerIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[4] = "";
            strArr2[5] = "";
            int pointerIndex3 = motionEvent.getPointerId(i);
            this.A08 = pointerIndex3;
            VelocityTracker velocityTracker = this.A0U;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:118:0x0024 */
    /* JADX WARN: Incorrect condition in loop: B:128:0x0051 */
    /* JADX WARN: Incorrect condition in loop: B:140:0x0095 */
    /* JADX WARN: Incorrect condition in loop: B:166:0x011f */
    /* JADX WARN: Incorrect condition in loop: B:178:0x015e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0Q(com.facebook.ads.redexgen.X.C3K r13, int r14, com.facebook.ads.redexgen.X.C3K r15) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.A0Q(com.facebook.ads.redexgen.X.3K, int, com.facebook.ads.redexgen.X.3K):void");
    }

    private void A0R(boolean z) {
        boolean z2 = this.A0P == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            boolean needPopulate = this.A0X.isFinished();
            boolean wasScrolling = true ^ needPopulate;
            if (wasScrolling) {
                this.A0X.abortAnimation();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[1] = "La7";
                int oldX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (oldX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != oldX) {
                        A0Z(currX);
                    }
                }
            }
        }
        this.A0o = false;
        for (int i = 0; i < this.A0t.size(); i++) {
            C3K c3k = this.A0t.get(i);
            boolean needPopulate2 = c3k.A04;
            if (needPopulate2) {
                z2 = true;
                c3k.A04 = false;
            }
        }
        if (z2) {
            if (z) {
                C3E.A0D(this, this.A0s);
            } else {
                this.A0s.run();
            }
        }
    }

    private void A0S(boolean z) {
        int layerType;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (z) {
                layerType = this.A0N;
            } else {
                layerType = 0;
            }
            getChildAt(i).setLayerType(layerType, null);
        }
    }

    private void A0T(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        int i = this.A00;
        if (i > 0) {
            A0L(i - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() {
        AbstractC01512z abstractC01512z = this.A01;
        if (abstractC01512z != null && this.A00 < abstractC01512z.A05() - 1) {
            A0L(this.A00 + 1, true);
            return true;
        } else if (A0v[2].length() != 14) {
            String[] strArr = A0v;
            strArr[7] = "AXA5EDUbYu85ntxkUdYhY3hIIlQIUQar";
            strArr[0] = "7HhQN1X94o8BEMOAnE9vO9t08zapWTmy";
            return false;
        } else {
            throw new RuntimeException();
        }
    }

    private boolean A0X(float f) {
        ArrayList<C3K> arrayList;
        boolean z = false;
        this.A05 = f;
        float scrollX = getScrollX() + (this.A05 - f);
        int clientWidth = getClientWidth();
        float oldScrollX = clientWidth;
        float oldScrollX2 = oldScrollX * this.A02;
        float leftBound = clientWidth;
        float leftBound2 = leftBound * this.A07;
        boolean rightAbsolute = true;
        boolean leftAbsolute = true;
        C3K c3k = this.A0t.get(0);
        C3K c3k2 = this.A0t.get(arrayList.size() - 1);
        if (c3k.A02 != 0) {
            rightAbsolute = false;
            float oldScrollX3 = c3k.A00;
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            A0v[1] = "a";
            oldScrollX2 = oldScrollX3 * clientWidth;
        }
        if (c3k2.A02 != this.A01.A05() - 1) {
            leftAbsolute = false;
            float leftBound3 = c3k2.A00;
            leftBound2 = leftBound3 * clientWidth;
        }
        if (scrollX < oldScrollX2) {
            if (rightAbsolute) {
                this.A0V.onPull(Math.abs(oldScrollX2 - scrollX) / clientWidth);
                z = true;
            }
            scrollX = oldScrollX2;
        } else if (scrollX > leftBound2) {
            if (leftAbsolute) {
                EdgeEffect edgeEffect = this.A0W;
                float oldScrollX4 = Math.abs(scrollX - leftBound2);
                float deltaX = clientWidth;
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    edgeEffect.onPull(oldScrollX4 / deltaX);
                    z = true;
                } else {
                    A0v[1] = "TwKB2lBmR";
                    edgeEffect.onPull(oldScrollX4 / deltaX);
                    z = true;
                }
            }
            scrollX = leftBound2;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0Z((int) scrollX);
        return z;
    }

    private final boolean A0Y(float f, float f2) {
        if (f >= this.A0I || f2 <= 0.0f) {
            if (f > getWidth() - this.A0I) {
                int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (A0v[2].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0v;
                strArr[3] = "LoLbwLodEQ0RZhoADzk4YxqyeMxGbPNe";
                strArr[6] = "uXFtlpuRRgamX4n9Zkql1HjWorEkSQ7b";
                if (i < 0) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean A0Z(int i) {
        int size = this.A0t.size();
        String A08 = A08(397, 53, 60);
        if (size == 0) {
            if (this.A0i) {
                return false;
            }
            this.A0g = false;
            A0I(0, 0.0f, 0);
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0v[2] = "c3ramapljB1reDSufYjA";
            if (this.A0g) {
                return false;
            }
            throw new IllegalStateException(A08);
        }
        C3K A03 = A03();
        int currentPage = getClientWidth();
        int i2 = this.A0M;
        int i3 = A03.A02;
        float f = ((i / currentPage) - A03.A00) / (A03.A01 + (i2 / currentPage));
        this.A0g = false;
        A0I(i3, f, (int) ((currentPage + i2) * f));
        if (this.A0g) {
            return true;
        }
        throw new IllegalStateException(A08);
    }

    private final boolean A0a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        } else if (findFocus != null) {
            boolean z = false;
            ViewParent parent = findFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                } else if (parent == this) {
                    z = true;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(A08(0, 4, 21));
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(HttpStatus.SC_MULTIPLE_CHOICES, 9, 47), A08(309, 72, 80) + sb.toString());
                findFocus = null;
            }
        }
        boolean z2 = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (nextFocused != null && nextFocused != findFocus) {
            if (i == 17) {
                z2 = (findFocus == null || A02(this.A0q, nextFocused).left < A02(this.A0q, findFocus).left) ? nextFocused.requestFocus() : A0V();
            } else if (i == 66) {
                z2 = (findFocus == null || A02(this.A0q, nextFocused).left > A02(this.A0q, findFocus).left) ? nextFocused.requestFocus() : A0W();
            }
        } else if (i == 17 || i == 1) {
            z2 = A0V();
        } else if (i == 66 || i == 2) {
            z2 = A0W();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    private final boolean A0b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            boolean handled = keyEvent.hasModifiers(2);
            if (handled) {
                return A0V();
            }
            return A0a(17);
        } else if (keyCode == 22) {
            boolean handled2 = keyEvent.hasModifiers(2);
            if (handled2) {
                return A0W();
            }
            return A0a(66);
        } else if (keyCode != 61) {
            return false;
        } else {
            boolean handled3 = keyEvent.hasNoModifiers();
            if (handled3) {
                return A0a(2);
            }
            boolean hasModifiers = keyEvent.hasModifiers(1);
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0v[1] = "lC1XoLB2bpdljamdt6Vm";
            if (!hasModifiers) {
                return false;
            }
            return A0a(1);
        }
    }

    public static boolean A0c(@NonNull View view) {
        return view.getClass().getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i4 = view.getScrollX();
            int count = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + i4 >= childAt.getLeft() && i2 + i4 < childAt.getRight() && i3 + count >= childAt.getTop() && i3 + count < childAt.getBottom()) {
                    int left = (i2 + i4) - childAt.getLeft();
                    int i5 = i3 + count;
                    if (A0v[1].length() == 12) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0v;
                    strArr[4] = "";
                    strArr[5] = "";
                    if (A0d(childAt, true, i, left, i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Incorrect condition in loop: B:61:0x002a */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0e() {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.2z r0 = r11.A01
            int r3 = r0.A05()
            r11.A0G = r3
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r11.A0t
            int r1 = r0.size()
            int r0 = r11.A0L
            int r0 = r0 * 2
            r5 = 1
            int r0 = r0 + r5
            r4 = 0
            if (r1 >= r0) goto L7b
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r11.A0t
            int r0 = r0.size()
            if (r0 >= r3) goto L7b
            r10 = 1
        L20:
            int r6 = r11.A00
            r9 = 0
            r2 = 0
        L24:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r11.A0t
            int r0 = r0.size()
            if (r2 >= r0) goto L7d
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r11.A0t
            java.lang.Object r8 = r0.get(r2)
            com.facebook.ads.redexgen.X.3K r8 = (com.facebook.ads.redexgen.X.C3K) r8
            com.facebook.ads.redexgen.X.2z r1 = r11.A01
            java.lang.Object r0 = r8.A03
            int r7 = r1.A06(r0)
            r0 = -1
            if (r7 != r0) goto L41
        L3f:
            int r2 = r2 + r5
            goto L24
        L41:
            r0 = -2
            if (r7 != r0) goto L6c
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r11.A0t
            r0.remove(r2)
            int r2 = r2 + (-1)
            if (r9 != 0) goto L4e
            r9 = 1
        L4e:
            com.facebook.ads.redexgen.X.2z r7 = r11.A01
            int r1 = r8.A02
            java.lang.Object r0 = r8.A03
            r7.A0B(r11, r1, r0)
            r10 = 1
            int r1 = r11.A00
            int r0 = r8.A02
            if (r1 != r0) goto L3f
            int r1 = r11.A00
            int r0 = r3 + (-1)
            int r0 = java.lang.Math.min(r1, r0)
            int r6 = java.lang.Math.max(r4, r0)
            r10 = 1
            goto L3f
        L6c:
            int r0 = r8.A02
            if (r0 == r7) goto L3f
            int r1 = r8.A02
            int r0 = r11.A00
            if (r1 != r0) goto L77
            r6 = r7
        L77:
            r8.A02 = r7
            r10 = 1
            goto L3f
        L7b:
            r10 = 0
            goto L20
        L7d:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r1 = r11.A0t
            java.util.Comparator<com.facebook.ads.redexgen.X.3K> r0 = com.facebook.ads.redexgen.X.C3S.A0z
            java.util.Collections.sort(r1, r0)
            if (r10 == 0) goto Lbb
            int r3 = r11.getChildCount()
            r2 = 0
        L8b:
            if (r2 >= r3) goto La1
            android.view.View r0 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            com.facebook.ads.redexgen.X.3L r1 = (com.facebook.ads.redexgen.X.C3L) r1
            boolean r0 = r1.A05
            if (r0 != 0) goto L9e
            r0 = 0
            r1.A00 = r0
        L9e:
            int r2 = r2 + 1
            goto L8b
        La1:
            r11.A0N(r6, r4, r5)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3S.A0v
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto Lbc
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3S.A0v
            java.lang.String r1 = "iBz2AIJ6C"
            r0 = 2
            r2[r0] = r1
            r11.requestLayout()
        Lbb:
            return
        Lbc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.A0e():void");
    }

    public final void A0f() {
        A0G(this.A00);
    }

    /* JADX WARN: Incorrect condition in loop: B:43:0x0011 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void addFocusables(java.util.ArrayList<android.view.View> r7, int r8, int r9) {
        /*
            r6 = this;
            int r5 = r7.size()
            int r4 = r6.getDescendantFocusability()
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r4 == r0) goto L2f
            r3 = 0
        Ld:
            int r0 = r6.getChildCount()
            if (r3 >= r0) goto L2f
            android.view.View r2 = r6.getChildAt(r3)
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L2c
            com.facebook.ads.redexgen.X.3K r0 = r6.A07(r2)
            if (r0 == 0) goto L2c
            int r1 = r0.A02
            int r0 = r6.A00
            if (r1 != r0) goto L2c
            r2.addFocusables(r7, r8, r9)
        L2c:
            int r3 = r3 + 1
            goto Ld
        L2f:
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r4 != r0) goto L39
            int r0 = r7.size()
            if (r5 != r0) goto L55
        L39:
            boolean r0 = r6.isFocusable()
            if (r0 != 0) goto L40
            return
        L40:
            r1 = r9 & 1
            r0 = 1
            if (r1 != r0) goto L52
            boolean r0 = r6.isInTouchMode()
            if (r0 == 0) goto L52
            boolean r0 = r6.isFocusableInTouchMode()
            if (r0 != 0) goto L52
            return
        L52:
            r7.add(r6)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.addFocusables(java.util.ArrayList, int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C3L c3l = (C3L) layoutParams;
        c3l.A05 |= A0c(view);
        if (this.A0j) {
            if (!c3l.A05) {
                c3l.A03 = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException(A08(86, 41, 16));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.A01 == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) width) * this.A02)) : i > 0 && scrollX < ((int) (((float) width) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3L) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0l = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int y = getScrollY();
            int x = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != x || y != oldY) {
                scrollTo(x, oldY);
                if (!A0Z(x)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            C3E.A07(this);
            return;
        }
        A0R(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C3K A07;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int childCount2 = childAt.getVisibility();
            if (childCount2 == 0 && (A07 = A07(childAt)) != null) {
                int i2 = A07.A02;
                String[] strArr = A0v;
                String str = strArr[7];
                String str2 = strArr[0];
                int i3 = str.charAt(10);
                int childCount3 = str2.charAt(10);
                if (i3 != childCount3) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[4] = "";
                strArr2[5] = "";
                int childCount4 = this.A00;
                if (i2 == childCount4 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0036, code lost:
        if (r3.A05() > 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0052, code lost:
        if (r3 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0054, code lost:
        r5 = r8.save();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r3 = getWidth();
        r8.rotate(270.0f);
        r1 = -r4;
        r8.translate(r1 + getPaddingTop(), r7.A02 * r3);
        r7.A0V.setSize(r4, r3);
        r0 = r7.A0V.draw(r8);
        r6 = false | r0;
        r8.restoreToCount(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008c, code lost:
        r0 = r7.A0W.isFinished();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0092, code lost:
        if (r0 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0094, code lost:
        r3 = r8.save();
        r5 = getWidth();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r8.rotate(90.0f);
        r8.translate(-getPaddingTop(), (-(r7.A07 + 1.0f)) * r5);
        r7.A0W.setSize(r4, r5);
        r0 = r7.A0W.draw(r8);
        r6 = r6 | r0;
        r8.restoreToCount(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
        if (r3 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3L();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3L(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC01512z getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int result = this.A0F == 2 ? (i - 1) - i2 : i2;
        int index = ((C3L) this.A0d.get(result).getLayoutParams()).A01;
        return index;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0s);
        Scroller scroller = this.A0X;
        if (scroller != null && !scroller.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0t.size() > 0 && this.A01 != null) {
            int pos = getScrollX();
            int lastPos = getWidth();
            float f2 = this.A0M / lastPos;
            int itemCount = 0;
            C3K c3k = this.A0t.get(0);
            float marginOffset = c3k.A00;
            int size = this.A0t.size();
            int i = this.A0t.get(size - 1).A02;
            loop0: for (int i2 = c3k.A02; i2 < i; i2++) {
                while (i2 > c3k.A02 && itemCount < size) {
                    itemCount++;
                    C3K c3k2 = this.A0t.get(itemCount);
                    String[] strArr = A0v;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int scrollX = str.charAt(10);
                    if (scrollX != str2.charAt(10)) {
                        break loop0;
                    }
                    A0v[2] = "Qpfq";
                    c3k = c3k2;
                }
                if (i2 == c3k.A02) {
                    f = (c3k.A00 + c3k.A01) * lastPos;
                    float marginOffset2 = c3k.A00;
                    marginOffset = marginOffset2 + c3k.A01 + f2;
                } else {
                    float A04 = this.A01.A04(i2);
                    f = (marginOffset + A04) * lastPos;
                    marginOffset += A04 + f2;
                }
                if (this.A0M + f > pos) {
                    Drawable drawable = this.A0S;
                    int round = Math.round(f);
                    int i3 = this.A0Q;
                    int width = Math.round(this.A0M + f);
                    drawable.setBounds(round, i3, width, this.A09);
                    Drawable drawable2 = this.A0S;
                    String[] strArr2 = A0v;
                    String str3 = strArr2[7];
                    String str4 = strArr2[0];
                    int width2 = str3.charAt(10);
                    if (width2 != str4.charAt(10)) {
                        A0v[1] = "";
                        drawable2.draw(canvas);
                    } else {
                        String[] strArr3 = A0v;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        drawable2.draw(canvas);
                    }
                }
                int i4 = pos + lastPos;
                int width3 = A0v[1].length();
                if (width3 == 12) {
                    throw new RuntimeException();
                }
                A0v[1] = "DrXdt";
                if (f > i4) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0U();
            String[] strArr = A0v;
            if (strArr[4].length() == strArr[5].length()) {
                A0v[2] = "iW5W";
                return false;
            }
        } else {
            if (action != 0) {
                if (this.A0k) {
                    return true;
                }
                if (this.A0m) {
                    return false;
                }
            }
            if (action != 0) {
                if (action == 2) {
                    int i = this.A08;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float y = motionEvent.getX(findPointerIndex);
                        float f2 = y - this.A05;
                        float abs = Math.abs(f2);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.A04);
                        if (f2 != 0.0f && !A0Y(this.A05, f2) && A0d(this, false, (int) f2, (int) y, (int) y2)) {
                            this.A05 = y;
                            this.A06 = y2;
                            this.A0m = true;
                            return false;
                        }
                        float y3 = this.A0R;
                        if (A0v[1].length() != 12) {
                            String[] strArr2 = A0v;
                            strArr2[7] = "NnThZj9Wv9885vPNkfCF8DoAZte0LwUX";
                            strArr2[0] = "g2aolHvSBW8By3vUeqDyYWaFAgdqNGTo";
                            if (abs > y3 && 0.5f * abs > abs2) {
                                this.A0k = true;
                                A0T(true);
                                setScrollState(1);
                                if (f2 <= 0.0f) {
                                    f = this.A03 - this.A0R;
                                } else {
                                    float f3 = this.A03;
                                    int i2 = this.A0R;
                                    String[] strArr3 = A0v;
                                    if (strArr3[7].charAt(10) != strArr3[0].charAt(10)) {
                                        f = f3 + i2;
                                    } else {
                                        String[] strArr4 = A0v;
                                        strArr4[7] = "WpQimEPBWZ8vG05HKhTxshBMY3NNEur0";
                                        strArr4[0] = "BEtp4ufX6D8x3OZlDxdpMoFh1oKQqP0t";
                                        f = f3 + i2;
                                    }
                                }
                                this.A05 = f;
                                this.A06 = y2;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > this.A0R) {
                                this.A0m = true;
                            }
                            if (this.A0k && A0X(y)) {
                                C3E.A07(this);
                            }
                        }
                    }
                } else if (action == 6) {
                    A0P(motionEvent);
                }
            } else {
                float x = motionEvent.getX();
                this.A03 = x;
                this.A05 = x;
                float y4 = motionEvent.getY();
                this.A04 = y4;
                this.A06 = y4;
                this.A08 = motionEvent.getPointerId(0);
                this.A0m = false;
                this.A0l = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0R(false);
                    this.A0k = false;
                } else {
                    this.A0X.abortAnimation();
                    this.A0o = false;
                    A0f();
                    this.A0k = true;
                    A0T(true);
                    setScrollState(1);
                }
            }
            if (this.A0U == null) {
                this.A0U = VelocityTracker.obtain();
            }
            this.A0U.addMovement(motionEvent);
            return this.A0k;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0085, code lost:
        if (r3 != 48) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0087, code lost:
        r14 = com.facebook.ads.redexgen.X.C3S.A0v;
        r2 = r14[7];
        r14 = r14[0];
        r2 = r2.charAt(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x009b, code lost:
        if (r2 == r14.charAt(10)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x009d, code lost:
        com.facebook.ads.redexgen.X.C3S.A0v[2] = "D8xV1TWmEwTp2AdSb5ATv3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00a4, code lost:
        if (r3 == 80) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00a6, code lost:
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00bb, code lost:
        r14 = com.facebook.ads.redexgen.X.C3S.A0v;
        r14[3] = "1ewPUp1k8Pl5lyl6fUi6LymHiaJ9xmay";
        r14[6] = "wiWTa2PhZxJDNWnFVxR2jmvUAFeWjohE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00c7, code lost:
        if (r3 == 80) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00ca, code lost:
        r2 = r8 - r16;
        r2 = r2 - r4.getMeasuredHeight();
        r16 = r16 + r4.getMeasuredHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00e4, code lost:
        if (r3 != 48) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00e7, code lost:
        r2 = r12;
        r12 = r12 + r4.getMeasuredHeight();
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int end;
        int i2;
        C3K A07;
        int i3 = getChildCount();
        int count = i & 2;
        if (count != 0) {
            end = 0;
            i2 = 1;
        } else {
            end = i3 - 1;
            i2 = -1;
            i3 = -1;
        }
        while (end != i3) {
            View child = getChildAt(end);
            int index = A0v[2].length();
            if (index == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "wvs0VrXDMEHK1ZrgMliCmQkmYIqFRPYZ";
            strArr[6] = "yeuyy9yC0QSIfk9tyj8D1No5khczL5F7";
            int count2 = child.getVisibility();
            if (count2 == 0 && (A07 = A07(child)) != null) {
                int index2 = A07.A02;
                int count3 = this.A00;
                if (index2 == count3 && child.requestFocus(i, rect)) {
                    return true;
                }
            }
            end += i2;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Context context = getContext();
            String[] strArr = A0v;
            if (strArr[3].charAt(15) == strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[7] = "Ly8LvMv3iU8o2fiJAVqvd6K7Aqz3gZKY";
            strArr2[0] = "HcNmsPXina8Ul250FP3kUGj1pgK53N1r";
            classLoader = context.getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) state;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0c = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        ViewPager$SavedState ss = new ViewPager$SavedState(superState);
        ss.A00 = this.A00;
        AbstractC01512z abstractC01512z = this.A01;
        if (abstractC01512z != null) {
            Parcelable superState2 = abstractC01512z.A07();
            ss.A01 = superState2;
        }
        Parcelable superState3 = new WrappedParcelable(ss);
        return superState3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0M;
            A0K(i, i3, i5, i5);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0j) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:38:0x0010 */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebook.ads.redexgen.X.3P] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAdapter(com.facebook.ads.redexgen.X.AbstractC01512z r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.2z r0 = r6.A01
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L33
            r0.A0A(r3)
            r5 = 0
        La:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r6.A0t
            int r0 = r0.size()
            if (r5 >= r0) goto L26
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r6.A0t
            java.lang.Object r0 = r0.get(r5)
            com.facebook.ads.redexgen.X.3K r0 = (com.facebook.ads.redexgen.X.C3K) r0
            com.facebook.ads.redexgen.X.2z r2 = r6.A01
            int r1 = r0.A02
            java.lang.Object r0 = r0.A03
            r2.A0B(r6, r1, r0)
            int r5 = r5 + 1
            goto La
        L26:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3K> r0 = r6.A0t
            r0.clear()
            r6.A0A()
            r6.A00 = r4
            r6.scrollTo(r4, r4)
        L33:
            r6.A01 = r7
            r6.A0G = r4
            com.facebook.ads.redexgen.X.2z r0 = r6.A01
            if (r0 == 0) goto L6c
            com.facebook.ads.redexgen.X.3P r0 = r6.A0b
            if (r0 != 0) goto L46
            com.facebook.ads.redexgen.X.3P r0 = new com.facebook.ads.redexgen.X.3P
            r0.<init>()
            r6.A0b = r0
        L46:
            com.facebook.ads.redexgen.X.2z r1 = r6.A01
            com.facebook.ads.redexgen.X.3P r0 = r6.A0b
            r1.A0A(r0)
            r6.A0o = r4
            boolean r2 = r6.A0i
            r1 = 1
            r6.A0i = r1
            com.facebook.ads.redexgen.X.2z r0 = r6.A01
            int r0 = r0.A05()
            r6.A0G = r0
            int r0 = r6.A0O
            if (r0 < 0) goto L94
            int r0 = r6.A0O
            r6.A0N(r0, r4, r1)
            r0 = -1
            r6.A0O = r0
            r6.A0T = r3
            r6.A0c = r3
        L6c:
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0e
            if (r0 == 0) goto L9e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9e
            r1 = 0
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0e
            int r0 = r0.size()
            if (r1 >= r0) goto L9e
            java.util.List<com.facebook.ads.internal.androidx.support.v4.view.ViewPager$OnAdapterChangeListener> r0 = r6.A0e
            r0.get(r1)
            r2 = 381(0x17d, float:5.34E-43)
            r1 = 16
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r1 = A08(r2, r1, r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L94:
            if (r2 != 0) goto L9a
            r6.A0f()
            goto L6c
        L9a:
            r6.requestLayout()
            goto L6c
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3S.setAdapter(com.facebook.ads.redexgen.X.2z):void");
    }

    public void setCurrentItem(int i) {
        this.A0o = false;
        A0N(i, !this.A0i, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(A08(HttpStatus.SC_MULTIPLE_CHOICES, 9, 47), A08(127, 31, 60) + i + A08(51, 26, 90) + 1);
            i = 1;
        }
        if (i != this.A0L) {
            this.A0L = i;
            A0f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C3N c3n) {
        this.A0Z = c3n;
    }

    public void setPageMargin(int i) {
        int width = this.A0M;
        this.A0M = i;
        int oldMargin = getWidth();
        A0K(oldMargin, oldMargin, i, width);
        requestLayout();
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        setPageMarginDrawable(C2V.A00(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.A0P == i) {
            return;
        }
        this.A0P = i;
        if (this.A0a != null) {
            A0S(i != 0);
        }
        A0F(i);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0p != z) {
            this.A0p = z;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
