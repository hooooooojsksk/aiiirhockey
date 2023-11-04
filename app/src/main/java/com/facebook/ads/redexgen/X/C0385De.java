package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.De */
/* loaded from: assets/audience_network.dex */
public final class C0385De implements InterfaceC0880Wv, InterfaceC03029h, InterfaceC03009f {
    public static byte[] A0O;
    public static String[] A0P = {"lFtWnCG46R5C0jFE4zUJTczpshBUtUUT", "lFOjdTcG38zZaGgojgc5eL5kqXnhZEZM", "wiGcXWoorOPZSjIllCfsaL8Ty45qvpEz", "HHU7rub9nESY9ymWNpU", "JQeT3oVWTWkCraIQT5Bxb1arMPILFYIY", "gEu", "Qio0MMI", "OwWxnbSWAOR1YegRtIWYLQC56lcDaoDA"};
    public float A00;
    public int A01;
    public int A02;
    @Nullable
    public Surface A03;
    @Nullable
    public SurfaceHolder A04;
    @Nullable
    public TextureView A05;
    public Format A06;
    public Format A07;
    public A6 A08;
    public C0335Ap A09;
    public C0335Ap A0A;
    public ET A0B;
    public List<FQ> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final InterfaceC0880Wv A0F;
    public final SurfaceHolder$CallbackC0878Wt A0G;
    public final C0876Wr A0H;
    public final CopyOnWriteArraySet<AM> A0I;
    public final CopyOnWriteArraySet<DC> A0J;
    public final CopyOnWriteArraySet<FU> A0K;
    public final CopyOnWriteArraySet<IG> A0L;
    public final CopyOnWriteArraySet<I7> A0M;
    public final InterfaceC0879Wu[] A0N;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{126, -108, -104, -101, -105, -112, airhockey.J_GOO, -93, -102, 123, -105, -116, -92, -112, -99, -101, -67, -70, -82, -87, -85, -83, -100, -83, -64, -68, -67, -70, -83, -108, -79, -69, -68, -83, -74, -83, -70, airhockey.J_ENEMYLOSE, -87, -76, -70, -83, -87, -84, -63, airhockey.J_ENEMYLOSE, -67, -74, -69, -83, -68, airhockey.J_ENEMYLOSE, -73, -70, airhockey.J_ENEMYLOSE, -70, -83, -72, -76, -87, -85, -83, -84, airhockey.J_REWARD};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BF != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0385De(InterfaceC03109p interfaceC03109p, GM gm, C9U c9u, @Nullable BF<C0859Wa> bf) {
        this(interfaceC03109p, gm, c9u, bf, new C03159v());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BF != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0385De(InterfaceC03109p interfaceC03109p, GM gm, C9U c9u, @Nullable BF<C0859Wa> bf, C03159v c03159v) {
        this(interfaceC03109p, gm, c9u, bf, c03159v, HG.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BF != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0385De(InterfaceC03109p interfaceC03109p, GM gm, C9U c9u, @Nullable BF<C0859Wa> bf, C03159v c03159v, HG hg) {
        this.A0G = new SurfaceHolder$CallbackC0878Wt(this);
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0I = new CopyOnWriteArraySet<>();
        this.A0E = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        Handler handler = this.A0E;
        SurfaceHolder$CallbackC0878Wt surfaceHolder$CallbackC0878Wt = this.A0G;
        this.A0N = interfaceC03109p.A4U(handler, surfaceHolder$CallbackC0878Wt, surfaceHolder$CallbackC0878Wt, surfaceHolder$CallbackC0878Wt, surfaceHolder$CallbackC0878Wt, bf);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = A6.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        this.A0F = A02(this.A0N, gm, c9u, hg);
        this.A0H = c03159v.A00(this.A0F, hg);
        A3F(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0I(this.A0H);
        if (bf instanceof C0861Wc) {
            ((C0861Wc) bf).A04(this.A0E, this.A0H);
        }
    }

    private final InterfaceC0880Wv A02(InterfaceC0879Wu[] interfaceC0879WuArr, GM gm, C9U c9u, HG hg) {
        return new C0387Dg(interfaceC0879WuArr, gm, c9u, hg);
    }

    private void A0E() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 0), A07(15, 49, 29));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        SurfaceHolder surfaceHolder = this.A04;
        String[] strArr = A0P;
        if (strArr[6].length() != strArr[5].length()) {
            String[] strArr2 = A0P;
            strArr2[1] = "ra3xydJ7kWhmMtg1TaM66w1JFa1gUTH7";
            strArr2[7] = "B2AnWPBfK4McGvg4VvevfKURx5PgHrL6";
            if (surfaceHolder != null) {
                SurfaceHolder$CallbackC0878Wt surfaceHolder$CallbackC0878Wt = this.A0G;
                if (A0P[3].length() != 30) {
                    A0P[2] = "TkNVmSJ94eiWQtufXtm52Md27gR86DeI";
                    surfaceHolder.removeCallback(surfaceHolder$CallbackC0878Wt);
                    this.A04 = null;
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public void A0G(@Nullable Surface surface, boolean z) {
        InterfaceC0879Wu[] interfaceC0879WuArr;
        ArrayList<C03069l> arrayList = new ArrayList();
        for (InterfaceC0879Wu interfaceC0879Wu : this.A0N) {
            if (interfaceC0879Wu.A7u() == 2) {
                arrayList.add(this.A0F.A4O(interfaceC0879Wu).A06(1).A07(surface).A05());
            }
        }
        Surface surface2 = this.A03;
        if (surface2 != null && surface2 != surface) {
            try {
                for (C03069l c03069l : arrayList) {
                    c03069l.A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0D = z;
    }

    private final void A0I(DC dc) {
        this.A0J.add(dc);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    @Nullable
    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AFU(false);
    }

    public final void A0N(float f) {
        InterfaceC0879Wu[] interfaceC0879WuArr;
        this.A00 = f;
        for (InterfaceC0879Wu interfaceC0879Wu : this.A0N) {
            if (interfaceC0879Wu.A7u() == 1) {
                this.A0F.A4O(interfaceC0879Wu).A06(2).A07(Float.valueOf(f)).A05();
            }
        }
    }

    public final void A0O(@Nullable Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(ET et) {
        ADZ(et, true, true);
    }

    public final void A0Q(I7 i7) {
        this.A0M.add(i7);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void A3F(InterfaceC02989d interfaceC02989d) {
        this.A0F.A3F(interfaceC02989d);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Wv
    public final C03069l A4O(InterfaceC03059k interfaceC03059k) {
        return this.A0F.A4O(interfaceC03059k);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final int A5u() {
        return this.A0F.A5u();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final long A5v() {
        return this.A0F.A5v();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final long A6G() {
        return this.A0F.A6G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final int A6I() {
        return this.A0F.A6I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final int A6J() {
        return this.A0F.A6J();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final long A6L() {
        return this.A0F.A6L();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final AbstractC03149u A6N() {
        return this.A0F.A6N();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final int A6O() {
        return this.A0F.A6O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final long A6X() {
        return this.A0F.A6X();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final boolean A7N() {
        return this.A0F.A7N();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0880Wv
    public final void ADZ(ET et, boolean z, boolean z2) {
        ET et2 = this.A0B;
        if (et2 != et) {
            if (et2 != null) {
                et2.AED(this.A0H);
                String[] strArr = A0P;
                if (strArr[4].charAt(10) == strArr[0].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0P;
                strArr2[1] = "neQjHr0c3Z22xWgcFsXV6yKpgIjCxRiM";
                strArr2[7] = "AZ8qNXqb66h1W9gn2ceQeQQ6zfm9Ofoh";
                this.A0H.A07();
            }
            Handler handler = this.A0E;
            if (A0P[3].length() == 30) {
                throw new RuntimeException();
            }
            A0P[2] = "hi3Z2rNIRXiwDW9NFTlP7K1BOJYRm9rY";
            et.A3D(handler, this.A0H);
            this.A0B = et;
        }
        this.A0F.ADZ(et, z, z2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void AE4() {
        this.A0F.AE4();
        A0E();
        Surface surface = this.A03;
        if (surface != null) {
            if (this.A0D) {
                surface.release();
            }
            this.A03 = null;
        }
        ET et = this.A0B;
        String[] strArr = A0P;
        if (strArr[6].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[1] = "3XPFavn3G5vCuxghg4tFItjGBt49wsdt";
        strArr2[7] = "vQrNoD9lPBn1b9gsSKOopZ1BvxRWCtpJ";
        if (et != null) {
            et.AED(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void AEe(long j) {
        this.A0H.A06();
        this.A0F.AEe(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void AEf() {
        this.A0H.A06();
        this.A0F.AEf();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void AF3(boolean z) {
        this.A0F.AF3(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03039i
    public final void AFU(boolean z) {
        this.A0F.AFU(z);
        ET et = this.A0B;
        if (et != null) {
            et.AED(this.A0H);
            this.A0B = null;
            this.A0H.A07();
        }
        this.A0C = Collections.emptyList();
    }
}
