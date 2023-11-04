package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Tp */
/* loaded from: assets/audience_network.dex */
public final class C0799Tp implements com.facebook.ads.Ad, NativeAdBaseApi, Repairable, J6 {
    public static C6M A0k;
    public static byte[] A0l;
    public static String[] A0m = {"Bl7Z7O36thNMsAQG86cT5hXAswukL2TU", "w0l3kgVUfrf8f1EzcfbBJ9JqF1JIQyF1", "3FYeVZ4P9Hva0brxRfDXnSutu97odoaf", "TkemScCQ72wM3yeu7V5OcaIZTlgQuG0T", "aV5nfdXEnoj7uvLi", "brDFWAS69jf159nGVdOYVvf", "WGIwYSb5Wjcv", "W7skGFSknqdZoaqu210O1mF"};
    public static final String A0n;
    public static final WeakHashMap<View, WeakReference<C0799Tp>> A0o;
    public long A00;
    @Nullable
    public Drawable A01;
    @Nullable
    public View.OnTouchListener A02;
    @Nullable
    public View A03;
    @Nullable
    public View A04;
    @Nullable
    public View A05;
    @Nullable
    public View A06;
    @Nullable
    public NativeAdLayout A07;
    public EnumC01000z A08;
    @Nullable
    public C0957Zx A09;
    @Nullable
    public C0424Er A0A;
    @Nullable
    public ZU A0B;
    @Nullable
    public C6S A0C;
    @Nullable
    public C8B A0D;
    public EnumC0523Is A0E;
    @Nullable
    public View$OnClickListenerC0801Tr A0F;
    @Nullable
    public InterfaceC0798To A0G;
    @Nullable
    public J0 A0H;
    public J1 A0I;
    public JF A0J;
    @Nullable
    public MB A0K;
    @Nullable
    public N8 A0L;
    @Nullable
    @DoNotStrip
    public OM A0M;
    @Nullable
    public C0676Ov A0N;
    @Nullable
    @DoNotStrip
    public Q9 A0O;
    @Nullable
    @DoNotStrip
    public Q9 A0P;
    @Nullable
    public QA A0Q;
    @Nullable
    public QA A0R;
    @Nullable
    public String A0S;
    @Nullable
    public String A0T;
    public WeakReference<YM> A0U;
    @Nullable
    public WeakReference<Q9> A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    @Nullable
    public C0967a7 A0a;
    public final C6M A0b;
    public final C0887Xc A0c;
    @Nullable
    public final InterfaceC0528Ix A0d;
    public final J8 A0e;
    public final LD A0f;
    public final String A0g;
    public final String A0h;
    public final List<View> A0i;
    public volatile boolean A0j;

    public static String A0W(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0l, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A0d() {
        A0l = new byte[]{86, -112, -100, -107, -108, -90, -89, -85, -90, -40, -88, -85, -40, -72, -71, -75, -70, -76, -28, -27, -25, 10, -58, 20, 21, 26, -58, 18, 21, 7, 10, 11, 10, 125, -96, -112, -95, -87, -84, -88, -99, -80, -95, 92, 99, airhockey.J_SDKVER, -81, 99, 92, -91, -81, 92, -86, -85, -80, 92, -99, 92, -86, -99, -80, -91, -78, -95, 92, -99, -96, -62, -66, -67, -15, -32, -27, -31, -22, -33, -31, -54, -31, -16, -13, -21, -18, -25, -105, -78, -70, -67, -74, -75, airhockey.J_BACK, -59, -64, airhockey.J_BACK, -67, -64, -78, -75, airhockey.J_BACK, -98, -74, -75, -70, -78, ByteCompanionObject.MAX_VALUE, -83, -56, -48, -45, -52, -53, -121, -37, -42, -121, -42, -55, -37, -56, -48, -43, -121, -37, -52, -44, -41, -45, -56, -37, -52, -121, -80, -85, -121, -51, -39, -42, -44, -121, -55, -48, -53, -121, -41, -56, -32, -45, -42, -56, -53, -121, -114, -116, -38, -114, -93, -56, -50, -65, -52, -56, -69, -58, airhockey.J_PURCHASE, -65, -52, -52, -55, -52, -120, airhockey.J_ONREWARDED, -79, -42, -34, -55, -44, -47, -52, -120, -37, -51, -36, -120, -41, -50, -120, -53, -44, -47, -53, -45, -55, -54, -44, -51, -120, -34, -47, -51, -33, -37, -43, -19, -20, -15, -23, -34, -15, -19, -1, -88, -18, -9, -6, -88, -15, -21, -9, -10, -88, -15, -5, -88, -15, -5, -88, -11, -15, -5, -5, -15, -10, -17, -74, -73, -49, -50, -45, -53, -64, -45, -49, -31, -118, -45, -35, -118, -41, -45, -35, -35, -45, -40, -47, -104, -71, -31, -33, -32, -116, -36, -34, -37, -30, -43, -48, -47, -116, -51, -116, -62, -43, -47, -29, -116, -97, -78, -89, -76, -93, 94, ByteCompanionObject.MAX_VALUE, -94, 94, -75, -97, -79, 94, -97, -86, -80, -93, -97, -94, -73, 94, -80, -93, -91, -89, -79, -78, -93, -80, -93, -94, 94, -75, -89, -78, -90, 94, -97, 94, -108, -89, -93, -75, airhockey.J_GAME_DISCONNECT, 94, ByteCompanionObject.MAX_VALUE, -77, -78, -83, 94, -77, -84, -80, -93, -91, -89, -79, -78, -93, -80, -89, -84, -91, 94, -97, -84, -94, 94, -82, -80, -83, -95, -93, -93, -94, -89, -84, -91, airhockey.J_GAME_DISCONNECT, -49, -30, -11, -22, -9, -26, -95, -30, -27, -95, -27, -26, -12, -11, -13, -16, -6, -26, -27, -115, -96, -77, -88, -75, -92, 95, -96, -93, 95, -85, -82, -96, -93, 95, -79, -92, -80, -76, -92, -78, -77, -92, -93, -32, -13, -17, 1, -86, -21, -10, -4, -17, -21, -18, 3, -86, -4, -17, -15, -13, -3, -2, -17, -4, -17, -18, -86, 1, -13, -2, -14, -86, -21, -86, -40, -21, -2, -13, 0, -17, -53, -18, -72, -86, -53, -1, -2, -7, -86, -1, -8, -4, -17, -15, -13, -3, -2, -17, -4, -13, -8, -15, -86, -21, -8, -18, -86, -6, -4, -7, -19, -17, -17, -18, -13, -8, -15, -72, -115, -96, -100, -82, 87, -91, -90, -85, 87, -87, -100, -98, -96, -86, -85, -100, -87, -100, -101, 87, -82, -96, -85, -97, 87, -85, -97, -96, -86, 87, -123, -104, -85, -96, -83, -100, airhockey.J_ACHIEVEMENTCALLBACK, -101, -47, -44, -112, -35, -43, -44, -39, -47, -112, -28, -23, -32, -43, -112, -39, -29, -112, -34, -33, -28, -112, -29, -27, -32, -32, -33, -30, -28, -43, -44, -98, -104, -89, -96, -113, -112, -98, -97, -99, -102, -92, -107, 99, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, airhockey.J_SDKVER, -108, airhockey.J_ENEMYLOSE, -94, -91, -105, -102, 119, -102, 7, 10, -4, -1, -36, -1, -61, -60, -69, -2, -4, 7, 7, 0, -1, -69, 8, 10, 13, 0, -69, 15, 3, -4, 9, -69, 10, 9, -2, 0, -17, -30, -11, -22, -9, -26};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0f(View view, View view2, List<View> list, boolean z) {
        InterfaceC0798To interfaceC0798To;
        if (!A0q()) {
            this.A0c.A0E().AE3();
        }
        if (view == null) {
            String A0W = A0W(255, 19, 68);
            if (!A0q()) {
                this.A0c.A0E().AE2(A0W);
            }
            throw new IllegalArgumentException(A0W);
        } else if (list == null || list.size() == 0) {
            String A0W2 = A0W(171, 30, 64);
            if (!A0q()) {
                this.A0c.A0E().AE2(A0W2);
            }
            throw new IllegalArgumentException(A0W2);
        } else {
            C0967a7 A0C = A0C();
            if (A0C == null) {
                String A0W3 = A0W(20, 13, 126);
                if (!A0q()) {
                    this.A0c.A0E().AE2(A0W3);
                }
                Log.e(A0n, A0W3);
                JA ja = new JA(AdErrorType.NATIVE_AD_IS_NOT_LOADED, A0W3);
                A11().A0E().A2b(LC.A01(this.A00), ja.A03().getErrorCode(), ja.A04());
                if (!IK.A24(this.A0c) || (interfaceC0798To = this.A0G) == null) {
                    return;
                }
                interfaceC0798To.AAv(ja);
                return;
            }
            String str = this.A0T;
            boolean z2 = view instanceof FrameLayout;
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[0] = "EctJGKY0XxsuqG0UQd3u1zsk6i1LiKEB";
            strArr2[2] = "xfmrtxxFdZMJNwdY4ICwqytBKlocc6OO";
            if (z2 && str != null) {
                A0g((FrameLayout) view, str);
            }
            NativeAdLayout nativeAdLayout = this.A07;
            if (nativeAdLayout != null) {
                ((Y5) nativeAdLayout.getNativeAdLayoutApi()).A02();
            }
            YM ym = this.A0U.get();
            if (ym != null && A0C.A08() == 1) {
                ym.A03(LT.AN_INFO_ICON);
            }
            if (view2 == null) {
                if (this.A0J == JF.A05) {
                    AdErrorType adErrorType = AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
                    String A0W4 = A0W(234, 21, 66);
                    JA ja2 = new JA(adErrorType, A0W4);
                    A11().A0E().A2b(LC.A01(this.A00), ja2.A03().getErrorCode(), ja2.A04());
                    InterfaceC0798To interfaceC0798To2 = this.A0G;
                    if (interfaceC0798To2 != null) {
                        interfaceC0798To2.AAv(ja2);
                    }
                    if (AdInternalSettings.isDebugBuild()) {
                        Log.e(A0n, A0W4);
                        return;
                    }
                    return;
                }
                AdErrorType adErrorType2 = AdErrorType.NO_MEDIAVIEW_IN_NATIVEBANNERAD;
                String A0W5 = A0W(HttpStatus.SC_CREATED, 33, 96);
                JA ja3 = new JA(adErrorType2, A0W5);
                A11().A0E().A2b(LC.A01(this.A00), ja3.A03().getErrorCode(), ja3.A04());
                InterfaceC0798To interfaceC0798To3 = this.A0G;
                if (interfaceC0798To3 != null) {
                    interfaceC0798To3.AAv(ja3);
                }
                if (AdInternalSettings.isDebugBuild()) {
                    Log.e(A0n, A0W5);
                    return;
                }
                return;
            }
            boolean z3 = (view2 instanceof AdNativeComponentView) && ((AdNativeComponentView) view2).getAdContentsView() != null;
            boolean z4 = z && (view2 instanceof ImageView);
            if (!z3 && !z4) {
                if (this.A0G != null) {
                    JA ja4 = new JA(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0W(510, 31, 72));
                    A11().A0E().A2b(LC.A01(this.A00), ja4.A03().getErrorCode(), ja4.A04());
                    this.A0G.AAv(ja4);
                    return;
                }
                return;
            }
            if (this.A04 != null) {
                Log.w(A0n, A0W(274, 80, 22));
                String[] strArr3 = A0m;
                if (strArr3[7].length() != strArr3[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0m;
                strArr4[7] = "Yitqb4l5O5wHhToyiUZG328";
                strArr4[5] = "n4uNZUYEyoiQJdMJgH58rRy";
                unregisterView();
            }
            if (A0o.containsKey(view) && A0o.get(view).get() != null) {
                Log.w(A0n, A0W(397, 75, 98));
                A0o.get(view).get().unregisterView();
            }
            this.A0F = new View$OnClickListenerC0801Tr(this, this.A0c, null);
            this.A04 = view;
            this.A06 = view2;
            if (view instanceof ViewGroup) {
                this.A0K = new MB(this.A0c, new C0805Tv(this));
                ((ViewGroup) view).addView(this.A0K);
            }
            if (A0C.A0U()) {
                this.A0O = new C0804Tu(this);
                this.A0Q = new QA(view, 1, new WeakReference(this.A0O), this.A0c);
                this.A0Q.A0Y(false);
                this.A0Q.A0X(A0C.A09());
                this.A0Q.A0U();
                this.A0c.A0E().A9q();
            }
            ArrayList<View> arrayList = new ArrayList(list);
            View view3 = this.A05;
            if (view3 != null) {
                arrayList.add(view3);
            }
            for (View view4 : arrayList) {
                A1K(view4);
            }
            int A00 = A00();
            this.A0P = new C0803Tt(this, view2, z4, A0C);
            if (view2 instanceof AdNativeComponentView) {
                this.A03 = ((AdNativeComponentView) view2).getAdContentsView();
            } else {
                this.A03 = view2;
            }
            if (IK.A1Q(this.A0c)) {
                String A1B = A1B();
                InterfaceC0517Im A0A = A11().A0A();
                View view5 = this.A03;
                if (A1B == null) {
                    A1B = A0W(0, 0, 21);
                }
                A0A.AFq(view5, A1B, this.A03 instanceof PH, true);
            }
            this.A0R = new QA(this.A03, A00, A03(), true, new WeakReference(this.A0P), this.A0c);
            this.A0R.A0Y(!A0q());
            this.A0R.A0W(A01());
            this.A0R.A0X(A02());
            View view6 = this.A03;
            if (view6 instanceof C0628My) {
                ((C0628My) view6).A06(this.A0R);
            }
            this.A09 = new C0957Zx(this.A0c, new C0800Tq(this, null), this.A0R, this.A0a);
            this.A09.A0D(arrayList);
            A0o.put(view, new WeakReference<>(this));
            if (Build.VERSION.SDK_INT < 18 || !IK.A10(this.A0c)) {
                return;
            }
            this.A0L = new N8();
            this.A0L.A0C(this.A0g);
            this.A0L.A0B(this.A0c.getPackageName());
            this.A0L.A0A(this.A0R);
            C0967a7 c0967a7 = this.A0a;
            if (c0967a7 != null && c0967a7.A0E().A03() > 0) {
                AnonymousClass11 A0E = this.A0a.A0E();
                this.A0L.A08(A0E.A03(), A0E.A04());
            }
            C8B c8b = this.A0D;
            if (c8b != null) {
                this.A0L.A09(c8b.A0C());
            } else {
                C0424Er c0424Er = this.A0A;
                if (c0424Er != null && c0424Er.A0G() != null) {
                    this.A0L.A09(this.A0A.A0G().A0C());
                }
            }
            View view7 = this.A04;
            String[] strArr5 = A0m;
            if (strArr5[4].length() != strArr5[6].length()) {
                String[] strArr6 = A0m;
                strArr6[4] = "DFdj5aRKmThGOYGM";
                strArr6[6] = "4rU7VADNdisg";
                view7.getOverlay().add(this.A0L);
                return;
            }
            String[] strArr7 = A0m;
            strArr7[7] = "HovrQjOKGOU1glve9p8eAJs";
            strArr7[5] = "lnqkcQfVF9X2NaZpGo2NogE";
            view7.getOverlay().add(this.A0L);
        }
    }

    static {
        A0d();
        A0n = C0799Tp.class.getSimpleName();
        A0o = new WeakHashMap<>();
    }

    public C0799Tp(Context context, String str, @Nullable InterfaceC0528Ix interfaceC0528Ix, boolean z) {
        this.A0h = UUID.randomUUID().toString();
        this.A0J = JF.A05;
        this.A0E = EnumC0523Is.A04;
        this.A08 = EnumC01000z.A03;
        this.A0U = new WeakReference<>(null);
        this.A0i = new ArrayList();
        this.A0f = new LD();
        this.A0Z = false;
        this.A0Y = false;
        this.A00 = -1L;
        if (context instanceof C0887Xc) {
            this.A0c = (C0887Xc) context;
        } else if (!z) {
            this.A0c = C5M.A04(context);
        } else {
            this.A0c = C5M.A02(context);
        }
        this.A0c.A0H(this);
        this.A0g = str;
        this.A0d = interfaceC0528Ix;
        C6M c6m = A0k;
        if (c6m != null) {
            this.A0b = c6m;
        } else {
            this.A0b = new C6M(this.A0c);
        }
        this.A05 = new View(context);
        this.A0e = new J8(this.A0c, this);
    }

    public C0799Tp(C0799Tp c0799Tp) {
        this((Context) c0799Tp.A0c, (String) null, c0799Tp.A0d, true);
        this.A0D = c0799Tp.A0D;
        this.A0a = c0799Tp.A0a;
        this.A0B = c0799Tp.A0B;
        this.A0j = true;
        this.A05 = new View(this.A0c);
    }

    public C0799Tp(C0887Xc c0887Xc, C0967a7 c0967a7, @Nullable C8B c8b, @Nullable InterfaceC0528Ix interfaceC0528Ix) {
        this((Context) c0887Xc, (String) null, interfaceC0528Ix, true);
        this.A0a = c0967a7;
        this.A0D = c8b;
        this.A0j = true;
        this.A05 = new View(c0887Xc);
    }

    public C0799Tp(C0887Xc c0887Xc, C0967a7 c0967a7, @Nullable C8B c8b, InterfaceC0528Ix interfaceC0528Ix, @Nullable ZU zu) {
        this(c0887Xc, c0967a7, c8b, interfaceC0528Ix);
        this.A0B = zu;
    }

    private int A00() {
        C8B c8b = this.A0D;
        if (c8b != null) {
            return c8b.A04();
        }
        C0424Er c0424Er = this.A0A;
        if (c0424Er == null || c0424Er.A0G() == null) {
            return 1;
        }
        return this.A0A.A0G().A04();
    }

    private int A01() {
        C8B c8b = this.A0D;
        if (c8b != null) {
            return c8b.A07();
        }
        C0967a7 c0967a7 = this.A0a;
        if (c0967a7 != null) {
            int A0C = c0967a7.A0C();
            String[] strArr = A0m;
            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                String[] strArr2 = A0m;
                strArr2[7] = "EUscbuPuA5cZxxPx7y6ncGc";
                strArr2[5] = "07NrZ6juCFttxvE5hiFlF8c";
                return A0C;
            }
            throw new RuntimeException();
        }
        C0424Er c0424Er = this.A0A;
        if (c0424Er != null && c0424Er.A0G() != null) {
            return this.A0A.A0G().A07();
        }
        return 0;
    }

    private int A02() {
        C8B c8b = this.A0D;
        if (c8b != null) {
            return c8b.A08();
        }
        C0967a7 c0967a7 = this.A0a;
        if (c0967a7 != null) {
            int A0D = c0967a7.A0D();
            String[] strArr = A0m;
            if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
                String[] strArr2 = A0m;
                strArr2[1] = "wlXrbCoONy6aNPfJSLZ4JGG9g8lWOQWJ";
                strArr2[3] = "zMDzXw8vWIk5v34E7N5RdIcOKoPIh5je";
                return A0D;
            }
            throw new RuntimeException();
        }
        C0424Er c0424Er = this.A0A;
        String[] strArr3 = A0m;
        if (strArr3[4].length() != strArr3[6].length()) {
            String[] strArr4 = A0m;
            strArr4[7] = "IJhE7OuQr9AUmHg0gZAU0NE";
            strArr4[5] = "Tpbr9nnLmrgR8Cas3OKWnYo";
            if (c0424Er == null) {
                return 1000;
            }
        } else {
            String[] strArr5 = A0m;
            strArr5[0] = "x7i9CQzVOJPdqJX1dHOWNRL80PPtBuUS";
            strArr5[2] = "xh5QtfSCbDAINUU48h4MV8p0ljd4aaCa";
            if (c0424Er == null) {
                return 1000;
            }
        }
        if (c0424Er.A0G() != null) {
            return this.A0A.A0G().A08();
        }
        return 1000;
    }

    private int A03() {
        C8B c8b = this.A0D;
        if (c8b != null) {
            return c8b.A09();
        }
        C0424Er c0424Er = this.A0A;
        if (c0424Er == null || c0424Er.A0G() == null) {
            return 0;
        }
        return this.A0A.A0G().A09();
    }

    public static Drawable A05(C0887Xc c0887Xc, Bitmap bitmap, boolean z, @Nullable String str) {
        BitmapDrawable A00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c0887Xc.getResources(), bitmap);
        if (!z || (A00 = C0675Ou.A00(c0887Xc, str)) == null) {
            return bitmapDrawable;
        }
        Drawable iconViewDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, A00});
        return iconViewDrawable;
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws JB {
        JF A00 = JK.A00(str2);
        if (A00 != null) {
            JF jf = JF.A04;
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[0] = "9sjWaS9CbZxjWOFrlYfgckD2h0ahWze6";
            strArr2[2] = "CgLfFBC4KJYZcdRIWMiGUMQeYT9XpqO1";
            if (A00 == jf) {
                return new NativeBannerAd(context, str);
            }
            JF template = JF.A05;
            if (A00 == template) {
                return new NativeAd(context, str);
            }
            throw new JB(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(33, 34, 20), A00));
        }
        throw new JB(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(105, 50, 63), str2));
    }

    @Nullable
    private final C0967a7 A0C() {
        C0967a7 c0967a7 = this.A0a;
        if (c0967a7 != null && c0967a7.A0T()) {
            return c0967a7;
        }
        return null;
    }

    private AnonymousClass11 A0F() {
        return A0G(false);
    }

    private AnonymousClass11 A0G(boolean z) {
        C0967a7 c0967a7 = this.A0a;
        if (c0967a7 != null && c0967a7.A0T()) {
            if (z) {
                this.A0a.A0I();
            }
            C0967a7 c0967a72 = this.A0a;
            String[] strArr = A0m;
            if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
                String[] strArr2 = A0m;
                strArr2[7] = "bGIdjP48JCmqHZjd8yMcvy0";
                strArr2[5] = "TixE3qv3ULKos9kbBUakVg1";
                return c0967a72.A0E();
            }
            throw new RuntimeException();
        }
        return new AnonymousClass11();
    }

    public static InterfaceC0528Ix A0K() {
        return new C0802Ts();
    }

    public static C0799Tp A0L(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (C0799Tp) ((AnonymousClass56) Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (C0799Tp) nativeAdBaseApi;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0M */
    public final C0529Iy getAdChoicesIcon() {
        return A0F().A0E();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0O */
    public final C0530Iz getAdStarRating() {
        return A0F().A0H();
    }

    private AdPlacementType A0R() {
        if (this.A0J == JF.A05) {
            return AdPlacementType.NATIVE;
        }
        return AdPlacementType.NATIVE_BANNER;
    }

    private void A0Z() {
        for (View v : this.A0i) {
            v.setOnClickListener(null);
            v.setOnTouchListener(null);
            v.setOnLongClickListener(null);
        }
        this.A0i.clear();
    }

    private void A0a() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            KS.A0E(new KS(), this.A0c, KT.A00(getAdChoicesLinkUrl()), A1B());
        }
    }

    public void A0b() {
        this.A0f.A05();
        this.A0e.A05();
    }

    public void A0c() {
        QA qa = this.A0Q;
        if (qa != null) {
            qa.A0V();
            this.A0c.A0E().A9r();
            this.A0Q = null;
        }
    }

    public static void A0e(@Nullable Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(null);
        } else {
            imageView.setBackgroundDrawable(null);
        }
    }

    private void A0g(FrameLayout frameLayout, String str) {
        C0676Ov c0676Ov = this.A0N;
        if (c0676Ov != null) {
            frameLayout.removeView(c0676Ov);
        }
        this.A0N = C0675Ou.A01(C5M.A02(this.A0c), str);
        C0676Ov c0676Ov2 = this.A0N;
        if (c0676Ov2 != null) {
            frameLayout.addView(c0676Ov2, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0N);
        }
    }

    private void A0h(@Nullable C0967a7 c0967a7, boolean z) {
        if (c0967a7 == null) {
            return;
        }
        boolean equals = this.A0E.equals(EnumC0523Is.A04);
        String A0W = A0W(594, 6, 89);
        if (equals) {
            AnonymousClass11 A0E = c0967a7.A0E();
            String clientToken = c0967a7.A6B();
            if (!TextUtils.isEmpty(clientToken)) {
                this.A0b.A0d(new C0513Ii(clientToken, this.A0c.A09()));
            }
            if (A0E.A0G() != null) {
                C6K c6k = new C6K(A0E.A0G().getUrl(), A0E.A0G().getHeight(), A0E.A0G().getWidth(), c0967a7.A0G(), A0W(594, 6, 89));
                c6k.A00 = this.A0C;
                this.A0b.A0V();
                this.A0b.A0b(c6k);
            }
            if (!this.A0J.equals(JF.A04)) {
                if (A0E.A0F() != null) {
                    this.A0b.A0b(new C6K(A0E.A0F().getUrl(), A0E.A0F().getHeight(), A0E.A0F().getWidth(), c0967a7.A0G(), A0W(594, 6, 89)));
                }
                List<C0799Tp> A0H = c0967a7.A0H();
                String[] strArr = A0m;
                if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[1] = "BiVeVWtUTguxpSjeMqAkCwQXeKWOVTz4";
                strArr2[3] = "8sdR9nWPZ664Gt9BvBocaDJi5It1hBkX";
                if (A0H != null) {
                    for (C0799Tp c0799Tp : c0967a7.A0H()) {
                        if (c0799Tp.getAdCoverImage() != null) {
                            this.A0b.A0b(new C6K(c0799Tp.getAdCoverImage().getUrl(), c0799Tp.getAdCoverImage().getHeight(), c0799Tp.getAdCoverImage().getWidth(), c0967a7.A0G(), A0W(594, 6, 89)));
                        }
                    }
                }
                String A0d = A0E.A0d();
                if (!TextUtils.isEmpty(A0d)) {
                    this.A0b.A0a(new C6I(A0d, c0967a7.A0G(), A0W(594, 6, 89), A0E.A0A()));
                }
            }
            AbstractC0952Zs A0D = A0E.A0D();
            if (A0D != null && A0D.A0a()) {
                C6I c6i = new C6I(A0D.A0H(), A0D.A0L(), A0W);
                c6i.A04 = true;
                c6i.A03 = A0W(0, 5, 0);
                this.A0b.A0X(c6i);
            }
        }
        this.A0b.A0W(new C0806Tw(this, c0967a7, z), new C6F(c0967a7.A0G(), A0W));
    }

    private void A0i(AnonymousClass12 anonymousClass12) {
        C0967a7 c0967a7 = this.A0a;
        if (c0967a7 == null) {
            return;
        }
        c0967a7.A0K(anonymousClass12);
    }

    public static void A0j(NativeAdImageApi nativeAdImageApi, ImageView imageView, C0887Xc c0887Xc) {
        if (nativeAdImageApi != null && imageView != null) {
            new AsyncTaskC0764Sf(imageView, c0887Xc).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0m(InterfaceC0798To interfaceC0798To) {
        this.A0G = interfaceC0798To;
    }

    private final void A0n(String str) {
        this.A0S = str;
    }

    private void A0o(List<View> list, View view) {
        InterfaceC0528Ix interfaceC0528Ix = this.A0d;
        if (interfaceC0528Ix != null && interfaceC0528Ix.AFE(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                String[] strArr = A0m;
                String str = strArr[7];
                String str2 = strArr[5];
                int i2 = str.length();
                if (i2 != str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[1] = "SQxDsveS3BVeMl0nUnJayKxDlwKiSRwM";
                strArr2[3] = "CPUPH8uU8pe6dd8URnD7AGDEQ4lKFlLs";
                A0o(list, childAt);
            }
            return;
        }
        list.add(view);
    }

    public boolean A0p() {
        return A18() == J3.A05 || A18() == J3.A03;
    }

    public boolean A0q() {
        return A0F().A0h();
    }

    public final long A0x() {
        return this.A00;
    }

    @Nullable
    public final C0967a7 A0y() {
        return this.A0a;
    }

    @Nullable
    public final AbstractC0952Zs A0z() {
        return A0F().A0D();
    }

    public final C6M A10() {
        return this.A0b;
    }

    public final C0887Xc A11() {
        return this.A0c;
    }

    @Nullable
    public final View$OnClickListenerC0801Tr A12() {
        return this.A0F;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A13 */
    public final C0529Iy getAdCoverImage() {
        return A0F().A0F();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A14 */
    public final C0529Iy getAdIcon() {
        return A0F().A0G();
    }

    @Nullable
    public final InterfaceC0798To A15() {
        return this.A0G;
    }

    @Nullable
    public final J0 A16() {
        return this.A0H;
    }

    public final J1 A17() {
        return this.A0I;
    }

    public final J3 A18() {
        return A0F().A0I();
    }

    public final LD A19() {
        return this.A0f;
    }

    @Nullable
    public final QA A1A() {
        return this.A0R;
    }

    @Nullable
    public final String A1B() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A6B();
    }

    @Nullable
    public final String A1C() {
        return this.A0T;
    }

    @Nullable
    public final String A1D() {
        return A0G(true).A0O();
    }

    @Nullable
    public final String A1E() {
        return A0G(true).A0P();
    }

    @Nullable
    public final String A1F() {
        return A0F().A0c();
    }

    @Nullable
    public final String A1G() {
        C0967a7 c0967a7 = this.A0a;
        if (c0967a7 == null || TextUtils.isEmpty(c0967a7.A0E().A0d())) {
            return null;
        }
        return this.A0b.A0S(this.A0a.A0E().A0d());
    }

    @Nullable
    public final List<C0799Tp> A1H() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A0H();
    }

    public final void A1I() {
        if (!C2E.A00(this.A0c.A01()).A0O(this.A0c, false)) {
            A0a();
            return;
        }
        C0887Xc c0887Xc = this.A0c;
        MH A01 = MI.A01(c0887Xc, c0887Xc.A09(), A1B(), this.A07);
        if (A01 == null) {
            A0a();
            return;
        }
        ((Y5) this.A07.getNativeAdLayoutApi()).A03(A01);
        A01.A0K();
    }

    public final void A1J(@Nullable Drawable drawable) {
        this.A01 = drawable;
        A1c(drawable != null, true);
        String[] strArr = A0m;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[4] = "Q96JEqttX0oIb74l";
        strArr2[6] = "mqYIcYUMJzEb";
    }

    public final void A1K(View view) {
        this.A0i.add(view);
        view.setOnClickListener(this.A0F);
        view.setOnTouchListener(this.A0F);
        if (Build.VERSION.SDK_INT >= 18) {
            boolean A10 = IK.A10(view.getContext());
            String[] strArr = A0m;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[4] = "GeTsVetQiODT9yUx";
            strArr2[6] = "UPeG8QvAHkrx";
            if (A10) {
                view.setOnLongClickListener(this.A0F);
            }
        }
    }

    public final void A1L(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0o(arrayList, view);
        A0f(view, imageView, arrayList, true);
    }

    public final void A1M(View view, ImageView imageView, List<View> clickableViews) {
        A0f(view, imageView, clickableViews, true);
    }

    public final void A1N(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0o(arrayList, view);
        A0f(view, adNativeComponentView, arrayList, false);
    }

    public final void A1O(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews) {
        A0f(view, adNativeComponentView, clickableViews, false);
    }

    public final void A1P(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Y = true;
        }
    }

    public final void A1Q(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Z = true;
        }
    }

    public final void A1R(NativeAdBase nativeAdBase, NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0m(new C0327Ah(nativeAdListener, nativeAdBase));
    }

    public final void A1S(@Nullable NativeAdLayout nativeAdLayout) {
        this.A07 = nativeAdLayout;
    }

    public final void A1T(C0967a7 c0967a7) {
        A0h(c0967a7, true);
        if (this.A0G != null) {
            List<C0799Tp> A0H = c0967a7.A0H();
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[0] = "OfB2JsewzcYgCxMvn97l0AOaUV28WOmd";
            strArr2[2] = "fN7XzjPm8qHCAEGwTiZWrbsVWAwnjwvJ";
            if (A0H != null) {
                C0808Ty c0808Ty = new C0808Ty(this);
                for (C0799Tp c0799Tp : c0967a7.A0H()) {
                    c0799Tp.A0i(c0808Ty);
                }
            }
        }
    }

    public final void A1U(@Nullable YM ym) {
        this.A0U = new WeakReference<>(ym);
    }

    public final void A1V(EnumC0523Is enumC0523Is, @Nullable String str, C6S c6s) {
        if (str == null) {
            this.A0c.A0E().A2e();
        } else {
            this.A0c.A0E().A2d();
        }
        this.A00 = System.currentTimeMillis();
        if (this.A0j) {
            AdSettings.IntegrationErrorMode A00 = C01181r.A00(this.A0c);
            String A0W = A0W(564, 30, 115);
            AdSettings.IntegrationErrorMode integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
            if (!integrationErrorMode.equals(A00)) {
                JA ja = new JA(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(564, 30, 115));
                A11().A0E().A2b(LC.A01(this.A00), ja.A03().getErrorCode(), ja.A04());
                InterfaceC0798To interfaceC0798To = this.A0G;
                if (interfaceC0798To != null) {
                    interfaceC0798To.AAv(ja);
                } else {
                    Log.e(A0W(67, 17, 84), A0W);
                }
                C02637t c02637t = new C02637t(A0W);
                A11().A07().A9C(A0W(541, 3, 15), C02627s.A0c, c02637t);
            } else {
                throw new C01231w(A0W);
            }
        }
        this.A0j = true;
        this.A0E = enumC0523Is;
        if (enumC0523Is.equals(EnumC0523Is.A05)) {
            this.A08 = EnumC01000z.A05;
        }
        this.A0C = c6s;
        C01161p c01161p = new C01161p(this.A0g, this.A0J, A0R(), null, 1);
        c01161p.A05(enumC0523Is);
        c01161p.A06(this.A0S);
        c01161p.A07(this.A0T);
        this.A0A = new C0424Er(this.A0c, c01161p);
        this.A0A.A0O(new C0809Tz(this));
        this.A0A.A0R(str);
    }

    public final void A1W(@Nullable J0 j0) {
        this.A0H = j0;
    }

    public final void A1X(J1 j1) {
        this.A0I = j1;
    }

    public final void A1Y(JF jf) {
        if (!A0q()) {
            if (JF.A04.equals(jf)) {
                C0887Xc c0887Xc = this.A0c;
                String[] strArr = A0m;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[7] = "er71GFUENUkH6mVEmd80tsw";
                strArr2[5] = "eRFgtOOg0hnVr16Te1PNaNs";
                c0887Xc.A0E().A2h(AdPlacementType.NATIVE_BANNER.toString(), this.A0g);
            } else {
                this.A0c.A0E().A2h(AdPlacementType.NATIVE.toString(), this.A0g);
            }
        }
        this.A0J = jf;
    }

    public final void A1Z(Q9 q9) {
        this.A0V = new WeakReference<>(q9);
    }

    public final void A1a(boolean z) {
        this.A0W = z;
    }

    public final void A1b(boolean z) {
        this.A0X = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x006b, code lost:
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006d, code lost:
        r2 = r3.A0G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e4, code lost:
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e7, code lost:
        r2 = A0W(0, 0, 21);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1c(boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0799Tp.A1c(boolean, boolean):void");
    }

    public final boolean A1d() {
        return this.A07 == null;
    }

    @Override // com.facebook.ads.redexgen.X.J6
    public final int A6K() {
        View view = this.A06;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof PH) {
                return ((PH) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new J4(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        JO.A05(A0W(544, 7, 3), A0W(354, 19, 89), A0W(5, 8, 76));
        if (IK.A1Q(this.A0c)) {
            A11().A0A().AFe(this.A03);
        }
        if (!A0q()) {
            this.A0c.A0E().A2i();
        }
        C0424Er c0424Er = this.A0A;
        if (c0424Er != null) {
            c0424Er.A0T(true);
            this.A0A = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0E.equals(EnumC0523Is.A05)) {
            this.A08 = EnumC01000z.A04;
        }
        this.A0E = EnumC0523Is.A04;
        A0h(this.A0a, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdBodyText() {
        return A0G(true).A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdCallToAction() {
        return A0G(true).A0X();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        C0529Iy adChoicesIcon = getAdChoicesIcon();
        String[] strArr = A0m;
        if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
            String[] strArr2 = A0m;
            strArr2[7] = "MRTmAh7YnfwjJHGdoro5GGF";
            strArr2[5] = "5NAjexdbITBZf7E7VHPXfXw";
            return adChoicesIcon.getUrl();
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesLinkUrl() {
        return A0F().A0K();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesText() {
        return A0F().A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdHeadline() {
        return A0G(true).A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdLinkDescription() {
        return A0G(true).A0N();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdSocialContext() {
        return A0G(true).A0R();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdTranslation() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdUntrimmedBodyText() {
        return A0G(true).A0V();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdvertiserName() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        C0967a7 c0967a7 = this.A0a;
        if (c0967a7 != null) {
            AnonymousClass11 A0E = c0967a7.A0E();
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[1] = "Gk0JtmCCXYpL8dPDyrRdSPBqQO7pSw2M";
            strArr2[3] = "hZFl2ZrFl9W40ZKmdwMt57qcTxbjzHrP";
            C0529Iy nativeAdImage = A0E.A0F();
            if (nativeAdImage != null) {
                int width = nativeAdImage.getWidth();
                int height = nativeAdImage.getHeight();
                if (height > 0) {
                    return width / height;
                }
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        String str = this.A0h;
        String[] strArr = A0m;
        if (strArr[4].length() != strArr[6].length()) {
            String[] strArr2 = A0m;
            strArr2[7] = "iawtn5ImZtHDfKUJHK1ePg9";
            strArr2[5] = "61vZsTsWUXSHOR043CjOsZn";
            return str;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0g;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final Drawable getPreloadedIconViewDrawable() {
        C0529Iy A0G;
        Bitmap A0M;
        C0967a7 adapter = this.A0a;
        if (adapter != null && (A0G = A0F().A0G()) != null && (A0M = this.A0b.A0M(A0G.getUrl())) != null) {
            C0887Xc A11 = A11();
            boolean A1d = A1d();
            String[] strArr = A0m;
            if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
                String[] strArr2 = A0m;
                strArr2[4] = "5rXv1LFjMRKkpcU7";
                strArr2[6] = "SFgDKFOuseBk";
                return A05(A11, A0M, A1d, A1C());
            }
            throw new RuntimeException();
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getPromotedTranslation() {
        return A0G(true).A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getSponsoredTranslation() {
        return A0G(true).A0S();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        C0967a7 c0967a7 = this.A0a;
        return c0967a7 != null && c0967a7.A0S();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z = true;
        C0424Er c0424Er = this.A0A;
        if (c0424Er != null) {
            z = c0424Er.A0U();
        } else {
            ZU zu = this.A0B;
            String[] strArr = A0m;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "v5uFzvuQ32LyebguaenlI2Y";
            strArr2[5] = "nsJGpwd0QPZOfVeZMyNRGWR";
            if (zu != null) {
                z = zu.A0A();
            }
        }
        this.A0c.A0E().A4b(z);
        return z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        C0967a7 c0967a7 = this.A0a;
        return c0967a7 != null && c0967a7.A0T();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        JO.A05(A0W(558, 6, 14), A0W(373, 24, 23), A0W(551, 7, 7));
        A1V(EnumC0523Is.A00(NativeAdBase.MediaCacheFlag.ALL), null, new C6S(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        JO.A05(A0W(558, 6, 14), A0W(373, 24, 23), A0W(13, 7, 89));
        ((J4) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        View view = this.A05;
        if (view != null) {
            view.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        View view = this.A04;
        if (view != null) {
            view.post(new U0(this));
        }
        String str = A0W(155, 16, 50) + L3.A03(this.A0c, th);
        A11().A0E().A2b(LC.A01(this.A00), 2001, str);
        InterfaceC0798To interfaceC0798To = this.A0G;
        if (interfaceC0798To != null) {
            interfaceC0798To.AAv(new JA(2001, str));
        }
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0n(extraHints.getHints());
        this.A0T = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00df, code lost:
        if (com.facebook.ads.redexgen.X.IK.A10(r6.A0c) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00e1, code lost:
        r6.A0L.A07();
        r6.A04.getOverlay().remove(r6.A0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00f1, code lost:
        com.facebook.ads.redexgen.X.C0799Tp.A0o.remove(r6.A04);
        A0Z();
        r6.A04 = null;
        r6.A06 = null;
        r0 = r6.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0101, code lost:
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0103, code lost:
        r0.A0V();
        r6.A0R = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0108, code lost:
        A0c();
        r6.A09 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x010d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x010e, code lost:
        if (r5 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0115, code lost:
        if (com.facebook.ads.redexgen.X.IK.A1Q(r4) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0128, code lost:
        throw new java.lang.IllegalStateException(A0W(472, 38, 15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0070, code lost:
        if (com.facebook.ads.redexgen.X.IK.A1Q(r4) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0072, code lost:
        A11().A0A().AFe(r6.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0087, code lost:
        if (com.facebook.ads.redexgen.X.C0799Tp.A0o.containsKey(r6.A04) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0097, code lost:
        if (com.facebook.ads.redexgen.X.C0799Tp.A0o.get(r6.A04).get() != r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0099, code lost:
        r4 = r6.A04;
        r5 = r4 instanceof android.view.ViewGroup;
        r3 = com.facebook.ads.redexgen.X.C0799Tp.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ad, code lost:
        if (r3[4].length() == r3[6].length()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00af, code lost:
        r3 = com.facebook.ads.redexgen.X.C0799Tp.A0m;
        r3[0] = "lVWmVGygxw0UbRbggHe19cSptvLLteak";
        r3[2] = "yD1YSLWVotW9RM3Ng5RpEu8J61bKeSm7";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00bb, code lost:
        if (r5 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00bd, code lost:
        r0 = r6.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00bf, code lost:
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c1, code lost:
        ((android.view.ViewGroup) r4).removeView(r0);
        r6.A0K = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00c8, code lost:
        r0 = r6.A0a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ca, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00cc, code lost:
        r0.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00d3, code lost:
        if (android.os.Build.VERSION.SDK_INT < 18) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00d7, code lost:
        if (r6.A0L == null) goto L45;
     */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void unregisterView() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0799Tp.unregisterView():void");
    }
}
